package ir.ac.kntu;// Generated from ALMAS.g by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ALMASParser extends Parser {
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
	public static final int
		RULE_program = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"program"
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

	@Override
	public String getGrammarFileName() { return "ALMAS.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ALMASParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> PROGRAM_BODY() { return getTokens(ALMASParser.PROGRAM_BODY); }
		public TerminalNode PROGRAM_BODY(int i) {
			return getToken(ALMASParser.PROGRAM_BODY, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener) ((ALMASListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener) ((ALMASListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROGRAM_BODY) {
				{
				{
				setState(2);
				match(PROGRAM_BODY);
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\2\2\n\2\7\3\2\2\2\4\6\7\3\2\2\5"+
		"\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7\3\2\2\2"+
		"\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
