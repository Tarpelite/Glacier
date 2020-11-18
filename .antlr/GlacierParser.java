// Generated from /mnt/d/workspace/2020_fall/PL/Glacier/Glacier.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GlacierParser extends Parser {
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, WS=58, Identifier=59, 
		IdentifierNondigit=60, Nondigit=61, Digit=62, UniversalCharacterName=63, 
		HexQuad=64, HexadecimalDigit=65, Number=66;
	public static final int
		RULE_item = 0, RULE_operator = 1, RULE_definition = 2, RULE_encodingRNN = 3, 
		RULE_expr = 4, RULE_binOp = 5, RULE_unaryOp = 6, RULE_typeG = 7, RULE_baseType = 8, 
		RULE_shape = 9, RULE_kind = 10, RULE_globalId = 11, RULE_localId = 12, 
		RULE_typeId = 13, RULE_realNumber = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"item", "operator", "definition", "encodingRNN", "expr", "binOp", "unaryOp", 
			"typeG", "baseType", "shape", "kind", "globalId", "localId", "typeId", 
			"realNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'operator'", "':'", "'def'", "'('", "')'", "'->'", "'{'", "'}'", 
			"'unfold'", "'True'", "'False'", "','", "'let'", "'='", "'in'", "'['", 
			"']'", "'if'", "'then'", "'else'", "'Zero'", "'Grad'", "'Ref'", "'!'", 
			"':='", "'+'", "'-'", "'*'", "'/'", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'sq'", "'Tensor'", "'forall'", "'refType'", "'IntType'", "'UIntType'", 
			"'FloatType'", "'BoolType'", "'Shape'", "'BaseType'", "'Type'", "'@'", 
			"'%'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", 
			"'9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "Identifier", 
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
	public String getGrammarFileName() { return "Glacier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GlacierParser(TokenStream input) {
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				operator();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
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
		public TypeGContext typeG() {
			return getRuleContext(TypeGContext.class,0);
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
			setState(34);
			match(T__0);
			setState(35);
			globalId();
			setState(36);
			match(T__1);
			setState(37);
			typeG(0);
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
		public List<TypeGContext> typeG() {
			return getRuleContexts(TypeGContext.class);
		}
		public TypeGContext typeG(int i) {
			return getRuleContext(TypeGContext.class,i);
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
			setState(39);
			match(T__2);
			setState(40);
			globalId();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(41);
				match(T__3);
				setState(42);
				localId();
				setState(43);
				match(T__1);
				setState(44);
				typeG(0);
				setState(45);
				match(T__4);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__5);
			setState(53);
			typeG(0);
			setState(54);
			match(T__6);
			setState(55);
			expr(0);
			setState(56);
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

	public static class EncodingRNNContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(GlacierParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GlacierParser.Identifier, i);
		}
		public EncodingRNNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodingRNN; }
	}

	public final EncodingRNNContext encodingRNN() throws RecognitionException {
		EncodingRNNContext _localctx = new EncodingRNNContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_encodingRNN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__8);
			setState(59);
			match(Identifier);
			setState(60);
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
		public TypeGContext typeG() {
			return getRuleContext(TypeGContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public EncodingRNNContext encodingRNN() {
			return getRuleContext(EncodingRNNContext.class,0);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public TerminalNode Number() { return getToken(GlacierParser.Number, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(63);
				localId();
				}
				break;
			case 2:
				{
				setState(64);
				realNumber();
				}
				break;
			case 3:
				{
				setState(65);
				match(T__9);
				}
				break;
			case 4:
				{
				setState(66);
				match(T__10);
				}
				break;
			case 5:
				{
				setState(67);
				match(T__12);
				setState(68);
				localId();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(69);
					match(T__1);
					setState(70);
					typeG(0);
					}
				}

				setState(73);
				match(T__13);
				setState(74);
				expr(0);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(75);
					match(T__14);
					setState(76);
					expr(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(79);
				match(T__3);
				setState(80);
				typeG(0);
				setState(81);
				match(T__4);
				setState(82);
				expr(13);
				}
				break;
			case 7:
				{
				setState(84);
				unaryOp();
				setState(85);
				expr(11);
				}
				break;
			case 8:
				{
				setState(87);
				match(T__3);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) {
					{
					setState(88);
					expr(0);
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(89);
						match(T__11);
						setState(90);
						expr(0);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(98);
				match(T__4);
				}
				break;
			case 9:
				{
				setState(99);
				match(T__15);
				setState(100);
				expr(0);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(101);
					match(T__11);
					setState(102);
					expr(0);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__16);
				}
				break;
			case 10:
				{
				setState(110);
				match(T__17);
				setState(111);
				expr(0);
				setState(112);
				match(T__18);
				setState(113);
				expr(0);
				setState(114);
				match(T__19);
				setState(115);
				expr(7);
				}
				break;
			case 11:
				{
				setState(117);
				match(T__20);
				setState(118);
				typeG(0);
				}
				break;
			case 12:
				{
				setState(119);
				match(T__21);
				setState(120);
				expr(5);
				}
				break;
			case 13:
				{
				setState(121);
				match(T__22);
				setState(122);
				expr(4);
				}
				break;
			case 14:
				{
				setState(123);
				match(T__23);
				setState(124);
				expr(3);
				}
				break;
			case 15:
				{
				setState(125);
				encodingRNN();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(129);
						binOp();
						setState(130);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(T__24);
						setState(134);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(136);
						match(T__3);
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) {
							{
							setState(137);
							expr(0);
							setState(142);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__11) {
								{
								{
								setState(138);
								match(T__11);
								setState(139);
								expr(0);
								}
								}
								setState(144);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(147);
						match(T__4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(149);
						match(T__15);
						setState(150);
						match(Number);
						setState(151);
						match(T__16);
						}
						break;
					}
					} 
				}
				setState(156);
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
		enterRule(_localctx, 10, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__34) ) {
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

	public static class TypeGContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public List<TypeGContext> typeG() {
			return getRuleContexts(TypeGContext.class);
		}
		public TypeGContext typeG(int i) {
			return getRuleContext(TypeGContext.class,i);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TypeGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeG; }
	}

	public final TypeGContext typeG() throws RecognitionException {
		return typeG(0);
	}

	private TypeGContext typeG(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeGContext _localctx = new TypeGContext(_ctx, _parentState);
		TypeGContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_typeG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				{
				setState(162);
				baseType();
				}
				break;
			case T__42:
				{
				setState(163);
				shape();
				}
				break;
			case T__35:
				{
				setState(164);
				match(T__35);
				setState(165);
				match(T__3);
				setState(166);
				typeG(0);
				setState(167);
				match(T__11);
				setState(168);
				typeG(0);
				setState(169);
				match(T__4);
				}
				break;
			case Nondigit:
				{
				setState(171);
				typeId();
				}
				break;
			case T__36:
				{
				setState(172);
				match(T__36);
				setState(173);
				match(T__3);
				setState(174);
				typeId();
				setState(175);
				match(T__1);
				setState(176);
				kind();
				setState(177);
				match(T__4);
				setState(178);
				match(T__11);
				setState(179);
				typeG(3);
				}
				break;
			case T__37:
				{
				setState(181);
				match(T__37);
				setState(182);
				match(T__3);
				setState(183);
				typeG(0);
				setState(184);
				match(T__4);
				}
				break;
			case T__3:
				{
				setState(186);
				match(T__3);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << Nondigit))) != 0)) {
					{
					setState(187);
					typeG(0);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(188);
						match(T__11);
						setState(189);
						typeG(0);
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(197);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeG);
					setState(200);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(201);
					match(T__5);
					setState(202);
					typeG(6);
					}
					} 
				}
				setState(207);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(GlacierParser.Number, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_baseType);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__38);
				setState(209);
				match(T__3);
				setState(210);
				match(Number);
				setState(211);
				match(T__4);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__39);
				setState(213);
				match(T__3);
				setState(214);
				match(Number);
				setState(215);
				match(T__4);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__40);
				setState(217);
				match(T__3);
				setState(218);
				match(Number);
				setState(219);
				match(T__4);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T__41);
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
		public List<TerminalNode> Number() { return getTokens(GlacierParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GlacierParser.Number, i);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__42);
			setState(224);
			match(T__3);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Number) {
				{
				setState(225);
				match(Number);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(226);
					match(T__11);
					setState(227);
					match(Number);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(235);
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
		enterRule(_localctx, 20, RULE_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(GlacierParser.Identifier, 0); }
		public GlobalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalId; }
	}

	public final GlobalIdContext globalId() throws RecognitionException {
		GlobalIdContext _localctx = new GlobalIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_globalId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__45);
			setState(240);
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
		public TerminalNode Identifier() { return getToken(GlacierParser.Identifier, 0); }
		public LocalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localId; }
	}

	public final LocalIdContext localId() throws RecognitionException {
		LocalIdContext _localctx = new LocalIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_localId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__46);
			setState(243);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode Nondigit() { return getToken(GlacierParser.Nondigit, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 28, RULE_realNumber);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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
				setState(250); 
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return typeG_sempred((TypeGContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean typeG_sempred(TypeGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\5\6c\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\5\6\u0094"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c1\n\t\f\t\16"+
		"\t\u00c4\13\t\5\t\u00c6\n\t\3\t\5\t\u00c9\n\t\3\t\3\t\3\t\7\t\u00ce\n"+
		"\t\f\t\16\t\u00d1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00e0\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u00e7\n\13\f\13\16\13"+
		"\u00ea\13\13\5\13\u00ec\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\6\20\u00fb\n\20\r\20\16\20\u00fc\3\20\2\4\n\20\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\4\2\20\20\34$\4\2\35\35%%\3"+
		"\2-/\3\2\62;\2\u0119\2\"\3\2\2\2\4$\3\2\2\2\6)\3\2\2\2\b<\3\2\2\2\n\u0080"+
		"\3\2\2\2\f\u009f\3\2\2\2\16\u00a1\3\2\2\2\20\u00c8\3\2\2\2\22\u00df\3"+
		"\2\2\2\24\u00e1\3\2\2\2\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u00f4\3\2"+
		"\2\2\34\u00f7\3\2\2\2\36\u00fa\3\2\2\2 #\5\4\3\2!#\5\6\4\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\3\3\2\2\2$%\7\3\2\2%&\5\30\r\2&\'\7\4\2\2\'(\5\20\t\2(\5"+
		"\3\2\2\2)*\7\5\2\2*\63\5\30\r\2+,\7\6\2\2,-\5\32\16\2-.\7\4\2\2./\5\20"+
		"\t\2/\60\7\7\2\2\60\62\3\2\2\2\61+\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\b\2\2\678\5\20\t\2"+
		"89\7\t\2\29:\5\n\6\2:;\7\n\2\2;\7\3\2\2\2<=\7\13\2\2=>\7=\2\2>?\7=\2\2"+
		"?\t\3\2\2\2@A\b\6\1\2A\u0081\5\32\16\2B\u0081\5\36\20\2C\u0081\7\f\2\2"+
		"D\u0081\7\r\2\2EF\7\17\2\2FI\5\32\16\2GH\7\4\2\2HJ\5\20\t\2IG\3\2\2\2"+
		"IJ\3\2\2\2JK\3\2\2\2KL\7\20\2\2LO\5\n\6\2MN\7\21\2\2NP\5\n\6\2OM\3\2\2"+
		"\2OP\3\2\2\2P\u0081\3\2\2\2QR\7\6\2\2RS\5\20\t\2ST\7\7\2\2TU\5\n\6\17"+
		"U\u0081\3\2\2\2VW\5\16\b\2WX\5\n\6\rX\u0081\3\2\2\2Yb\7\6\2\2Z_\5\n\6"+
		"\2[\\\7\16\2\2\\^\5\n\6\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2bZ\3\2\2\2bc\3\2\2\2cd\3\2\2\2d\u0081\7\7\2\2ef\7\22\2"+
		"\2fk\5\n\6\2gh\7\16\2\2hj\5\n\6\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2ln\3\2\2\2mk\3\2\2\2no\7\23\2\2o\u0081\3\2\2\2pq\7\24\2\2qr\5\n\6"+
		"\2rs\7\25\2\2st\5\n\6\2tu\7\26\2\2uv\5\n\6\tv\u0081\3\2\2\2wx\7\27\2\2"+
		"x\u0081\5\20\t\2yz\7\30\2\2z\u0081\5\n\6\7{|\7\31\2\2|\u0081\5\n\6\6}"+
		"~\7\32\2\2~\u0081\5\n\6\5\177\u0081\5\b\5\2\u0080@\3\2\2\2\u0080B\3\2"+
		"\2\2\u0080C\3\2\2\2\u0080D\3\2\2\2\u0080E\3\2\2\2\u0080Q\3\2\2\2\u0080"+
		"V\3\2\2\2\u0080Y\3\2\2\2\u0080e\3\2\2\2\u0080p\3\2\2\2\u0080w\3\2\2\2"+
		"\u0080y\3\2\2\2\u0080{\3\2\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\u009c\3\2\2\2\u0082\u0083\f\16\2\2\u0083\u0084\5\f\7\2\u0084\u0085\5"+
		"\n\6\17\u0085\u009b\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\33\2\2\u0088"+
		"\u009b\5\n\6\5\u0089\u008a\f\21\2\2\u008a\u0093\7\6\2\2\u008b\u0090\5"+
		"\n\6\2\u008c\u008d\7\16\2\2\u008d\u008f\5\n\6\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u009b\7\7\2\2\u0096\u0097\f\13\2\2\u0097\u0098\7"+
		"\22\2\2\u0098\u0099\7D\2\2\u0099\u009b\7\23\2\2\u009a\u0082\3\2\2\2\u009a"+
		"\u0086\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\13\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2"+
		"\17\3\2\2\2\u00a3\u00a4\b\t\1\2\u00a4\u00c9\5\22\n\2\u00a5\u00c9\5\24"+
		"\13\2\u00a6\u00a7\7&\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5\20\t\2\u00a9"+
		"\u00aa\7\16\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\7\2\2\u00ac\u00c9\3"+
		"\2\2\2\u00ad\u00c9\5\34\17\2\u00ae\u00af\7\'\2\2\u00af\u00b0\7\6\2\2\u00b0"+
		"\u00b1\5\34\17\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4"+
		"\7\7\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5\20\t\5\u00b6\u00c9\3\2\2\2"+
		"\u00b7\u00b8\7(\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bb"+
		"\7\7\2\2\u00bb\u00c9\3\2\2\2\u00bc\u00c5\7\6\2\2\u00bd\u00c2\5\20\t\2"+
		"\u00be\u00bf\7\16\2\2\u00bf\u00c1\5\20\t\2\u00c0\u00be\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\7\7\2\2\u00c8\u00a3\3\2\2\2\u00c8\u00a5\3\2\2\2\u00c8"+
		"\u00a6\3\2\2\2\u00c8\u00ad\3\2\2\2\u00c8\u00ae\3\2\2\2\u00c8\u00b7\3\2"+
		"\2\2\u00c8\u00bc\3\2\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\f\7\2\2\u00cb"+
		"\u00cc\7\b\2\2\u00cc\u00ce\5\20\t\b\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\21\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7D\2"+
		"\2\u00d5\u00e0\7\7\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9"+
		"\7D\2\2\u00d9\u00e0\7\7\2\2\u00da\u00db\7+\2\2\u00db\u00dc\7\6\2\2\u00dc"+
		"\u00dd\7D\2\2\u00dd\u00e0\7\7\2\2\u00de\u00e0\7,\2\2\u00df\u00d2\3\2\2"+
		"\2\u00df\u00d6\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\23"+
		"\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\u00eb\7\6\2\2\u00e3\u00e8\7D\2\2\u00e4"+
		"\u00e5\7\16\2\2\u00e5\u00e7\7D\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7\7\2\2\u00ee\25\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f0\27"+
		"\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7=\2\2\u00f3\31\3\2\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5\u00f6\7=\2\2\u00f6\33\3\2\2\2\u00f7\u00f8\7?\2\2"+
		"\u00f8\35\3\2\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\26\""+
		"\63IO_bk\u0080\u0090\u0093\u009a\u009c\u00c2\u00c5\u00c8\u00cf\u00df\u00e8"+
		"\u00eb\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}