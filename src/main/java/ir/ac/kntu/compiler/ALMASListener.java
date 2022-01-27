package ir.ac.kntu.compiler;// Generated from ALMAS.g by ANTLR 4.9.3

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ALMASParser}.
 */
public interface ALMASListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ALMASParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(ALMASParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(ALMASParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#func_inputs}.
     *
     * @param ctx the parse tree
     */
    void enterFunc_inputs(ALMASParser.Func_inputsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#func_inputs}.
     *
     * @param ctx the parse tree
     */
    void exitFunc_inputs(ALMASParser.Func_inputsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#program_body}.
     *
     * @param ctx the parse tree
     */
    void enterProgram_body(ALMASParser.Program_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#program_body}.
     *
     * @param ctx the parse tree
     */
    void exitProgram_body(ALMASParser.Program_bodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(ALMASParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(ALMASParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#string_assignment}.
     *
     * @param ctx the parse tree
     */
    void enterString_assignment(ALMASParser.String_assignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#string_assignment}.
     *
     * @param ctx the parse tree
     */
    void exitString_assignment(ALMASParser.String_assignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#decimal_assignment}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_assignment(ALMASParser.Decimal_assignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#decimal_assignment}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_assignment(ALMASParser.Decimal_assignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#boolean_assignment}.
     *
     * @param ctx the parse tree
     */
    void enterBoolean_assignment(ALMASParser.Boolean_assignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#boolean_assignment}.
     *
     * @param ctx the parse tree
     */
    void exitBoolean_assignment(ALMASParser.Boolean_assignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#if_st}.
     *
     * @param ctx the parse tree
     */
    void enterIf_st(ALMASParser.If_stContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#if_st}.
     *
     * @param ctx the parse tree
     */
    void exitIf_st(ALMASParser.If_stContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#bare_if}.
     *
     * @param ctx the parse tree
     */
    void enterBare_if(ALMASParser.Bare_ifContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#bare_if}.
     *
     * @param ctx the parse tree
     */
    void exitBare_if(ALMASParser.Bare_ifContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#elif}.
     *
     * @param ctx the parse tree
     */
    void enterElif(ALMASParser.ElifContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#elif}.
     *
     * @param ctx the parse tree
     */
    void exitElif(ALMASParser.ElifContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#bare_elif}.
     *
     * @param ctx the parse tree
     */
    void enterBare_elif(ALMASParser.Bare_elifContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#bare_elif}.
     *
     * @param ctx the parse tree
     */
    void exitBare_elif(ALMASParser.Bare_elifContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#else_st}.
     *
     * @param ctx the parse tree
     */
    void enterElse_st(ALMASParser.Else_stContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#else_st}.
     *
     * @param ctx the parse tree
     */
    void exitElse_st(ALMASParser.Else_stContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void enterExpressions(ALMASParser.ExpressionsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void exitExpressions(ALMASParser.ExpressionsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(ALMASParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(ALMASParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#relop_expression}.
     *
     * @param ctx the parse tree
     */
    void enterRelop_expression(ALMASParser.Relop_expressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#relop_expression}.
     *
     * @param ctx the parse tree
     */
    void exitRelop_expression(ALMASParser.Relop_expressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#decimal_expressions}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_expressions(ALMASParser.Decimal_expressionsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#decimal_expressions}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_expressions(ALMASParser.Decimal_expressionsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#decimal_expression}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_expression(ALMASParser.Decimal_expressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#decimal_expression}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_expression(ALMASParser.Decimal_expressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#statements}.
     *
     * @param ctx the parse tree
     */
    void enterStatements(ALMASParser.StatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#statements}.
     *
     * @param ctx the parse tree
     */
    void exitStatements(ALMASParser.StatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#loop}.
     *
     * @param ctx the parse tree
     */
    void enterLoop(ALMASParser.LoopContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#loop}.
     *
     * @param ctx the parse tree
     */
    void exitLoop(ALMASParser.LoopContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#loop_statements}.
     *
     * @param ctx the parse tree
     */
    void enterLoop_statements(ALMASParser.Loop_statementsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#loop_statements}.
     *
     * @param ctx the parse tree
     */
    void exitLoop_statements(ALMASParser.Loop_statementsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#break_continue}.
     *
     * @param ctx the parse tree
     */
    void enterBreak_continue(ALMASParser.Break_continueContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#break_continue}.
     *
     * @param ctx the parse tree
     */
    void exitBreak_continue(ALMASParser.Break_continueContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(ALMASParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(ALMASParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#input}.
     *
     * @param ctx the parse tree
     */
    void enterInput(ALMASParser.InputContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#input}.
     *
     * @param ctx the parse tree
     */
    void exitInput(ALMASParser.InputContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#return_type}.
     *
     * @param ctx the parse tree
     */
    void enterReturn_type(ALMASParser.Return_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#return_type}.
     *
     * @param ctx the parse tree
     */
    void exitReturn_type(ALMASParser.Return_typeContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#function}.
     *
     * @param ctx the parse tree
     */
    void enterFunction(ALMASParser.FunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#function}.
     *
     * @param ctx the parse tree
     */
    void exitFunction(ALMASParser.FunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#function_call}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_call(ALMASParser.Function_callContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#function_call}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_call(ALMASParser.Function_callContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#more_func_inputs}.
     *
     * @param ctx the parse tree
     */
    void enterMore_func_inputs(ALMASParser.More_func_inputsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#more_func_inputs}.
     *
     * @param ctx the parse tree
     */
    void exitMore_func_inputs(ALMASParser.More_func_inputsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#return_st}.
     *
     * @param ctx the parse tree
     */
    void enterReturn_st(ALMASParser.Return_stContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#return_st}.
     *
     * @param ctx the parse tree
     */
    void exitReturn_st(ALMASParser.Return_stContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#func_args}.
     *
     * @param ctx the parse tree
     */
    void enterFunc_args(ALMASParser.Func_argsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#func_args}.
     *
     * @param ctx the parse tree
     */
    void exitFunc_args(ALMASParser.Func_argsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#more_func_args}.
     *
     * @param ctx the parse tree
     */
    void enterMore_func_args(ALMASParser.More_func_argsContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#more_func_args}.
     *
     * @param ctx the parse tree
     */
    void exitMore_func_args(ALMASParser.More_func_argsContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#boolean_cast}.
     *
     * @param ctx the parse tree
     */
    void enterBoolean_cast(ALMASParser.Boolean_castContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#boolean_cast}.
     *
     * @param ctx the parse tree
     */
    void exitBoolean_cast(ALMASParser.Boolean_castContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#decimal_cast}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_cast(ALMASParser.Decimal_castContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#decimal_cast}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_cast(ALMASParser.Decimal_castContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#string_cast}.
     *
     * @param ctx the parse tree
     */
    void enterString_cast(ALMASParser.String_castContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#string_cast}.
     *
     * @param ctx the parse tree
     */
    void exitString_cast(ALMASParser.String_castContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#primitive_type}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitive_type(ALMASParser.Primitive_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#primitive_type}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitive_type(ALMASParser.Primitive_typeContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#java_code}.
     *
     * @param ctx the parse tree
     */
    void enterJava_code(ALMASParser.Java_codeContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#java_code}.
     *
     * @param ctx the parse tree
     */
    void exitJava_code(ALMASParser.Java_codeContext ctx);

    /**
     * Enter a parse tree produced by {@link ALMASParser#java_code_block}.
     *
     * @param ctx the parse tree
     */
    void enterJava_code_block(ALMASParser.Java_code_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link ALMASParser#java_code_block}.
     *
     * @param ctx the parse tree
     */
    void exitJava_code_block(ALMASParser.Java_code_blockContext ctx);
}
