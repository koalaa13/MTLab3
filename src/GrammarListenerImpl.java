import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GrammarListenerImpl extends GrammarBaseListener {
    private final CppCode code = new CppCode();

    public CppCode getCode() {
        return code;
    }

    // FUNC PART

    private CppCode curFunction = null;

    @Override
    public void exitFunc_ret(GrammarParser.Func_retContext ctx) {
        curFunction.addExpression("return " + expressionCalc + ';');
    }

    @Override
    public void exitFunc_expr_assign(GrammarParser.Func_expr_assignContext ctx) {
        String varName = ctx.VAR().getText();
        curFunction.addVariable(varName);
        curFunction.addExpression(varName + " = " + expressionCalc + ";");
    }

    @Override
    public void exitFunc_expr_input(GrammarParser.Func_expr_inputContext ctx) {
        String varName = ctx.VAR().getText();
        curFunction.addVariable(varName);
        curFunction.addExpression("scanf(\"%d\", " + varName + ");");
    }

    @Override
    public void exitFunc_expr_output(GrammarParser.Func_expr_outputContext ctx) {
        String varName = ctx.VAR().getText();
        curFunction.addVariable(varName);
        curFunction.addExpression("printf(\"%d\", " + varName + ");");
    }

    @Override
    public void exitFunc(GrammarParser.FuncContext ctx) {
        code.addFunction(curFunction);
    }

    @Override
    public void enterFunc(GrammarParser.FuncContext ctx) {
        curFunction = new CppCode();
        curFunction.setFunction(true);
    }

    @Override
    public void exitFunc_arg(GrammarParser.Func_argContext ctx) {
        curFunction.addFunctionArg(ctx.VAR().getText());
    }

    @Override
    public void exitFunc_name(GrammarParser.Func_nameContext ctx) {
        curFunction.setFunctionName(ctx.VAR().getText());
    }

    // IN-OUT PART

    @Override
    public void exitExpr_input(GrammarParser.Expr_inputContext ctx) {
        String varName = ctx.VAR().getText();
        code.addVariable(varName);
        code.addExpression("scanf(\"%d\", " + varName + ");");
    }

    @Override
    public void exitExpr_output(GrammarParser.Expr_outputContext ctx) {
        String varName = ctx.VAR().getText();
        code.addVariable(varName);
        code.addExpression("printf(\"%d\", " + varName + ");");
    }

    // ASSIGN PART

    @Override
    public void exitExpr_assign(GrammarParser.Expr_assignContext ctx) {
        String varName = ctx.VAR().getText();
        code.addVariable(varName);
        code.addExpression(varName + " = " + expressionCalc + ";");
    }

    // EXPRESSION PART

    Stack<String> booleanExpression = new Stack<>();
    private String expressionCalc = "";

    @Override
    public void exitExpr_calc(GrammarParser.Expr_calcContext ctx) {
        if (ctx.expr_bool() != null) {
            expressionCalc = booleanExpression.pop();
        }
        if (ctx.expr_math() != null) {
            expressionCalc = ctx.expr_math().getText();
        }
    }

    @Override
    public void exitExpr_bool(GrammarParser.Expr_boolContext ctx) {
        if (ctx.expr_bool_not() != null) {
            String arg = booleanExpression.pop();
            booleanExpression.add("!" + arg);
        }
        if (ctx.expr_bool_and() != null) {
            String arg2 = booleanExpression.pop();
            String arg1 = booleanExpression.pop();
            booleanExpression.add(arg1 + " && " + arg2);
        }
        if (ctx.expr_bool_or() != null) {
            String arg2 = booleanExpression.pop();
            String arg1 = booleanExpression.pop();
            booleanExpression.add(arg1 + " || " + arg2);
        }
        if (ctx.expr_bool_false() != null) {
            booleanExpression.add("false");
        }
        if (ctx.expr_bool_true() != null) {
            booleanExpression.add("true");
        }
        if (ctx.expr_bool_var() != null) {
            String varName = ctx.expr_bool_var().getText();
            code.addVariable(varName);
            booleanExpression.add(varName);
        }
        if (ctx.expr_bool_() != null) {
            String arg = booleanExpression.pop();
            booleanExpression.add("(" + arg + ")");
        }
    }
}
