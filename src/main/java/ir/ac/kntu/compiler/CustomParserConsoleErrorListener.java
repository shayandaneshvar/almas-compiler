package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.HashSet;
import java.util.Set;

public class CustomParserConsoleErrorListener extends ConsoleErrorListener {
    private final Set<String> errors = new HashSet<>();

    public Set<String> getErrors() {
        return errors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {
        System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
        errors.add("Syntax Error: At (row,column) = (" + line + ", " + charPositionInLine + ") => " + msg);
    }
}
