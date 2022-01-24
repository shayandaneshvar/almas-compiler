package ir.ac.kntu.compiler;

public final class JavaConstructsUtil {

    public static String getBaseConstruct(String filename, String codes, String functions) {
        return BASE_CONSTRUCT
                .replace("FILE_NAME", filename)
                .replace("CODES", codes)
                .replace("FUNCTIONS", functions);
    }

    public static String getStringAssignment(ALMASParser.String_assignmentContext ctx) {
        return ctx.ASSIGNMENT_OP() + " " + ctx.STRING() + "\n";
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
        return result + " " + ctx.IDENTIFIER();
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
    private static final String DECIMAL = "double", STRING = "String", BOOLEAN = "boolean";
    private static final String STRING_CAST = "stringCast(INPUT)";
    private static final String BASE_CONSTRUCT = "import java.util.Scanner;\n" +
            "public class FILE_NAME {\n" +
            "  private static final Scanner scanner = new Scanner(System.in);\n" +
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
            "  public static void main(String[] args) {\n" +
            "      CODES\n" +
            "\n" +
            "  scanner.close();\n" +
            "  }\n" +
            "\n" +
            "  FUNCTIONS\n" +
            "\n" +
            " }";



}
