package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.Token;

public final class SemanticChecker {

    private static String getLocation(Token token) {
        return "(" +
                token.getLine() + ", " +
                token.getCharPositionInLine() + ")";
    }

    // TODO: 1/25/2022 excess bullshit
    public static String checkAssignmentSemantics(ALMASParser.AssignmentContext ctx) {
        if (ctx.STRING_TYPE() == null ^ ctx.string_assignment() == null) {
            return "Wrong String Assignment semantics at (row,col) => " +
                    getLocation(ctx.STRING_TYPE().getSymbol());
        }
        if (ctx.BOOLEAN_TYPE() == null ^ ctx.boolean_assignment() == null) {
            return "Wrong Boolean Assignment semantics at (row,col) => " +
                    getLocation(ctx.BOOLEAN_TYPE().getSymbol());
        }
        if (ctx.DECIMAL_TYPE() == null ^ ctx.decimal_assignment() == null) {
            return "Wrong Decimal Assignment semantics at (row,col) => " +
                    getLocation(ctx.DECIMAL_TYPE().getSymbol());
        }
        return "";
    }
}
