package ir.ac.kntu.compiler;// Generated from ALMAS.g by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ALMASLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            WS = 1, JAVA_STARTER = 2, DECIMAL_TYPE = 3, STRING_TYPE = 4, BOOLEAN_TYPE = 5, VOID_TYPE = 6,
            ASSIGNMENT_OP = 7, RELATIONAL_OPERATOR = 8, EQUAL = 9, COMMA = 10, COLON = 11, CURLY_RIGHT = 12,
            CURLY_LEFT = 13, LEFT_P = 14, RIGHT_P = 15, PRINT_OP = 16, INPUT_OP = 17, BOOLEAN = 18,
            IF_SYMBOL = 19, ELSE_IF_SYMBOL = 20, ELSE_SYMBOL = 21, FOR_SYMBOL = 22, FUNCTION_SYMBOL = 23,
            RETURN_SYMBOL = 24, CONTINUE_SYMBOL = 25, BREAK_SYMBOL = 26, DECIMAL = 27, BOOLEAN_CAST_SYMBOL = 28,
            STRING_CAST_SYMBOL = 29, DECIMAL_CAST_SYMBOL = 30, UNARY_OP = 31, BINARY_BOOLEAN_OP = 32,
            BINARY_DECIMAL_OP = 33, IDENTIFIER = 34, STRING = 35;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "WS", "JAVA_STARTER", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE",
                "VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", "MUL", "DIV", "ADD",
                "SUB", "MOD", "INTEGER_DIV", "AND", "OR", "XOR", "NOT", "EQUAL", "COMMA",
                "COLON", "CURLY_RIGHT", "CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP",
                "INPUT_OP", "BOOLEAN", "IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL",
                "FOR_SYMBOL", "FUNCTION_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL",
                "BREAK_SYMBOL", "SIGN", "NUMBER", "DECIMAL", "BOOLEAN_CAST_SYMBOL", "STRING_CAST_SYMBOL",
                "DECIMAL_CAST_SYMBOL", "UNARY_OP", "BINARY_BOOLEAN_OP", "BINARY_DECIMAL_OP",
                "IDENTIFIER", "STRING_LITERAL", "STRING", "ANYCHAR"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, "'@java'", "'#'", "'$'", "'?'", "'_'", "'='", null, "'is'",
                "','", "':'", "'}'", "'{'", "'('", "')'", "'@print'", "'@input'", null,
                "'if'", "'elif'", "'else'", "'loop'", "'fn'", "'ret'", "'go'", "'break'",
                null, "'@?'", "'@$'", "'@#'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "WS", "JAVA_STARTER", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE",
                "VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", "EQUAL", "COMMA",
                "COLON", "CURLY_RIGHT", "CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP",
                "INPUT_OP", "BOOLEAN", "IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL",
                "FOR_SYMBOL", "FUNCTION_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL",
                "BREAK_SYMBOL", "DECIMAL", "BOOLEAN_CAST_SYMBOL", "STRING_CAST_SYMBOL",
                "DECIMAL_CAST_SYMBOL", "UNARY_OP", "BINARY_BOOLEAN_OP", "BINARY_DECIMAL_OP",
                "IDENTIFIER", "STRING"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public ALMASLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "ALMAS.g";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0123\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t" +
                    "\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3" +
                    "\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3" +
                    "\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3" +
                    "\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3" +
                    "\35\3\35\3\35\5\35\u00b8\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37" +
                    "\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%" +
                    "\3%\3%\3%\3%\3&\3&\5&\u00de\n&\3\'\6\'\u00e1\n\'\r\'\16\'\u00e2\3(\5(" +
                    "\u00e6\n(\3(\3(\5(\u00ea\n(\3(\3(\3(\3(\3(\5(\u00f1\n(\3(\3(\5(\u00f5" +
                    "\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\5-\u0105\n-\3.\3.\3.\3." +
                    "\3.\3.\5.\u010d\n.\3/\3/\3/\7/\u0112\n/\f/\16/\u0115\13/\3\60\3\60\3\61" +
                    "\3\61\7\61\u011b\n\61\f\61\16\61\u011e\13\61\3\61\3\61\3\62\3\62\2\2\63" +
                    "\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2" +
                    "!\2#\2%\2\'\13)\f+\r-\16/\17\61\20\63\21\65\22\67\239\24;\25=\26?\27A" +
                    "\30C\31E\32G\33I\34K\2M\2O\35Q\36S\37U W!Y\"[#]$_\2a%c\2\3\2\6\5\2\13" +
                    "\f\17\17\"\"\4\2>>@@\4\2C\\c|\3\2$$\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2" +
                    "\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2" +
                    "\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2" +
                    "\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3" +
                    "\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2" +
                    "\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2" +
                    "[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\3e\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\tq\3" +
                    "\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2" +
                    "\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35" +
                    "\u008a\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3" +
                    "\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\u009e" +
                    "\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00ab\3" +
                    "\2\2\29\u00b7\3\2\2\2;\u00b9\3\2\2\2=\u00bc\3\2\2\2?\u00c1\3\2\2\2A\u00c6" +
                    "\3\2\2\2C\u00cb\3\2\2\2E\u00ce\3\2\2\2G\u00d2\3\2\2\2I\u00d5\3\2\2\2K" +
                    "\u00dd\3\2\2\2M\u00e0\3\2\2\2O\u00f4\3\2\2\2Q\u00f6\3\2\2\2S\u00f9\3\2" +
                    "\2\2U\u00fc\3\2\2\2W\u00ff\3\2\2\2Y\u0104\3\2\2\2[\u010c\3\2\2\2]\u010e" +
                    "\3\2\2\2_\u0116\3\2\2\2a\u0118\3\2\2\2c\u0121\3\2\2\2ef\t\2\2\2fg\3\2" +
                    "\2\2gh\b\2\2\2h\4\3\2\2\2ij\7B\2\2jk\7l\2\2kl\7c\2\2lm\7x\2\2mn\7c\2\2" +
                    "n\6\3\2\2\2op\7%\2\2p\b\3\2\2\2qr\7&\2\2r\n\3\2\2\2st\7A\2\2t\f\3\2\2" +
                    "\2uv\7a\2\2v\16\3\2\2\2wx\7?\2\2x\20\3\2\2\2y\177\t\3\2\2z{\7@\2\2{\177" +
                    "\7?\2\2|}\7>\2\2}\177\7?\2\2~y\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177\22\3\2" +
                    "\2\2\u0080\u0081\7,\2\2\u0081\24\3\2\2\2\u0082\u0083\7\61\2\2\u0083\26" +
                    "\3\2\2\2\u0084\u0085\7-\2\2\u0085\30\3\2\2\2\u0086\u0087\7/\2\2\u0087" +
                    "\32\3\2\2\2\u0088\u0089\7\'\2\2\u0089\34\3\2\2\2\u008a\u008b\7\61\2\2" +
                    "\u008b\u008c\7\61\2\2\u008c\36\3\2\2\2\u008d\u008e\7(\2\2\u008e \3\2\2" +
                    "\2\u008f\u0090\7~\2\2\u0090\"\3\2\2\2\u0091\u0092\7`\2\2\u0092$\3\2\2" +
                    "\2\u0093\u0094\7#\2\2\u0094&\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7" +
                    "u\2\2\u0097(\3\2\2\2\u0098\u0099\7.\2\2\u0099*\3\2\2\2\u009a\u009b\7<" +
                    "\2\2\u009b,\3\2\2\2\u009c\u009d\7\177\2\2\u009d.\3\2\2\2\u009e\u009f\7" +
                    "}\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\62\3\2\2\2\u00a2\u00a3" +
                    "\7+\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7B\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7" +
                    "\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa" +
                    "\66\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae" +
                    "\u00af\7r\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7v\2\2\u00b18\3\2\2\2\u00b2" +
                    "\u00b3\7{\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b8\7u\2\2\u00b5\u00b6\7p\2\2" +
                    "\u00b6\u00b8\7q\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8:\3\2" +
                    "\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb<\3\2\2\2\u00bc\u00bd" +
                    "\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0" +
                    ">\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4" +
                    "\u00c5\7g\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7q\2\2\u00c8" +
                    "\u00c9\7q\2\2\u00c9\u00ca\7r\2\2\u00caB\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc" +
                    "\u00cd\7p\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0" +
                    "\u00d1\7v\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7q\2\2\u00d4" +
                    "H\3\2\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8" +
                    "\u00d9\7c\2\2\u00d9\u00da\7m\2\2\u00daJ\3\2\2\2\u00db\u00de\5\27\f\2\u00dc" +
                    "\u00de\5\31\r\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00deL\3\2\2\2" +
                    "\u00df\u00e1\4\62;\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0" +
                    "\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3N\3\2\2\2\u00e4\u00e6\5K&\2\u00e5\u00e4" +
                    "\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f5\5M\'\2\u00e8" +
                    "\u00ea\5K&\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2" +
                    "\2\u00eb\u00ec\5M\'\2\u00ec\u00ed\7\60\2\2\u00ed\u00ee\5M\'\2\u00ee\u00f5" +
                    "\3\2\2\2\u00ef\u00f1\5K&\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1" +
                    "\u00f2\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3\u00f5\5M\'\2\u00f4\u00e5\3\2" +
                    "\2\2\u00f4\u00e9\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5P\3\2\2\2\u00f6\u00f7" +
                    "\7B\2\2\u00f7\u00f8\7A\2\2\u00f8R\3\2\2\2\u00f9\u00fa\7B\2\2\u00fa\u00fb" +
                    "\7&\2\2\u00fbT\3\2\2\2\u00fc\u00fd\7B\2\2\u00fd\u00fe\7%\2\2\u00feV\3" +
                    "\2\2\2\u00ff\u0100\5%\23\2\u0100X\3\2\2\2\u0101\u0105\5\37\20\2\u0102" +
                    "\u0105\5!\21\2\u0103\u0105\5#\22\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2" +
                    "\2\2\u0104\u0103\3\2\2\2\u0105Z\3\2\2\2\u0106\u010d\5\27\f\2\u0107\u010d" +
                    "\5\31\r\2\u0108\u010d\5\23\n\2\u0109\u010d\5\25\13\2\u010a\u010d\5\35" +
                    "\17\2\u010b\u010d\5\33\16\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c" +
                    "\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2" +
                    "\2\2\u010d\\\3\2\2\2\u010e\u0113\t\4\2\2\u010f\u0112\5M\'\2\u0110\u0112" +
                    "\t\4\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113" +
                    "\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114^\3\2\2\2\u0115\u0113\3\2\2\2" +
                    "\u0116\u0117\7$\2\2\u0117`\3\2\2\2\u0118\u011c\5_\60\2\u0119\u011b\5c" +
                    "\62\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c" +
                    "\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5_" +
                    "\60\2\u0120b\3\2\2\2\u0121\u0122\n\5\2\2\u0122d\3\2\2\2\20\2~\u00b7\u00dd" +
                    "\u00e2\u00e5\u00e9\u00f0\u00f4\u0104\u010c\u0111\u0113\u011c\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
