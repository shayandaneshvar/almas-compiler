package ir.ac.kntu.compiler;// Generated from ALMAS.g by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ALMASLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DECIMAL_TYPE=2, STRING_TYPE=3, BOOLEAN_TYPE=4, VOID_TYPE=5, ASSIGNMENT_OP=6, 
		RELATIONAL_OPERATOR=7, EQUAL=8, COMMA=9, COLON=10, CURLY_RIGHT=11, CURLY_LEFT=12, 
		LEFT_P=13, RIGHT_P=14, PRINT_OP=15, INPUT_OP=16, BOOLEAN=17, IF_SYMBOL=18, 
		ELSE_IF_SYMBOL=19, ELSE_SYMBOL=20, FOR_SYMBOL=21, FUNCTION_SYMBOL=22, 
		RETURN_SYMBOL=23, CONTINUE_SYMBOL=24, BREAK_SYMBOL=25, DECIMAL=26, BOOLEAN_CAST_SYMBOL=27, 
		STRING_CAST_SYMBOL=28, DECIMAL_CAST_SYMBOL=29, UNARY_OP=30, BINARY_BOOLEAN_OP=31, 
		BINARY_DECIMAL_OP=32, IDENTIFIER=33, STRING=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "ASSIGNMENT_OP", 
			"RELATIONAL_OPERATOR", "MUL", "DIV", "ADD", "SUB", "MOD", "INTEGER_DIV", 
			"AND", "OR", "XOR", "NOT", "EQUAL", "COMMA", "COLON", "CURLY_RIGHT", 
			"CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP", "INPUT_OP", "BOOLEAN", 
			"IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", "FOR_SYMBOL", "FUNCTION_SYMBOL", 
			"RETURN_SYMBOL", "CONTINUE_SYMBOL", "BREAK_SYMBOL", "SIGN", "NUMBER", 
			"DECIMAL", "BOOLEAN_CAST_SYMBOL", "STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL", 
			"UNARY_OP", "BINARY_BOOLEAN_OP", "BINARY_DECIMAL_OP", "IDENTIFIER", "STRING_LITERAL", 
			"STRING", "ANYCHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'#'", "'$'", "'?'", "'_'", "'='", null, "'is'", "','", "':'", 
			"'}'", "'{'", "'('", "')'", "'@print'", "'@input'", null, "'if'", "'elif'", 
			"'else'", "'loop'", "'fn'", "'ret'", "'go'", "'break'", null, "'@?'", 
			"'@$'", "'@#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", 
			"ASSIGNMENT_OP", "RELATIONAL_OPERATOR", "EQUAL", "COMMA", "COLON", "CURLY_RIGHT", 
			"CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP", "INPUT_OP", "BOOLEAN", 
			"IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", "FOR_SYMBOL", "FUNCTION_SYMBOL", 
			"RETURN_SYMBOL", "CONTINUE_SYMBOL", "BREAK_SYMBOL", "DECIMAL", "BOOLEAN_CAST_SYMBOL", 
			"STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL", "UNARY_OP", "BINARY_BOOLEAN_OP", 
			"BINARY_DECIMAL_OP", "IDENTIFIER", "STRING"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ALMAS.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bw\n\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00b0\n\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\5%\u00d6\n"+
		"%\3&\6&\u00d9\n&\r&\16&\u00da\3\'\5\'\u00de\n\'\3\'\3\'\5\'\u00e2\n\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u00e9\n\'\3\'\3\'\5\'\u00ed\n\'\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3,\3,\3,\5,\u00fd\n,\3-\3-\3-\3-\3-\3-\5-\u0105\n"+
		"-\3.\3.\3.\7.\u010a\n.\f.\16.\u010d\13.\3/\3/\3\60\3\60\7\60\u0113\n\60"+
		"\f\60\16\60\u0116\13\60\3\60\3\60\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\n\'\13)\f+"+
		"\r-\16/\17\61\20\63\21\65\22\67\239\24;\25=\26?\27A\30C\31E\32G\33I\2"+
		"K\2M\34O\35Q\36S\37U W!Y\"[#]\2_$a\2\3\2\6\5\2\13\f\17\17\"\"\4\2>>@@"+
		"\4\2C\\c|\3\2$$\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\3c"+
		"\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17v\3"+
		"\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2"+
		"\2\33\u0082\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#"+
		"\u008b\3\2\2\2%\u008d\3\2\2\2\'\u0090\3\2\2\2)\u0092\3\2\2\2+\u0094\3"+
		"\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009a\3\2\2\2\63\u009c\3\2\2\2"+
		"\65\u00a3\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b4\3\2\2\2=\u00b9"+
		"\3\2\2\2?\u00be\3\2\2\2A\u00c3\3\2\2\2C\u00c6\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00cd\3\2\2\2I\u00d5\3\2\2\2K\u00d8\3\2\2\2M\u00ec\3\2\2\2O\u00ee\3\2"+
		"\2\2Q\u00f1\3\2\2\2S\u00f4\3\2\2\2U\u00f7\3\2\2\2W\u00fc\3\2\2\2Y\u0104"+
		"\3\2\2\2[\u0106\3\2\2\2]\u010e\3\2\2\2_\u0110\3\2\2\2a\u0119\3\2\2\2c"+
		"d\t\2\2\2de\3\2\2\2ef\b\2\2\2f\4\3\2\2\2gh\7%\2\2h\6\3\2\2\2ij\7&\2\2"+
		"j\b\3\2\2\2kl\7A\2\2l\n\3\2\2\2mn\7a\2\2n\f\3\2\2\2op\7?\2\2p\16\3\2\2"+
		"\2qw\t\3\2\2rs\7@\2\2sw\7?\2\2tu\7>\2\2uw\7?\2\2vq\3\2\2\2vr\3\2\2\2v"+
		"t\3\2\2\2w\20\3\2\2\2xy\7,\2\2y\22\3\2\2\2z{\7\61\2\2{\24\3\2\2\2|}\7"+
		"-\2\2}\26\3\2\2\2~\177\7/\2\2\177\30\3\2\2\2\u0080\u0081\7\'\2\2\u0081"+
		"\32\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7\61\2\2\u0084\34\3\2\2\2"+
		"\u0085\u0086\7(\2\2\u0086\36\3\2\2\2\u0087\u0088\7~\2\2\u0088 \3\2\2\2"+
		"\u0089\u008a\7`\2\2\u008a\"\3\2\2\2\u008b\u008c\7#\2\2\u008c$\3\2\2\2"+
		"\u008d\u008e\7k\2\2\u008e\u008f\7u\2\2\u008f&\3\2\2\2\u0090\u0091\7.\2"+
		"\2\u0091(\3\2\2\2\u0092\u0093\7<\2\2\u0093*\3\2\2\2\u0094\u0095\7\177"+
		"\2\2\u0095,\3\2\2\2\u0096\u0097\7}\2\2\u0097.\3\2\2\2\u0098\u0099\7*\2"+
		"\2\u0099\60\3\2\2\2\u009a\u009b\7+\2\2\u009b\62\3\2\2\2\u009c\u009d\7"+
		"B\2\2\u009d\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7w\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\7{\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00b0\7u\2\2\u00ad\u00ae\7p\2\2\u00ae\u00b0\7q\2\2\u00af\u00aa\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7"+
		"h\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7h\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd>\3\2\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7r\2\2\u00c2"+
		"@\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7p\2\2\u00c5B\3\2\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9D\3\2\2\2\u00ca\u00cb"+
		"\7i\2\2\u00cb\u00cc\7q\2\2\u00ccF\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf"+
		"\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7m\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d6\5\25\13\2\u00d4\u00d6\5\27\f\2\u00d5\u00d3\3\2\2"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6J\3\2\2\2\u00d7\u00d9\4\62;\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"L\3\2\2\2\u00dc\u00de\5I%\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00ed\5K&\2\u00e0\u00e2\5I%\2\u00e1\u00e0\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5K&\2\u00e4\u00e5"+
		"\7\60\2\2\u00e5\u00e6\5K&\2\u00e6\u00ed\3\2\2\2\u00e7\u00e9\5I%\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\60"+
		"\2\2\u00eb\u00ed\5K&\2\u00ec\u00dd\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e8"+
		"\3\2\2\2\u00edN\3\2\2\2\u00ee\u00ef\7B\2\2\u00ef\u00f0\7A\2\2\u00f0P\3"+
		"\2\2\2\u00f1\u00f2\7B\2\2\u00f2\u00f3\7&\2\2\u00f3R\3\2\2\2\u00f4\u00f5"+
		"\7B\2\2\u00f5\u00f6\7%\2\2\u00f6T\3\2\2\2\u00f7\u00f8\5#\22\2\u00f8V\3"+
		"\2\2\2\u00f9\u00fd\5\35\17\2\u00fa\u00fd\5\37\20\2\u00fb\u00fd\5!\21\2"+
		"\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fdX\3"+
		"\2\2\2\u00fe\u0105\5\25\13\2\u00ff\u0105\5\27\f\2\u0100\u0105\5\21\t\2"+
		"\u0101\u0105\5\23\n\2\u0102\u0105\5\33\16\2\u0103\u0105\5\31\r\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105Z\3\2\2\2\u0106\u010b"+
		"\t\4\2\2\u0107\u010a\5K&\2\u0108\u010a\t\4\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\\\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7$\2\2\u010f^\3\2"+
		"\2\2\u0110\u0114\5]/\2\u0111\u0113\5a\61\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\5]/\2\u0118`\3\2\2\2\u0119\u011a\n\5\2\2\u011a"+
		"b\3\2\2\2\20\2v\u00af\u00d5\u00da\u00dd\u00e1\u00e8\u00ec\u00fc\u0104"+
		"\u0109\u010b\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
