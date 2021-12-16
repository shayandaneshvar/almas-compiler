package ir.ac.kntu;// Generated from ALMAS.g by ANTLR 4.9.3
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
		PROGRAM_BODY=1, ASSIGNMENT=2, STRING_ASSIGNMENT=3, DECIMAL_ASSIGNMENT=4, 
		BOOLEAN_ASSIGNMENT=5, IF=6, BARE_IF=7, ELIF=8, BARE_ELIF=9, ELSE=10, EXPRESSIONS=11, 
		EXPRESSION=12, RELOP_EXPRESSION=13, STATEMENTS=14, LOOP=15, LOOP_STATEMENTS=16, 
		WS=17, PRIMITIVE_TYPE=18, RETURN_TYPE=19, FUNCTION=20, FUNCTION_CALL=21, 
		FUNC_INPUTS=22, MORE_FUNC_INPUTS=23, RETURN_ST=24, FUNC_ARGS=25, MORE_FUNC_ARGS=26, 
		BOOLEAN_CAST=27, DECIMAL_CAST=28, STRING_CAST=29, IDENTIFIER=30, DECIMAL_TYPE=31, 
		STRING_TYPE=32, BOOLEAN_TYPE=33, VOID_TYPE=34, ASSIGNMENT_OP=35, RELATIONAL_OPERATOR=36, 
		MUL=37, DIV=38, ADD=39, SUB=40, MOD=41, INTEGER_DIV=42, AND=43, OR=44, 
		XOR=45, NOT=46, UNARY_OP=47, BINARY_BOOLEAN_OP=48, EQUAL=49, COMMA=50, 
		COLON=51, CURLY_RIGHT=52, CURLY_LEFT=53, LEFT_P=54, RIGHT_P=55, PRINT_OP=56, 
		INPUT_OP=57, BOOLEAN=58, IF_SYMBOL=59, ELSE_IF_SYMBOL=60, ELSE_SYMBOL=61, 
		FOR_SYMBOL=62, FUNCTION_SYMBOL=63, RETURN_SYMBOL=64, CONTINUE_SYMBOL=65, 
		BREAK_SYMBOL=66, SIGN=67, NUMBER=68, DECIMAL=69, STRING_LITERAL=70, STRING=71, 
		ANYCHAR=72, BOOLEAN_CAST_SYMBOL=73, STRING_CAST_SYMBOL=74, DECIMAL_CAST_SYMBOL=75;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM_BODY", "ASSIGNMENT", "STRING_ASSIGNMENT", "DECIMAL_ASSIGNMENT", 
			"BOOLEAN_ASSIGNMENT", "IF", "BARE_IF", "ELIF", "BARE_ELIF", "ELSE", "EXPRESSIONS", 
			"EXPRESSION", "RELOP_EXPRESSION", "STATEMENTS", "LOOP", "LOOP_STATEMENTS", 
			"WS", "PRIMITIVE_TYPE", "RETURN_TYPE", "FUNCTION", "FUNCTION_CALL", "FUNC_INPUTS", 
			"MORE_FUNC_INPUTS", "RETURN_ST", "FUNC_ARGS", "MORE_FUNC_ARGS", "BOOLEAN_CAST", 
			"DECIMAL_CAST", "STRING_CAST", "IDENTIFIER", "DECIMAL_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "INTEGER_DIV", "AND", "OR", "XOR", 
			"NOT", "UNARY_OP", "BINARY_BOOLEAN_OP", "EQUAL", "COMMA", "COLON", "CURLY_RIGHT", 
			"CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP", "INPUT_OP", "BOOLEAN", 
			"IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", "FOR_SYMBOL", "FUNCTION_SYMBOL", 
			"RETURN_SYMBOL", "CONTINUE_SYMBOL", "BREAK_SYMBOL", "SIGN", "NUMBER", 
			"DECIMAL", "STRING_LITERAL", "STRING", "ANYCHAR", "BOOLEAN_CAST_SYMBOL", 
			"STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'#'", "'$'", "'?'", "'_'", 
			"'='", null, "'*'", "'/'", "'+'", "'-'", "'%'", "'//'", "'&'", "'|'", 
			"'^'", "'!'", null, null, "'is'", "','", "':'", "'{'", "'}'", "'('", 
			"')'", "'@print'", "'@input'", null, "'if'", "'elif'", "'else'", "'loop'", 
			"'fn'", "'ret'", "'go'", "'break'", null, null, null, "'\"'", null, null, 
			"'@?'", "'@$'", "'@#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM_BODY", "ASSIGNMENT", "STRING_ASSIGNMENT", "DECIMAL_ASSIGNMENT", 
			"BOOLEAN_ASSIGNMENT", "IF", "BARE_IF", "ELIF", "BARE_ELIF", "ELSE", "EXPRESSIONS", 
			"EXPRESSION", "RELOP_EXPRESSION", "STATEMENTS", "LOOP", "LOOP_STATEMENTS", 
			"WS", "PRIMITIVE_TYPE", "RETURN_TYPE", "FUNCTION", "FUNCTION_CALL", "FUNC_INPUTS", 
			"MORE_FUNC_INPUTS", "RETURN_ST", "FUNC_ARGS", "MORE_FUNC_ARGS", "BOOLEAN_CAST", 
			"DECIMAL_CAST", "STRING_CAST", "IDENTIFIER", "DECIMAL_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "INTEGER_DIV", "AND", "OR", "XOR", 
			"NOT", "UNARY_OP", "BINARY_BOOLEAN_OP", "EQUAL", "COMMA", "COLON", "CURLY_RIGHT", 
			"CURLY_LEFT", "LEFT_P", "RIGHT_P", "PRINT_OP", "INPUT_OP", "BOOLEAN", 
			"IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", "FOR_SYMBOL", "FUNCTION_SYMBOL", 
			"RETURN_SYMBOL", "CONTINUE_SYMBOL", "BREAK_SYMBOL", "SIGN", "NUMBER", 
			"DECIMAL", "STRING_LITERAL", "STRING", "ANYCHAR", "BOOLEAN_CAST_SYMBOL", 
			"STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0240\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\5\2\u009c\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00aa\n\3\3\4\3\4\3\4\3\4\5\4\u00b0\n\4\3\5"+
		"\3\5\3\5\3\5\5\5\u00b6\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\5\t\u00d4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e9\n\f\3\r\3\r\7\r\u00ed\n"+
		"\r\f\r\16\r\u00f0\13\r\3\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\3\r\3"+
		"\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16"+
		"\3\16\5\16\u0108\n\16\3\16\3\16\3\16\5\16\u010d\n\16\3\16\7\16\u0110\n"+
		"\16\f\16\16\16\u0113\13\16\3\16\3\16\3\16\3\16\5\16\u0119\n\16\3\17\3"+
		"\17\3\17\6\17\u011e\n\17\r\17\16\17\u011f\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0127\n\20\3\20\3\20\3\20\3\20\5\20\u012d\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\6\21\u0137\n\21\r\21\16\21\u0138\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u0142\n\23\3\24\3\24\5\24\u0146\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u014d\n\25\3\25\3\25\3\25\3\25\5\25\u0153\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u015a\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u0161"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0167\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u016f\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0176\n\32\3\32\5\32\u0179"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0181\n\33\3\33\5\33\u0184\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\7\37\u0198\n\37\f\37\16\37\u019b\13\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\5%\u01ac\n%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\5\61\u01c8\n\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\5;\u01ec\n;\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\5D\u0212\nD\3"+
		"E\6E\u0215\nE\rE\16E\u0216\3F\5F\u021a\nF\3F\3F\5F\u021e\nF\3F\3F\3F\3"+
		"F\3F\5F\u0225\nF\3F\3F\5F\u0229\nF\3G\3G\3H\3H\7H\u022f\nH\fH\16H\u0232"+
		"\13H\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\2\2M\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\4\2>>@@\3\2$$\2\u0284\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\3\u009b\3\2\2\2\5\u00a9\3\2\2\2\7\u00ab\3\2\2\2\t\u00b1\3\2\2"+
		"\2\13\u00b7\3\2\2\2\r\u00c5\3\2\2\2\17\u00c7\3\2\2\2\21\u00d3\3\2\2\2"+
		"\23\u00d5\3\2\2\2\25\u00de\3\2\2\2\27\u00e8\3\2\2\2\31\u0103\3\2\2\2\33"+
		"\u0118\3\2\2\2\35\u011d\3\2\2\2\37\u0121\3\2\2\2!\u0136\3\2\2\2#\u013a"+
		"\3\2\2\2%\u0141\3\2\2\2\'\u0145\3\2\2\2)\u0147\3\2\2\2+\u0156\3\2\2\2"+
		"-\u015d\3\2\2\2/\u0162\3\2\2\2\61\u0168\3\2\2\2\63\u0175\3\2\2\2\65\u017a"+
		"\3\2\2\2\67\u0185\3\2\2\29\u018a\3\2\2\2;\u018f\3\2\2\2=\u0194\3\2\2\2"+
		"?\u019c\3\2\2\2A\u019e\3\2\2\2C\u01a0\3\2\2\2E\u01a2\3\2\2\2G\u01a4\3"+
		"\2\2\2I\u01ab\3\2\2\2K\u01ad\3\2\2\2M\u01af\3\2\2\2O\u01b1\3\2\2\2Q\u01b3"+
		"\3\2\2\2S\u01b5\3\2\2\2U\u01b7\3\2\2\2W\u01ba\3\2\2\2Y\u01bc\3\2\2\2["+
		"\u01be\3\2\2\2]\u01c0\3\2\2\2_\u01c2\3\2\2\2a\u01c7\3\2\2\2c\u01c9\3\2"+
		"\2\2e\u01cc\3\2\2\2g\u01ce\3\2\2\2i\u01d0\3\2\2\2k\u01d2\3\2\2\2m\u01d4"+
		"\3\2\2\2o\u01d6\3\2\2\2q\u01d8\3\2\2\2s\u01df\3\2\2\2u\u01eb\3\2\2\2w"+
		"\u01ed\3\2\2\2y\u01f0\3\2\2\2{\u01f5\3\2\2\2}\u01fa\3\2\2\2\177\u01ff"+
		"\3\2\2\2\u0081\u0202\3\2\2\2\u0083\u0206\3\2\2\2\u0085\u0209\3\2\2\2\u0087"+
		"\u0211\3\2\2\2\u0089\u0214\3\2\2\2\u008b\u0228\3\2\2\2\u008d\u022a\3\2"+
		"\2\2\u008f\u022c\3\2\2\2\u0091\u0235\3\2\2\2\u0093\u0237\3\2\2\2\u0095"+
		"\u023a\3\2\2\2\u0097\u023d\3\2\2\2\u0099\u009c\5\35\17\2\u009a\u009c\5"+
		")\25\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\4\3\2\2\2\u009d\u009e"+
		"\5A!\2\u009e\u009f\5=\37\2\u009f\u00a0\5\7\4\2\u00a0\u00aa\3\2\2\2\u00a1"+
		"\u00a2\5? \2\u00a2\u00a3\5=\37\2\u00a3\u00a4\5\t\5\2\u00a4\u00aa\3\2\2"+
		"\2\u00a5\u00a6\5C\"\2\u00a6\u00a7\5=\37\2\u00a7\u00a8\5\13\6\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa"+
		"\6\3\2\2\2\u00ab\u00af\5\5\3\2\u00ac\u00b0\5\u008fH\2\u00ad\u00b0\5+\26"+
		"\2\u00ae\u00b0\5;\36\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\b\3\2\2\2\u00b1\u00b5\5\5\3\2\u00b2\u00b6\5\u008bF\2\u00b3"+
		"\u00b6\5+\26\2\u00b4\u00b6\59\35\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b6\n\3\2\2\2\u00b7\u00bc\5\5\3\2\u00b8\u00bd"+
		"\5u;\2\u00b9\u00bd\5\27\f\2\u00ba\u00bd\5+\26\2\u00bb\u00bd\5\67\34\2"+
		"\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\f\3\2\2\2\u00be\u00c6\5\17\b\2\u00bf\u00c0\5\17\b\2\u00c0"+
		"\u00c1\5\21\t\2\u00c1\u00c6\3\2\2\2\u00c2\u00c3\5\17\b\2\u00c3\u00c4\5"+
		"\25\13\2\u00c4\u00c6\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\5w<\2\u00c8\u00c9\5m\67\2"+
		"\u00c9\u00ca\5\27\f\2\u00ca\u00cb\5o8\2\u00cb\u00cc\5k\66\2\u00cc\u00cd"+
		"\5\35\17\2\u00cd\u00ce\5i\65\2\u00ce\20\3\2\2\2\u00cf\u00d4\5\23\n\2\u00d0"+
		"\u00d1\5\23\n\2\u00d1\u00d2\5\25\13\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf"+
		"\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\5y=\2\u00d6"+
		"\u00d7\5m\67\2\u00d7\u00d8\5\27\f\2\u00d8\u00d9\5o8\2\u00d9\u00da\5k\66"+
		"\2\u00da\u00db\5\35\17\2\u00db\u00dc\5i\65\2\u00dc\u00dd\5\21\t\2\u00dd"+
		"\24\3\2\2\2\u00de\u00df\5{>\2\u00df\u00e0\5k\66\2\u00e0\u00e1\5\35\17"+
		"\2\u00e1\u00e2\5i\65\2\u00e2\26\3\2\2\2\u00e3\u00e9\5\31\r\2\u00e4\u00e5"+
		"\5\31\r\2\u00e5\u00e6\5a\61\2\u00e6\u00e7\5\27\f\2\u00e7\u00e9\3\2\2\2"+
		"\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\30\3\2\2\2\u00ea\u0104"+
		"\5\33\16\2\u00eb\u00ed\5_\60\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u0104\5=\37\2\u00f2\u00f4\5_\60\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0104\5u;\2\u00f9\u00fb\5_\60\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5m\67\2\u0100\u0101\5\31"+
		"\r\2\u0101\u0102\5o8\2\u0102\u0104\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00ee"+
		"\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00fc\3\2\2\2\u0104\32\3\2\2\2\u0105"+
		"\u0108\5\u008bF\2\u0106\u0108\5=\37\2\u0107\u0105\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\5I%\2\u010a\u010d\5\u008bF\2"+
		"\u010b\u010d\5=\37\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0119"+
		"\3\2\2\2\u010e\u0110\5_\60\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\5m\67\2\u0115\u0116\5\33\16\2\u0116\u0117\5o8\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0107\3\2\2\2\u0118\u0111\3\2\2\2\u0119\34\3\2\2"+
		"\2\u011a\u011e\5\5\3\2\u011b\u011e\5\r\7\2\u011c\u011e\5\37\20\2\u011d"+
		"\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\36\3\2\2\2\u0121\u0122"+
		"\5}?\2\u0122\u0123\5m\67\2\u0123\u0124\5=\37\2\u0124\u0126\5g\64\2\u0125"+
		"\u0127\5\u008bF\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\5g\64\2\u0129\u012a\5\u008bF\2\u012a\u012c\5g\64"+
		"\2\u012b\u012d\5\u008bF\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\5o8\2\u012f\u0130\5k\66\2\u0130\u0131\5!\21"+
		"\2\u0131\u0132\5i\65\2\u0132 \3\2\2\2\u0133\u0137\5\35\17\2\u0134\u0137"+
		"\5\u0083B\2\u0135\u0137\5\u0085C\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\"\3\2\2\2\u013a\u013b\t\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013d\b\22\2\2\u013d$\3\2\2\2\u013e\u0142\5A!\2\u013f\u0142\5?"+
		" \2\u0140\u0142\5C\"\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140"+
		"\3\2\2\2\u0142&\3\2\2\2\u0143\u0146\5%\23\2\u0144\u0146\5E#\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146(\3\2\2\2\u0147\u0148\5\177@\2\u0148"+
		"\u0149\5\'\24\2\u0149\u014a\5=\37\2\u014a\u014c\5m\67\2\u014b\u014d\5"+
		"-\27\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\5o8\2\u014f\u0150\5k\66\2\u0150\u0152\5\35\17\2\u0151\u0153\5\61"+
		"\31\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\5i\65\2\u0155*\3\2\2\2\u0156\u0157\5=\37\2\u0157\u0159\5m\67\2"+
		"\u0158\u015a\5\63\32\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\5o8\2\u015c,\3\2\2\2\u015d\u015e\5%\23\2\u015e\u0160"+
		"\5=\37\2\u015f\u0161\5/\30\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		".\3\2\2\2\u0162\u0163\5e\63\2\u0163\u0164\5%\23\2\u0164\u0166\5=\37\2"+
		"\u0165\u0167\5/\30\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\60"+
		"\3\2\2\2\u0168\u016e\5\u0081A\2\u0169\u016f\5=\37\2\u016a\u016f\5\u008b"+
		"F\2\u016b\u016f\5\u008fH\2\u016c\u016f\5u;\2\u016d\u016f\5\27\f\2\u016e"+
		"\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016d\3\2\2\2\u016f\62\3\2\2\2\u0170\u0176\5=\37\2\u0171\u0176"+
		"\5\u008bF\2\u0172\u0176\5\u008fH\2\u0173\u0176\5u;\2\u0174\u0176\5\27"+
		"\f\2\u0175\u0170\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\5\65"+
		"\33\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\64\3\2\2\2\u017a\u0180"+
		"\5e\63\2\u017b\u0181\5=\37\2\u017c\u0181\5\u008bF\2\u017d\u0181\5\u008f"+
		"H\2\u017e\u0181\5u;\2\u017f\u0181\5\27\f\2\u0180\u017b\3\2\2\2\u0180\u017c"+
		"\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0184\5\65\33\2\u0183\u0182\3\2\2\2\u0183\u0184\3"+
		"\2\2\2\u0184\66\3\2\2\2\u0185\u0186\5\u0093J\2\u0186\u0187\5m\67\2\u0187"+
		"\u0188\5=\37\2\u0188\u0189\5o8\2\u01898\3\2\2\2\u018a\u018b\5\u0097L\2"+
		"\u018b\u018c\5m\67\2\u018c\u018d\5=\37\2\u018d\u018e\5o8\2\u018e:\3\2"+
		"\2\2\u018f\u0190\5\u0095K\2\u0190\u0191\5m\67\2\u0191\u0192\5=\37\2\u0192"+
		"\u0193\5o8\2\u0193<\3\2\2\2\u0194\u0199\t\3\2\2\u0195\u0198\5\u0089E\2"+
		"\u0196\u0198\t\3\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a>\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\7%\2\2\u019d@\3\2\2\2\u019e\u019f\7&\2\2\u019f"+
		"B\3\2\2\2\u01a0\u01a1\7A\2\2\u01a1D\3\2\2\2\u01a2\u01a3\7a\2\2\u01a3F"+
		"\3\2\2\2\u01a4\u01a5\7?\2\2\u01a5H\3\2\2\2\u01a6\u01ac\t\4\2\2\u01a7\u01a8"+
		"\7@\2\2\u01a8\u01ac\7?\2\2\u01a9\u01aa\7>\2\2\u01aa\u01ac\7?\2\2\u01ab"+
		"\u01a6\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a9\3\2\2\2\u01acJ\3\2\2\2"+
		"\u01ad\u01ae\7,\2\2\u01aeL\3\2\2\2\u01af\u01b0\7\61\2\2\u01b0N\3\2\2\2"+
		"\u01b1\u01b2\7-\2\2\u01b2P\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4R\3\2\2\2\u01b5"+
		"\u01b6\7\'\2\2\u01b6T\3\2\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\7\61\2"+
		"\2\u01b9V\3\2\2\2\u01ba\u01bb\7(\2\2\u01bbX\3\2\2\2\u01bc\u01bd\7~\2\2"+
		"\u01bdZ\3\2\2\2\u01be\u01bf\7`\2\2\u01bf\\\3\2\2\2\u01c0\u01c1\7#\2\2"+
		"\u01c1^\3\2\2\2\u01c2\u01c3\5]/\2\u01c3`\3\2\2\2\u01c4\u01c8\5W,\2\u01c5"+
		"\u01c8\5Y-\2\u01c6\u01c8\5[.\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2"+
		"\u01c7\u01c6\3\2\2\2\u01c8b\3\2\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7u"+
		"\2\2\u01cbd\3\2\2\2\u01cc\u01cd\7.\2\2\u01cdf\3\2\2\2\u01ce\u01cf\7<\2"+
		"\2\u01cfh\3\2\2\2\u01d0\u01d1\7}\2\2\u01d1j\3\2\2\2\u01d2\u01d3\7\177"+
		"\2\2\u01d3l\3\2\2\2\u01d4\u01d5\7*\2\2\u01d5n\3\2\2\2\u01d6\u01d7\7+\2"+
		"\2\u01d7p\3\2\2\2\u01d8\u01d9\7B\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7"+
		"t\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7v\2\2\u01der"+
		"\3\2\2\2\u01df\u01e0\7B\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7p\2\2\u01e2"+
		"\u01e3\7r\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7v\2\2\u01e5t\3\2\2\2\u01e6"+
		"\u01e7\7{\2\2\u01e7\u01e8\7g\2\2\u01e8\u01ec\7u\2\2\u01e9\u01ea\7p\2\2"+
		"\u01ea\u01ec\7q\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ecv\3\2"+
		"\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7h\2\2\u01efx\3\2\2\2\u01f0\u01f1"+
		"\7g\2\2\u01f1\u01f2\7n\2\2\u01f2\u01f3\7k\2\2\u01f3\u01f4\7h\2\2\u01f4"+
		"z\3\2\2\2\u01f5\u01f6\7g\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7u\2\2\u01f8"+
		"\u01f9\7g\2\2\u01f9|\3\2\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7q\2\2\u01fc"+
		"\u01fd\7q\2\2\u01fd\u01fe\7r\2\2\u01fe~\3\2\2\2\u01ff\u0200\7h\2\2\u0200"+
		"\u0201\7p\2\2\u0201\u0080\3\2\2\2\u0202\u0203\7t\2\2\u0203\u0204\7g\2"+
		"\2\u0204\u0205\7v\2\2\u0205\u0082\3\2\2\2\u0206\u0207\7i\2\2\u0207\u0208"+
		"\7q\2\2\u0208\u0084\3\2\2\2\u0209\u020a\7d\2\2\u020a\u020b\7t\2\2\u020b"+
		"\u020c\7g\2\2\u020c\u020d\7c\2\2\u020d\u020e\7m\2\2\u020e\u0086\3\2\2"+
		"\2\u020f\u0212\5O(\2\u0210\u0212\5Q)\2\u0211\u020f\3\2\2\2\u0211\u0210"+
		"\3\2\2\2\u0212\u0088\3\2\2\2\u0213\u0215\4\62;\2\u0214\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u008a\3\2"+
		"\2\2\u0218\u021a\5\u0087D\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u0229\5\u0089E\2\u021c\u021e\5\u0087D\2\u021d\u021c"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\5\u0089E"+
		"\2\u0220\u0221\7\60\2\2\u0221\u0222\5\u0089E\2\u0222\u0229\3\2\2\2\u0223"+
		"\u0225\5\u0087D\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0227\7\60\2\2\u0227\u0229\5\u0089E\2\u0228\u0219\3\2\2"+
		"\2\u0228\u021d\3\2\2\2\u0228\u0224\3\2\2\2\u0229\u008c\3\2\2\2\u022a\u022b"+
		"\7$\2\2\u022b\u008e\3\2\2\2\u022c\u0230\5\u008dG\2\u022d\u022f\5\u0091"+
		"I\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\5\u008d"+
		"G\2\u0234\u0090\3\2\2\2\u0235\u0236\n\5\2\2\u0236\u0092\3\2\2\2\u0237"+
		"\u0238\7B\2\2\u0238\u0239\7A\2\2\u0239\u0094\3\2\2\2\u023a\u023b\7B\2"+
		"\2\u023b\u023c\7&\2\2\u023c\u0096\3\2\2\2\u023d\u023e\7B\2\2\u023e\u023f"+
		"\7%\2\2\u023f\u0098\3\2\2\2\61\2\u009b\u00a9\u00af\u00b5\u00bc\u00c5\u00d3"+
		"\u00e8\u00ee\u00f5\u00fc\u0103\u0107\u010c\u0111\u0118\u011d\u011f\u0126"+
		"\u012c\u0136\u0138\u0141\u0145\u014c\u0152\u0159\u0160\u0166\u016e\u0175"+
		"\u0178\u0180\u0183\u0197\u0199\u01ab\u01c7\u01eb\u0211\u0216\u0219\u021d"+
		"\u0224\u0228\u0230\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
