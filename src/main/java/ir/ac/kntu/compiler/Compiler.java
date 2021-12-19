package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public enum Compiler {
    INSTANCE;
    private List<List<InvalidToken>> invalidTokens = new ArrayList<>();

    public List<List<InvalidToken>> getInvalidTokens() {
        return invalidTokens;
    }

    private ALMASLexer lexer = null;

    public void runLexer(String sourceCode) {
        lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(sourceCode));
        CustomConsoleErrorListener listener = new CustomConsoleErrorListener();
        lexer.addErrorListener(listener);
        List<? extends Token> extractedTokens = lexer.getAllTokens();
        extractedTokens.forEach(z -> {
            System.out.println("Text: " + z.getText());
            System.out.println("Type: " + z.getType());
            System.out.println("Index: " + z.getStartIndex() + ", " + z.getStopIndex());
            System.out.println("Line: " + z.getLine());
            System.out.println("Channel: " + z.getChannel());
            System.out.println("token index: " + z.getTokenIndex());
            System.out.println("token source: " + z.getTokenSource());
            System.out.println("char pos inline: " + z.getCharPositionInLine());
        });
        invalidTokens = listener.getInvalidTokens();
    }


    public void runParser() {
        if (lexer == null) {
            throw new FatalException("Should run lexer first!");
        }
        if (!invalidTokens.isEmpty()) {
            throw new FatalException("We have invalid Tokens"); // FIXME: Phase 3
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ALMASParser parser = new ALMASParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ALMASBaseListener(), tree);
    }

    public static void main(String[] args) {
        String src = "2 * 2 + 4/5 + 7//3 asd ♦ ♣ ♣ ▬ ♪ ♫ fuck shit this ☺ ";
        ALMASLexer lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(src));
        CustomConsoleErrorListener listener = new CustomConsoleErrorListener();
        lexer.addErrorListener(listener);

        List<? extends Token> extractedTokens = lexer.getAllTokens();
        extractedTokens.forEach(z -> {
            System.out.println("Text: " + z.getText());
            System.out.println("Type: " + z.getType());
            System.out.println("Index: " + z.getStartIndex() + ", " + z.getStopIndex());
            System.out.println("Line: " + z.getLine());
            System.out.println("Channel: " + z.getChannel());
            System.out.println("token index: " + z.getTokenIndex());
            System.out.println("token source: " + z.getTokenSource());
            System.out.println("char pos inline: " + z.getCharPositionInLine());
        });

        List<List<InvalidToken>> invalidTokens = listener.getInvalidTokens();
//        System.out.println("D");
//        System.out.println(extractedTokens);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        ALMASParser parser = new ALMASParser(tokens);
//        ParseTree tree = parser.program(); // begin parsing at init rule
//        System.out.println(tree.toStringTree(parser));
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new ALMASBaseListener(), tree);
    }
}
