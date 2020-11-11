// Generated from /mnt/d/workspace/2020_fall/Glacier/glacier.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class glacierParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, WS=57, Identifier=58, IdentifierNondigit=59, 
		Nondigit=60, Digit=61, UniversalCharacterName=62, HexQuad=63, HexadecimalDigit=64, 
		Number=65;
	public static final int
		RULE_item = 0, RULE_operator = 1, RULE_definition = 2, RULE_expr = 3, 
		RULE_binOp = 4, RULE_unaryOp = 5, RULE_gtype = 6, RULE_basegtype = 7, 
		RULE_shape = 8, RULE_kind = 9, RULE_globalId = 10, RULE_localId = 11, 
		RULE_gtypeId = 12, RULE_realNumber = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"item", "operator", "definition", "expr", "binOp", "unaryOp", "gtype", 
			"basegtype", "shape", "kind", "globalId", "localId", "gtypeId", "realNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'operator'", "':'", "'def'", "'('", "')'", "'->'", "'{'", "'}'", 
			"'True'", "'False'", "','", "'let'", "'='", "'in'", "'['", "']'", "'if'", 
			"'then'", "'else'", "'Zero'", "'Grad'", "'Ref'", "'!'", "':='", "'+'", 
			"'-'", "'*'", "'/'", "'!='", "'<'", "'<='", "'>'", "'>='", "'sq'", "'Tensor'", 
			"'forall'", "'refgtype'", "'IntType'", "'UIntType'", "'FloatType'", "'BoolType'", 
			"'Shape'", "'BaseType'", "'Type'", "'@'", "'%'", "'0'", "'1'", "'2'", 
			"'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "Identifier", 
			"IdentifierNondigit", "Nondigit", "Digit", "UniversalCharacterName", 
			"HexQuad", "HexadecimalDigit", "Number"
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
	public String getGrammarFileName() { return "glacier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public glacierParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ItemContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_item);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				operator();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				definition();
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

	public static class OperatorContext extends ParserRuleContext {
		public GlobalIdContext globalId() {
			return getRuleContext(GlobalIdContext.class,0);
		}
		public GtypeContext gtype() {
			return getRuleContext(GtypeContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			globalId();
			setState(34);
			match(T__1);
			setState(35);
			gtype(0);
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

	public static class DefinitionContext extends ParserRuleContext {
		public GlobalIdContext globalId() {
			return getRuleContext(GlobalIdContext.class,0);
		}
		public List<GtypeContext> gtype() {
			return getRuleContexts(GtypeContext.class);
		}
		public GtypeContext gtype(int i) {
			return getRuleContext(GtypeContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<LocalIdContext> localId() {
			return getRuleContexts(LocalIdContext.class);
		}
		public LocalIdContext localId(int i) {
			return getRuleContext(LocalIdContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			globalId();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(39);
				match(T__3);
				setState(40);
				localId();
				setState(41);
				match(T__1);
				setState(42);
				gtype(0);
				setState(43);
				match(T__4);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__5);
			setState(51);
			gtype(0);
			setState(52);
			match(T__6);
			setState(53);
			expr(0);
			setState(54);
			match(T__7);
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
		public LocalIdContext localId() {
			return getRuleContext(LocalIdContext.class,0);
		}
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtypeContext gtype() {
			return getRuleContext(GtypeContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public TerminalNode Number() { return getToken(glacierParser.Number, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(57);
				localId();
				}
				break;
			case 2:
				{
				setState(58);
				realNumber();
				}
				break;
			case 3:
				{
				setState(59);
				match(T__8);
				}
				break;
			case 4:
				{
				setState(60);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(61);
				match(T__11);
				setState(62);
				localId();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(63);
					match(T__1);
					setState(64);
					gtype(0);
					}
				}

				setState(67);
				match(T__12);
				setState(68);
				expr(0);
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(69);
					match(T__13);
					setState(70);
					expr(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(73);
				match(T__3);
				setState(74);
				gtype(0);
				setState(75);
				match(T__4);
				setState(76);
				expr(12);
				}
				break;
			case 7:
				{
				setState(78);
				unaryOp();
				setState(79);
				expr(10);
				}
				break;
			case 8:
				{
				setState(81);
				match(T__3);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__33) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) {
					{
					setState(82);
					expr(0);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(83);
						match(T__10);
						setState(84);
						expr(0);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(92);
				match(T__4);
				}
				break;
			case 9:
				{
				setState(93);
				match(T__14);
				setState(94);
				expr(0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(95);
					match(T__10);
					setState(96);
					expr(0);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(T__15);
				}
				break;
			case 10:
				{
				setState(104);
				match(T__16);
				setState(105);
				expr(0);
				setState(106);
				match(T__17);
				setState(107);
				expr(0);
				setState(108);
				match(T__18);
				setState(109);
				expr(6);
				}
				break;
			case 11:
				{
				setState(111);
				match(T__19);
				setState(112);
				gtype(0);
				}
				break;
			case 12:
				{
				setState(113);
				match(T__20);
				setState(114);
				expr(4);
				}
				break;
			case 13:
				{
				setState(115);
				match(T__21);
				setState(116);
				expr(3);
				}
				break;
			case 14:
				{
				setState(117);
				match(T__22);
				setState(118);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						binOp();
						setState(123);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						match(T__23);
						setState(127);
						expr(2);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(129);
						match(T__3);
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__33) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) {
							{
							setState(130);
							expr(0);
							setState(135);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__10) {
								{
								{
								setState(131);
								match(T__10);
								setState(132);
								expr(0);
								}
								}
								setState(137);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(140);
						match(T__4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(142);
						match(T__14);
						setState(143);
						match(Number);
						setState(144);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinOpContext extends ParserRuleContext {
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__33) ) {
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

	public static class GtypeContext extends ParserRuleContext {
		public BasegtypeContext basegtype() {
			return getRuleContext(BasegtypeContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public List<GtypeContext> gtype() {
			return getRuleContexts(GtypeContext.class);
		}
		public GtypeContext gtype(int i) {
			return getRuleContext(GtypeContext.class,i);
		}
		public GtypeIdContext gtypeId() {
			return getRuleContext(GtypeIdContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public GtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtype; }
	}

	public final GtypeContext gtype() throws RecognitionException {
		return gtype(0);
	}

	private GtypeContext gtype(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GtypeContext _localctx = new GtypeContext(_ctx, _parentState);
		GtypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_gtype, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				{
				setState(155);
				basegtype();
				}
				break;
			case T__41:
				{
				setState(156);
				shape();
				}
				break;
			case T__34:
				{
				setState(157);
				match(T__34);
				setState(158);
				match(T__3);
				setState(159);
				gtype(0);
				setState(160);
				match(T__10);
				setState(161);
				gtype(0);
				setState(162);
				match(T__4);
				}
				break;
			case Nondigit:
				{
				setState(164);
				gtypeId();
				}
				break;
			case T__35:
				{
				setState(165);
				match(T__35);
				setState(166);
				match(T__3);
				setState(167);
				gtypeId();
				setState(168);
				match(T__1);
				setState(169);
				kind();
				setState(170);
				match(T__4);
				setState(171);
				match(T__10);
				setState(172);
				gtype(3);
				}
				break;
			case T__36:
				{
				setState(174);
				match(T__36);
				setState(175);
				match(T__3);
				setState(176);
				gtype(0);
				setState(177);
				match(T__4);
				}
				break;
			case T__3:
				{
				setState(179);
				match(T__3);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << Nondigit))) != 0)) {
					{
					setState(180);
					gtype(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(181);
						match(T__10);
						setState(182);
						gtype(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GtypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_gtype);
					setState(193);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(194);
					match(T__5);
					setState(195);
					gtype(6);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasegtypeContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(glacierParser.Number, 0); }
		public BasegtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basegtype; }
	}

	public final BasegtypeContext basegtype() throws RecognitionException {
		BasegtypeContext _localctx = new BasegtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basegtype);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__37);
				setState(202);
				match(T__3);
				setState(203);
				match(Number);
				setState(204);
				match(T__4);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__38);
				setState(206);
				match(T__3);
				setState(207);
				match(Number);
				setState(208);
				match(T__4);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__39);
				setState(210);
				match(T__3);
				setState(211);
				match(Number);
				setState(212);
				match(T__4);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(T__40);
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

	public static class ShapeContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(glacierParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(glacierParser.Number, i);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__41);
			setState(217);
			match(T__3);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Number) {
				{
				setState(218);
				match(Number);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(219);
					match(T__10);
					setState(220);
					match(Number);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(228);
			match(T__4);
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

	public static class KindContext extends ParserRuleContext {
		public KindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kind; }
	}

	public final KindContext kind() throws RecognitionException {
		KindContext _localctx = new KindContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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

	public static class GlobalIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(glacierParser.Identifier, 0); }
		public GlobalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalId; }
	}

	public final GlobalIdContext globalId() throws RecognitionException {
		GlobalIdContext _localctx = new GlobalIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__44);
			setState(233);
			match(Identifier);
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

	public static class LocalIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(glacierParser.Identifier, 0); }
		public LocalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localId; }
	}

	public final LocalIdContext localId() throws RecognitionException {
		LocalIdContext _localctx = new LocalIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__45);
			setState(236);
			match(Identifier);
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

	public static class GtypeIdContext extends ParserRuleContext {
		public TerminalNode Nondigit() { return getToken(glacierParser.Nondigit, 0); }
		public GtypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtypeId; }
	}

	public final GtypeIdContext gtypeId() throws RecognitionException {
		GtypeIdContext _localctx = new GtypeIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_gtypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Nondigit);
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

	public static class RealNumberContext extends ParserRuleContext {
		public RealNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumber; }
	}

	public final RealNumberContext realNumber() throws RecognitionException {
		RealNumberContext _localctx = new RealNumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_realNumber);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return gtype_sempred((GtypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean gtype_sempred(GtypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\5"+
		"\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5X\n\5\f\5\16\5[\13\5\5\5]\n\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16"+
		"\5g\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0088"+
		"\n\5\f\5\16\5\u008b\13\5\5\5\u008d\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0094\n"+
		"\5\f\5\16\5\u0097\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\5\b\u00bf\n\b\3\b\5\b"+
		"\u00c2\n\b\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00e0\n\n\f\n\16\n\u00e3\13\n\5\n\u00e5\n\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\6\17\u00f4\n\17\r\17\16\17\u00f5"+
		"\3\17\2\4\b\16\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\4\2\17\17\33"+
		"#\4\2\34\34$$\3\2,.\3\2\61:\2\u0112\2 \3\2\2\2\4\"\3\2\2\2\6\'\3\2\2\2"+
		"\by\3\2\2\2\n\u0098\3\2\2\2\f\u009a\3\2\2\2\16\u00c1\3\2\2\2\20\u00d8"+
		"\3\2\2\2\22\u00da\3\2\2\2\24\u00e8\3\2\2\2\26\u00ea\3\2\2\2\30\u00ed\3"+
		"\2\2\2\32\u00f0\3\2\2\2\34\u00f3\3\2\2\2\36!\5\4\3\2\37!\5\6\4\2 \36\3"+
		"\2\2\2 \37\3\2\2\2!\3\3\2\2\2\"#\7\3\2\2#$\5\26\f\2$%\7\4\2\2%&\5\16\b"+
		"\2&\5\3\2\2\2\'(\7\5\2\2(\61\5\26\f\2)*\7\6\2\2*+\5\30\r\2+,\7\4\2\2,"+
		"-\5\16\b\2-.\7\7\2\2.\60\3\2\2\2/)\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\b\2\2\65\66\5\16\b\2\66"+
		"\67\7\t\2\2\678\5\b\5\289\7\n\2\29\7\3\2\2\2:;\b\5\1\2;z\5\30\r\2<z\5"+
		"\34\17\2=z\7\13\2\2>z\7\f\2\2?@\7\16\2\2@C\5\30\r\2AB\7\4\2\2BD\5\16\b"+
		"\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\17\2\2FI\5\b\5\2GH\7\20\2\2HJ\5\b"+
		"\5\2IG\3\2\2\2IJ\3\2\2\2Jz\3\2\2\2KL\7\6\2\2LM\5\16\b\2MN\7\7\2\2NO\5"+
		"\b\5\16Oz\3\2\2\2PQ\5\f\7\2QR\5\b\5\fRz\3\2\2\2S\\\7\6\2\2TY\5\b\5\2U"+
		"V\7\r\2\2VX\5\b\5\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^z\7\7\2\2_`\7\21\2\2`e\5\b"+
		"\5\2ab\7\r\2\2bd\5\b\5\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2"+
		"\2\2ge\3\2\2\2hi\7\22\2\2iz\3\2\2\2jk\7\23\2\2kl\5\b\5\2lm\7\24\2\2mn"+
		"\5\b\5\2no\7\25\2\2op\5\b\5\bpz\3\2\2\2qr\7\26\2\2rz\5\16\b\2st\7\27\2"+
		"\2tz\5\b\5\6uv\7\30\2\2vz\5\b\5\5wx\7\31\2\2xz\5\b\5\4y:\3\2\2\2y<\3\2"+
		"\2\2y=\3\2\2\2y>\3\2\2\2y?\3\2\2\2yK\3\2\2\2yP\3\2\2\2yS\3\2\2\2y_\3\2"+
		"\2\2yj\3\2\2\2yq\3\2\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2z\u0095\3\2\2\2"+
		"{|\f\r\2\2|}\5\n\6\2}~\5\b\5\16~\u0094\3\2\2\2\177\u0080\f\3\2\2\u0080"+
		"\u0081\7\32\2\2\u0081\u0094\5\b\5\4\u0082\u0083\f\20\2\2\u0083\u008c\7"+
		"\6\2\2\u0084\u0089\5\b\5\2\u0085\u0086\7\r\2\2\u0086\u0088\5\b\5\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0094\7\7\2\2\u008f\u0090\f\n"+
		"\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7C\2\2\u0092\u0094\7\22\2\2\u0093"+
		"{\3\2\2\2\u0093\177\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u008f\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\t\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u0099\t\2\2\2\u0099\13\3\2\2\2\u009a\u009b"+
		"\t\3\2\2\u009b\r\3\2\2\2\u009c\u009d\b\b\1\2\u009d\u00c2\5\20\t\2\u009e"+
		"\u00c2\5\22\n\2\u009f\u00a0\7%\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\5\16"+
		"\b\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5\16\b\2\u00a4\u00a5\7\7\2\2\u00a5"+
		"\u00c2\3\2\2\2\u00a6\u00c2\5\32\16\2\u00a7\u00a8\7&\2\2\u00a8\u00a9\7"+
		"\6\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\24\13\2"+
		"\u00ac\u00ad\7\7\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\5\16\b\5\u00af\u00c2"+
		"\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b3\5\16\b\2"+
		"\u00b3\u00b4\7\7\2\2\u00b4\u00c2\3\2\2\2\u00b5\u00be\7\6\2\2\u00b6\u00bb"+
		"\5\16\b\2\u00b7\u00b8\7\r\2\2\u00b8\u00ba\5\16\b\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\7\7\2\2\u00c1\u009c\3\2\2\2\u00c1\u009e\3\2"+
		"\2\2\u00c1\u009f\3\2\2\2\u00c1\u00a6\3\2\2\2\u00c1\u00a7\3\2\2\2\u00c1"+
		"\u00b0\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\f\7"+
		"\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c7\5\16\b\b\u00c6\u00c3\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\17\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce"+
		"\7C\2\2\u00ce\u00d9\7\7\2\2\u00cf\u00d0\7)\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\7C\2\2\u00d2\u00d9\7\7\2\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\7\6\2"+
		"\2\u00d5\u00d6\7C\2\2\u00d6\u00d9\7\7\2\2\u00d7\u00d9\7+\2\2\u00d8\u00cb"+
		"\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\21\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00e4\7\6\2\2\u00dc\u00e1\7C\2\2"+
		"\u00dd\u00de\7\r\2\2\u00de\u00e0\7C\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\7\7\2\2\u00e7\23\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9\25"+
		"\3\2\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\7<\2\2\u00ec\27\3\2\2\2\u00ed"+
		"\u00ee\7\60\2\2\u00ee\u00ef\7<\2\2\u00ef\31\3\2\2\2\u00f0\u00f1\7>\2\2"+
		"\u00f1\33\3\2\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\35\3\2\2\2\26 "+
		"\61CIY\\ey\u0089\u008c\u0093\u0095\u00bb\u00be\u00c1\u00c8\u00d8\u00e1"+
		"\u00e4\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}