// Generated from /home/tiago/Documentos/Projects/lumier/src/main/antlr/org/lumier/Lumier.g4 by ANTLR 4.9.2

package org.lumier;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LumierLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, END_KEYWORD=16, 
		FUNCTION_KEYWORD=17, IDENTIFIER=18, STRING=19, NUMBER=20, N=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "END_KEYWORD", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "FUNCTION_KEYWORD", "IDENTIFIER", "STRING", "NUMBER", 
			"N", "WS"
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


	public LumierLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lumier.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26y\n\26\3\26\3\26\3\26\3\26"+
		"\6\26\177\n\26\r\26\16\26\u0080\3\27\3\27\7\27\u0085\n\27\f\27\16\27\u0088"+
		"\13\27\3\27\3\27\3\30\3\30\6\30\u008e\n\30\r\30\16\30\u008f\3\31\3\31"+
		"\3\31\6\31\u0095\n\31\r\31\16\31\u0096\3\31\3\31\3\32\6\32\u009c\n\32"+
		"\r\32\16\32\u009d\3\32\3\32\3\u0086\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)\23+\24-\25"+
		"/\26\61\27\63\30\3\2\6\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\2\u00a8\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2"+
		"\2\58\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2"+
		"\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33U\3\2\2"+
		"\2\35Z\3\2\2\2\37^\3\2\2\2!b\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)l"+
		"\3\2\2\2+x\3\2\2\2-\u0082\3\2\2\2/\u008b\3\2\2\2\61\u0094\3\2\2\2\63\u009b"+
		"\3\2\2\2\65\66\7/\2\2\66\67\7/\2\2\67\4\3\2\2\289\7k\2\29:\7p\2\2:\6\3"+
		"\2\2\2;<\7k\2\2<=\7h\2\2=\b\3\2\2\2>?\7g\2\2?@\7n\2\2@A\7u\2\2AB\7g\2"+
		"\2B\n\3\2\2\2CD\7-\2\2D\f\3\2\2\2EF\7/\2\2F\16\3\2\2\2GH\7,\2\2H\20\3"+
		"\2\2\2IJ\7\61\2\2J\22\3\2\2\2KL\7\'\2\2L\24\3\2\2\2MN\7`\2\2N\26\3\2\2"+
		"\2OP\7?\2\2P\30\3\2\2\2QR\7f\2\2RS\7w\2\2ST\7r\2\2T\32\3\2\2\2UV\7u\2"+
		"\2VW\7y\2\2WX\7c\2\2XY\7r\2\2Y\34\3\2\2\2Z[\7r\2\2[\\\7q\2\2\\]\7r\2\2"+
		"]\36\3\2\2\2^_\7t\2\2_`\7q\2\2`a\7v\2\2a \3\2\2\2bc\7g\2\2cd\7p\2\2de"+
		"\7f\2\2e\"\3\2\2\2fg\t\2\2\2g$\3\2\2\2hi\t\3\2\2i&\3\2\2\2jk\t\4\2\2k"+
		"(\3\2\2\2lm\7h\2\2mn\7w\2\2no\7p\2\2op\7e\2\2pq\7v\2\2qr\7k\2\2rs\7q\2"+
		"\2st\7p\2\2t*\3\2\2\2uy\5#\22\2vy\5%\23\2wy\7a\2\2xu\3\2\2\2xv\3\2\2\2"+
		"xw\3\2\2\2y~\3\2\2\2z\177\5#\22\2{\177\5%\23\2|\177\7a\2\2}\177\5\'\24"+
		"\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081,\3\2\2\2\u0082\u0086\7$\2\2\u0083\u0085"+
		"\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a"+
		"\7$\2\2\u008a.\3\2\2\2\u008b\u008d\7/\2\2\u008c\u008e\5\'\24\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\60\3\2\2\2\u0091\u0095\7\f\2\2\u0092\u0093\7\17\2\2\u0093\u0095\7\f\2"+
		"\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\31\2\2"+
		"\u0099\62\3\2\2\2\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\b\32\2\2\u00a0\64\3\2\2\2\13\2x~\u0080\u0086\u008f\u0094\u0096"+
		"\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}