package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ALMASRuleListener extends ALMASBaseListener {
    private String javaCode = "";
    private String codes = "";
    private String functions = "";
    private final Set<String> semanticErrors = new HashSet<>();
    private boolean functionContext = false;
    private final String filename;
    private final Stack<Block> mainBlockStack = new Stack<>();
    private final Stack<Block> functionBlockStack = new Stack<>();

    private void emit(String text) {
        if (functionContext) {
            functions += text;
        } else {
            codes += text;
        }
    }

    public Set<String> getSemanticErrors() {
        return semanticErrors;
    }

    public String getJavaCode() {
        return javaCode.replace(";)", ")");
    }

    public ALMASRuleListener(String filename) {
        this.filename = filename;
    }


    @Override
    public void enterProgram_body(ALMASParser.Program_bodyContext ctx) {
        addBlock();
    }

    @Override
    public void exitProgram_body(ALMASParser.Program_bodyContext ctx) {
        //removeCurrentBlock();
    }

    @Override
    public void exitProgram(ALMASParser.ProgramContext ctx) {
        javaCode = JavaConstructsUtil.getBaseConstruct(filename, codes, functions);
    }

    @Override
    public void enterFunc_inputs(ALMASParser.Func_inputsContext ctx) {
        super.enterFunc_inputs(ctx);
    }

    @Override
    public void enterAssignment(ALMASParser.AssignmentContext ctx) {
        emit(JavaConstructsUtil.getAssignment(ctx));

        String error = SemanticChecker.checkVariableIsAlreadyDefined(ctx.IDENTIFIER(), getCurrentBlock());
        if (!error.isEmpty()) {
            semanticErrors.add(error);
        }

        addVariableToCurrentBlock(ctx.IDENTIFIER().getText());
    }

    @Override
    public void exitAssignment(ALMASParser.AssignmentContext ctx) {
        emit("); \n");
    }

    @Override
    public void enterString_assignment(ALMASParser.String_assignmentContext ctx) {
        emit(JavaConstructsUtil.getStringAssignment(ctx));

        if (ctx.IDENTIFIER() != null) {
            String error = SemanticChecker.checkVariableIsDefined(ctx.IDENTIFIER(), getCurrentBlock());
            if (!error.isEmpty()) {
                semanticErrors.add(error);
            }
        }
    }


    @Override
    public void enterDecimal_assignment(ALMASParser.Decimal_assignmentContext ctx) {
        emit(JavaConstructsUtil.getDecimalAssignment(ctx));

        if (ctx.IDENTIFIER() != null) {
            String error = SemanticChecker.checkVariableIsDefined(ctx.IDENTIFIER(), getCurrentBlock());
            if (!error.isEmpty()) {
                semanticErrors.add(error);
            }
        }
    }

    @Override
    public void enterBoolean_assignment(ALMASParser.Boolean_assignmentContext ctx) {
        emit(JavaConstructsUtil.getBooleanAssignment(ctx));

        if (ctx.IDENTIFIER() != null) {
            String error = SemanticChecker.checkVariableIsDefined(ctx.IDENTIFIER(), getCurrentBlock());
            if (!error.isEmpty()) {
                semanticErrors.add(error);
            }
        }
    }


    @Override
    public void enterBare_if(ALMASParser.Bare_ifContext ctx) {
        emit(JavaConstructsUtil.getIfSt(ctx));

        addBlock();
    }

    @Override
    public void exitBare_if(ALMASParser.Bare_ifContext ctx) {
        emit("}\n");

        removeCurrentBlock();
    }

    @Override
    public void enterElif(ALMASParser.ElifContext ctx) {
        addBlock();
    }

    @Override
    public void enterBare_elif(ALMASParser.Bare_elifContext ctx) {
        emit(JavaConstructsUtil.getElif(ctx));
    }

    @Override
    public void exitBare_elif(ALMASParser.Bare_elifContext ctx) {
        emit("}\n");
    }

    @Override
    public void exitElif(ALMASParser.ElifContext ctx) {
        removeCurrentBlock();
    }

    @Override
    public void enterElse_st(ALMASParser.Else_stContext ctx) {
        emit(JavaConstructsUtil.getElse(ctx));
        addBlock();
    }

    @Override
    public void exitElse_st(ALMASParser.Else_stContext ctx) {
        if (ctx.ELSE_SYMBOL() != null)
            emit("}\n");
        removeCurrentBlock();
    }

    private void findAllIdentifiersOfExpression(RuleContext ctx, List<TerminalNode> identifiers) {
        if (ctx instanceof ALMASParser.ExpressionsContext) {
            findAllIdentifiersOfExpression(((ALMASParser.ExpressionsContext) ctx).expressions(), identifiers);
            findAllIdentifiersOfExpression(((ALMASParser.ExpressionsContext) ctx).expression(), identifiers);
        } else if (ctx instanceof ALMASParser.ExpressionContext) {
            if (((ALMASParser.ExpressionContext) ctx).IDENTIFIER() != null) {
                identifiers.add(((ALMASParser.ExpressionContext) ctx).IDENTIFIER());
            }
            findAllIdentifiersOfExpression(((ALMASParser.ExpressionContext) ctx).expression(), identifiers);
            findAllIdentifiersOfExpression(((ALMASParser.ExpressionContext) ctx).relop_expression(), identifiers);
        } else if (ctx instanceof ALMASParser.Relop_expressionContext) {
            identifiers.addAll(((ALMASParser.Relop_expressionContext) ctx).IDENTIFIER());
            findAllIdentifiersOfExpression(((ALMASParser.Relop_expressionContext) ctx).relop_expression(), identifiers);
        } else if (ctx instanceof ALMASParser.Decimal_expressionsContext) {
            findAllIdentifiersOfDecimalExpression(ctx, identifiers);
        }
    }

    private void findAllIdentifiersOfDecimalExpression(RuleContext ctx, List<TerminalNode> identifiers) {
        if (ctx instanceof ALMASParser.Decimal_expressionsContext) {
            findAllIdentifiersOfDecimalExpression(((ALMASParser.Decimal_expressionsContext) ctx).decimal_expression(), identifiers);
            findAllIdentifiersOfDecimalExpression(((ALMASParser.Decimal_expressionsContext) ctx).decimal_expressions(), identifiers);
        }

        if (ctx instanceof ALMASParser.Decimal_expressionContext) {
            identifiers.addAll(((ALMASParser.Decimal_expressionContext) ctx).IDENTIFIER());
        }
    }

    @Override
    public void enterExpressions(ALMASParser.ExpressionsContext ctx) {
        LinkedList<TerminalNode> identifiers = new LinkedList<>();
        findAllIdentifiersOfExpression(ctx, identifiers);
        identifiers.forEach(identifier -> {
            String error = SemanticChecker.checkVariableIsDefined(identifier, getCurrentBlock());
            if (!error.isEmpty()) {
                semanticErrors.add(error);
            }
        });
    }

    @Override
    public void enterDecimal_expressions(ALMASParser.Decimal_expressionsContext ctx) {
        LinkedList<TerminalNode> identifiers = new LinkedList<>();
        findAllIdentifiersOfDecimalExpression(ctx, identifiers);
        identifiers.forEach(identifier -> {
            String error = SemanticChecker.checkVariableIsDefined(identifier, getCurrentBlock());
            if (!error.isEmpty()) {
                semanticErrors.add(error);
            }
        });
    }

    private void addBlock() {
        Stack<Block> blocks = null;
        if (functionContext) {
            blocks = functionBlockStack;
        } else {
            blocks = mainBlockStack;
        }
        Block parent = blocks.size() > 0 ? blocks.peek() : null;
        int key = blocks.size();
        Block block = new Block(key, parent);
        blocks.push(block);
    }

    private void removeCurrentBlock() {
        if (functionContext) {
            functionBlockStack.pop();
        } else {
            mainBlockStack.pop();
        }
    }

    private Block getCurrentBlock() {
        if (functionContext) {
            return functionBlockStack.peek();
        }
        return mainBlockStack.peek();
    }


    private Block getMainBlock() {
        return mainBlockStack.firstElement();
    }

    private void addVariableToMainBlock(String variableName) {
        getMainBlock().addVariableToBlock(variableName);
    }

    private void addVariableToCurrentBlock(String variableName) {
        getCurrentBlock().addVariableToBlock(variableName);
    }

    private List<String> getCurrentBlockVariables() {
        return getCurrentBlock().getVariables();
    }


    @Override
    public void enterLoop(ALMASParser.LoopContext ctx) {
        emit(JavaConstructsUtil.getLoop(ctx));
        addBlock();
        addVariableToCurrentBlock(ctx.IDENTIFIER().getText());
    }


    @Override
    public void exitJava_code_block(ALMASParser.Java_code_blockContext ctx) {
        emit(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public void exitLoop(ALMASParser.LoopContext ctx) {
        emit("}\n");
        removeCurrentBlock();
    }


    @Override
    public void exitBreak_continue(ALMASParser.Break_continueContext ctx) {
        emit(JavaConstructsUtil.getBreakContinueSt(ctx));
        String error = SemanticChecker.checkBreakAndContinueSemantics(ctx);
        if (!error.isEmpty()) {
            semanticErrors.add(error);
        }
    }

    @Override
    public void enterPrint(ALMASParser.PrintContext ctx) {
        emit(JavaConstructsUtil.getPrint(ctx));
    }

    @Override
    public void enterInput(ALMASParser.InputContext ctx) {
        emit(JavaConstructsUtil.getInput(ctx));
    }

    private void addFunctionInputToCurrentBlock(ALMASParser.FunctionContext ctx) {
        addBlock();
        if (ctx.func_inputs().IDENTIFIER() != null) {
            addVariableToCurrentBlock(ctx.func_inputs().IDENTIFIER().getText());
            ALMASParser.More_func_inputsContext funcInput = ctx.func_inputs().more_func_inputs();
            while (funcInput != null) {
                addVariableToCurrentBlock(funcInput.IDENTIFIER().getText());
                funcInput = funcInput.more_func_inputs();
            }
        }
    }

    @Override
    public void enterFunction(ALMASParser.FunctionContext ctx) {
        functionContext = true;
        emit(JavaConstructsUtil.getFunction(ctx));
        addBlock();
        addFunctionInputToCurrentBlock(ctx);
        String error = SemanticChecker.checkVariableIsAlreadyDefined(ctx.IDENTIFIER()
                , getMainBlock());
        if (!error.isEmpty()) {
            semanticErrors.add(error);
        }
        addVariableToMainBlock(ctx.IDENTIFIER().getText());
    }

    @Override
    public void exitFunction(ALMASParser.FunctionContext ctx) {
        emit(JavaConstructsUtil.getFunctionReturnType(ctx));
        removeCurrentBlock();
        functionContext = false;
    }

    private List<TerminalNode> getFunctionCallIdentifiers(ALMASParser.Function_callContext ctx) {
        List<TerminalNode> identifiers = new LinkedList<>();

        if (ctx.func_args()!= null && ctx.func_args().IDENTIFIER() != null) {
            identifiers.add(ctx.func_args().IDENTIFIER());

            ALMASParser.More_func_argsContext moreFuncArg = ctx.func_args().more_func_args();
            while (moreFuncArg != null) {
                identifiers.add(moreFuncArg.IDENTIFIER());
                moreFuncArg = moreFuncArg.more_func_args();
            }
            return identifiers;
        }

        return null;
    }

    @Override
    public void enterFunction_call(ALMASParser.Function_callContext ctx) {
        emit(JavaConstructsUtil.getFunctionCall(ctx));

        List<TerminalNode> functionCallIdentifiers = getFunctionCallIdentifiers(ctx);
        if (functionCallIdentifiers != null) {
            functionCallIdentifiers.forEach(identifier -> {
                String error = SemanticChecker.checkVariableIsDefined(identifier, getCurrentBlock());
                if (!error.isEmpty()) {
                    semanticErrors.add(error);
                }
            });
        }

    }


    @Override
    public void enterBoolean_cast(ALMASParser.Boolean_castContext ctx) {
        emit(JavaConstructsUtil.getBooleanCast(ctx));
    }


    @Override
    public void enterDecimal_cast(ALMASParser.Decimal_castContext ctx) {
        emit(JavaConstructsUtil.getDoubleCast(ctx));
    }

    @Override
    public void enterString_cast(ALMASParser.String_castContext ctx) {
        emit(JavaConstructsUtil.getStringCast(ctx));
    }

    // general methods

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
