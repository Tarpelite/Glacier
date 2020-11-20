// Generated from d:\workspace\2020_fall\PL\Glacier\atto.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class attoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, VAR=11, INT=12, SPACESL=13;
	public static final int
		RULE_func = 0, RULE_expr = 1, RULE_name = 2, RULE_args = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"func", "expr", "name", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fn'", "'is'", "'if'", "'head'", "'tail'", "'+'", "'-'", "'='", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "VAR", 
			"INT", "SPACESL"
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
	public String getGrammarFileName() { return "atto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public attoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> SPACESL() { return getTokens(attoParser.SPACESL); }
		public TerminalNode SPACESL(int i) {
			return getToken(attoParser.SPACESL, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			match(SPACESL);
			setState(10);
			name();
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(11);
				args();
				}
				break;
			}
			setState(14);
			match(SPACESL);
			setState(15);
			match(T__1);
			setState(16);
			match(SPACESL);
			setState(17);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> SPACESL() { return getTokens(attoParser.SPACESL); }
		public TerminalNode SPACESL(int i) {
			return getToken(attoParser.SPACESL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case SPACESL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__2);
				setState(21);
				match(SPACESL);
				setState(22);
				expr();
				setState(23);
				match(SPACESL);
				setState(24);
				expr();
				setState(25);
				match(SPACESL);
				setState(26);
				expr();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(T__3);
				setState(29);
				match(SPACESL);
				setState(30);
				expr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(T__4);
				setState(32);
				match(SPACESL);
				setState(33);
				expr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				match(T__5);
				setState(35);
				match(SPACESL);
				setState(36);
				expr();
				setState(37);
				match(SPACESL);
				setState(38);
				expr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(T__6);
				setState(41);
				match(SPACESL);
				setState(42);
				expr();
				setState(43);
				match(SPACESL);
				setState(44);
				expr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				match(T__7);
				setState(47);
				match(SPACESL);
				setState(48);
				expr();
				setState(49);
				match(SPACESL);
				setState(50);
				expr();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(T__8);
				setState(53);
				match(SPACESL);
				setState(54);
				expr();
				setState(55);
				match(SPACESL);
				setState(56);
				expr();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				name();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(attoParser.VAR, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VAR);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> SPACESL() { return getTokens(attoParser.SPACESL); }
		public TerminalNode SPACESL(int i) {
			return getToken(attoParser.SPACESL, i);
		}
		public List<TerminalNode> VAR() { return getTokens(attoParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(attoParser.VAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(attoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(attoParser.INT, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(66);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SPACESL:
						{
						setState(63);
						match(SPACESL);
						setState(64);
						match(VAR);
						}
						break;
					case INT:
						{
						setState(65);
						match(INT);
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
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2\17\n\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5\3\5\6\5E\n\5\r\5\16\5F\3\5\2"+
		"\2\6\2\4\6\b\2\2\2O\2\n\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bD\3\2\2\2\n\13"+
		"\7\3\2\2\13\f\7\17\2\2\f\16\5\6\4\2\r\17\5\b\5\2\16\r\3\2\2\2\16\17\3"+
		"\2\2\2\17\20\3\2\2\2\20\21\7\17\2\2\21\22\7\4\2\2\22\23\7\17\2\2\23\24"+
		"\5\4\3\2\24\3\3\2\2\2\25>\3\2\2\2\26\27\7\5\2\2\27\30\7\17\2\2\30\31\5"+
		"\4\3\2\31\32\7\17\2\2\32\33\5\4\3\2\33\34\7\17\2\2\34\35\5\4\3\2\35>\3"+
		"\2\2\2\36\37\7\6\2\2\37 \7\17\2\2 >\5\4\3\2!\"\7\7\2\2\"#\7\17\2\2#>\5"+
		"\4\3\2$%\7\b\2\2%&\7\17\2\2&\'\5\4\3\2\'(\7\17\2\2()\5\4\3\2)>\3\2\2\2"+
		"*+\7\t\2\2+,\7\17\2\2,-\5\4\3\2-.\7\17\2\2./\5\4\3\2/>\3\2\2\2\60\61\7"+
		"\n\2\2\61\62\7\17\2\2\62\63\5\4\3\2\63\64\7\17\2\2\64\65\5\4\3\2\65>\3"+
		"\2\2\2\66\67\7\13\2\2\678\7\17\2\289\5\4\3\29:\7\17\2\2:;\5\4\3\2;>\3"+
		"\2\2\2<>\5\6\4\2=\25\3\2\2\2=\26\3\2\2\2=\36\3\2\2\2=!\3\2\2\2=$\3\2\2"+
		"\2=*\3\2\2\2=\60\3\2\2\2=\66\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\7\r\2\2@\7"+
		"\3\2\2\2AB\7\17\2\2BE\7\r\2\2CE\7\16\2\2DA\3\2\2\2DC\3\2\2\2EF\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2\6\16=DF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}