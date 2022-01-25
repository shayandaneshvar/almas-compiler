package ir.ac.kntu.compiler;

public final class JavaConstructsUtil {

    private static final String DECIMAL = "double", STRING = "String", BOOLEAN = "boolean";
    private static final String STRING_CAST = "stringCast(INPUT)";
    private static final String DECIMAL_CAST = "decimalCast(INPUT)";
    private static final String BOOLEAN_CAST = "booleanCast(INPUT)";
    private static final String INPUT = "input(INPUT)";
    private static final String PRINT = "System.out.println(INPUT);\n";
    private static final String LOOP = "for (int ID = START; i < END; i += INC) {\n";
    private static final String IF = "if (TERM) {\n";
    private static final String ELIF = "else if (TERM) {\n";
    private static final String ELSE = "else {\n";
    private static final String FUNCTION = "\n" +
            "    public static RETURN_TYPE FUNCTION_NAME(INPUTS) {\n";
    private static final String FUNCTION_CALL = "FUNCTION_NAME(INPUTS);";
    private static final String BASE_CONSTRUCT = "import java.util.Scanner;\n" +
            "public class FILE_NAME {\n" +
            "  private static final Scanner scanner = new Scanner(System.in);\n" +
            "    public static double decimalCast(double value) {\n" +
            "        return value;\n" +
            "    }\n" +
            "\n" +
            "    public static String input(String message) {\n" +
            "        System.out.println(message);\n" +
            "        return scanner.nextLine();\n" +
            "    }\n" +
            "\n" +
            "    public static double decimalCast(String value) {\n" +
            "        return Double.parseDouble(value);\n" +
            "    }\n" +
            "\n" +
            "    public static double decimalCast(boolean value) {\n" +
            "        if (value) return 1.0;\n" +
            "        return 0.0;\n" +
            "    }\n" +
            "\n" +
            "    public static boolean booleanCast(double value) {\n" +
            "        return !(value < 1) || !(value > -1);\n" +
            "    }\n" +
            "\n" +
            "    public static boolean booleanCast(String value) {\n" +
            "        return value.equals(\"yes\") || value.equals(\"1\");\n" +
            "    }\n" +
            "\n" +
            "    public static boolean booleanCast(boolean value) {\n" +
            "        return value;\n" +
            "    }\n" +
            "    public static String stringCast(double value) {\n" +
            "        return String.valueOf(value);\n" +
            "    }\n" +
            "\n" +
            "    public static String stringCast(String value) {\n" +
            "        return value;\n" +
            "    }\n" +
            "\n" +
            "    public static String stringCast(boolean value) {\n" +
            "        if (value) return \"yes\";\n" +
            "        return \"no\";\n" +
            "    }\n" +
            "    public static void main(String[] args) {\n" +
            "      CODES\n" +
            "\n" +
            "        scanner.close();\n" +
            "    }\n" +
            "\n" +
            "    FUNCTIONS\n" +
            "\n" +
            " }\n";


    public static String getBaseConstruct(String filename, String codes, String functions) {
        return BASE_CONSTRUCT
                .replace("FILE_NAME", filename)
                .replace("CODES", codes)
                .replace("FUNCTIONS", functions);
    }


    public static String getAssignment(ALMASParser.AssignmentContext ctx) {
        String result = "";
        if (ctx.STRING_TYPE() != null) {
            result += STRING;
        } else if (ctx.BOOLEAN_TYPE() != null) {
            result += BOOLEAN;
        } else if (ctx.DECIMAL_TYPE() != null) {
            result += DECIMAL;
        }
        return result + " " + ctx.IDENTIFIER() + " ";
    }

    public static String getPrimitiveType(ALMASParser.Primitive_typeContext ctx) {
        if (ctx.BOOLEAN_TYPE() != null) return BOOLEAN;
        if (ctx.DECIMAL_TYPE() != null) return DECIMAL;
        if (ctx.STRING_TYPE() != null) return STRING;
        throw new FatalException("Unexpected Error in getPrimitiveType(ctx)");
    }

    public static String getStringCast(ALMASParser.String_castContext ctx) {
        return STRING_CAST.replace("INPUT", ctx.IDENTIFIER().getText());
    }

    public static String getDoubleCast(ALMASParser.Decimal_castContext ctx) {
        return DECIMAL_CAST.replace("INPUT", ctx.IDENTIFIER().getText());
    }

    public static String getBooleanCast(ALMASParser.Boolean_castContext ctx) {
        return BOOLEAN_CAST.replace("INPUT", translateExpression(ctx.getText()));
    }

    public static String getInput(ALMASParser.InputContext ctx) {
        return INPUT.replace("INPUT", ctx.IDENTIFIER() == null ? ctx.STRING().getText() :
                STRING_CAST.replace("INPUT", ctx.IDENTIFIER().getText()));
    }

    public static String getPrint(ALMASParser.PrintContext ctx) { // FIXME: 1/25/2022
        return PRINT.replace("INPUT", ctx.IDENTIFIER() != null ?
                ctx.IDENTIFIER().getText() : ctx.STRING().getText());
    }


    public static String getStringAssignment(ALMASParser.String_assignmentContext ctx) {
        String result = ctx.ASSIGNMENT_OP() + " " + "stringCast(";
        if (ctx.STRING() != null)
            return result + ctx.STRING().getText();
        return result;
    }

    public static String getDecimalAssignment(ALMASParser.Decimal_assignmentContext ctx) {
        String result = ctx.ASSIGNMENT_OP() + " " + "decimalCast(";
        if (ctx.decimal_expressions() != null)
            return result + ctx.decimal_expressions().getText().replace("//", "/");
        return result;
    }

    public static String getBooleanAssignment(ALMASParser.Boolean_assignmentContext ctx) {
        String result = ctx.ASSIGNMENT_OP() + " " + "booleanCast(";
        if (ctx.BOOLEAN() != null)
            return result + translateExpression(ctx.BOOLEAN().getText());
        else if (ctx.expressions() != null) {
            return translateExpression(ctx.expressions().getText());
        }
        return result;
    }

    private static String translateExpression(String input) {
        return input
                .replace("is", "==")
                .replace("&", "&&")
                .replace("|", "||")
                .replace("yes", "true")
                .replace("no", "false");
    }

    public static String getLoop(ALMASParser.LoopContext ctx) {
        String start, end, inc;
        String[] numbers = ctx.getText()
                .substring(7, ctx.getText().length() - 3).split(":");
        start = numbers[0].trim().isEmpty() ? "0" : numbers[0].trim();
        end = numbers[1].trim();
        inc = numbers[2].trim().isEmpty() ? "1" : numbers[2].trim();

        return LOOP.replace("ID", ctx.IDENTIFIER().getText())
                .replace("START", start)
                .replace("END", end)
                .replace("INC", inc);
    }

    public static String getIfSt(ALMASParser.Bare_ifContext ctx) {
        return IF.replace("TERM", translateExpression(ctx.expressions().getText()));
    }

    public static String getElif(ALMASParser.ElifContext ctx) {
        return ELIF.replace("TERM", translateExpression(ctx.expressions().getText()));
    }

    public static String getElse(ALMASParser.Else_stContext ctx) {
        return ELSE;
    }

    public static String getFunction(ALMASParser.FunctionContext ctx) {
        String result = FUNCTION.replace("FUNCTION_NAME", ctx.IDENTIFIER().getText());
        if (ctx.return_type().VOID_TYPE() != null) {
            result = result.replace("RETURN_TYPE", "void");
        } else {
            if (ctx.return_type().primitive_type().STRING_TYPE() != null) {
                result = result.replace("RETURN_TYPE", "String");
            } else if (ctx.return_type().primitive_type().BOOLEAN_TYPE() != null) {
                result = result.replace("RETURN_TYPE", "boolean");
            } else if (ctx.return_type().primitive_type().DECIMAL_TYPE() != null) {
                result = result.replace("RETURN_TYPE", "double");
            }
        }
        return result.replace("INPUTS", ctx.func_inputs()
                .getText()
                .substring(1, ctx.func_inputs().getText().length() - 1)
                .replace("$", "String ")
                .replace("#", "double ")
                .replace("?", "boolean "));
    }

    public static String getFunctionReturnType(ALMASParser.FunctionContext ctx) {
        // TODO: 1/25/2022 Semantic Checking of return type and return Value
        if (ctx.return_st() == null) {
            return "} \n";
        }
        String result = "return ";
        if (ctx.return_st().STRING() != null) {
            result += ctx.return_st().STRING().getText();
        } else if (ctx.return_st().BOOLEAN() != null) {
            result += ctx.return_st().BOOLEAN().getText().equals("yes") ? "true" : "false";
        } else if (ctx.return_st().IDENTIFIER() != null) {
            result += ctx.return_st().IDENTIFIER().getText();
        } else if (ctx.return_st().expressions() != null) {
            result += translateExpression(ctx.return_st().expressions().getText());
        } else if (ctx.return_st().decimal_expressions() != null) {
            result += ctx.return_st().decimal_expressions().getText().replace("//", "/");
        }

        return result + "; \n } \n";
    }

    public static String getFunctionCall(ALMASParser.Function_callContext ctx) {
        String result = FUNCTION_CALL.replace("FUNCTION_NAME", ctx.IDENTIFIER().getText());
        return result.replace("INPUTS", translateExpression(ctx.func_args().getText())
                .replace("//", "/"));
    }

    public static String getLoopSt(ALMASParser.Loop_statementsContext ctx) {
        if(ctx.BREAK_SYMBOL() != null){
            return "break;";
        }
        if(ctx.CONTINUE_SYMBOL() != null){
            return "continue;";
        }
        return "";
    }
}
