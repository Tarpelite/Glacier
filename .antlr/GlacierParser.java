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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, WS=45, COMMENT=46, 
		VAR=47, INT=48, SPACESL=49, FLOAT=50;
	public static final int
		RULE_program = 0, RULE_func = 1, RULE_expr = 2, RULE_binOp = 3, RULE_unaryOp = 4, 
		RULE_name = 5, RULE_params = 6, RULE_typeG = 7, RULE_basetypeG = 8, RULE_shape = 9, 
		RULE_args = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func", "expr", "binOp", "unaryOp", "name", "params", "typeG", 
			"basetypeG", "shape", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'::'", "'{'", "'}'", "'True'", "'False'", "'('", "','", 
			"')'", "'let'", "':'", "'='", "'in'", "'['", "']'", "'if'", "'then'", 
			"'else'", "'Zero'", "'Grad'", "'Ref'", "'!'", "':='", "'+'", "'-'", "'*'", 
			"'/'", "'!='", "'<'", "'<='", "'>='", "'>'", "'fold'", "'unfold'", "'map'", 
			"'tail'", "'filter'", "'->'", "'Tensor'", "'Int'", "'UInt'", "'Float'", 
			"'Bool'", "'Shape'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"VAR", "INT", "SPACESL", "FLOAT"
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

	public static class ProgramContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(22);
					func();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case T__9:
				case T__13:
				case T__15:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__24:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case VAR:
				case INT:
				case FLOAT:
					{
					setState(23);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
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

	public static class FuncContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			name();
			setState(31);
			match(T__1);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(32);
				params();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__2);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(39);
				expr(0);
				}
			}

			setState(42);
			match(T__3);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INT() { return getToken(GlacierParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GlacierParser.FLOAT, 0); }
		public TypeGContext typeG() {
			return getRuleContext(TypeGContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(45);
				name();
				}
				break;
			case 2:
				{
				setState(46);
				match(INT);
				}
				break;
			case 3:
				{
				setState(47);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(48);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(49);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(50);
				match(T__9);
				setState(51);
				name();
				setState(52);
				match(T__10);
				setState(53);
				typeG(0);
				setState(54);
				match(T__11);
				setState(55);
				expr(0);
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(56);
					match(T__12);
					setState(57);
					expr(0);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(60);
				match(T__6);
				setState(61);
				typeG(0);
				setState(62);
				match(T__8);
				setState(63);
				expr(12);
				}
				break;
			case 8:
				{
				setState(65);
				unaryOp();
				setState(66);
				expr(10);
				}
				break;
			case 9:
				{
				setState(68);
				match(T__6);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					setState(69);
					expr(0);
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(70);
						match(T__7);
						setState(71);
						expr(0);
						}
						}
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(79);
				match(T__8);
				}
				break;
			case 10:
				{
				setState(80);
				match(T__13);
				setState(81);
				expr(0);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(82);
					match(T__7);
					setState(83);
					expr(0);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__14);
				}
				break;
			case 11:
				{
				setState(91);
				match(T__15);
				setState(92);
				expr(0);
				setState(93);
				match(T__16);
				setState(94);
				expr(0);
				setState(95);
				match(T__17);
				setState(96);
				expr(6);
				}
				break;
			case 12:
				{
				setState(98);
				match(T__18);
				setState(99);
				expr(5);
				}
				break;
			case 13:
				{
				setState(100);
				match(T__19);
				setState(101);
				expr(4);
				}
				break;
			case 14:
				{
				setState(102);
				match(T__20);
				setState(103);
				expr(3);
				}
				break;
			case 15:
				{
				setState(104);
				match(T__21);
				setState(105);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						binOp();
						setState(110);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(113);
						match(T__22);
						setState(114);
						expr(2);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(116);
						match(T__6);
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) {
							{
							setState(117);
							expr(0);
							setState(122);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__7) {
								{
								{
								setState(118);
								match(T__7);
								setState(119);
								expr(0);
								}
								}
								setState(124);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(127);
						match(T__8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(129);
						match(T__13);
						setState(130);
						match(INT);
						setState(131);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 6, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GlacierParser.VAR, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TypeGContext> typeG() {
			return getRuleContexts(TypeGContext.class);
		}
		public TypeGContext typeG(int i) {
			return getRuleContext(TypeGContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			name();
			setState(144);
			match(T__10);
			setState(145);
			typeG(0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(146);
				match(T__37);
				setState(147);
				name();
				setState(148);
				match(T__10);
				setState(149);
				typeG(0);
				}
				}
				setState(155);
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

	public static class TypeGContext extends ParserRuleContext {
		public BasetypeGContext basetypeG() {
			return getRuleContext(BasetypeGContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(GlacierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GlacierParser.INT, i);
		}
		public List<TypeGContext> typeG() {
			return getRuleContexts(TypeGContext.class);
		}
		public TypeGContext typeG(int i) {
			return getRuleContext(TypeGContext.class,i);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				{
				setState(157);
				basetypeG();
				}
				break;
			case T__43:
				{
				setState(158);
				shape();
				}
				break;
			case T__38:
				{
				setState(159);
				match(T__38);
				setState(160);
				match(T__6);
				setState(161);
				match(INT);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(162);
					match(T__7);
					setState(163);
					match(INT);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__8);
				}
				break;
			case T__6:
				{
				setState(170);
				match(T__6);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
					{
					setState(171);
					typeG(0);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__37) {
						{
						{
						setState(172);
						match(T__37);
						setState(173);
						typeG(0);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(181);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeG);
					setState(184);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(185);
					match(T__37);
					setState(186);
					typeG(3);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class BasetypeGContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GlacierParser.INT, 0); }
		public BasetypeGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypeG; }
	}

	public final BasetypeGContext basetypeG() throws RecognitionException {
		BasetypeGContext _localctx = new BasetypeGContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basetypeG);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__39);
				setState(193);
				match(T__6);
				setState(194);
				match(INT);
				setState(195);
				match(T__8);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__40);
				setState(197);
				match(T__6);
				setState(198);
				match(INT);
				setState(199);
				match(T__8);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__41);
				setState(201);
				match(T__6);
				setState(202);
				match(INT);
				setState(203);
				match(T__8);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(T__42);
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
		public List<TerminalNode> INT() { return getTokens(GlacierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GlacierParser.INT, i);
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
			setState(207);
			match(T__43);
			setState(208);
			match(T__6);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(209);
				match(INT);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(210);
					match(T__7);
					setState(211);
					match(INT);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219);
			match(T__8);
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
		public List<TerminalNode> SPACESL() { return getTokens(GlacierParser.SPACESL); }
		public TerminalNode SPACESL(int i) {
			return getToken(GlacierParser.SPACESL, i);
		}
		public List<TerminalNode> VAR() { return getTokens(GlacierParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(GlacierParser.VAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(GlacierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GlacierParser.INT, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACESL:
					{
					setState(221);
					match(SPACESL);
					setState(222);
					match(VAR);
					}
					break;
				case INT:
					{
					setState(223);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==SPACESL );
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return typeG_sempred((TypeGContext)_localctx, predIndex);
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
	private boolean typeG_sempred(TypeGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00e7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\5\4P\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4{\n\4\f\4\16\4~\13\4\5\4\u0080\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\u0087\n\4\f\4\16\4\u008a\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\5\t\u00b6\n\t\3\t\5\t\u00b9\n\t\3"+
		"\t\3\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00d7\n\13\f\13\16\13\u00da\13\13\5\13\u00dc\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\6\f\u00e3\n\f\r\f\16\f\u00e4\3\f\2\4\6\20\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\4\4\2\16\16\32\"\4\2\33\33#\'\2\u0106\2\34\3\2\2\2\4\37\3\2\2\2"+
		"\6l\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3"+
		"\2\2\2\20\u00b8\3\2\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26\u00e2\3\2"+
		"\2\2\30\33\5\4\3\2\31\33\5\6\4\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37 \7\3\2"+
		"\2 !\5\f\7\2!%\7\4\2\2\"$\5\16\b\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&(\3\2\2\2\'%\3\2\2\2(*\7\5\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,"+
		"\3\2\2\2,-\7\6\2\2-\5\3\2\2\2./\b\4\1\2/m\5\f\7\2\60m\7\62\2\2\61m\7\64"+
		"\2\2\62m\7\7\2\2\63m\7\b\2\2\64\65\7\f\2\2\65\66\5\f\7\2\66\67\7\r\2\2"+
		"\678\5\20\t\289\7\16\2\29<\5\6\4\2:;\7\17\2\2;=\5\6\4\2<:\3\2\2\2<=\3"+
		"\2\2\2=m\3\2\2\2>?\7\t\2\2?@\5\20\t\2@A\7\13\2\2AB\5\6\4\16Bm\3\2\2\2"+
		"CD\5\n\6\2DE\5\6\4\fEm\3\2\2\2FO\7\t\2\2GL\5\6\4\2HI\7\n\2\2IK\5\6\4\2"+
		"JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OG\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2Qm\7\13\2\2RS\7\20\2\2SX\5\6\4\2TU\7\n\2\2UW\5\6\4"+
		"\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\21"+
		"\2\2\\m\3\2\2\2]^\7\22\2\2^_\5\6\4\2_`\7\23\2\2`a\5\6\4\2ab\7\24\2\2b"+
		"c\5\6\4\bcm\3\2\2\2de\7\25\2\2em\5\6\4\7fg\7\26\2\2gm\5\6\4\6hi\7\27\2"+
		"\2im\5\6\4\5jk\7\30\2\2km\5\6\4\4l.\3\2\2\2l\60\3\2\2\2l\61\3\2\2\2l\62"+
		"\3\2\2\2l\63\3\2\2\2l\64\3\2\2\2l>\3\2\2\2lC\3\2\2\2lF\3\2\2\2lR\3\2\2"+
		"\2l]\3\2\2\2ld\3\2\2\2lf\3\2\2\2lh\3\2\2\2lj\3\2\2\2m\u0088\3\2\2\2no"+
		"\f\r\2\2op\5\b\5\2pq\5\6\4\16q\u0087\3\2\2\2rs\f\3\2\2st\7\31\2\2t\u0087"+
		"\5\6\4\4uv\f\20\2\2v\177\7\t\2\2w|\5\6\4\2xy\7\n\2\2y{\5\6\4\2zx\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0087\7\13\2\2\u0082\u0083"+
		"\f\n\2\2\u0083\u0084\7\20\2\2\u0084\u0085\7\62\2\2\u0085\u0087\7\21\2"+
		"\2\u0086n\3\2\2\2\u0086r\3\2\2\2\u0086u\3\2\2\2\u0086\u0082\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\7\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u008c\t\2\2\2\u008c\t\3\2\2\2\u008d\u008e\t"+
		"\3\2\2\u008e\13\3\2\2\2\u008f\u0090\7\61\2\2\u0090\r\3\2\2\2\u0091\u0092"+
		"\5\f\7\2\u0092\u0093\7\r\2\2\u0093\u009b\5\20\t\2\u0094\u0095\7(\2\2\u0095"+
		"\u0096\5\f\7\2\u0096\u0097\7\r\2\2\u0097\u0098\5\20\t\2\u0098\u009a\3"+
		"\2\2\2\u0099\u0094\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\t\1"+
		"\2\u009f\u00b9\5\22\n\2\u00a0\u00b9\5\24\13\2\u00a1\u00a2\7)\2\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a8\7\62\2\2\u00a4\u00a5\7\n\2\2\u00a5\u00a7\7"+
		"\62\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b9\7\13"+
		"\2\2\u00ac\u00b5\7\t\2\2\u00ad\u00b2\5\20\t\2\u00ae\u00af\7(\2\2\u00af"+
		"\u00b1\5\20\t\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\13"+
		"\2\2\u00b8\u009e\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a1\3\2\2\2\u00b8"+
		"\u00ac\3\2\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\f\4\2\2\u00bb\u00bc\7("+
		"\2\2\u00bc\u00be\5\20\t\5\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00bf\3\2\2"+
		"\2\u00c2\u00c3\7*\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00d0"+
		"\7\13\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\7\62\2\2"+
		"\u00c9\u00d0\7\13\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00cd"+
		"\7\62\2\2\u00cd\u00d0\7\13\2\2\u00ce\u00d0\7-\2\2\u00cf\u00c2\3\2\2\2"+
		"\u00cf\u00c6\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\23"+
		"\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\u00db\7\t\2\2\u00d3\u00d8\7\62\2\2\u00d4"+
		"\u00d5\7\n\2\2\u00d5\u00d7\7\62\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\7\13\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\63\2\2\u00e0"+
		"\u00e3\7\61\2\2\u00e1\u00e3\7\62\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\27\3\2\2\2\32\32\34%*<LOXl|\177\u0086\u0088\u009b\u00a8\u00b2\u00b5\u00b8"+
		"\u00bf\u00cf\u00d8\u00db\u00e2\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}