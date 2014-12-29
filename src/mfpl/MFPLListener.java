package mfpl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MFPLParser}.
 */
public interface MFPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MFPLParser#assignmentRule}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentRule(@NotNull MFPLParser.AssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#assignmentRule}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentRule(@NotNull MFPLParser.AssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#conditionalStructRule}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStructRule(@NotNull MFPLParser.ConditionalStructRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#conditionalStructRule}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStructRule(@NotNull MFPLParser.ConditionalStructRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#declarationRule}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(@NotNull MFPLParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#declarationRule}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(@NotNull MFPLParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#systemcallRule}.
	 * @param ctx the parse tree
	 */
	void enterSystemcallRule(@NotNull MFPLParser.SystemcallRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#systemcallRule}.
	 * @param ctx the parse tree
	 */
	void exitSystemcallRule(@NotNull MFPLParser.SystemcallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule6}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule6(@NotNull MFPLParser.ExpressionRule6Context ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule6}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule6(@NotNull MFPLParser.ExpressionRule6Context ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(@NotNull MFPLParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(@NotNull MFPLParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#printContentRule}.
	 * @param ctx the parse tree
	 */
	void enterPrintContentRule(@NotNull MFPLParser.PrintContentRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#printContentRule}.
	 * @param ctx the parse tree
	 */
	void exitPrintContentRule(@NotNull MFPLParser.PrintContentRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule4}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule4(@NotNull MFPLParser.ExpressionRule4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule4}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule4(@NotNull MFPLParser.ExpressionRule4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#printRule}.
	 * @param ctx the parse tree
	 */
	void enterPrintRule(@NotNull MFPLParser.PrintRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#printRule}.
	 * @param ctx the parse tree
	 */
	void exitPrintRule(@NotNull MFPLParser.PrintRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#systemcallcontentRule}.
	 * @param ctx the parse tree
	 */
	void enterSystemcallcontentRule(@NotNull MFPLParser.SystemcallcontentRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#systemcallcontentRule}.
	 * @param ctx the parse tree
	 */
	void exitSystemcallcontentRule(@NotNull MFPLParser.SystemcallcontentRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MFPLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MFPLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule5}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule5(@NotNull MFPLParser.ExpressionRule5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule5}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule5(@NotNull MFPLParser.ExpressionRule5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#loopRule}.
	 * @param ctx the parse tree
	 */
	void enterLoopRule(@NotNull MFPLParser.LoopRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#loopRule}.
	 * @param ctx the parse tree
	 */
	void exitLoopRule(@NotNull MFPLParser.LoopRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#doforeverifRule}.
	 * @param ctx the parse tree
	 */
	void enterDoforeverifRule(@NotNull MFPLParser.DoforeverifRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#doforeverifRule}.
	 * @param ctx the parse tree
	 */
	void exitDoforeverifRule(@NotNull MFPLParser.DoforeverifRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#rootRule}.
	 * @param ctx the parse tree
	 */
	void enterRootRule(@NotNull MFPLParser.RootRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#rootRule}.
	 * @param ctx the parse tree
	 */
	void exitRootRule(@NotNull MFPLParser.RootRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule(@NotNull MFPLParser.ExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule(@NotNull MFPLParser.ExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule2}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule2(@NotNull MFPLParser.ExpressionRule2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule2}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule2(@NotNull MFPLParser.ExpressionRule2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#expressionRule3}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule3(@NotNull MFPLParser.ExpressionRule3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#expressionRule3}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule3(@NotNull MFPLParser.ExpressionRule3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#statementRule}.
	 * @param ctx the parse tree
	 */
	void enterStatementRule(@NotNull MFPLParser.StatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#statementRule}.
	 * @param ctx the parse tree
	 */
	void exitStatementRule(@NotNull MFPLParser.StatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#routineRule}.
	 * @param ctx the parse tree
	 */
	void enterRoutineRule(@NotNull MFPLParser.RoutineRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#routineRule}.
	 * @param ctx the parse tree
	 */
	void exitRoutineRule(@NotNull MFPLParser.RoutineRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#elseIfRule}.
	 * @param ctx the parse tree
	 */
	void enterElseIfRule(@NotNull MFPLParser.ElseIfRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#elseIfRule}.
	 * @param ctx the parse tree
	 */
	void exitElseIfRule(@NotNull MFPLParser.ElseIfRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#countRule}.
	 * @param ctx the parse tree
	 */
	void enterCountRule(@NotNull MFPLParser.CountRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#countRule}.
	 * @param ctx the parse tree
	 */
	void exitCountRule(@NotNull MFPLParser.CountRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MFPLParser#elseRule}.
	 * @param ctx the parse tree
	 */
	void enterElseRule(@NotNull MFPLParser.ElseRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MFPLParser#elseRule}.
	 * @param ctx the parse tree
	 */
	void exitElseRule(@NotNull MFPLParser.ElseRuleContext ctx);
}