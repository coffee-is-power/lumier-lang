// Generated from /home/tiago/Documentos/Projects/lumier/src/main/antlr/org/lumier/Lumier.g4 by ANTLR 4.9.2

package org.lumier;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LumierParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, END_KEYWORD=16, 
		FUNCTION_KEYWORD=17, IDENTIFIER=18, STRING=19, NUMBER=20, N=21, WS=22;
	public static final int
		RULE_compilationUnit = 0, RULE_function = 1, RULE_function_signature = 2, 
		RULE_parameters = 3, RULE_return_types = 4, RULE_type = 5, RULE_if_block = 6, 
		RULE_else_block = 7, RULE_block = 8, RULE_statement = 9, RULE_push_value_statement = 10, 
		RULE_function_call = 11, RULE_operation = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "function", "function_signature", "parameters", "return_types", 
			"type", "if_block", "else_block", "block", "statement", "push_value_statement", 
			"function_call", "operation", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'--'", "'in'", "'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'='", "'dup'", "'swap'", "'pop'", "'rot'", "'end'", "'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "END_KEYWORD", "FUNCTION_KEYWORD", "IDENTIFIER", 
			"STRING", "NUMBER", "N", "WS"
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
	public String getGrammarFileName() { return "Lumier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LumierParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(28);
				function();
				}
				}
				setState(33);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_KEYWORD() { return getToken(LumierParser.FUNCTION_KEYWORD, 0); }
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(FUNCTION_KEYWORD);
			setState(35);
			function_signature();
			setState(36);
			block();
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

	public static class Function_signatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LumierParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(IDENTIFIER);
			setState(39);
			parameters();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(40);
				match(T__0);
				setState(41);
				return_types();
				}
			}

			setState(44);
			match(T__1);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(46);
				type();
				}
				}
				setState(51);
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

	public static class Return_typesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(52);
				type();
				}
				}
				setState(57);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LumierParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
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

	public static class If_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			block();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				else_block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode END_KEYWORD() { return getToken(LumierParser.END_KEYWORD, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << IDENTIFIER) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(END_KEYWORD);
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

	public static class StatementContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Push_value_statementContext push_value_statement() {
			return getRuleContext(Push_value_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				if_block();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				push_value_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				function_call();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				operation();
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

	public static class Push_value_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Push_value_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_value_statement; }
	}

	public final Push_value_statementContext push_value_statement() throws RecognitionException {
		Push_value_statementContext _localctx = new Push_value_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_push_value_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			expr();
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
		public TerminalNode IDENTIFIER() { return getToken(LumierParser.IDENTIFIER, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFIER);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends OperationContext {
		public AddContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DivContext extends OperationContext {
		public DivContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class PopContext extends OperationContext {
		public PopContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends OperationContext {
		public SubContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class RotateContext extends OperationContext {
		public RotateContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class ModContext extends OperationContext {
		public ModContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends OperationContext {
		public MulContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class SwapContext extends OperationContext {
		public SwapContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsContext extends OperationContext {
		public EqualsContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class PowContext extends OperationContext {
		public PowContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DuplicateContext extends OperationContext {
		public DuplicateContext(OperationContext ctx) { copyFrom(ctx); }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new PowContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new DuplicateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new SwapContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new PopContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new RotateContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				match(T__14);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LumierParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(LumierParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\5\7\5\62\n\5\f\5\16\5\65\13"+
		"\5\3\6\7\68\n\6\f\6\16\6;\13\6\3\7\3\7\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\3"+
		"\t\3\n\7\nH\n\n\f\n\16\nK\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13S\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16d\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\3\3\2\25\26\2l\2!\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b\63\3\2\2\2\n9\3\2"+
		"\2\2\f<\3\2\2\2\16>\3\2\2\2\20C\3\2\2\2\22I\3\2\2\2\24R\3\2\2\2\26T\3"+
		"\2\2\2\30V\3\2\2\2\32c\3\2\2\2\34e\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 "+
		"#\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\7\23\2\2%&\5"+
		"\6\4\2&\'\5\22\n\2\'\5\3\2\2\2()\7\24\2\2),\5\b\5\2*+\7\3\2\2+-\5\n\6"+
		"\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\4\2\2/\7\3\2\2\2\60\62\5\f\7\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65"+
		"\63\3\2\2\2\668\5\f\7\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":\13\3\2\2\2;9\3\2\2\2<=\7\24\2\2=\r\3\2\2\2>?\7\5\2\2?A\5\22\n\2@B\5"+
		"\20\t\2A@\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CD\7\6\2\2DE\5\22\n\2E\21\3\2\2"+
		"\2FH\5\24\13\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2"+
		"\2\2LM\7\22\2\2M\23\3\2\2\2NS\5\16\b\2OS\5\26\f\2PS\5\30\r\2QS\5\32\16"+
		"\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\25\3\2\2\2TU\5\34\17\2U\27"+
		"\3\2\2\2VW\7\24\2\2W\31\3\2\2\2Xd\7\7\2\2Yd\7\b\2\2Zd\7\t\2\2[d\7\n\2"+
		"\2\\d\7\13\2\2]d\7\f\2\2^d\7\r\2\2_d\7\16\2\2`d\7\17\2\2ad\7\20\2\2bd"+
		"\7\21\2\2cX\3\2\2\2cY\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2"+
		"c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\33\3\2\2\2ef\t\2\2"+
		"\2f\35\3\2\2\2\n!,\639AIRc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}