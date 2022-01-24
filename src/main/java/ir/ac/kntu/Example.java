package ir.ac.kntu;

import ir.ac.kntu.compiler.ALMASLexer;
import ir.ac.kntu.compiler.ALMASParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class Example {
    final static String EOF = "\u001a";

    public static void main1(String[] args) {
        String src = "2 * 2 + 4/5 + 7//3  ";
        ALMASLexer lexer = new ALMASLexer(new ANTLRInputStream(src));
        ALMASParser parser = new ALMASParser(new CommonTokenStream(lexer));
//        CommonTree tree = ((CommonTree)parser.).getTree();
//        DOTTreeGenerator gen = new DOTTreeGenerator();
//        StringTemplate st = gen.toDOT(tree);
        lexer.addErrorListener(new ConsoleErrorListener());
        List<? extends Token> tokens = lexer.getAllTokens();
        System.out.println("DEBUG");
        System.out.println(tokens);
//        parser.addErrorListener(new ConsoleErrorListener());
        
    }
}
