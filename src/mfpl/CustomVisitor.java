package mfpl;

import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Alican Şekerefe
 */

//class for controlling the rule flow
public class CustomVisitor extends MFPLBaseVisitor
{
    //map to keep var names
    private static HashMap<String, String> nameToVarMap = null;
    //map to keep var types
    private static HashMap<String, String> nameToVarTypeMap = null;
    
    public CustomVisitor()
    {
        nameToVarMap = new HashMap<>();
        nameToVarTypeMap = new HashMap<>();
    }
    
    //declares a new variable with given name and type
    //throws exception if var exists
    private void declare(String varName, String type)
    {
        //check the map
        if(nameToVarMap.containsKey(varName))
            throw new RuntimeException(" ** variable '"+varName+"' already declared! **");
        else
        {
            //instantiate the var with default value
            nameToVarMap.put(varName, type.equals("str") ? "null" : "0.0");
            nameToVarTypeMap.put(varName, type);
        }
    }

    //assigns value to the given variable
    private static void assign(String varName, String value)
    {
        //check if it really exists
        if(nameToVarMap.containsKey(varName))
        {
            boolean isString = nameToVarTypeMap.get(varName).equals("str");
         
            //if it's a string, assign whatever the value is
            if(isString)
                nameToVarMap.put(varName, value);
            //if it's numeric, make sure provided value is also numeric
            else if(isNumeric(value))
                nameToVarMap.put(varName, value);
            else
                throw new RuntimeException(" ** type mismatch!");
            
            nameToVarMap.put(varName, value);
        }
        else
            throw new RuntimeException(" ** undeclared variable '"+varName+"' **");
    }
    
    //returns true if provided string is numeric
    private static boolean isNumeric(String value)
    {
        boolean numeric = false;
        
        try
        {
            Double.parseDouble(value);
            numeric = true;
        }
        catch(Exception e)
        {
            
        }
        
        return numeric;
    }
    
    //returns the numeric value of the given variable
    private static double getNumericIdentifier(String varName)
    {
        String value = nameToVarMap.get(varName);
        //check if it exists
        if(value == null)
            throw new RuntimeException("** Undeclared variable '"+varName+"'");
        //make sure variable was declared as numeric
        else if(nameToVarTypeMap.get(varName).equals("str"))
            throw new RuntimeException("** Type mismatch! Numeric value expected!");
        
        return Double.parseDouble(nameToVarMap.get(varName)+"");
    }
    
    //returns the value of the variable
    private static String getIdentifierValue(String varName)
    {
        String value = nameToVarMap.get(varName);
        if(value == null)
            throw new RuntimeException("** Undeclared variable '"+varName+"'");
        
        return value;
    }
    
    //performs arithmetic operaton on the given values considering the operator
    private static double performArithmetics(String operator, String val1, String val2)
    {
        Double result = 0D;
        if(operator.equals("*"))
            result = Double.parseDouble(val1) * (double)Double.parseDouble(val2);
        else if(operator.equals("/"))
            result = Double.parseDouble(val1) / (double)Double.parseDouble(val2);
        else if(operator.equals("+"))
            result = Double.parseDouble(val1) + (double)Double.parseDouble(val2);
        else
            result = Double.parseDouble(val1) - (double)Double.parseDouble(val2);

        return result;
    }

    //performs logical operation on the given values considering the operator
    private static double performLogics(String operator, String val1, String val2)
    {
        boolean result = false;

        if(operator.equals("or"))
            result = Double.parseDouble(val1)!=0 || Double.parseDouble(val2)!=0;
        else if(operator.equals("and"))
            result = Double.parseDouble(val1)!=0 && Double.parseDouble(val2)!=0;
        else
            result = val1.equals(val2);
        
        //convert bool to number
        return result ? 1 : 0;
    }
    
    @Override
    //performs declaration
    public Object visitDeclarationRule(MFPLParser.DeclarationRuleContext ctx)
    {
        //get identifiers
        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        for(int i=0;i<identifiers.size();i++)
            //try to declare them with the given type
            declare(identifiers.get(i).getText(), ctx.TYPENAME().getText());
        return null;
    }

    @Override
    //performs assignment
    public Object visitAssignmentRule(MFPLParser.AssignmentRuleContext ctx) 
    {
        //if an expression is matched, evaluate it and assign its value
        if(ctx.expressionRule()!=null)
            assign(ctx.IDENTIFIER().getText(), visit(ctx.expressionRule())+"");
        else
        //string is matched. assign it
            assign(ctx.IDENTIFIER().getText(), ctx.STRINGVALUE().getText());
        
        return null;
    }
    
    @Override
    //controls the flow of if operation
    public Object visitIfRule(MFPLParser.IfRuleContext ctx) 
    {
        boolean done = false;
        //evaluate the expression and check if its positive
        boolean conditionSatisfied = Double.parseDouble(visit(ctx.expressionRule())+"") != 0.0;
        
        //it's positive, so statement will be visited
        if(conditionSatisfied)
        {
            for(int i=0;i<ctx.statementRule().size();i++)
                visit(ctx.statementRule(i));
            done = true;
        }
        else
        {
            List<MFPLParser.ElseIfRuleContext> elseIfs = ctx.elseIfRule();
            //check if there are else if's
            if(elseIfs.size()>0)
            {
                int i = 0;
                boolean jumpToNext = true;
                do
                {
                    //visit them one by one until they skip or get consumed
                    Object response = visit(elseIfs.get(i++));
                    jumpToNext = Boolean.parseBoolean(response+"");
                }while(jumpToNext && i<elseIfs.size());
                
                done = !jumpToNext;
            }
            
            //check else clause
            if(!done && ctx.elseRule() != null)
                //else if exists. visit the statement no matter what
                visit(ctx.elseRule());
        }
        return null;
    }

    @Override
    //controls the flow of else if rule.
    public Object visitElseIfRule(MFPLParser.ElseIfRuleContext ctx) 
    {
        boolean jumpToNext = true;
        //check if condition is positive
        boolean conditionSatisfied = Double.parseDouble(visit(ctx.expressionRule())+"") != 0.0;
        //condition is satisfied.
        if(conditionSatisfied)
        {
            for(int i=0;i<ctx.statementRule().size();i++)
                visit(ctx.statementRule(i));
            //prevent ifrule to jump to the next "else if" or "else"
            jumpToNext = false;
        }
        
        //return the state of else if to notify the caller
        return jumpToNext;
    }

    @Override
    //controls the flow of else rule
    public Object visitElseRule(MFPLParser.ElseRuleContext ctx) 
    {
        //always visit the statement(s)
        for(int i=0;i<ctx.statementRule().size();i++)
            visit(ctx.statementRule(i));
        return null;
    }

    @Override
    //controls the initialization of expressions
    public Object visitExpressionRule(MFPLParser.ExpressionRuleContext ctx)
    {
        Object result = null;
        
        //if operator exits, perform the operation. otherwise, visit the lower level expression
        if(ctx.operator!=null)
            result = performLogics(
                    ctx.operator.getText(), 
                    visit(ctx.expressionRule2())+"", 
                    visit(ctx.expressionRule())+"");
        else
            result = visit(ctx.expressionRule2());
        
        return result;
    }

    @Override
    public Object visitExpressionRule2(MFPLParser.ExpressionRule2Context ctx)
    {
        Object result = null;
        
        if(ctx.operator!=null)
            result = performLogics(
                        ctx.operator.getText(), 
                        visit(ctx.expressionRule2())+"", 
                        visit(ctx.expressionRule3())+"");
        else
            result = visit(ctx.expressionRule3());
        
        return result;
    }
    
    @Override
    public Object visitExpressionRule3(MFPLParser.ExpressionRule3Context ctx) 
    {
        Object result = null;
        
        if(ctx.operator!=null)
            result = performLogics(
                        ctx.operator.getText(), 
                        visit(ctx.expressionRule3())+"", 
                        visit(ctx.expressionRule4())+"");
        else
            result = visit(ctx.expressionRule4());
        
        return result;
    }

    @Override
    public Object visitExpressionRule4(MFPLParser.ExpressionRule4Context ctx)
    {
        Object result = null;
        
        if(ctx.operator!=null)
            result = performArithmetics(
                        ctx.operator.getText(), 
                        visit(ctx.expressionRule4())+"", 
                        visit(ctx.expressionRule5())+"");
        else
            result = visit(ctx.expressionRule5());
        
        return result;
    }

   
    @Override
    public Object visitExpressionRule5(MFPLParser.ExpressionRule5Context ctx) 
    {
        Object result = null;
        
        if(ctx.operator!=null)
            result = performArithmetics(
                        ctx.operator.getText(), 
                        visit(ctx.expressionRule5())+"", 
                        visit(ctx.expressionRule6())+"");
        else if(ctx.expressionRule6() != null)
            result = visit(ctx.expressionRule6());
        
        return result;
    }

    @Override
    public Object visitExpressionRule6(MFPLParser.ExpressionRule6Context ctx) 
    {
        Object result = null;
        
        if(ctx.IDENTIFIER() != null)
            result = getIdentifierValue(ctx.IDENTIFIER().getText());
        else if(ctx.NUMERICVALUE() != null)
            result = Double.parseDouble(ctx.NUMERICVALUE().getText())+"";
        else
            result = visit(ctx.expressionRule());
        
        return result;
    }

    @Override
    //controls count loop
    public Object visitCountRule(MFPLParser.CountRuleContext ctx) 
    {
        //find starting index
        int start = Integer.parseInt(ctx.NUMERICVALUE(0).getText());
        //find ending index
        int end = Integer.parseInt(ctx.NUMERICVALUE(1).getText());
        
        //run the loop
        for(int i = start;i<end;i++)
            //visit the provided statement            
            for(int j=0;j<ctx.statementRule().size();j++)
                visit(ctx.statementRule(j));
        
        return null;
    }

    @Override
    //controls print rule. prints the provided tokens
    public Object visitPrintRule(MFPLParser.PrintRuleContext ctx) 
    {
        String text = "";
        //visit and append each token value
        for(int i=0;i<ctx.printContentRule().size();i++)
            text += visit(ctx.printContentRule(i)) + (i+1<ctx.printContentRule().size() ? " " : "");
        //print the final text
        
        System.out.println(text);
        return null;
    }

    @Override
    //returns the value of provided print content
    public Object visitPrintContentRule(MFPLParser.PrintContentRuleContext ctx) 
    {
        String result = "";
        
        //if id, get its value
        if(ctx.IDENTIFIER()!=null)
            result = getIdentifierValue(ctx.IDENTIFIER().getText());
        //if string, get its text
        else if(ctx.STRINGVALUE()!=null)
            result = ctx.STRINGVALUE().getText();
        //it's an expression. evaluate and get its value
        else
            result = visit(ctx.expressionRule())+"";
        
        return result.replace("\"", "");
    }

    @Override
    //controls syscall rule
    public Object visitSystemcallRule(MFPLParser.SystemcallRuleContext ctx) 
    {
        //evaluate the provided content and append it to the target text
        String target = "";
        for(int i=0;i<ctx.systemcallcontentRule().size();i++)
        {
            target+=(visit(ctx.systemcallcontentRule(i))+"").replace("\"","");
            if(i+1<ctx.systemcallcontentRule().size())
                target+=" ";
        }
        
        //notify the user
        System.out.println("calling '"+target+"'");
        
        try
        {
            //try to execute the given target
            Runtime.getRuntime().exec(target);
        }
        catch(Exception e)
        {
            //notify failures
            System.out.println("**failed to call "+target);
        }
        
        return null;
    }

    @Override
    //returns the string value of the provided sysscallcontent rule
    public Object visitSystemcallcontentRule(MFPLParser.SystemcallcontentRuleContext ctx)
    {
        String result = "";
        
        if(ctx.STRINGVALUE()!=null)
            result = ctx.STRINGVALUE().getText();
        else
            result = getIdentifierValue(ctx.IDENTIFIER().getText());
        
        return result;
    }

    @Override
    //flow controller for do forever if loop
    public Object visitDoforeverifRule(MFPLParser.DoforeverifRuleContext ctx) 
    {
        while(true)
        {
            //check the condition
            boolean conditionStatisfied = Double.parseDouble(visit(ctx.expressionRule())+"") != 0.0;
            //if true, run the statements
            if(conditionStatisfied)
                for(int i=0;i<ctx.statementRule().size();i++)
                    visit(ctx.statementRule(i));
            //condifiton not satisfied. break immediately
            else
                break;
        }
        
        return null;
    }
}
