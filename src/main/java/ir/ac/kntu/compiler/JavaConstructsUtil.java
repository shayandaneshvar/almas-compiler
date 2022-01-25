package ir.ac.kntu.compiler;

import java.util.List;

public final class JavaConstructsUtil {

    private static final String DECIMAL = "double", STRING = "String", BOOLEAN = "boolean";
    private static final String STRING_CAST = "stringCast(INPUT)";
    private static final String DECIMAL_CAST = "decimalCast(INPUT)";
    private static final String BOOLEAN_CAST = "booleanCast(INPUT)";
    private static final String INPUT = "input(INPUT)";
    private static final String PRINT = "System.out.println(INPUT);\n";
    private static final String LOOP = "for (int ID = START; i < END; i += INC) {\n";
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
        return BOOLEAN_CAST.replace("INPUT", ctx.getText());
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
            return result + ctx.decimal_expressions().getText();
        return result;
    }

    public static String getBooleanAssignment(ALMASParser.Boolean_assignmentContext ctx) {
        String result = ctx.ASSIGNMENT_OP() + " " + "booleanCast(";
        if (ctx.BOOLEAN() != null)
            return result + ctx.BOOLEAN().getText();
        return result;
    }

    public static String getLoop(ALMASParser.LoopContext ctx) {
        List<ALMASParser.Decimal_expressionsContext> decimalExpressions = ctx.decimal_expressions();

        String start, end, inc;

        if (decimalExpressions.size() == 1) {
            start = "0";
            end = decimalExpressions.get(0).getText();
            inc = "1";
        } else {
            start = decimalExpressions.get(0).getText();
            end = decimalExpressions.get(1).getText();
            inc = decimalExpressions.get(2).getText();
        }

        return LOOP
                .replace("ID", ctx.IDENTIFIER().getText())
                .replace("START", start)
                .replace("END", end)
                .replace("INC", inc);
    }
}
