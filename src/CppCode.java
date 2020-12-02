import java.util.*;

public class CppCode {
    private final Set<String> variables = new HashSet<>();
    private final List<String> expressions = new ArrayList<>();
    private final List<CppCode> functions = new ArrayList<>();

    public void setFunction(boolean function) {
        isFunction = function;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void addFunctionArg(String arg) {
        functionArgsNames.add(arg);
    }

    private boolean isFunction;
    private String functionName;
    private final List<String> functionArgsNames;

    public CppCode() {
        this.isFunction = false;
        this.functionName = "main";
        this.functionArgsNames = new ArrayList<>();
    }

    public static String addTabs(int cntTabs, String data) {
        return "\t".repeat(cntTabs) + data;
    }

    public void addVariables(Collection<String> toAdd) {
        variables.addAll(toAdd);
    }

    public void addVariable(String var) {
        variables.add(var);
    }

    public void addExpressions(Collection<String> toAdd) {
        expressions.addAll(toAdd);
    }

    public void addExpression(String expr) {
        expressions.add(expr);
    }

    public void addFunction(CppCode function) {
        functions.add(function);
    }

    private String genFuncArgs() {
        StringBuilder res = new StringBuilder();
        if (!functionArgsNames.isEmpty()) {
            res.append("int ").append(functionArgsNames.get(0));
            for (int i = 1; i < functionArgsNames.size(); ++i) {
                res.append(", int ").append(functionArgsNames.get(i));
            }
        }
        return res.toString();
    }

    private void putFuncHeader(StringBuilder res) {
        res
                .append("int ")
                .append(functionName)
                .append('(')
                .append(genFuncArgs())
                .append("){\n");
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        if (isFunction) {
            putFuncHeader(ans);
            for (var i : variables) {
                if (!functionArgsNames.contains(i)) {
                    ans.append(addTabs(1, "int " + i + ";\n"));
                }
            }
            for (var i : expressions) {
                ans.append(addTabs(1, i + '\n'));
            }
        } else {
            ans.append("#include<stdio.h>\n");
            for (var i : variables) {
                ans.append("int ").append(i).append(";\n");
            }
            for (var i : functions) {
                ans.append(i.toString());
            }
            putFuncHeader(ans);
            for (var i : expressions) {
                ans.append(addTabs(1, i + "\n"));
            }
        }
        ans.append("}\n");
        return ans.toString();
    }
}
