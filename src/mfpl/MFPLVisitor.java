package mfpl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MFPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MFPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MFPLParser#assignmentRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRule(@NotNull MFPLParser.AssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#conditionalStructRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStructRule(@NotNull MFPLParser.ConditionalStructRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#declarationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(@NotNull MFPLParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#systemcallRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemcallRule(@NotNull MFPLParser.SystemcallRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule6(@NotNull MFPLParser.ExpressionRule6Context ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#ifRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(@NotNull MFPLParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#printContentRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintContentRule(@NotNull MFPLParser.PrintContentRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule4(@NotNull MFPLParser.ExpressionRule4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#printRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintRule(@NotNull MFPLParser.PrintRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#systemcallcontentRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemcallcontentRule(@NotNull MFPLParser.SystemcallcontentRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull MFPLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule5(@NotNull MFPLParser.ExpressionRule5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#loopRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopRule(@NotNull MFPLParser.LoopRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#doforeverifRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoforeverifRule(@NotNull MFPLParser.DoforeverifRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#rootRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRule(@NotNull MFPLParser.RootRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(@NotNull MFPLParser.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule2(@NotNull MFPLParser.ExpressionRule2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#expressionRule3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule3(@NotNull MFPLParser.ExpressionRule3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#statementRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRule(@NotNull MFPLParser.StatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#routineRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineRule(@NotNull MFPLParser.RoutineRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#elseIfRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfRule(@NotNull MFPLParser.ElseIfRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#countRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountRule(@NotNull MFPLParser.CountRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MFPLParser#elseRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseRule(@NotNull MFPLParser.ElseRuleContext ctx);
}