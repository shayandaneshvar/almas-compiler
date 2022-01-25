package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Set;

public class ALMASRuleListener extends ALMASBaseListener {
    private String javaCode = "";
    private String codes = "";
    private String functions = "";
    private Set<String> semanticErrors = new HashSet<>();

    private final String filename;

    public Set<String> getSemanticErrors() {
        return semanticErrors;
    }

    public String getJavaCode() {
        return javaCode;
    }

    public ALMASRuleListener(String filename) {
        this.filename = filename;
    }


//    @Override
//    public void enterProgram(ALMASParser.ProgramContext ctx) {
//
//    }

    @Override
    public void exitProgram(ALMASParser.ProgramContext ctx) {
        javaCode = JavaConstructsUtil.getBaseConstruct(filename, codes, functions);
    }

//    @Override
//    public void enterFunc_inputs(ALMASParser.Func_inputsContext ctx) {
//        super.enterFunc_inputs(ctx);
//    }

    @Override
    public void exitFunc_inputs(ALMASParser.Func_inputsContext ctx) {

    }

    @Override
    public void enterProgram_body(ALMASParser.Program_bodyContext ctx) {
        super.enterProgram_body(ctx);
    }

    @Override
    public void exitProgram_body(ALMASParser.Program_bodyContext ctx) {
        super.exitProgram_body(ctx);
    }

    @Override
    public void enterAssignment(ALMASParser.AssignmentContext ctx) {
        codes += JavaConstructsUtil.getAssignment(ctx);
        String error = SemanticChecker.checkAssignmentSemantics(ctx);
        semanticErrors.add(error);
    }

    @Override
    public void exitAssignment(ALMASParser.AssignmentContext ctx) {
        codes += "); \n";
    }

    @Override
    public void enterString_assignment(ALMASParser.String_assignmentContext ctx) {
        codes += JavaConstructsUtil.getStringAssignment(ctx);
    }

//    @Override
//    public void exitString_assignment(ALMASParser.String_assignmentContext ctx) {
//
//    }

    @Override
    public void enterDecimal_assignment(ALMASParser.Decimal_assignmentContext ctx) {
        codes += JavaConstructsUtil.getDecimalAssignment(ctx);
    }

//    @Override
//    public void exitDecimal_assignment(ALMASParser.Decimal_assignmentContext ctx) {
//        super.exitDecimal_assignment(ctx);
//    }

    @Override
    public void enterBoolean_assignment(ALMASParser.Boolean_assignmentContext ctx) {
        codes += JavaConstructsUtil.getBooleanAssignment(ctx);
    }

//    @Override
//    public void exitBoolean_assignment(ALMASParser.Boolean_assignmentContext ctx) {
//        super.exitBoolean_assignment(ctx);
//    }

    @Override
    public void enterIf_st(ALMASParser.If_stContext ctx) {
    }

    @Override
    public void exitIf_st(ALMASParser.If_stContext ctx) {
        super.exitIf_st(ctx);
    }

    @Override
    public void enterBare_if(ALMASParser.Bare_ifContext ctx) {
        codes += JavaConstructsUtil.getIfSt(ctx);
    }

    @Override
    public void exitBare_if(ALMASParser.Bare_ifContext ctx) {
        codes += "}\n";
    }

    @Override
    public void enterElif(ALMASParser.ElifContext ctx) {
        codes += JavaConstructsUtil.getElif(ctx);
    }

    @Override
    public void exitElif(ALMASParser.ElifContext ctx) {
        codes += "}\n";
    }

    @Override
    public void enterElse_st(ALMASParser.Else_stContext ctx) {
        codes += JavaConstructsUtil.getElse(ctx);
    }

    @Override
    public void exitElse_st(ALMASParser.Else_stContext ctx) {
        codes += "}\n";
    }

    @Override
    public void enterExpressions(ALMASParser.ExpressionsContext ctx) {
        super.enterExpressions(ctx);
    }

    @Override
    public void exitExpressions(ALMASParser.ExpressionsContext ctx) {
        super.exitExpressions(ctx);
    }

    @Override
    public void enterExpression(ALMASParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(ALMASParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterRelop_expression(ALMASParser.Relop_expressionContext ctx) {
        super.enterRelop_expression(ctx);
    }

    @Override
    public void exitRelop_expression(ALMASParser.Relop_expressionContext ctx) {
        super.exitRelop_expression(ctx);
    }

    @Override
    public void enterDecimal_expressions(ALMASParser.Decimal_expressionsContext ctx) {
        super.enterDecimal_expressions(ctx);
    }

    @Override
    public void exitDecimal_expressions(ALMASParser.Decimal_expressionsContext ctx) {
        super.exitDecimal_expressions(ctx);
    }

    @Override
    public void enterDecimal_expression(ALMASParser.Decimal_expressionContext ctx) {
        super.enterDecimal_expression(ctx);
    }

    @Override
    public void exitDecimal_expression(ALMASParser.Decimal_expressionContext ctx) {
        super.exitDecimal_expression(ctx);
    }

    @Override
    public void enterStatements(ALMASParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(ALMASParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterLoop(ALMASParser.LoopContext ctx) {
        codes += JavaConstructsUtil.getLoop(ctx);
    }

    @Override
    public void exitLoop(ALMASParser.LoopContext ctx) {
        codes += "}\n";
    }

    @Override
    public void enterLoop_statements(ALMASParser.Loop_statementsContext ctx) {
        super.enterLoop_statements(ctx);
    }

    @Override
    public void exitLoop_statements(ALMASParser.Loop_statementsContext ctx) {
        super.exitLoop_statements(ctx);
    }

    @Override
    public void enterPrint(ALMASParser.PrintContext ctx) {
        codes += JavaConstructsUtil.getPrint(ctx);
    }

//    @Override
//    public void exitPrint(ALMASParser.PrintContext ctx) {
//        super.exitPrint(ctx);
//    }

    @Override
    public void enterInput(ALMASParser.InputContext ctx) {
        codes += JavaConstructsUtil.getInput(ctx);
    }

//    @Override
//    public void exitInput(ALMASParser.InputContext ctx) {
//        super.exitInput(ctx);
//    }

    @Override
    public void enterReturn_type(ALMASParser.Return_typeContext ctx) {
        super.enterReturn_type(ctx);
    }

    @Override
    public void exitReturn_type(ALMASParser.Return_typeContext ctx) {
        super.exitReturn_type(ctx);
    }

    @Override
    public void enterFunction(ALMASParser.FunctionContext ctx) {
        super.enterFunction(ctx);
    }

    @Override
    public void exitFunction(ALMASParser.FunctionContext ctx) {
        super.exitFunction(ctx);
    }

    @Override
    public void enterFunction_call(ALMASParser.Function_callContext ctx) {
        super.enterFunction_call(ctx);
    }

    @Override
    public void exitFunction_call(ALMASParser.Function_callContext ctx) {
        super.exitFunction_call(ctx);
    }

    @Override
    public void enterMore_func_inputs(ALMASParser.More_func_inputsContext ctx) {
        super.enterMore_func_inputs(ctx);
    }

    @Override
    public void exitMore_func_inputs(ALMASParser.More_func_inputsContext ctx) {
        super.exitMore_func_inputs(ctx);
    }

    @Override
    public void enterReturn_st(ALMASParser.Return_stContext ctx) {
        super.enterReturn_st(ctx);
    }

    @Override
    public void exitReturn_st(ALMASParser.Return_stContext ctx) {
        super.exitReturn_st(ctx);
    }

    @Override
    public void enterFunc_args(ALMASParser.Func_argsContext ctx) {
        super.enterFunc_args(ctx);
    }

    @Override
    public void exitFunc_args(ALMASParser.Func_argsContext ctx) {
        super.exitFunc_args(ctx);
    }

    @Override
    public void enterMore_func_args(ALMASParser.More_func_argsContext ctx) {
        super.enterMore_func_args(ctx);
    }

    @Override
    public void exitMore_func_args(ALMASParser.More_func_argsContext ctx) {
        super.exitMore_func_args(ctx);
    }

    @Override
    public void enterBoolean_cast(ALMASParser.Boolean_castContext ctx) {
        codes += JavaConstructsUtil.getBooleanCast(ctx);
    }

//    @Override
//    public void exitBoolean_cast(ALMASParser.Boolean_castContext ctx) {
//        super.exitBoolean_cast(ctx);
//    }

    @Override
    public void enterDecimal_cast(ALMASParser.Decimal_castContext ctx) {
        codes += JavaConstructsUtil.getDoubleCast(ctx);
    }

//    @Override
//    public void exitDecimal_cast(ALMASParser.Decimal_castContext ctx) {
//        super.exitDecimal_cast(ctx);// TODO: 1/25/2022
//    }

    @Override
    public void enterString_cast(ALMASParser.String_castContext ctx) {
        codes += JavaConstructsUtil.getStringCast(ctx);
    }

//    @Override
//    public void exitString_cast(ALMASParser.String_castContext ctx) {
//
//    }

    @Override
    public void enterPrimitive_type(ALMASParser.Primitive_typeContext ctx) {
        codes += JavaConstructsUtil.getPrimitiveType(ctx);
    }

//    @Override
//    public void exitPrimitive_type(ALMASParser.Primitive_typeContext ctx) {
//        super.exitPrimitive_type(ctx);
//    }
    // general methods

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    /**
     * lexer terminal tokens
     *
     * @param node
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
