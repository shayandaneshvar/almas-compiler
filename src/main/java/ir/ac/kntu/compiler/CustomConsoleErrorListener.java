package ir.ac.kntu.compiler;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CustomConsoleErrorListener extends ConsoleErrorListener {
    private final HashMap<String, List<InvalidToken>> invalidTokens = new HashMap<>();

    public List<List<InvalidToken>> getInvalidTokens() {
        return invalidTokens.values()
                .stream()
                .sorted((x, y) -> y.size() - x.size())
                .collect(Collectors.toList());
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
        int startingIndex = msg.indexOf("'") + 1;
        int endingIndex = msg.lastIndexOf("'");
        int row = line;
        int column = charPositionInLine;
        String token = msg.substring(startingIndex, endingIndex);
        List<InvalidToken> tokenOccurrences = invalidTokens.getOrDefault(token, new ArrayList<>());
        tokenOccurrences.add(new InvalidToken(row, column, token));
        invalidTokens.put(token, tokenOccurrences);
    }
}
