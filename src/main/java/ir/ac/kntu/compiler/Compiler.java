package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public enum Compiler {
    INSTANCE;
    private ALMASLexer lexer = null;
    private List<List<InvalidToken>> invalidTokens = new ArrayList<>();
    private List<? extends Token> extractedTokens;
    private Set<String> syntaxErrors;
    private Set<String> semanticErrors;

    public Set<String> getSyntaxErrors() {
        return syntaxErrors;
    }

    public List<List<InvalidToken>> getInvalidTokens() {
        return invalidTokens;
    }

    public List<? extends Token> getExtractedTokens() {
        return extractedTokens;
    }

    public Set<String> getSemanticErrors() {
        return semanticErrors;
    }

    public String getTokenName(int tokenId) {
        return Optional.ofNullable(lexer)
                .map(l -> l.getVocabulary().getSymbolicName(tokenId))
                .orElseThrow(() -> new FatalException("Run Lexer First!"));
    }

    public void runLexer(String sourceCode) {
        lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(sourceCode));
        CustomLexerConsoleErrorListener listener = new CustomLexerConsoleErrorListener();
        lexer.addErrorListener(listener);
        extractedTokens = lexer.getAllTokens();
        invalidTokens = listener.getInvalidTokens();
        extractedTokens.forEach(z -> {
            System.out.println("Text: " + z.getText());
            System.out.println("Type: " + z.getType());
            System.out.println("Index: " + z.getStartIndex() + ", " + z.getStopIndex());
            System.out.println("Line: " + z.getLine());
            System.out.println("Channel: " + z.getChannel());
            System.out.println("token index: " + z.getTokenIndex());
            System.out.println("token source: " + z.getTokenSource());
            System.out.println("char pos inline: " + z.getCharPositionInLine());
            System.out.println("Display Name: " + lexer.getVocabulary().getDisplayName(z.getType()));
            System.out.println("Literal Name: " + lexer.getVocabulary().getLiteralName(z.getType()));
            System.out.println("Symbolic name: " + lexer.getVocabulary().getSymbolicName(z.getType()));
            System.out.println("-----------");
        });

    }


    public Function<String, String> runParser(String sourceCode) {
        lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ALMASParser parser = new ALMASParser(tokens);
        CustomParserConsoleErrorListener listener = new CustomParserConsoleErrorListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.program();// begin parsing at init rule
        syntaxErrors = listener.getErrors();
        if (!syntaxErrors.isEmpty()) {
            return x -> null;
        }
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        ALMASRuleListener semanticListener = new ALMASRuleListener("FILENAME");
        walker.walk(semanticListener, tree);
        semanticErrors = semanticListener.getSemanticErrors();

        return filename -> semanticListener.getJavaCode().replace("FILENAME", filename);
    }

    public static void main(String[] args) {
        String src = "2 * 2 + 4/5 + 7//3 asd ♦ ♣ ♣ ▬ ♪ ♫ this ☺ ";
        ALMASLexer lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(src));
        CustomLexerConsoleErrorListener listener = new CustomLexerConsoleErrorListener();
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
            System.out.println("Display Name: " + lexer.getVocabulary().getDisplayName(z.getType()));
            System.out.println("Literal Name: " + lexer.getVocabulary().getLiteralName(z.getType()));
            System.out.println("Symbolic name: " + lexer.getVocabulary().getSymbolicName(z.getType()));
            System.out.println("-----------");
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
