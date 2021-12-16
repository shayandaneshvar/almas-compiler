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
		WS=1, DECIMAL_TYPE=2, STRING_TYPE=3, BOOLEAN_TYPE=4, VOID_TYPE=5, ASSIGNMENT_OP=6, 
		RELATIONAL_OPERATOR=7, EQUAL=8, COMMA=9, COLON=10, CURLY_RIGHT=11, CURLY_LEFT=12, 
		LEFT_P=13, RIGHT_P=14, PRINT_OP=15, INPUT_OP=16, BOOLEAN=17, IF_SYMBOL=18, 
		ELSE_IF_SYMBOL=19, ELSE_SYMBOL=20, FOR_SYMBOL=21, FUNCTION_SYMBOL=22, 
		RETURN_SYMBOL=23, CONTINUE_SYMBOL=24, BREAK_SYMBOL=25, DECIMAL=26, BOOLEAN_CAST_SYMBOL=27, 
		STRING_CAST_SYMBOL=28, DECIMAL_CAST_SYMBOL=29, UNARY_OP=30, BINARY_BOOLEAN_OP=31, 
		BINARY_DECIMAL_OP=32, IDENTIFIER=33, STRING=34;
	public static final int
		RULE_program = 0, RULE_func_inputs = 1, RULE_program_body = 2, RULE_assignment = 3, 
		RULE_string_assignment = 4, RULE_decimal_assignment = 5, RULE_boolean_assignment = 6, 
		RULE_if_st = 7, RULE_bare_if = 8, RULE_elif = 9, RULE_else_st = 10, RULE_expressions = 11, 
		RULE_expression = 12, RULE_relop_expression = 13, RULE_decimal_expressions = 14, 
		RULE_decimal_expression = 15, RULE_statements = 16, RULE_loop = 17, RULE_loop_statements = 18, 
		RULE_print = 19, RULE_input = 20, RULE_return_type = 21, RULE_function = 22, 
		RULE_function_call = 23, RULE_more_func_inputs = 24, RULE_return_st = 25, 
		RULE_func_args = 26, RULE_more_func_args = 27, RULE_boolean_cast = 28, 
		RULE_decimal_cast = 29, RULE_string_cast = 30, RULE_primitive_type = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_inputs", "program_body", "assignment", "string_assignment", 
			"decimal_assignment", "boolean_assignment", "if_st", "bare_if", "elif", 
			"else_st", "expressions", "expression", "relop_expression", "decimal_expressions", 
			"decimal_expression", "statements", "loop", "loop_statements", "print", 
			"input", "return_type", "function", "function_call", "more_func_inputs", 
			"return_st", "func_args", "more_func_args", "boolean_cast", "decimal_cast", 
			"string_cast", "primitive_type"
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
		public List<Program_bodyContext> program_body() {
			return getRuleContexts(Program_bodyContext.class);
		}
		public Program_bodyContext program_body(int i) {
			return getRuleContext(Program_bodyContext.class,i);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << FUNCTION_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(64);
				program_body();
				}
				}
				setState(69);
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

	public static class Func_inputsContext extends ParserRuleContext {
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public More_func_inputsContext more_func_inputs() {
			return getRuleContext(More_func_inputsContext.class,0);
		}
		public Func_inputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterFunc_inputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitFunc_inputs(this);
		}
	}

	public final Func_inputsContext func_inputs() throws RecognitionException {
		Func_inputsContext _localctx = new Func_inputsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LEFT_P);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(71);
				primitive_type();
				setState(72);
				match(IDENTIFIER);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(73);
					more_func_inputs();
					}
				}

				}
			}

			setState(78);
			match(RIGHT_P);
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

	public static class Program_bodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Program_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterProgram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitProgram_body(this);
		}
	}

	public final Program_bodyContext program_body() throws RecognitionException {
		Program_bodyContext _localctx = new Program_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_body);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
			case PRINT_OP:
			case INPUT_OP:
			case IF_SYMBOL:
			case FOR_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				statements();
				}
				break;
			case FUNCTION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ALMASParser.STRING_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public TerminalNode DECIMAL_TYPE() { return getToken(ALMASParser.DECIMAL_TYPE, 0); }
		public Decimal_assignmentContext decimal_assignment() {
			return getRuleContext(Decimal_assignmentContext.class,0);
		}
		public TerminalNode BOOLEAN_TYPE() { return getToken(ALMASParser.BOOLEAN_TYPE, 0); }
		public Boolean_assignmentContext boolean_assignment() {
			return getRuleContext(Boolean_assignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(STRING_TYPE);
				setState(85);
				match(IDENTIFIER);
				setState(86);
				string_assignment();
				}
				break;
			case DECIMAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(DECIMAL_TYPE);
				setState(88);
				match(IDENTIFIER);
				setState(89);
				decimal_assignment();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(BOOLEAN_TYPE);
				setState(91);
				match(IDENTIFIER);
				setState(92);
				boolean_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_OP() { return getToken(ALMASParser.ASSIGNMENT_OP, 0); }
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public String_castContext string_cast() {
			return getRuleContext(String_castContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitString_assignment(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ASSIGNMENT_OP);
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(96);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(97);
				function_call();
				}
				break;
			case STRING_CAST_SYMBOL:
				{
				setState(98);
				string_cast();
				}
				break;
			case INPUT_OP:
				{
				setState(99);
				input();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Decimal_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_OP() { return getToken(ALMASParser.ASSIGNMENT_OP, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Decimal_castContext decimal_cast() {
			return getRuleContext(Decimal_castContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Decimal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterDecimal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitDecimal_assignment(this);
		}
	}

	public final Decimal_assignmentContext decimal_assignment() throws RecognitionException {
		Decimal_assignmentContext _localctx = new Decimal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ASSIGNMENT_OP);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(103);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(104);
				function_call();
				}
				break;
			case 3:
				{
				setState(105);
				decimal_cast();
				}
				break;
			case 4:
				{
				setState(106);
				input();
				}
				break;
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

	public static class Boolean_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_OP() { return getToken(ALMASParser.ASSIGNMENT_OP, 0); }
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Boolean_castContext boolean_cast() {
			return getRuleContext(Boolean_castContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Boolean_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterBoolean_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitBoolean_assignment(this);
		}
	}

	public final Boolean_assignmentContext boolean_assignment() throws RecognitionException {
		Boolean_assignmentContext _localctx = new Boolean_assignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolean_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ASSIGNMENT_OP);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(111);
				expressions();
				}
				break;
			case 3:
				{
				setState(112);
				function_call();
				}
				break;
			case 4:
				{
				setState(113);
				boolean_cast();
				}
				break;
			case 5:
				{
				setState(114);
				input();
				}
				break;
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

	public static class If_stContext extends ParserRuleContext {
		public Bare_ifContext bare_if() {
			return getRuleContext(Bare_ifContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public Else_stContext else_st() {
			return getRuleContext(Else_stContext.class,0);
		}
		public If_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterIf_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitIf_st(this);
		}
	}

	public final If_stContext if_st() throws RecognitionException {
		If_stContext _localctx = new If_stContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			bare_if();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(118);
				elif();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(121);
				else_st();
				}
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

	public static class Bare_ifContext extends ParserRuleContext {
		public TerminalNode IF_SYMBOL() { return getToken(ALMASParser.IF_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(ALMASParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ALMASParser.CURLY_RIGHT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Bare_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bare_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterBare_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitBare_if(this);
		}
	}

	public final Bare_ifContext bare_if() throws RecognitionException {
		Bare_ifContext _localctx = new Bare_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bare_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF_SYMBOL);
			setState(125);
			match(LEFT_P);
			setState(126);
			expressions();
			setState(127);
			match(RIGHT_P);
			setState(128);
			match(CURLY_LEFT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(129);
				statements();
				}
			}

			setState(132);
			match(CURLY_RIGHT);
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

	public static class ElifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF_SYMBOL() { return getToken(ALMASParser.ELSE_IF_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(ALMASParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ALMASParser.CURLY_RIGHT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitElif(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ELSE_IF_SYMBOL);
			setState(135);
			match(LEFT_P);
			setState(136);
			expressions();
			setState(137);
			match(RIGHT_P);
			setState(138);
			match(CURLY_LEFT);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(139);
				statements();
				}
			}

			setState(142);
			match(CURLY_RIGHT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(143);
				elif();
				}
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

	public static class Else_stContext extends ParserRuleContext {
		public TerminalNode ELSE_SYMBOL() { return getToken(ALMASParser.ELSE_SYMBOL, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(ALMASParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ALMASParser.CURLY_RIGHT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterElse_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitElse_st(this);
		}
	}

	public final Else_stContext else_st() throws RecognitionException {
		Else_stContext _localctx = new Else_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ELSE_SYMBOL);
			setState(147);
			match(CURLY_LEFT);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(148);
				statements();
				}
			}

			setState(151);
			match(CURLY_RIGHT);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode BINARY_BOOLEAN_OP() { return getToken(ALMASParser.BINARY_BOOLEAN_OP, 0); }
		public TerminalNode EQUAL() { return getToken(ALMASParser.EQUAL, 0); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expression();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==BINARY_BOOLEAN_OP) {
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==BINARY_BOOLEAN_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				expressions();
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public Relop_expressionContext relop_expression() {
			return getRuleContext(Relop_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public List<TerminalNode> UNARY_OP() { return getTokens(ALMASParser.UNARY_OP); }
		public TerminalNode UNARY_OP(int i) {
			return getToken(ALMASParser.UNARY_OP, i);
		}
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				relop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(159);
					match(UNARY_OP);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(166);
					match(UNARY_OP);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(173);
					match(UNARY_OP);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(LEFT_P);
				setState(180);
				expression();
				setState(181);
				match(RIGHT_P);
				}
				break;
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

	public static class Relop_expressionContext extends ParserRuleContext {
		public List<Decimal_expressionsContext> decimal_expressions() {
			return getRuleContexts(Decimal_expressionsContext.class);
		}
		public Decimal_expressionsContext decimal_expressions(int i) {
			return getRuleContext(Decimal_expressionsContext.class,i);
		}
		public TerminalNode RELATIONAL_OPERATOR() { return getToken(ALMASParser.RELATIONAL_OPERATOR, 0); }
		public TerminalNode EQUAL() { return getToken(ALMASParser.EQUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(ALMASParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ALMASParser.STRING, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(ALMASParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(ALMASParser.BOOLEAN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ALMASParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ALMASParser.IDENTIFIER, i);
		}
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public Relop_expressionContext relop_expression() {
			return getRuleContext(Relop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public List<TerminalNode> UNARY_OP() { return getTokens(ALMASParser.UNARY_OP); }
		public TerminalNode UNARY_OP(int i) {
			return getToken(ALMASParser.UNARY_OP, i);
		}
		public Relop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterRelop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitRelop_expression(this);
		}
	}

	public final Relop_expressionContext relop_expression() throws RecognitionException {
		Relop_expressionContext _localctx = new Relop_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relop_expression);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				decimal_expressions();
				setState(186);
				match(RELATIONAL_OPERATOR);
				setState(187);
				decimal_expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(189);
					decimal_expressions();
					}
					break;
				case 2:
					{
					setState(190);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(191);
					match(BOOLEAN);
					}
					break;
				case 4:
					{
					setState(192);
					match(IDENTIFIER);
					}
					break;
				}
				setState(195);
				match(EQUAL);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(196);
					decimal_expressions();
					}
					break;
				case 2:
					{
					setState(197);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(198);
					match(BOOLEAN);
					}
					break;
				case 4:
					{
					setState(199);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(202);
					match(UNARY_OP);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(LEFT_P);
				setState(209);
				relop_expression();
				setState(210);
				match(RIGHT_P);
				}
				break;
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

	public static class Decimal_expressionsContext extends ParserRuleContext {
		public Decimal_expressionContext decimal_expression() {
			return getRuleContext(Decimal_expressionContext.class,0);
		}
		public TerminalNode BINARY_DECIMAL_OP() { return getToken(ALMASParser.BINARY_DECIMAL_OP, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public Decimal_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterDecimal_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitDecimal_expressions(this);
		}
	}

	public final Decimal_expressionsContext decimal_expressions() throws RecognitionException {
		Decimal_expressionsContext _localctx = new Decimal_expressionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decimal_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			decimal_expression();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BINARY_DECIMAL_OP) {
				{
				setState(215);
				match(BINARY_DECIMAL_OP);
				setState(216);
				decimal_expressions();
				}
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

	public static class Decimal_expressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ALMASParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ALMASParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(ALMASParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(ALMASParser.DECIMAL, i);
		}
		public TerminalNode BINARY_DECIMAL_OP() { return getToken(ALMASParser.BINARY_DECIMAL_OP, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Decimal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterDecimal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitDecimal_expression(this);
		}
	}

	public final Decimal_expressionContext decimal_expression() throws RecognitionException {
		Decimal_expressionContext _localctx = new Decimal_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decimal_expression);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(220);
					match(BINARY_DECIMAL_OP);
					setState(221);
					_la = _input.LA(1);
					if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case LEFT_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(LEFT_P);
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_DECIMAL_OP) {
					{
					setState(226);
					match(BINARY_DECIMAL_OP);
					setState(227);
					_la = _input.LA(1);
					if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(230);
				match(RIGHT_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<If_stContext> if_st() {
			return getRuleContexts(If_stContext.class);
		}
		public If_stContext if_st(int i) {
			return getRuleContext(If_stContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(239);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DECIMAL_TYPE:
					case STRING_TYPE:
					case BOOLEAN_TYPE:
						{
						setState(233);
						assignment();
						}
						break;
					case IF_SYMBOL:
						{
						setState(234);
						if_st();
						}
						break;
					case FOR_SYMBOL:
						{
						setState(235);
						loop();
						}
						break;
					case IDENTIFIER:
						{
						setState(236);
						function_call();
						}
						break;
					case PRINT_OP:
						{
						setState(237);
						print();
						}
						break;
					case INPUT_OP:
						{
						setState(238);
						input();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR_SYMBOL() { return getToken(ALMASParser.FOR_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public List<TerminalNode> COLON() { return getTokens(ALMASParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ALMASParser.COLON, i);
		}
		public List<Decimal_expressionsContext> decimal_expressions() {
			return getRuleContexts(Decimal_expressionsContext.class);
		}
		public Decimal_expressionsContext decimal_expressions(int i) {
			return getRuleContext(Decimal_expressionsContext.class,i);
		}
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(ALMASParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ALMASParser.CURLY_RIGHT, 0); }
		public Loop_statementsContext loop_statements() {
			return getRuleContext(Loop_statementsContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FOR_SYMBOL);
			setState(244);
			match(LEFT_P);
			setState(245);
			match(IDENTIFIER);
			setState(246);
			match(COLON);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(247);
				decimal_expressions();
				}
			}

			setState(250);
			match(COLON);
			setState(251);
			decimal_expressions();
			setState(252);
			match(COLON);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(253);
				decimal_expressions();
				}
			}

			setState(256);
			match(RIGHT_P);
			setState(257);
			match(CURLY_LEFT);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(258);
				loop_statements();
				}
			}

			setState(261);
			match(CURLY_RIGHT);
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

	public static class Loop_statementsContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> CONTINUE_SYMBOL() { return getTokens(ALMASParser.CONTINUE_SYMBOL); }
		public TerminalNode CONTINUE_SYMBOL(int i) {
			return getToken(ALMASParser.CONTINUE_SYMBOL, i);
		}
		public List<TerminalNode> BREAK_SYMBOL() { return getTokens(ALMASParser.BREAK_SYMBOL); }
		public TerminalNode BREAK_SYMBOL(int i) {
			return getToken(ALMASParser.BREAK_SYMBOL, i);
		}
		public Loop_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterLoop_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitLoop_statements(this);
		}
	}

	public final Loop_statementsContext loop_statements() throws RecognitionException {
		Loop_statementsContext _localctx = new Loop_statementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loop_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECIMAL_TYPE:
				case STRING_TYPE:
				case BOOLEAN_TYPE:
				case PRINT_OP:
				case INPUT_OP:
				case IF_SYMBOL:
				case FOR_SYMBOL:
				case IDENTIFIER:
					{
					setState(263);
					statements();
					}
					break;
				case CONTINUE_SYMBOL:
					{
					setState(264);
					match(CONTINUE_SYMBOL);
					}
					break;
				case BREAK_SYMBOL:
					{
					setState(265);
					match(BREAK_SYMBOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0) );
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_OP() { return getToken(ALMASParser.PRINT_OP, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(PRINT_OP);
			setState(271);
			match(LEFT_P);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(272);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(273);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(274);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(275);
				match(IDENTIFIER);
				}
				break;
			}
			setState(278);
			match(RIGHT_P);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT_OP() { return getToken(ALMASParser.INPUT_OP, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(INPUT_OP);
			setState(281);
			match(LEFT_P);
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			match(RIGHT_P);
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

	public static class Return_typeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(ALMASParser.VOID_TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_type);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				primitive_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(VOID_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_SYMBOL() { return getToken(ALMASParser.FUNCTION_SYMBOL, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public Func_inputsContext func_inputs() {
			return getRuleContext(Func_inputsContext.class,0);
		}
		public TerminalNode CURLY_LEFT() { return getToken(ALMASParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ALMASParser.CURLY_RIGHT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Return_stContext return_st() {
			return getRuleContext(Return_stContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FUNCTION_SYMBOL);
			setState(290);
			return_type();
			setState(291);
			match(IDENTIFIER);
			setState(292);
			func_inputs();
			setState(293);
			match(CURLY_LEFT);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(294);
				statements();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN_SYMBOL) {
				{
				setState(297);
				return_st();
				}
			}

			setState(300);
			match(CURLY_RIGHT);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(IDENTIFIER);
			setState(303);
			match(LEFT_P);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << BOOLEAN) | (1L << DECIMAL) | (1L << UNARY_OP) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(304);
				func_args();
				}
			}

			setState(307);
			match(RIGHT_P);
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

	public static class More_func_inputsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ALMASParser.COMMA, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public More_func_inputsContext more_func_inputs() {
			return getRuleContext(More_func_inputsContext.class,0);
		}
		public More_func_inputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_func_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterMore_func_inputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitMore_func_inputs(this);
		}
	}

	public final More_func_inputsContext more_func_inputs() throws RecognitionException {
		More_func_inputsContext _localctx = new More_func_inputsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_more_func_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(COMMA);
			setState(310);
			primitive_type();
			setState(311);
			match(IDENTIFIER);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(312);
				more_func_inputs();
				}
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

	public static class Return_stContext extends ParserRuleContext {
		public TerminalNode RETURN_SYMBOL() { return getToken(ALMASParser.RETURN_SYMBOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Return_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterReturn_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitReturn_st(this);
		}
	}

	public final Return_stContext return_st() throws RecognitionException {
		Return_stContext _localctx = new Return_stContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(RETURN_SYMBOL);
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(316);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(317);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(318);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(319);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(320);
				expressions();
				}
				break;
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

	public static class Func_argsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public More_func_argsContext more_func_args() {
			return getRuleContext(More_func_argsContext.class,0);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitFunc_args(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(323);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(324);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(325);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(326);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(327);
				expressions();
				}
				break;
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(330);
				more_func_args();
				}
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

	public static class More_func_argsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ALMASParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public Decimal_expressionsContext decimal_expressions() {
			return getRuleContext(Decimal_expressionsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ALMASParser.BOOLEAN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public More_func_argsContext more_func_args() {
			return getRuleContext(More_func_argsContext.class,0);
		}
		public More_func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterMore_func_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitMore_func_args(this);
		}
	}

	public final More_func_argsContext more_func_args() throws RecognitionException {
		More_func_argsContext _localctx = new More_func_argsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_more_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(COMMA);
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(334);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(335);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(336);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(337);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(338);
				expressions();
				}
				break;
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(341);
				more_func_args();
				}
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

	public static class Boolean_castContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_CAST_SYMBOL() { return getToken(ALMASParser.BOOLEAN_CAST_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Boolean_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterBoolean_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitBoolean_cast(this);
		}
	}

	public final Boolean_castContext boolean_cast() throws RecognitionException {
		Boolean_castContext _localctx = new Boolean_castContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_boolean_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(BOOLEAN_CAST_SYMBOL);
			setState(345);
			match(LEFT_P);
			setState(346);
			match(IDENTIFIER);
			setState(347);
			match(RIGHT_P);
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

	public static class Decimal_castContext extends ParserRuleContext {
		public TerminalNode DECIMAL_CAST_SYMBOL() { return getToken(ALMASParser.DECIMAL_CAST_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Decimal_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterDecimal_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitDecimal_cast(this);
		}
	}

	public final Decimal_castContext decimal_cast() throws RecognitionException {
		Decimal_castContext _localctx = new Decimal_castContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decimal_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(DECIMAL_CAST_SYMBOL);
			setState(350);
			match(LEFT_P);
			setState(351);
			match(IDENTIFIER);
			setState(352);
			match(RIGHT_P);
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

	public static class String_castContext extends ParserRuleContext {
		public TerminalNode STRING_CAST_SYMBOL() { return getToken(ALMASParser.STRING_CAST_SYMBOL, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public String_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterString_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitString_cast(this);
		}
	}

	public final String_castContext string_cast() throws RecognitionException {
		String_castContext _localctx = new String_castContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(STRING_CAST_SYMBOL);
			setState(355);
			match(LEFT_P);
			setState(356);
			match(IDENTIFIER);
			setState(357);
			match(RIGHT_P);
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ALMASParser.STRING_TYPE, 0); }
		public TerminalNode DECIMAL_TYPE() { return getToken(ALMASParser.DECIMAL_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ALMASParser.BOOLEAN_TYPE, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitPrimitive_type(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\5\3M\n\3\5\3O\n\3\3\3"+
		"\3\3\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bv\n\b\3\t\3\t\5\tz\n\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0085\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13"+
		"\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\5\f\u0098\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\5\r\u009f\n\r\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3\16"+
		"\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16\3\16\3\16\7\16\u00b1\n\16"+
		"\f\16\16\16\u00b4\13\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00cb\n\17\3\17\7\17\u00ce\n\17\f\17\16\17\u00d1\13\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00d7\n\17\3\20\3\20\3\20\5\20\u00dc\n\20\3\21\3\21\3"+
		"\21\5\21\u00e1\n\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\21\5\21\u00ea"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00f2\n\22\r\22\16\22\u00f3\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00fb\n\23\3\23\3\23\3\23\3\23\5\23\u0101"+
		"\n\23\3\23\3\23\3\23\5\23\u0106\n\23\3\23\3\23\3\24\3\24\3\24\6\24\u010d"+
		"\n\24\r\24\16\24\u010e\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0122\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u012a\n\30\3\30\5\30\u012d\n\30\3\30\3\30\3"+
		"\31\3\31\3\31\5\31\u0134\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u013c"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0144\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u014b\n\34\3\34\5\34\u014e\n\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0156\n\35\3\35\5\35\u0159\n\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\4\2\n\n!!\4\2\34\34#"+
		"#\3\2#$\3\2\4\6\2\u0197\2E\3\2\2\2\4H\3\2\2\2\6T\3\2\2\2\b_\3\2\2\2\n"+
		"a\3\2\2\2\fh\3\2\2\2\16o\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0088\3\2"+
		"\2\2\26\u0094\3\2\2\2\30\u009b\3\2\2\2\32\u00b9\3\2\2\2\34\u00d6\3\2\2"+
		"\2\36\u00d8\3\2\2\2 \u00e9\3\2\2\2\"\u00f1\3\2\2\2$\u00f5\3\2\2\2&\u010c"+
		"\3\2\2\2(\u0110\3\2\2\2*\u011a\3\2\2\2,\u0121\3\2\2\2.\u0123\3\2\2\2\60"+
		"\u0130\3\2\2\2\62\u0137\3\2\2\2\64\u013d\3\2\2\2\66\u014a\3\2\2\28\u014f"+
		"\3\2\2\2:\u015a\3\2\2\2<\u015f\3\2\2\2>\u0164\3\2\2\2@\u0169\3\2\2\2B"+
		"D\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2"+
		"HN\7\17\2\2IJ\5@!\2JL\7#\2\2KM\5\62\32\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2"+
		"NI\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\20\2\2Q\5\3\2\2\2RU\5\"\22\2SU\5.\30"+
		"\2TR\3\2\2\2TS\3\2\2\2U\7\3\2\2\2VW\7\5\2\2WX\7#\2\2X`\5\n\6\2YZ\7\4\2"+
		"\2Z[\7#\2\2[`\5\f\7\2\\]\7\6\2\2]^\7#\2\2^`\5\16\b\2_V\3\2\2\2_Y\3\2\2"+
		"\2_\\\3\2\2\2`\t\3\2\2\2af\7\b\2\2bg\7$\2\2cg\5\60\31\2dg\5> \2eg\5*\26"+
		"\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hm\7\b\2\2in\5\36"+
		"\20\2jn\5\60\31\2kn\5<\37\2ln\5*\26\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml"+
		"\3\2\2\2n\r\3\2\2\2ou\7\b\2\2pv\7\23\2\2qv\5\30\r\2rv\5\60\31\2sv\5:\36"+
		"\2tv\5*\26\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\17\3\2"+
		"\2\2wy\5\22\n\2xz\5\24\13\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5\26\f\2|"+
		"{\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~\177\7\24\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0081\5\30\r\2\u0081\u0082\7\20\2\2\u0082\u0084\7\16\2\2\u0083\u0085"+
		"\5\"\22\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\7\r\2\2\u0087\23\3\2\2\2\u0088\u0089\7\25\2\2\u0089\u008a"+
		"\7\17\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\20\2\2\u008c\u008e\7\16\2"+
		"\2\u008d\u008f\5\"\22\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\7\r\2\2\u0091\u0093\5\24\13\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095\7\26\2\2\u0095"+
		"\u0097\7\16\2\2\u0096\u0098\5\"\22\2\u0097\u0096\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\r\2\2\u009a\27\3\2\2\2\u009b"+
		"\u009e\5\32\16\2\u009c\u009d\t\2\2\2\u009d\u009f\5\30\r\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00ba\5\34\17\2\u00a1"+
		"\u00a3\7 \2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00ba\7#\2\2\u00a8\u00aa\7 \2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00ba\7\23\2\2\u00af\u00b1\7 \2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\5\32\16\2\u00b7"+
		"\u00b8\7\20\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00a0\3\2\2\2\u00b9\u00a4\3"+
		"\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba\33\3\2\2\2\u00bb"+
		"\u00bc\5\36\20\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\5\36\20\2\u00be\u00d7"+
		"\3\2\2\2\u00bf\u00c4\5\36\20\2\u00c0\u00c4\7$\2\2\u00c1\u00c4\7\23\2\2"+
		"\u00c2\u00c4\7#\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\7\n\2\2\u00c6"+
		"\u00cb\5\36\20\2\u00c7\u00cb\7$\2\2\u00c8\u00cb\7\23\2\2\u00c9\u00cb\7"+
		"#\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00d7\3\2\2\2\u00cc\u00ce\7 \2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\5"+
		"\34\17\2\u00d4\u00d5\7\20\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00bb\3\2\2\2"+
		"\u00d6\u00c3\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00db"+
		"\5 \21\2\u00d9\u00da\7\"\2\2\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00e0\t\3\2\2\u00de\u00df"+
		"\7\"\2\2\u00df\u00e1\t\3\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00ea\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e6\t\3\2\2\u00e4\u00e5\7"+
		"\"\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\7\20\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e2\3"+
		"\2\2\2\u00ea!\3\2\2\2\u00eb\u00f2\5\b\5\2\u00ec\u00f2\5\20\t\2\u00ed\u00f2"+
		"\5$\23\2\u00ee\u00f2\5\60\31\2\u00ef\u00f2\5(\25\2\u00f0\u00f2\5*\26\2"+
		"\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f6\7\27\2\2"+
		"\u00f6\u00f7\7\17\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fa\7\f\2\2\u00f9\u00fb"+
		"\5\36\20\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fd\7\f\2\2\u00fd\u00fe\5\36\20\2\u00fe\u0100\7\f\2\2\u00ff\u0101"+
		"\5\36\20\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0103\7\20\2\2\u0103\u0105\7\16\2\2\u0104\u0106\5&\24\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\r\2\2\u0108"+
		"%\3\2\2\2\u0109\u010d\5\"\22\2\u010a\u010d\7\32\2\2\u010b\u010d\7\33\2"+
		"\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\'\3\2\2\2\u0110"+
		"\u0111\7\21\2\2\u0111\u0116\7\17\2\2\u0112\u0117\5\36\20\2\u0113\u0117"+
		"\7$\2\2\u0114\u0117\7\23\2\2\u0115\u0117\7#\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\7\20\2\2\u0119)\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c"+
		"\7\17\2\2\u011c\u011d\t\4\2\2\u011d\u011e\7\20\2\2\u011e+\3\2\2\2\u011f"+
		"\u0122\5@!\2\u0120\u0122\7\7\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2"+
		"\2\u0122-\3\2\2\2\u0123\u0124\7\30\2\2\u0124\u0125\5,\27\2\u0125\u0126"+
		"\7#\2\2\u0126\u0127\5\4\3\2\u0127\u0129\7\16\2\2\u0128\u012a\5\"\22\2"+
		"\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d"+
		"\5\64\33\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2"+
		"\u012e\u012f\7\r\2\2\u012f/\3\2\2\2\u0130\u0131\7#\2\2\u0131\u0133\7\17"+
		"\2\2\u0132\u0134\5\66\34\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7\20\2\2\u0136\61\3\2\2\2\u0137\u0138\7\13"+
		"\2\2\u0138\u0139\5@!\2\u0139\u013b\7#\2\2\u013a\u013c\5\62\32\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\63\3\2\2\2\u013d\u0143\7\31\2"+
		"\2\u013e\u0144\7#\2\2\u013f\u0144\5\36\20\2\u0140\u0144\7$\2\2\u0141\u0144"+
		"\7\23\2\2\u0142\u0144\5\30\r\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2\2\2"+
		"\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\65"+
		"\3\2\2\2\u0145\u014b\7#\2\2\u0146\u014b\5\36\20\2\u0147\u014b\7$\2\2\u0148"+
		"\u014b\7\23\2\2\u0149\u014b\5\30\r\2\u014a\u0145\3\2\2\2\u014a\u0146\3"+
		"\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014e\58\35\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\67\3\2\2\2\u014f\u0155\7\13\2\2\u0150\u0156\7#\2\2\u0151\u0156"+
		"\5\36\20\2\u0152\u0156\7$\2\2\u0153\u0156\7\23\2\2\u0154\u0156\5\30\r"+
		"\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\58\35\2\u0158"+
		"\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u01599\3\2\2\2\u015a\u015b\7\35\2\2"+
		"\u015b\u015c\7\17\2\2\u015c\u015d\7#\2\2\u015d\u015e\7\20\2\2\u015e;\3"+
		"\2\2\2\u015f\u0160\7\37\2\2\u0160\u0161\7\17\2\2\u0161\u0162\7#\2\2\u0162"+
		"\u0163\7\20\2\2\u0163=\3\2\2\2\u0164\u0165\7\36\2\2\u0165\u0166\7\17\2"+
		"\2\u0166\u0167\7#\2\2\u0167\u0168\7\20\2\2\u0168?\3\2\2\2\u0169\u016a"+
		"\t\5\2\2\u016aA\3\2\2\2/ELNT_fmuy|\u0084\u008e\u0092\u0097\u009e\u00a4"+
		"\u00ab\u00b2\u00b9\u00c3\u00ca\u00cf\u00d6\u00db\u00e0\u00e6\u00e9\u00f1"+
		"\u00f3\u00fa\u0100\u0105\u010c\u010e\u0116\u0121\u0129\u012c\u0133\u013b"+
		"\u0143\u014a\u014d\u0155\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
