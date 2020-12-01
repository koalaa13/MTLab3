// Generated from /home/koalaa13/IntelijIdeaProjects/MTLab3/src/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GrammarParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GrammarParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(GrammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(GrammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ret(GrammarParser.Func_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ret(GrammarParser.Func_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_line}.
	 * @param ctx the parse tree
	 */
	void enterFunc_line(GrammarParser.Func_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_line}.
	 * @param ctx the parse tree
	 */
	void exitFunc_line(GrammarParser.Func_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(GrammarParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(GrammarParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_invoke_args(GrammarParser.Func_invoke_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_invoke_args(GrammarParser.Func_invoke_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(GrammarParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(GrammarParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(GrammarParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(GrammarParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(GrammarParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(GrammarParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_expr_output}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr_output(GrammarParser.Func_expr_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_expr_output}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr_output(GrammarParser.Func_expr_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_expr_input}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr_input(GrammarParser.Func_expr_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_expr_input}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr_input(GrammarParser.Func_expr_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr_assign(GrammarParser.Func_expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr_assign(GrammarParser.Func_expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(GrammarParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(GrammarParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_calc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_calc(GrammarParser.Expr_calcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_calc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_calc(GrammarParser.Expr_calcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(GrammarParser.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(GrammarParser.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_(GrammarParser.Expr_bool_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_(GrammarParser.Expr_bool_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_var}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_var(GrammarParser.Expr_bool_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_var}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_var(GrammarParser.Expr_bool_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_or(GrammarParser.Expr_bool_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_or(GrammarParser.Expr_bool_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_and(GrammarParser.Expr_bool_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_and(GrammarParser.Expr_bool_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_not}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_not(GrammarParser.Expr_bool_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_not}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_not(GrammarParser.Expr_bool_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_false}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_false(GrammarParser.Expr_bool_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_false}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_false(GrammarParser.Expr_bool_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_bool_true}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_true(GrammarParser.Expr_bool_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_bool_true}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_true(GrammarParser.Expr_bool_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_math}.
	 * @param ctx the parse tree
	 */
	void enterExpr_math(GrammarParser.Expr_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_math}.
	 * @param ctx the parse tree
	 */
	void exitExpr_math(GrammarParser.Expr_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(GrammarParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(GrammarParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_output}.
	 * @param ctx the parse tree
	 */
	void enterExpr_output(GrammarParser.Expr_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_output}.
	 * @param ctx the parse tree
	 */
	void exitExpr_output(GrammarParser.Expr_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr_input}.
	 * @param ctx the parse tree
	 */
	void enterExpr_input(GrammarParser.Expr_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr_input}.
	 * @param ctx the parse tree
	 */
	void exitExpr_input(GrammarParser.Expr_inputContext ctx);
}