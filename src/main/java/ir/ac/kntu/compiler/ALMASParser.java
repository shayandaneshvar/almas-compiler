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
		WS=1, JAVA_STARTER=2, DECIMAL_TYPE=3, STRING_TYPE=4, BOOLEAN_TYPE=5, VOID_TYPE=6, 
		ASSIGNMENT_OP=7, RELATIONAL_OPERATOR=8, EQUAL=9, COMMA=10, COLON=11, CURLY_RIGHT=12, 
		CURLY_LEFT=13, LEFT_P=14, RIGHT_P=15, PRINT_OP=16, INPUT_OP=17, BOOLEAN=18, 
		IF_SYMBOL=19, ELSE_IF_SYMBOL=20, ELSE_SYMBOL=21, FOR_SYMBOL=22, FUNCTION_SYMBOL=23, 
		RETURN_SYMBOL=24, CONTINUE_SYMBOL=25, BREAK_SYMBOL=26, DECIMAL=27, BOOLEAN_CAST_SYMBOL=28, 
		STRING_CAST_SYMBOL=29, DECIMAL_CAST_SYMBOL=30, UNARY_OP=31, BINARY_BOOLEAN_OP=32, 
		BINARY_DECIMAL_OP=33, IDENTIFIER=34, STRING=35;
	public static final int
		RULE_program = 0, RULE_func_inputs = 1, RULE_program_body = 2, RULE_assignment = 3, 
		RULE_string_assignment = 4, RULE_decimal_assignment = 5, RULE_boolean_assignment = 6, 
		RULE_if_st = 7, RULE_bare_if = 8, RULE_elif = 9, RULE_bare_elif = 10, 
		RULE_else_st = 11, RULE_expressions = 12, RULE_expression = 13, RULE_relop_expression = 14, 
		RULE_decimal_expressions = 15, RULE_decimal_expression = 16, RULE_statements = 17, 
		RULE_loop = 18, RULE_loop_statements = 19, RULE_break_continue = 20, RULE_print = 21, 
		RULE_input = 22, RULE_return_type = 23, RULE_function = 24, RULE_function_call = 25, 
		RULE_more_func_inputs = 26, RULE_return_st = 27, RULE_func_args = 28, 
		RULE_more_func_args = 29, RULE_boolean_cast = 30, RULE_decimal_cast = 31, 
		RULE_string_cast = 32, RULE_primitive_type = 33, RULE_java_code = 34, 
		RULE_java_code_block = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_inputs", "program_body", "assignment", "string_assignment", 
			"decimal_assignment", "boolean_assignment", "if_st", "bare_if", "elif", 
			"bare_elif", "else_st", "expressions", "expression", "relop_expression", 
			"decimal_expressions", "decimal_expression", "statements", "loop", "loop_statements", 
			"break_continue", "print", "input", "return_type", "function", "function_call", 
			"more_func_inputs", "return_st", "func_args", "more_func_args", "boolean_cast", 
			"decimal_cast", "string_cast", "primitive_type", "java_code", "java_code_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@java'", "'#'", "'$'", "'?'", "'_'", "'='", null, "'is'", 
			"','", "':'", "'}'", "'{'", "'('", "')'", "'@print'", "'@input'", null, 
			"'if'", "'elif'", "'else'", "'loop'", "'fn'", "'ret'", "'go'", "'break'", 
			null, "'@?'", "'@$'", "'@#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << FUNCTION_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(72);
				program_body();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(80);
			match(LEFT_P);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(81);
				primitive_type();
				setState(82);
				match(IDENTIFIER);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(83);
					more_func_inputs();
					}
				}

				}
			}

			setState(88);
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
		public Java_codeContext java_code() {
			return getRuleContext(Java_codeContext.class,0);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				java_code();
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(STRING_TYPE);
				setState(96);
				match(IDENTIFIER);
				setState(97);
				string_assignment();
				}
				break;
			case DECIMAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(DECIMAL_TYPE);
				setState(99);
				match(IDENTIFIER);
				setState(100);
				decimal_assignment();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(BOOLEAN_TYPE);
				setState(102);
				match(IDENTIFIER);
				setState(103);
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
			setState(106);
			match(ASSIGNMENT_OP);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(107);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(108);
				function_call();
				}
				break;
			case 3:
				{
				setState(109);
				string_cast();
				}
				break;
			case 4:
				{
				setState(110);
				input();
				}
				break;
			case 5:
				{
				setState(111);
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
			setState(114);
			match(ASSIGNMENT_OP);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(115);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(116);
				function_call();
				}
				break;
			case 3:
				{
				setState(117);
				decimal_cast();
				}
				break;
			case 4:
				{
				setState(118);
				input();
				}
				break;
			case 5:
				{
				setState(119);
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
			setState(122);
			match(ASSIGNMENT_OP);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(123);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(124);
				expressions();
				}
				break;
			case 3:
				{
				setState(125);
				function_call();
				}
				break;
			case 4:
				{
				setState(126);
				boolean_cast();
				}
				break;
			case 5:
				{
				setState(127);
				input();
				}
				break;
			case 6:
				{
				setState(128);
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
			setState(131);
			bare_if();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(132);
				elif();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(135);
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
			setState(138);
			match(IF_SYMBOL);
			setState(139);
			match(LEFT_P);
			setState(140);
			expressions();
			setState(141);
			match(RIGHT_P);
			setState(142);
			match(CURLY_LEFT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(143);
				statements();
				}
			}

			setState(146);
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
		public Bare_elifContext bare_elif() {
			return getRuleContext(Bare_elifContext.class,0);
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
			setState(148);
			bare_elif();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF_SYMBOL) {
				{
				setState(149);
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

	public static class Bare_elifContext extends ParserRuleContext {
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
		public Bare_elifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bare_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterBare_elif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitBare_elif(this);
		}
	}

	public final Bare_elifContext bare_elif() throws RecognitionException {
		Bare_elifContext _localctx = new Bare_elifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bare_elif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ELSE_IF_SYMBOL);
			setState(153);
			match(LEFT_P);
			setState(154);
			expressions();
			setState(155);
			match(RIGHT_P);
			setState(156);
			match(CURLY_LEFT);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(157);
				statements();
				}
			}

			setState(160);
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
		enterRule(_localctx, 22, RULE_else_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ELSE_SYMBOL);
			setState(163);
			match(CURLY_LEFT);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(164);
				statements();
				}
			}

			setState(167);
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
		enterRule(_localctx, 24, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==BINARY_BOOLEAN_OP) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==BINARY_BOOLEAN_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				relop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(175);
					match(UNARY_OP);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(182);
					match(UNARY_OP);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(189);
					match(UNARY_OP);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(LEFT_P);
				setState(196);
				expression();
				setState(197);
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
		enterRule(_localctx, 28, RULE_relop_expression);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				decimal_expressions();
				setState(202);
				match(RELATIONAL_OPERATOR);
				setState(203);
				decimal_expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(205);
					decimal_expressions();
					}
					break;
				case 2:
					{
					setState(206);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(207);
					match(BOOLEAN);
					}
					break;
				case 4:
					{
					setState(208);
					match(IDENTIFIER);
					}
					break;
				}
				setState(211);
				match(EQUAL);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(212);
					decimal_expressions();
					}
					break;
				case 2:
					{
					setState(213);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(214);
					match(BOOLEAN);
					}
					break;
				case 4:
					{
					setState(215);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNARY_OP) {
					{
					{
					setState(218);
					match(UNARY_OP);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(LEFT_P);
				setState(225);
				relop_expression();
				setState(226);
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
		enterRule(_localctx, 30, RULE_decimal_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			decimal_expression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BINARY_DECIMAL_OP) {
				{
				setState(231);
				match(BINARY_DECIMAL_OP);
				setState(232);
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
		enterRule(_localctx, 32, RULE_decimal_expression);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(236);
					match(BINARY_DECIMAL_OP);
					setState(237);
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
				setState(240);
				match(LEFT_P);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_DECIMAL_OP) {
					{
					setState(242);
					match(BINARY_DECIMAL_OP);
					setState(243);
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

				setState(246);
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
		public List<Java_codeContext> java_code() {
			return getRuleContexts(Java_codeContext.class);
		}
		public Java_codeContext java_code(int i) {
			return getRuleContext(Java_codeContext.class,i);
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
		enterRule(_localctx, 34, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(257);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DECIMAL_TYPE:
					case STRING_TYPE:
					case BOOLEAN_TYPE:
						{
						setState(249);
						assignment();
						}
						break;
					case IF_SYMBOL:
						{
						setState(250);
						if_st();
						}
						break;
					case FOR_SYMBOL:
						{
						setState(251);
						loop();
						}
						break;
					case IDENTIFIER:
						{
						setState(252);
						function_call();
						}
						break;
					case PRINT_OP:
						{
						setState(253);
						print();
						}
						break;
					case JAVA_STARTER:
						{
						setState(254);
						java_code();
						}
						break;
					case INPUT_OP:
						{
						setState(255);
						input();
						}
						break;
					case CONTINUE_SYMBOL:
					case BREAK_SYMBOL:
						{
						setState(256);
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
				setState(259); 
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
		enterRule(_localctx, 36, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FOR_SYMBOL);
			setState(262);
			match(LEFT_P);
			setState(263);
			match(IDENTIFIER);
			setState(264);
			match(COLON);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(265);
				decimal_expressions();
				}
			}

			setState(268);
			match(COLON);
			setState(269);
			decimal_expressions();
			setState(270);
			match(COLON);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(271);
				decimal_expressions();
				}
			}

			setState(274);
			match(RIGHT_P);
			setState(275);
			match(CURLY_LEFT);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(276);
				loop_statements();
				}
			}

			setState(279);
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
		enterRule(_localctx, 38, RULE_loop_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				statements();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0) );
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
		enterRule(_localctx, 40, RULE_break_continue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 42, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(PRINT_OP);
			setState(289);
			match(LEFT_P);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(290);
				decimal_expressions();
				}
				break;
			case 2:
				{
				setState(291);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(292);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(293);
				match(IDENTIFIER);
				}
				break;
			}
			setState(296);
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
		enterRule(_localctx, 44, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(INPUT_OP);
			setState(299);
			match(LEFT_P);
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
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
		enterRule(_localctx, 46, RULE_return_type);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				primitive_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		enterRule(_localctx, 48, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(FUNCTION_SYMBOL);
			setState(308);
			return_type();
			setState(309);
			match(IDENTIFIER);
			setState(310);
			func_inputs();
			setState(311);
			match(CURLY_LEFT);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_STARTER) | (1L << DECIMAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT_OP) | (1L << INPUT_OP) | (1L << IF_SYMBOL) | (1L << FOR_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(312);
				statements();
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN_SYMBOL) {
				{
				setState(315);
				return_st();
				}
			}

			setState(318);
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
		enterRule(_localctx, 50, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IDENTIFIER);
			setState(321);
			match(LEFT_P);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_P) | (1L << BOOLEAN) | (1L << DECIMAL) | (1L << UNARY_OP) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(322);
				func_args();
				}
			}

			setState(325);
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
		enterRule(_localctx, 52, RULE_more_func_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(COMMA);
			setState(328);
			primitive_type();
			setState(329);
			match(IDENTIFIER);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(330);
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
		enterRule(_localctx, 54, RULE_return_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(RETURN_SYMBOL);
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
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
		enterRule(_localctx, 56, RULE_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(341);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(342);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(343);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(344);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(345);
				expressions();
				}
				break;
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(348);
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
		enterRule(_localctx, 58, RULE_more_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(COMMA);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(352);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(353);
				decimal_expressions();
				}
				break;
			case 3:
				{
				setState(354);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(355);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(356);
				expressions();
				}
				break;
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(359);
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
		enterRule(_localctx, 60, RULE_boolean_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(BOOLEAN_CAST_SYMBOL);
			setState(363);
			match(LEFT_P);
			setState(364);
			match(IDENTIFIER);
			setState(365);
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
		enterRule(_localctx, 62, RULE_decimal_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(DECIMAL_CAST_SYMBOL);
			setState(368);
			match(LEFT_P);
			setState(369);
			match(IDENTIFIER);
			setState(370);
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
		enterRule(_localctx, 64, RULE_string_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(STRING_CAST_SYMBOL);
			setState(373);
			match(LEFT_P);
			setState(374);
			match(IDENTIFIER);
			setState(375);
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
		enterRule(_localctx, 66, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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

	public static class Java_codeContext extends ParserRuleContext {
		public TerminalNode JAVA_STARTER() { return getToken(ALMASParser.JAVA_STARTER, 0); }
		public TerminalNode LEFT_P() { return getToken(ALMASParser.LEFT_P, 0); }
		public TerminalNode RIGHT_P() { return getToken(ALMASParser.RIGHT_P, 0); }
		public Java_code_blockContext java_code_block() {
			return getRuleContext(Java_code_blockContext.class,0);
		}
		public Java_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterJava_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitJava_code(this);
		}
	}

	public final Java_codeContext java_code() throws RecognitionException {
		Java_codeContext _localctx = new Java_codeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_java_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(JAVA_STARTER);
			setState(380);
			match(LEFT_P);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(381);
				java_code_block();
				}
			}

			setState(384);
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

	public static class Java_code_blockContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ALMASParser.STRING, 0); }
		public Java_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).enterJava_code_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ALMASListener ) ((ALMASListener)listener).exitJava_code_block(this);
		}
	}

	public final Java_code_blockContext java_code_block() throws RecognitionException {
		Java_code_blockContext _localctx = new Java_code_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_java_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3W\n\3\5\3Y\n\3\3\3\3\3\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084"+
		"\n\b\3\t\3\t\5\t\u0088\n\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0093\n\n\3\n\3\n\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a1\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a8\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u00af\n\16\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17"+
		"\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13\17\3\17\3\17\7\17\u00c1\n\17"+
		"\f\17\16\17\u00c4\13\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d4\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00db\n\20\3\20\7\20\u00de\n\20\f\20\16\20\u00e1\13\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\3\21\5\21\u00ec\n\21\3\22\3\22\3"+
		"\22\5\22\u00f1\n\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\22\5\22\u00fa"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0104\n\23\r\23\16"+
		"\23\u0105\3\24\3\24\3\24\3\24\3\24\5\24\u010d\n\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0113\n\24\3\24\3\24\3\24\5\24\u0118\n\24\3\24\3\24\3\25\6\25\u011d"+
		"\n\25\r\25\16\25\u011e\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0129"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0134\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u013c\n\32\3\32\5\32\u013f\n\32\3\32\3"+
		"\32\3\33\3\33\3\33\5\33\u0146\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u014e\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0156\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u015d\n\36\3\36\5\36\u0160\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0168\n\37\3\37\5\37\u016b\n\37\3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\5$\u0181\n$\3$\3$\3%\3%\3%"+
		"\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFH\2\7\4\2\13\13\"\"\4\2\35\35$$\3\2\33\34\3\2$%\3\2\5\7\2\u01b3\2"+
		"M\3\2\2\2\4R\3\2\2\2\6_\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16|\3"+
		"\2\2\2\20\u0085\3\2\2\2\22\u008c\3\2\2\2\24\u0096\3\2\2\2\26\u009a\3\2"+
		"\2\2\30\u00a4\3\2\2\2\32\u00ab\3\2\2\2\34\u00c9\3\2\2\2\36\u00e6\3\2\2"+
		"\2 \u00e8\3\2\2\2\"\u00f9\3\2\2\2$\u0103\3\2\2\2&\u0107\3\2\2\2(\u011c"+
		"\3\2\2\2*\u0120\3\2\2\2,\u0122\3\2\2\2.\u012c\3\2\2\2\60\u0133\3\2\2\2"+
		"\62\u0135\3\2\2\2\64\u0142\3\2\2\2\66\u0149\3\2\2\28\u014f\3\2\2\2:\u015c"+
		"\3\2\2\2<\u0161\3\2\2\2>\u016c\3\2\2\2@\u0171\3\2\2\2B\u0176\3\2\2\2D"+
		"\u017b\3\2\2\2F\u017d\3\2\2\2H\u0184\3\2\2\2JL\5\6\4\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RX\7"+
		"\20\2\2ST\5D#\2TV\7$\2\2UW\5\66\34\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XS\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\21\2\2[\5\3\2\2\2\\`\5$\23\2]`\5\62\32"+
		"\2^`\5F$\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\6\2\2bc\7$\2"+
		"\2ck\5\n\6\2de\7\5\2\2ef\7$\2\2fk\5\f\7\2gh\7\7\2\2hi\7$\2\2ik\5\16\b"+
		"\2ja\3\2\2\2jd\3\2\2\2jg\3\2\2\2k\t\3\2\2\2lr\7\t\2\2ms\7%\2\2ns\5\64"+
		"\33\2os\5B\"\2ps\5.\30\2qs\7$\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2"+
		"\2\2rq\3\2\2\2s\13\3\2\2\2tz\7\t\2\2u{\5 \21\2v{\5\64\33\2w{\5@!\2x{\5"+
		".\30\2y{\7$\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\r\3"+
		"\2\2\2|\u0083\7\t\2\2}\u0084\7\24\2\2~\u0084\5\32\16\2\177\u0084\5\64"+
		"\33\2\u0080\u0084\5> \2\u0081\u0084\5.\30\2\u0082\u0084\7$\2\2\u0083}"+
		"\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0087\5\22\n\2\u0086"+
		"\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3"+
		"\2\2\2\u0089\u008b\5\30\r\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\21\3\2\2\2\u008c\u008d\7\25\2\2\u008d\u008e\7\20\2\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0090\7\21\2\2\u0090\u0092\7\17\2\2\u0091\u0093\5$\23\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\16"+
		"\2\2\u0095\23\3\2\2\2\u0096\u0098\5\26\f\2\u0097\u0099\5\24\13\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7\26\2"+
		"\2\u009b\u009c\7\20\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7\21\2\2\u009e"+
		"\u00a0\7\17\2\2\u009f\u00a1\5$\23\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\27\3\2\2\2\u00a4"+
		"\u00a5\7\27\2\2\u00a5\u00a7\7\17\2\2\u00a6\u00a8\5$\23\2\u00a7\u00a6\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa"+
		"\31\3\2\2\2\u00ab\u00ae\5\34\17\2\u00ac\u00ad\t\2\2\2\u00ad\u00af\5\32"+
		"\16\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00ca"+
		"\5\36\20\2\u00b1\u00b3\7!\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00ca\7$\2\2\u00b8\u00ba\7!\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00ca\7\24\2\2\u00bf\u00c1\7!\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"\u00c7\5\34\17\2\u00c7\u00c8\7\21\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b0"+
		"\3\2\2\2\u00c9\u00b4\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca"+
		"\35\3\2\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\5 \21"+
		"\2\u00ce\u00e7\3\2\2\2\u00cf\u00d4\5 \21\2\u00d0\u00d4\7%\2\2\u00d1\u00d4"+
		"\7\24\2\2\u00d2\u00d4\7$\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\7\13"+
		"\2\2\u00d6\u00db\5 \21\2\u00d7\u00db\7%\2\2\u00d8\u00db\7\24\2\2\u00d9"+
		"\u00db\7$\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\u00e7\3\2\2\2\u00dc\u00de\7!\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\20\2\2\u00e3"+
		"\u00e4\5\36\20\2\u00e4\u00e5\7\21\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00cb"+
		"\3\2\2\2\u00e6\u00d3\3\2\2\2\u00e6\u00df\3\2\2\2\u00e7\37\3\2\2\2\u00e8"+
		"\u00eb\5\"\22\2\u00e9\u00ea\7#\2\2\u00ea\u00ec\5 \21\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00f0\t\3\2\2\u00ee\u00ef"+
		"\7#\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00fa\3\2\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f6\t\3\2\2\u00f4\u00f5\7"+
		"#\2\2\u00f5\u00f7\t\3\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\7\21\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f2\3"+
		"\2\2\2\u00fa#\3\2\2\2\u00fb\u0104\5\b\5\2\u00fc\u0104\5\20\t\2\u00fd\u0104"+
		"\5&\24\2\u00fe\u0104\5\64\33\2\u00ff\u0104\5,\27\2\u0100\u0104\5F$\2\u0101"+
		"\u0104\5.\30\2\u0102\u0104\5*\26\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2"+
		"\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106%\3\2\2\2\u0107\u0108"+
		"\7\30\2\2\u0108\u0109\7\20\2\2\u0109\u010a\7$\2\2\u010a\u010c\7\r\2\2"+
		"\u010b\u010d\5 \21\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\7\r\2\2\u010f\u0110\5 \21\2\u0110\u0112\7\r\2\2\u0111"+
		"\u0113\5 \21\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\7\21\2\2\u0115\u0117\7\17\2\2\u0116\u0118\5(\25\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\16"+
		"\2\2\u011a\'\3\2\2\2\u011b\u011d\5$\23\2\u011c\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f)\3\2\2\2\u0120"+
		"\u0121\t\4\2\2\u0121+\3\2\2\2\u0122\u0123\7\22\2\2\u0123\u0128\7\20\2"+
		"\2\u0124\u0129\5 \21\2\u0125\u0129\7%\2\2\u0126\u0129\7\24\2\2\u0127\u0129"+
		"\7$\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\21\2\2\u012b-\3\2\2\2"+
		"\u012c\u012d\7\23\2\2\u012d\u012e\7\20\2\2\u012e\u012f\t\5\2\2\u012f\u0130"+
		"\7\21\2\2\u0130/\3\2\2\2\u0131\u0134\5D#\2\u0132\u0134\7\b\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134\61\3\2\2\2\u0135\u0136\7\31\2\2\u0136"+
		"\u0137\5\60\31\2\u0137\u0138\7$\2\2\u0138\u0139\5\4\3\2\u0139\u013b\7"+
		"\17\2\2\u013a\u013c\5$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013f\58\35\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\16\2\2\u0141\63\3\2\2\2\u0142\u0143"+
		"\7$\2\2\u0143\u0145\7\20\2\2\u0144\u0146\5:\36\2\u0145\u0144\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\21\2\2\u0148\65\3\2\2"+
		"\2\u0149\u014a\7\f\2\2\u014a\u014b\5D#\2\u014b\u014d\7$\2\2\u014c\u014e"+
		"\5\66\34\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\67\3\2\2\2\u014f"+
		"\u0155\7\32\2\2\u0150\u0156\7$\2\2\u0151\u0156\5 \21\2\u0152\u0156\7%"+
		"\2\2\u0153\u0156\7\24\2\2\u0154\u0156\5\32\16\2\u0155\u0150\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u01569\3\2\2\2\u0157\u015d\7$\2\2\u0158\u015d\5 \21\2\u0159\u015d"+
		"\7%\2\2\u015a\u015d\7\24\2\2\u015b\u015d\5\32\16\2\u015c\u0157\3\2\2\2"+
		"\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b"+
		"\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\5<\37\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160;\3\2\2\2\u0161\u0167\7\f\2\2\u0162\u0168\7$\2\2\u0163"+
		"\u0168\5 \21\2\u0164\u0168\7%\2\2\u0165\u0168\7\24\2\2\u0166\u0168\5\32"+
		"\16\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5<"+
		"\37\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b=\3\2\2\2\u016c\u016d"+
		"\7\36\2\2\u016d\u016e\7\20\2\2\u016e\u016f\7$\2\2\u016f\u0170\7\21\2\2"+
		"\u0170?\3\2\2\2\u0171\u0172\7 \2\2\u0172\u0173\7\20\2\2\u0173\u0174\7"+
		"$\2\2\u0174\u0175\7\21\2\2\u0175A\3\2\2\2\u0176\u0177\7\37\2\2\u0177\u0178"+
		"\7\20\2\2\u0178\u0179\7$\2\2\u0179\u017a\7\21\2\2\u017aC\3\2\2\2\u017b"+
		"\u017c\t\6\2\2\u017cE\3\2\2\2\u017d\u017e\7\4\2\2\u017e\u0180\7\20\2\2"+
		"\u017f\u0181\5H%\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\7\21\2\2\u0183G\3\2\2\2\u0184\u0185\7%\2\2\u0185"+
		"I\3\2\2\2/MVX_jrz\u0083\u0087\u008a\u0092\u0098\u00a0\u00a7\u00ae\u00b4"+
		"\u00bb\u00c2\u00c9\u00d3\u00da\u00df\u00e6\u00eb\u00f0\u00f6\u00f9\u0103"+
		"\u0105\u010c\u0112\u0117\u011e\u0128\u0133\u013b\u013e\u0145\u014d\u0155"+
		"\u015c\u015f\u0167\u016a\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
