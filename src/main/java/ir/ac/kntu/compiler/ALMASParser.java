package ir.ac.kntu.compiler;// Generated from ALMAS.g by ANTLR 4.9.3
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
		RULE_break_continue = 19, RULE_print = 20, RULE_input = 21, RULE_return_type = 22, 
		RULE_function = 23, RULE_function_call = 24, RULE_more_func_inputs = 25, 
		RULE_return_st = 26, RULE_func_args = 27, RULE_more_func_args = 28, RULE_boolean_cast = 29, 
		RULE_decimal_cast = 30, RULE_string_cast = 31, RULE_primitive_type = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_inputs", "program_body", "assignment", "string_assignment", 
			"decimal_assignment", "boolean_assignment", "if_st", "bare_if", "elif", 
			"else_st", "expressions", "expression", "relop_expression", "decimal_expressions", 
			"decimal_expression", "statements", "loop", "loop_statements", "break_continue", 
			"print", "input", "return_type", "function", "function_call", "more_func_inputs", 
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
		public TerminalNode EOF() { return getToken(ALMASParser.EOF, 0); }
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << FUNCTION_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(66);
				program_body();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
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
			setState(74);
			match(LEFT_P);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(75);
				primitive_type();
				setState(76);
				match(IDENTIFIER);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(77);
					more_func_inputs();
					}
				}

				}
			}

			setState(82);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
			case PRINT_OP:
			case INPUT_OP:
			case IF_SYMBOL:
			case FOR_SYMBOL:
			case CONTINUE_SYMBOL:
			case BREAK_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				statements();
				}
				break;
			case FUNCTION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(STRING_TYPE);
				setState(89);
				match(IDENTIFIER);
				setState(90);
				string_assignment();
				}
				break;
			case DECIMAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(DECIMAL_TYPE);
				setState(92);
				match(IDENTIFIER);
				setState(93);
				decimal_assignment();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(BOOLEAN_TYPE);
				setState(95);
				match(IDENTIFIER);
				setState(96);
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
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
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
			setState(99);
			match(ASSIGNMENT_OP);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(101);
				function_call();
				}
				break;
			case 3:
				{
				setState(102);
				string_cast();
				}
				break;
			case 4:
				{
				setState(103);
				input();
				}
				break;
			case 5:
				{
				setState(104);
				match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
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
			setState(107);
			match(ASSIGNMENT_OP);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(109);
				function_call();
				}
				break;
			case 3:
				{
				setState(110);
				decimal_cast();
				}
				break;
			case 4:
				{
				setState(111);
				input();
				}
				break;
			case 5:
				{
				setState(112);
				match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(ALMASParser.IDENTIFIER, 0); }
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
			setState(115);
			match(ASSIGNMENT_OP);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(116);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(117);
				expressions();
				}
				break;
			case 3:
				{
				setState(118);
				function_call();
				}
				break;
			case 4:
				{
				setState(119);
				boolean_cast();
				}
				break;
			case 5:
				{
				setState(120);
				input();
				}
				break;
			case 6:
				{
				setState(121);
				match(IDENTIFIER);
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
			setState(124);
			bare_if();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(125);
				elif();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(128);
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
			setState(131);
			match(IF_SYMBOL);
			setState(132);
			match(LEFT_P);
			setState(133);
			expressions();
			setState(134);
			match(RIGHT_P);
			setState(135);
			match(CURLY_LEFT);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(136);
				statements();
				}
			}

			setState(139);
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
			setState(141);
			match(ELSE_IF_SYMBOL);
			setState(142);
			match(LEFT_P);
			setState(143);
			expressions();
			setState(144);
			match(RIGHT_P);
			setState(145);
			match(CURLY_LEFT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(146);
				statements();
				}
			}

			setState(149);
			match(CURLY_RIGHT);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(150);
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
			setState(153);
			match(ELSE_SYMBOL);
			setState(154);
			match(CURLY_LEFT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(155);
				statements();
				}
			}

			setState(158);
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
			setState(160);
			expression();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==BINARY_BOOLEAN_OP) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==BINARY_BOOLEAN_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				relop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(180);
					match(UNARY_OP);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(LEFT_P);
				setState(187);
				expression();
				setState(188);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				decimal_expressions();
				setState(193);
				match(RELATIONAL_OPERATOR);
				setState(194);
				decimal_expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				setState(202);
				match(EQUAL);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(203);
					decimal_expressions();
					}
					break;
				case 2:
					{
					setState(204);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(205);
					match(BOOLEAN);
					}
					break;
				case 4:
					{
					setState(206);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(209);
					match(UNARY_OP);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(LEFT_P);
				setState(216);
				relop_expression();
				setState(217);
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
			setState(221);
			decimal_expression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BINARY_DECIMAL_OP) {
				{
				setState(222);
				match(BINARY_DECIMAL_OP);
				setState(223);
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(227);
					match(BINARY_DECIMAL_OP);
					setState(228);
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
				setState(231);
				match(LEFT_P);
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_DECIMAL_OP) {
					{
					setState(233);
					match(BINARY_DECIMAL_OP);
					setState(234);
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

				setState(237);
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
		public List<Break_continueContext> break_continue() {
			return getRuleContexts(Break_continueContext.class);
		}
		public Break_continueContext break_continue(int i) {
			return getRuleContext(Break_continueContext.class,i);
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
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(247);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DECIMAL_TYPE:
					case STRING_TYPE:
					case BOOLEAN_TYPE:
						{
						setState(240);
						assignment();
						}
						break;
					case IF_SYMBOL:
						{
						setState(241);
						if_st();
						}
						break;
					case FOR_SYMBOL:
						{
						setState(242);
						loop();
						}
						break;
					case IDENTIFIER:
						{
						setState(243);
						function_call();
						}
						break;
					case PRINT_OP:
						{
						setState(244);
						print();
						}
						break;
					case INPUT_OP:
						{
						setState(245);
						input();
						}
						break;
					case CONTINUE_SYMBOL:
					case BREAK_SYMBOL:
						{
						setState(246);
						break_continue();
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
				setState(249); 
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
			setState(251);
			match(FOR_SYMBOL);
			setState(252);
			match(LEFT_P);
			setState(253);
			match(IDENTIFIER);
			setState(254);
			match(COLON);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(255);
				decimal_expressions();
				}
			}

			setState(258);
			match(COLON);
			setState(259);
			decimal_expressions();
			setState(260);
			match(COLON);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(261);
				decimal_expressions();
				}
			}

			setState(264);
			match(RIGHT_P);
			setState(265);
			match(CURLY_LEFT);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(266);
				loop_statements();
				}
			}

			setState(269);
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
		public List<Break_continueContext> break_continue() {
			return getRuleContexts(Break_continueContext.class);
		}
		public Break_continueContext break_continue(int i) {
			return getRuleContext(Break_continueContext.class,i);
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
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(271);
					statements();
					}
					break;
				case 2:
					{
					setState(272);
					break_continue();
					}
					break;
				}
				}
				setState(275); 
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

	public static class Break_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE_SYMBOL() { return getToken(ALMASParser.CONTINUE_SYMBOL, 0); }
		public TerminalNode BREAK_SYMBOL() { return getToken(ALMASParser.BREAK_SYMBOL, 0); }
		public Break_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterBreak_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitBreak_continue(this);
		}
	}

	public final Break_continueContext break_continue() throws RecognitionException {
		Break_continueContext _localctx = new Break_continueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_break_continue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==CONTINUE_SYMBOL || _la==BREAK_SYMBOL) ) {
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
		enterRule(_localctx, 40, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PRINT_OP);
			setState(280);
			match(LEFT_P);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(281);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(282);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(283);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(284);
				match(IDENTIFIER);
				}
				break;
			}
			setState(287);
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
		enterRule(_localctx, 42, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(INPUT_OP);
			setState(290);
			match(LEFT_P);
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
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
		enterRule(_localctx, 44, RULE_return_type);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				primitive_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(FUNCTION_SYMBOL);
			setState(299);
			return_type();
			setState(300);
			match(IDENTIFIER);
			setState(301);
			func_inputs();
			setState(302);
			match(CURLY_LEFT);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(303);
				statements();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN_SYMBOL) {
				{
				setState(306);
				return_st();
				}
			}

			setState(309);
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
		enterRule(_localctx, 48, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(LEFT_P);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << BOOLEAN) | (1L << DECIMAL) | (1L << UNARY_OP) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(313);
				func_args();
				}
			}

			setState(316);
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
		enterRule(_localctx, 50, RULE_more_func_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(COMMA);
			setState(319);
			primitive_type();
			setState(320);
			match(IDENTIFIER);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(321);
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
		enterRule(_localctx, 52, RULE_return_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RETURN_SYMBOL);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(325);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(326);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(327);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(328);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(329);
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
		enterRule(_localctx, 54, RULE_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(332);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(333);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(334);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(335);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(336);
				expressions();
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(339);
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
		enterRule(_localctx, 56, RULE_more_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(COMMA);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(343);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(344);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(345);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(346);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(347);
				expressions();
				}
				break;
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(350);
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
		enterRule(_localctx, 58, RULE_boolean_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(BOOLEAN_CAST_SYMBOL);
			setState(354);
			match(LEFT_P);
			setState(355);
			match(IDENTIFIER);
			setState(356);
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
		enterRule(_localctx, 60, RULE_decimal_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(DECIMAL_CAST_SYMBOL);
			setState(359);
			match(LEFT_P);
			setState(360);
			match(IDENTIFIER);
			setState(361);
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
		enterRule(_localctx, 62, RULE_string_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(STRING_CAST_SYMBOL);
			setState(364);
			match(LEFT_P);
			setState(365);
			match(IDENTIFIER);
			setState(366);
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
		enterRule(_localctx, 64, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0175\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\5\3S\n\3\3\3\3\3\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\5\t\u0081\n\t\3\t"+
		"\5\t\u0084\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f"+
		"\3\f\5\f\u009f\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\7\16\u00aa"+
		"\n\16\f\16\16\16\u00ad\13\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4"+
		"\13\16\3\16\3\16\7\16\u00b8\n\16\f\16\16\16\u00bb\13\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00c1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cb"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\3\17\7\17\u00d5\n\17\f"+
		"\17\16\17\u00d8\13\17\3\17\3\17\3\17\3\17\5\17\u00de\n\17\3\20\3\20\3"+
		"\20\5\20\u00e3\n\20\3\21\3\21\3\21\5\21\u00e8\n\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00ee\n\21\3\21\5\21\u00f1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\6\22\u00fa\n\22\r\22\16\22\u00fb\3\23\3\23\3\23\3\23\3\23\5\23\u0103"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0109\n\23\3\23\3\23\3\23\5\23\u010e\n"+
		"\23\3\23\3\23\3\24\3\24\6\24\u0114\n\24\r\24\16\24\u0115\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0120\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u012b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0133"+
		"\n\31\3\31\5\31\u0136\n\31\3\31\3\31\3\32\3\32\3\32\5\32\u013d\n\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\5\33\u0145\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u014d\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0154\n\35\3\35\5"+
		"\35\u0157\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015f\n\36\3\36\5\36"+
		"\u0162\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\7\4\2\n\n!!\4\2\34\34##\3\2\32\33\3\2#$\3\2\4\6\2\u01a2\2"+
		"G\3\2\2\2\4L\3\2\2\2\6X\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fm\3\2\2\2\16u\3"+
		"\2\2\2\20~\3\2\2\2\22\u0085\3\2\2\2\24\u008f\3\2\2\2\26\u009b\3\2\2\2"+
		"\30\u00a2\3\2\2\2\32\u00c0\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 "+
		"\u00f0\3\2\2\2\"\u00f9\3\2\2\2$\u00fd\3\2\2\2&\u0113\3\2\2\2(\u0117\3"+
		"\2\2\2*\u0119\3\2\2\2,\u0123\3\2\2\2.\u012a\3\2\2\2\60\u012c\3\2\2\2\62"+
		"\u0139\3\2\2\2\64\u0140\3\2\2\2\66\u0146\3\2\2\28\u0153\3\2\2\2:\u0158"+
		"\3\2\2\2<\u0163\3\2\2\2>\u0168\3\2\2\2@\u016d\3\2\2\2B\u0172\3\2\2\2D"+
		"F\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\7\2\2\3K\3\3\2\2\2LR\7\17\2\2MN\5B\"\2NP\7#\2\2OQ\5\64\33\2PO\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RM\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\20\2\2U\5\3\2"+
		"\2\2VY\5\"\22\2WY\5\60\31\2XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z[\7\5\2\2["+
		"\\\7#\2\2\\d\5\n\6\2]^\7\4\2\2^_\7#\2\2_d\5\f\7\2`a\7\6\2\2ab\7#\2\2b"+
		"d\5\16\b\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2d\t\3\2\2\2ek\7\b\2\2fl\7$\2\2"+
		"gl\5\62\32\2hl\5@!\2il\5,\27\2jl\7#\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2"+
		"ki\3\2\2\2kj\3\2\2\2l\13\3\2\2\2ms\7\b\2\2nt\5\36\20\2ot\5\62\32\2pt\5"+
		"> \2qt\5,\27\2rt\7#\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2"+
		"\2\2t\r\3\2\2\2u|\7\b\2\2v}\7\23\2\2w}\5\30\r\2x}\5\62\32\2y}\5<\37\2"+
		"z}\5,\27\2{}\7#\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2"+
		"|{\3\2\2\2}\17\3\2\2\2~\u0080\5\22\n\2\177\u0081\5\24\13\2\u0080\177\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\26\f\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\7\24\2"+
		"\2\u0086\u0087\7\17\2\2\u0087\u0088\5\30\r\2\u0088\u0089\7\20\2\2\u0089"+
		"\u008b\7\16\2\2\u008a\u008c\5\"\22\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\r\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\7\25\2\2\u0090\u0091\7\17\2\2\u0091\u0092\5\30\r\2\u0092\u0093"+
		"\7\20\2\2\u0093\u0095\7\16\2\2\u0094\u0096\5\"\22\2\u0095\u0094\3\2\2"+
		"\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\r\2\2\u0098\u009a"+
		"\5\24\13\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b"+
		"\u009c\7\26\2\2\u009c\u009e\7\16\2\2\u009d\u009f\5\"\22\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a5\5\32\16\2\u00a3\u00a4\t\2\2\2\u00a4\u00a6\5\30"+
		"\r\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00c1"+
		"\5\34\17\2\u00a8\u00aa\7 \2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00c1\7#\2\2\u00af\u00b1\7 \2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00c1\7\23\2\2\u00b6\u00b8\7 \2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd"+
		"\u00be\5\32\16\2\u00be\u00bf\7\20\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00a7"+
		"\3\2\2\2\u00c0\u00ab\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1"+
		"\33\3\2\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\36"+
		"\20\2\u00c5\u00de\3\2\2\2\u00c6\u00cb\5\36\20\2\u00c7\u00cb\7$\2\2\u00c8"+
		"\u00cb\7\23\2\2\u00c9\u00cb\7#\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00d1\7\n\2\2\u00cd\u00d2\5\36\20\2\u00ce\u00d2\7$\2\2\u00cf\u00d2\7"+
		"\23\2\2\u00d0\u00d2\7#\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d5\7 "+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\17"+
		"\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7\20\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00c2\3\2\2\2\u00dd\u00ca\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00e2\5 \21\2\u00e0\u00e1\7\"\2\2\u00e1\u00e3\5\36\20\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e7\t\3\2"+
		"\2\u00e5\u00e6\7\"\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\7\17\2\2\u00ea\u00ed\t\3\2\2"+
		"\u00eb\u00ec\7\"\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7\20\2\2\u00f0\u00e4\3\2\2\2"+
		"\u00f0\u00e9\3\2\2\2\u00f1!\3\2\2\2\u00f2\u00fa\5\b\5\2\u00f3\u00fa\5"+
		"\20\t\2\u00f4\u00fa\5$\23\2\u00f5\u00fa\5\62\32\2\u00f6\u00fa\5*\26\2"+
		"\u00f7\u00fa\5,\27\2\u00f8\u00fa\5(\25\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3"+
		"\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc#\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff"+
		"\7\17\2\2\u00ff\u0100\7#\2\2\u0100\u0102\7\f\2\2\u0101\u0103\5\36\20\2"+
		"\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\7\f\2\2\u0105\u0106\5\36\20\2\u0106\u0108\7\f\2\2\u0107\u0109\5\36\20"+
		"\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\7\20\2\2\u010b\u010d\7\16\2\2\u010c\u010e\5&\24\2\u010d\u010c\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\r\2\2\u0110%\3"+
		"\2\2\2\u0111\u0114\5\"\22\2\u0112\u0114\5(\25\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\'\3\2\2\2\u0117\u0118\t\4\2\2\u0118)\3\2\2\2\u0119\u011a\7"+
		"\21\2\2\u011a\u011f\7\17\2\2\u011b\u0120\5\36\20\2\u011c\u0120\7$\2\2"+
		"\u011d\u0120\7\23\2\2\u011e\u0120\7#\2\2\u011f\u011b\3\2\2\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\20\2\2\u0122+\3\2\2\2\u0123\u0124\7\22\2\2\u0124\u0125\7\17\2"+
		"\2\u0125\u0126\t\5\2\2\u0126\u0127\7\20\2\2\u0127-\3\2\2\2\u0128\u012b"+
		"\5B\"\2\u0129\u012b\7\7\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"/\3\2\2\2\u012c\u012d\7\30\2\2\u012d\u012e\5.\30\2\u012e\u012f\7#\2\2"+
		"\u012f\u0130\5\4\3\2\u0130\u0132\7\16\2\2\u0131\u0133\5\"\22\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\5\66\34\2"+
		"\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\7\r\2\2\u0138\61\3\2\2\2\u0139\u013a\7#\2\2\u013a\u013c\7\17\2\2\u013b"+
		"\u013d\58\35\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\7\20\2\2\u013f\63\3\2\2\2\u0140\u0141\7\13\2\2\u0141"+
		"\u0142\5B\"\2\u0142\u0144\7#\2\2\u0143\u0145\5\64\33\2\u0144\u0143\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\65\3\2\2\2\u0146\u014c\7\31\2\2\u0147\u014d"+
		"\7#\2\2\u0148\u014d\5\36\20\2\u0149\u014d\7$\2\2\u014a\u014d\7\23\2\2"+
		"\u014b\u014d\5\30\r\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\67\3\2\2\2\u014e"+
		"\u0154\7#\2\2\u014f\u0154\5\36\20\2\u0150\u0154\7$\2\2\u0151\u0154\7\23"+
		"\2\2\u0152\u0154\5\30\r\2\u0153\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u0153"+
		"\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0157\5:\36\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"9\3\2\2\2\u0158\u015e\7\13\2\2\u0159\u015f\7#\2\2\u015a\u015f\5\36\20"+
		"\2\u015b\u015f\7$\2\2\u015c\u015f\7\23\2\2\u015d\u015f\5\30\r\2\u015e"+
		"\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015d\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0162\5:\36\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162;\3\2\2\2\u0163\u0164\7\35\2\2"+
		"\u0164\u0165\7\17\2\2\u0165\u0166\7#\2\2\u0166\u0167\7\20\2\2\u0167=\3"+
		"\2\2\2\u0168\u0169\7\37\2\2\u0169\u016a\7\17\2\2\u016a\u016b\7#\2\2\u016b"+
		"\u016c\7\20\2\2\u016c?\3\2\2\2\u016d\u016e\7\36\2\2\u016e\u016f\7\17\2"+
		"\2\u016f\u0170\7#\2\2\u0170\u0171\7\20\2\2\u0171A\3\2\2\2\u0172\u0173"+
		"\t\6\2\2\u0173C\3\2\2\2/GPRXcks|\u0080\u0083\u008b\u0095\u0099\u009e\u00a5"+
		"\u00ab\u00b2\u00b9\u00c0\u00ca\u00d1\u00d6\u00dd\u00e2\u00e7\u00ed\u00f0"+
		"\u00f9\u00fb\u0102\u0108\u010d\u0113\u0115\u011f\u012a\u0132\u0135\u013c"+
		"\u0144\u014c\u0153\u0156\u015e\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}