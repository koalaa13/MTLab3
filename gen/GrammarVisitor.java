// Generated from /home/koalaa13/IntelijIdeaProjects/MTLab3/src/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cond(GrammarParser.While_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_with_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_with_else_statement(GrammarParser.If_with_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(GrammarParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_body(GrammarParser.If_else_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_line(GrammarParser.If_else_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_expr(GrammarParser.If_else_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whole_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhole_if(GrammarParser.Whole_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(GrammarParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_output(GrammarParser.If_else_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_input(GrammarParser.If_else_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_assign(GrammarParser.If_else_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GrammarParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(GrammarParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ret(GrammarParser.Func_retContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_line(GrammarParser.Func_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(GrammarParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invoke_args(GrammarParser.Func_invoke_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(GrammarParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(GrammarParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(GrammarParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_expr_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr_output(GrammarParser.Func_expr_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_expr_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr_input(GrammarParser.Func_expr_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr_assign(GrammarParser.Func_expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign(GrammarParser.Expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_calc(GrammarParser.Expr_calcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool(GrammarParser.Expr_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_(GrammarParser.Expr_bool_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_var(GrammarParser.Expr_bool_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_or(GrammarParser.Expr_bool_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_and(GrammarParser.Expr_bool_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_not(GrammarParser.Expr_bool_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_false(GrammarParser.Expr_bool_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_bool_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool_true(GrammarParser.Expr_bool_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_math(GrammarParser.Expr_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(GrammarParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_output(GrammarParser.Expr_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_input(GrammarParser.Expr_inputContext ctx);
}