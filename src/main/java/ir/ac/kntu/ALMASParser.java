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
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitProgram(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\13\4\2\t\2\3\2\7"+
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
