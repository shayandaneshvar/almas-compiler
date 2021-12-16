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
		BOOLEAN_ASSIGNMENT=5, IF=6, ELIF=7, ELSE=8, EXPRESSIONS=9, EXPRESSION=10, 
		RELOP_EXPRESSION=11, STATEMENTS=12, LOOP=13, LOOP_STATEMENTS=14, WS=15, 
		PRIMITIVE_TYPE=16, RETURN_TYPE=17, FUNCTION=18, FUNCTION_CALL=19, FUNC_INPUTS=20, 
		MORE_FUNC_INPUTS=21, RETURN_ST=22, FUNC_ARGS=23, MORE_FUNC_ARGS=24, BOOLEAN_CAST=25, 
		DECIMAL_CAST=26, STRING_CAST=27, IDENTIFIER=28, DECIMAL_TYPE=29, STRING_TYPE=30, 
		BOOLEAN_TYPE=31, VOID_TYPE=32, ASSIGNMENT_OP=33, RELATIONAL_OPERATOR=34, 
		MUL=35, DIV=36, ADD=37, SUB=38, MOD=39, INTEGER_DIV=40, AND=41, OR=42, 
		XOR=43, NOT=44, UNARY_OP=45, BINARY_BOOLEAN_OP=46, EQUAL=47, COMMA=48, 
		COLON=49, CURLY_RIGHT=50, CURLY_LEFT=51, LEFT_P=52, RIGHT_P=53, PRINT_OP=54, 
		INPUT_OP=55, BOOLEAN=56, IF_SYMBOL=57, ELSE_IF_SYMBOL=58, ELSE_SYMBOL=59, 
		FOR_SYMBOL=60, FUNCTION_SYMBOL=61, RETURN_SYMBOL=62, CONTINUE_SYMBOL=63, 
		BREAK_SYMBOL=64, SIGN=65, NUMBER=66, DECIMAL=67, OPTIONAL_DECIMAL=68, 
		STRING_LITERAL=69, STRING=70, ANYCHAR=71, BOOLEAN_CAST_SYMBOL=72, STRING_CAST_SYMBOL=73, 
		DECIMAL_CAST_SYMBOL=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM_BODY", "ASSIGNMENT", "STRING_ASSIGNMENT", "DECIMAL_ASSIGNMENT", 
			"BOOLEAN_ASSIGNMENT", "IF", "ELIF", "ELSE", "EXPRESSIONS", "EXPRESSION", 
			"RELOP_EXPRESSION", "STATEMENTS", "LOOP", "LOOP_STATEMENTS", "WS", "PRIMITIVE_TYPE", 
			"RETURN_TYPE", "FUNCTION", "FUNCTION_CALL", "FUNC_INPUTS", "MORE_FUNC_INPUTS", 
			"RETURN_ST", "FUNC_ARGS", "MORE_FUNC_ARGS", "BOOLEAN_CAST", "DECIMAL_CAST", 
			"STRING_CAST", "IDENTIFIER", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", "MUL", "DIV", "ADD", 
			"SUB", "MOD", "INTEGER_DIV", "AND", "OR", "XOR", "NOT", "UNARY_OP", "BINARY_BOOLEAN_OP", 
			"EQUAL", "COMMA", "COLON", "CURLY_RIGHT", "CURLY_LEFT", "LEFT_P", "RIGHT_P", 
			"PRINT_OP", "INPUT_OP", "BOOLEAN", "IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", 
			"FOR_SYMBOL", "FUNCTION_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"BREAK_SYMBOL", "SIGN", "NUMBER", "DECIMAL", "OPTIONAL_DECIMAL", "STRING_LITERAL", 
			"STRING", "ANYCHAR", "BOOLEAN_CAST_SYMBOL", "STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'#'", "'$'", "'?'", "'_'", "'='", null, 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'//'", "'&'", "'|'", "'^'", "'!'", 
			null, null, "'is'", "','", "':'", "'{'", "'}'", "'('", "')'", "'@print'", 
			"'@input'", null, "'if'", "'elif'", "'else'", "'loop'", "'fn'", "'ret'", 
			"'go'", "'break'", null, null, null, null, "'\"'", null, null, "'@?'", 
			"'@$'", "'@#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM_BODY", "ASSIGNMENT", "STRING_ASSIGNMENT", "DECIMAL_ASSIGNMENT", 
			"BOOLEAN_ASSIGNMENT", "IF", "ELIF", "ELSE", "EXPRESSIONS", "EXPRESSION", 
			"RELOP_EXPRESSION", "STATEMENTS", "LOOP", "LOOP_STATEMENTS", "WS", "PRIMITIVE_TYPE", 
			"RETURN_TYPE", "FUNCTION", "FUNCTION_CALL", "FUNC_INPUTS", "MORE_FUNC_INPUTS", 
			"RETURN_ST", "FUNC_ARGS", "MORE_FUNC_ARGS", "BOOLEAN_CAST", "DECIMAL_CAST", 
			"STRING_CAST", "IDENTIFIER", "DECIMAL_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"VOID_TYPE", "ASSIGNMENT_OP", "RELATIONAL_OPERATOR", "MUL", "DIV", "ADD", 
			"SUB", "MOD", "INTEGER_DIV", "AND", "OR", "XOR", "NOT", "UNARY_OP", "BINARY_BOOLEAN_OP", 
			"EQUAL", "COMMA", "COLON", "CURLY_RIGHT", "CURLY_LEFT", "LEFT_P", "RIGHT_P", 
			"PRINT_OP", "INPUT_OP", "BOOLEAN", "IF_SYMBOL", "ELSE_IF_SYMBOL", "ELSE_SYMBOL", 
			"FOR_SYMBOL", "FUNCTION_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"BREAK_SYMBOL", "SIGN", "NUMBER", "DECIMAL", "OPTIONAL_DECIMAL", "STRING_LITERAL", 
			"STRING", "ANYCHAR", "BOOLEAN_CAST_SYMBOL", "STRING_CAST_SYMBOL", "DECIMAL_CAST_SYMBOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u023b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\5\2\u009a\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u00a8\n\3\3\4\3\4\3\4\3\4\5\4\u00ae\n\4\3\5\3\5\3"+
		"\5\3\5\5\5\u00b4\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d1"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00e0"+
		"\n\n\3\13\3\13\7\13\u00e4\n\13\f\13\16\13\u00e7\13\13\3\13\3\13\7\13\u00eb"+
		"\n\13\f\13\16\13\u00ee\13\13\3\13\3\13\7\13\u00f2\n\13\f\13\16\13\u00f5"+
		"\13\13\3\13\3\13\3\13\3\13\5\13\u00fb\n\13\3\f\3\f\5\f\u00ff\n\f\3\f\3"+
		"\f\3\f\5\f\u0104\n\f\3\f\7\f\u0107\n\f\f\f\16\f\u010a\13\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0110\n\f\3\r\3\r\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\7\17\u012b\n\17\f\17\16\17\u012e\13\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\5\21\u0137\n\21\3\22\3\22\5\22\u013b\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0152\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u015a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n\27\5"+
		"\27\u0165\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u016d\n\30\3\30\3\30"+
		"\5\30\u0171\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0179\n\31\3\31\3"+
		"\31\3\31\5\31\u017e\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0192\n\35\f\35\16"+
		"\35\u0195\13\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"#\5#\u01a6\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3/\5/\u01c2\n/\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\39\39\39\39\39\59\u01e6\n9\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3B\3B\3B\5B\u020d\nB\3C\6C\u0210\nC\rC\16C\u0211\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0220\nD\3E\3E\5E\u0224\nE\3F\3F\3"+
		"G\3G\7G\u022a\nG\fG\16G\u022d\13G\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K"+
		"\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG"+
		"\u008dH\u008fI\u0091J\u0093K\u0095L\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|"+
		"\4\2>>@@\3\2$$\2\u0279\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\3\u0099\3\2\2\2\5\u00a7\3\2\2\2\7\u00a9\3\2\2\2\t\u00af"+
		"\3\2\2\2\13\u00b5\3\2\2\2\r\u00bc\3\2\2\2\17\u00d0\3\2\2\2\21\u00d8\3"+
		"\2\2\2\23\u00df\3\2\2\2\25\u00fa\3\2\2\2\27\u010f\3\2\2\2\31\u0116\3\2"+
		"\2\2\33\u0119\3\2\2\2\35\u012c\3\2\2\2\37\u012f\3\2\2\2!\u0136\3\2\2\2"+
		"#\u013a\3\2\2\2%\u013c\3\2\2\2\'\u0147\3\2\2\2)\u0151\3\2\2\2+\u0159\3"+
		"\2\2\2-\u0164\3\2\2\2/\u0170\3\2\2\2\61\u017d\3\2\2\2\63\u017f\3\2\2\2"+
		"\65\u0184\3\2\2\2\67\u0189\3\2\2\29\u018e\3\2\2\2;\u0196\3\2\2\2=\u0198"+
		"\3\2\2\2?\u019a\3\2\2\2A\u019c\3\2\2\2C\u019e\3\2\2\2E\u01a5\3\2\2\2G"+
		"\u01a7\3\2\2\2I\u01a9\3\2\2\2K\u01ab\3\2\2\2M\u01ad\3\2\2\2O\u01af\3\2"+
		"\2\2Q\u01b1\3\2\2\2S\u01b4\3\2\2\2U\u01b6\3\2\2\2W\u01b8\3\2\2\2Y\u01ba"+
		"\3\2\2\2[\u01bc\3\2\2\2]\u01c1\3\2\2\2_\u01c3\3\2\2\2a\u01c6\3\2\2\2c"+
		"\u01c8\3\2\2\2e\u01ca\3\2\2\2g\u01cc\3\2\2\2i\u01ce\3\2\2\2k\u01d0\3\2"+
		"\2\2m\u01d2\3\2\2\2o\u01d9\3\2\2\2q\u01e5\3\2\2\2s\u01e7\3\2\2\2u\u01ea"+
		"\3\2\2\2w\u01ef\3\2\2\2y\u01f4\3\2\2\2{\u01f9\3\2\2\2}\u01fc\3\2\2\2\177"+
		"\u0200\3\2\2\2\u0081\u0203\3\2\2\2\u0083\u020c\3\2\2\2\u0085\u020f\3\2"+
		"\2\2\u0087\u021f\3\2\2\2\u0089\u0223\3\2\2\2\u008b\u0225\3\2\2\2\u008d"+
		"\u0227\3\2\2\2\u008f\u0230\3\2\2\2\u0091\u0232\3\2\2\2\u0093\u0235\3\2"+
		"\2\2\u0095\u0238\3\2\2\2\u0097\u009a\5\31\r\2\u0098\u009a\5%\23\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\4\3\2\2\2\u009b\u009c\5=\37\2"+
		"\u009c\u009d\59\35\2\u009d\u009e\5\7\4\2\u009e\u00a8\3\2\2\2\u009f\u00a0"+
		"\5;\36\2\u00a0\u00a1\59\35\2\u00a1\u00a2\5\t\5\2\u00a2\u00a8\3\2\2\2\u00a3"+
		"\u00a4\5? \2\u00a4\u00a5\59\35\2\u00a5\u00a6\5\13\6\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u009b\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8"+
		"\6\3\2\2\2\u00a9\u00ad\5\5\3\2\u00aa\u00ae\5\u008dG\2\u00ab\u00ae\5\'"+
		"\24\2\u00ac\u00ae\5\67\34\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\b\3\2\2\2\u00af\u00b3\5\5\3\2\u00b0\u00b4\5\u0087"+
		"D\2\u00b1\u00b4\5\'\24\2\u00b2\u00b4\5\65\33\2\u00b3\u00b0\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\n\3\2\2\2\u00b5\u00ba\5\5\3\2"+
		"\u00b6\u00bb\5q9\2\u00b7\u00bb\5\23\n\2\u00b8\u00bb\5\'\24\2\u00b9\u00bb"+
		"\5\63\32\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\f\3\2\2\2\u00bc\u00bd\5s:\2\u00bd\u00be\5i"+
		"\65\2\u00be\u00bf\5\23\n\2\u00bf\u00c0\5k\66\2\u00c0\u00c1\5g\64\2\u00c1"+
		"\u00c2\5\31\r\2\u00c2\u00c3\5e\63\2\u00c3\u00c4\5\17\b\2\u00c4\u00c5\5"+
		"\21\t\2\u00c5\16\3\2\2\2\u00c6\u00d1\3\2\2\2\u00c7\u00c8\5u;\2\u00c8\u00c9"+
		"\5i\65\2\u00c9\u00ca\5\23\n\2\u00ca\u00cb\5k\66\2\u00cb\u00cc\5g\64\2"+
		"\u00cc\u00cd\5\31\r\2\u00cd\u00ce\5e\63\2\u00ce\u00cf\5\17\b\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d1\20\3\2\2\2\u00d2"+
		"\u00d9\3\2\2\2\u00d3\u00d4\5w<\2\u00d4\u00d5\5g\64\2\u00d5\u00d6\5\31"+
		"\r\2\u00d6\u00d7\5e\63\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d9\22\3\2\2\2\u00da\u00e0\5\25\13\2\u00db\u00dc\5\25"+
		"\13\2\u00dc\u00dd\5]/\2\u00dd\u00de\5\23\n\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\24\3\2\2\2\u00e1\u00fb\5\27\f"+
		"\2\u00e2\u00e4\5[.\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00fb\59\35\2\u00e9\u00eb\5[.\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00fb\5q9\2\u00f0\u00f2\5[.\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5i\65\2\u00f7\u00f8\5\25\13\2\u00f8"+
		"\u00f9\5k\66\2\u00f9\u00fb\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e5\3\2"+
		"\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb\26\3\2\2\2\u00fc\u00ff"+
		"\5\u0087D\2\u00fd\u00ff\59\35\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0103\5E#\2\u0101\u0104\5\u0087D\2\u0102"+
		"\u0104\59\35\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0110\3\2"+
		"\2\2\u0105\u0107\5[.\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\5i\65\2\u010c\u010d\5\27\f\2\u010d\u010e\5k\66\2\u010e\u0110\3"+
		"\2\2\2\u010f\u00fe\3\2\2\2\u010f\u0108\3\2\2\2\u0110\30\3\2\2\2\u0111"+
		"\u0115\5\5\3\2\u0112\u0115\5\r\7\2\u0113\u0115\5\33\16\2\u0114\u0111\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\32\3\2\2\2\u0118\u0116\3\2\2"+
		"\2\u0119\u011a\5y=\2\u011a\u011b\5i\65\2\u011b\u011c\59\35\2\u011c\u011d"+
		"\5c\62\2\u011d\u011e\5\u0089E\2\u011e\u011f\5c\62\2\u011f\u0120\5\u0087"+
		"D\2\u0120\u0121\5c\62\2\u0121\u0122\5\u0089E\2\u0122\u0123\5k\66\2\u0123"+
		"\u0124\5g\64\2\u0124\u0125\5\35\17\2\u0125\u0126\5e\63\2\u0126\34\3\2"+
		"\2\2\u0127\u012b\5\31\r\2\u0128\u012b\5\177@\2\u0129\u012b\5\u0081A\2"+
		"\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\36\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\t\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\20"+
		"\2\2\u0132 \3\2\2\2\u0133\u0137\5=\37\2\u0134\u0137\5;\36\2\u0135\u0137"+
		"\5? \2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\"\3\2\2\2\u0138\u013b\5!\21\2\u0139\u013b\5A!\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b$\3\2\2\2\u013c\u013d\5{>\2\u013d\u013e\5#\22\2\u013e"+
		"\u013f\59\35\2\u013f\u0140\5i\65\2\u0140\u0141\5)\25\2\u0141\u0142\5k"+
		"\66\2\u0142\u0143\5g\64\2\u0143\u0144\5\31\r\2\u0144\u0145\5-\27\2\u0145"+
		"\u0146\5e\63\2\u0146&\3\2\2\2\u0147\u0148\59\35\2\u0148\u0149\5i\65\2"+
		"\u0149\u014a\5/\30\2\u014a\u014b\5k\66\2\u014b(\3\2\2\2\u014c\u0152\3"+
		"\2\2\2\u014d\u014e\5!\21\2\u014e\u014f\59\35\2\u014f\u0150\5+\26\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0152*\3\2\2\2"+
		"\u0153\u0154\5a\61\2\u0154\u0155\5!\21\2\u0155\u0156\59\35\2\u0156\u0157"+
		"\5+\26\2\u0157\u015a\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a,\3\2\2\2\u015b\u0165\3\2\2\2\u015c\u0162\5}?\2\u015d"+
		"\u0163\59\35\2\u015e\u0163\5\u0087D\2\u015f\u0163\5\u008dG\2\u0160\u0163"+
		"\5q9\2\u0161\u0163\5\23\n\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u015b\3\2\2\2\u0164\u015c\3\2\2\2\u0165.\3\2\2\2\u0166\u0171"+
		"\3\2\2\2\u0167\u016d\59\35\2\u0168\u016d\5\u0087D\2\u0169\u016d\5\u008d"+
		"G\2\u016a\u016d\5q9\2\u016b\u016d\5\23\n\2\u016c\u0167\3\2\2\2\u016c\u0168"+
		"\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\5\61\31\2\u016f\u0171\3\2\2\2\u0170\u0166\3"+
		"\2\2\2\u0170\u016c\3\2\2\2\u0171\60\3\2\2\2\u0172\u0178\5a\61\2\u0173"+
		"\u0179\59\35\2\u0174\u0179\5\u0087D\2\u0175\u0179\5\u008dG\2\u0176\u0179"+
		"\5q9\2\u0177\u0179\5\23\n\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2\2\u0178"+
		"\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\5\61\31\2\u017b\u017e\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u0172\3\2\2\2\u017d\u017c\3\2\2\2\u017e\62\3\2\2\2\u017f\u0180\5\u0091"+
		"I\2\u0180\u0181\5i\65\2\u0181\u0182\59\35\2\u0182\u0183\5k\66\2\u0183"+
		"\64\3\2\2\2\u0184\u0185\5\u0095K\2\u0185\u0186\5i\65\2\u0186\u0187\59"+
		"\35\2\u0187\u0188\5k\66\2\u0188\66\3\2\2\2\u0189\u018a\5\u0093J\2\u018a"+
		"\u018b\5i\65\2\u018b\u018c\59\35\2\u018c\u018d\5k\66\2\u018d8\3\2\2\2"+
		"\u018e\u0193\t\3\2\2\u018f\u0192\5\u0085C\2\u0190\u0192\t\3\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194:\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197"+
		"\7%\2\2\u0197<\3\2\2\2\u0198\u0199\7&\2\2\u0199>\3\2\2\2\u019a\u019b\7"+
		"A\2\2\u019b@\3\2\2\2\u019c\u019d\7a\2\2\u019dB\3\2\2\2\u019e\u019f\7?"+
		"\2\2\u019fD\3\2\2\2\u01a0\u01a6\t\4\2\2\u01a1\u01a2\7@\2\2\u01a2\u01a6"+
		"\7?\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a6\7?\2\2\u01a5\u01a0\3\2\2\2\u01a5"+
		"\u01a1\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6F\3\2\2\2\u01a7\u01a8\7,\2\2\u01a8"+
		"H\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aaJ\3\2\2\2\u01ab\u01ac\7-\2\2\u01ac"+
		"L\3\2\2\2\u01ad\u01ae\7/\2\2\u01aeN\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0"+
		"P\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b3\7\61\2\2\u01b3R\3\2\2\2\u01b4"+
		"\u01b5\7(\2\2\u01b5T\3\2\2\2\u01b6\u01b7\7~\2\2\u01b7V\3\2\2\2\u01b8\u01b9"+
		"\7`\2\2\u01b9X\3\2\2\2\u01ba\u01bb\7#\2\2\u01bbZ\3\2\2\2\u01bc\u01bd\5"+
		"Y-\2\u01bd\\\3\2\2\2\u01be\u01c2\5S*\2\u01bf\u01c2\5U+\2\u01c0\u01c2\5"+
		"W,\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"^\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7u\2\2\u01c5`\3\2\2\2\u01c6\u01c7"+
		"\7.\2\2\u01c7b\3\2\2\2\u01c8\u01c9\7<\2\2\u01c9d\3\2\2\2\u01ca\u01cb\7"+
		"}\2\2\u01cbf\3\2\2\2\u01cc\u01cd\7\177\2\2\u01cdh\3\2\2\2\u01ce\u01cf"+
		"\7*\2\2\u01cfj\3\2\2\2\u01d0\u01d1\7+\2\2\u01d1l\3\2\2\2\u01d2\u01d3\7"+
		"B\2\2\u01d3\u01d4\7r\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7"+
		"\7p\2\2\u01d7\u01d8\7v\2\2\u01d8n\3\2\2\2\u01d9\u01da\7B\2\2\u01da\u01db"+
		"\7k\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7r\2\2\u01dd\u01de\7w\2\2\u01de"+
		"\u01df\7v\2\2\u01dfp\3\2\2\2\u01e0\u01e1\7{\2\2\u01e1\u01e2\7g\2\2\u01e2"+
		"\u01e6\7u\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e6\7q\2\2\u01e5\u01e0\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e6r\3\2\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7"+
		"h\2\2\u01e9t\3\2\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed"+
		"\7k\2\2\u01ed\u01ee\7h\2\2\u01eev\3\2\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1"+
		"\7n\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7g\2\2\u01f3x\3\2\2\2\u01f4\u01f5"+
		"\7n\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7r\2\2\u01f8"+
		"z\3\2\2\2\u01f9\u01fa\7h\2\2\u01fa\u01fb\7p\2\2\u01fb|\3\2\2\2\u01fc\u01fd"+
		"\7t\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7v\2\2\u01ff~\3\2\2\2\u0200\u0201"+
		"\7i\2\2\u0201\u0202\7q\2\2\u0202\u0080\3\2\2\2\u0203\u0204\7d\2\2\u0204"+
		"\u0205\7t\2\2\u0205\u0206\7g\2\2\u0206\u0207\7c\2\2\u0207\u0208\7m\2\2"+
		"\u0208\u0082\3\2\2\2\u0209\u020d\3\2\2\2\u020a\u020d\5K&\2\u020b\u020d"+
		"\5M\'\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\u0084\3\2\2\2\u020e\u0210\4\62;\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0086\3\2\2\2\u0213"+
		"\u0214\5\u0083B\2\u0214\u0215\5\u0085C\2\u0215\u0220\3\2\2\2\u0216\u0217"+
		"\5\u0083B\2\u0217\u0218\5\u0085C\2\u0218\u0219\7\60\2\2\u0219\u021a\5"+
		"\u0085C\2\u021a\u0220\3\2\2\2\u021b\u021c\5\u0083B\2\u021c\u021d\7\60"+
		"\2\2\u021d\u021e\5\u0085C\2\u021e\u0220\3\2\2\2\u021f\u0213\3\2\2\2\u021f"+
		"\u0216\3\2\2\2\u021f\u021b\3\2\2\2\u0220\u0088\3\2\2\2\u0221\u0224\5\u0087"+
		"D\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u008a\3\2\2\2\u0225\u0226\7$\2\2\u0226\u008c\3\2\2\2\u0227\u022b\5\u008b"+
		"F\2\u0228\u022a\5\u008fH\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u022f\5\u008bF\2\u022f\u008e\3\2\2\2\u0230\u0231\n\5\2\2\u0231"+
		"\u0090\3\2\2\2\u0232\u0233\7B\2\2\u0233\u0234\7A\2\2\u0234\u0092\3\2\2"+
		"\2\u0235\u0236\7B\2\2\u0236\u0237\7&\2\2\u0237\u0094\3\2\2\2\u0238\u0239"+
		"\7B\2\2\u0239\u023a\7%\2\2\u023a\u0096\3\2\2\2+\2\u0099\u00a7\u00ad\u00b3"+
		"\u00ba\u00d0\u00d8\u00df\u00e5\u00ec\u00f3\u00fa\u00fe\u0103\u0108\u010f"+
		"\u0114\u0116\u012a\u012c\u0136\u013a\u0151\u0159\u0162\u0164\u016c\u0170"+
		"\u0178\u017d\u0191\u0193\u01a5\u01c1\u01e5\u020c\u0211\u021f\u0223\u022b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
