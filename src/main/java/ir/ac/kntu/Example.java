package ir.ac.kntu;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Example {
    public static void main(String[] args) {
        String src = "2 * 2 + 4/5 + 7//3 fuck shit this ";
        ALMASLexer lexer = new ALMASLexer(new org.antlr.v4.runtime.ANTLRInputStream(src));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ALMASParser parser = new ALMASParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ALMASBaseListener(), tree);
    }
}
