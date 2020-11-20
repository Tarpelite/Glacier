// Generated from /mnt/d/workspace/2020_fall/PL/Glacier/Tscheme.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TschemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, SL=21, WS=22, ID=23, LETTER=24, DIGIT=25, 
		OPS=26, BooleanG=27, SYMBOL=28;
	public static final int
		RULE_program = 0, RULE_form = 1, RULE_defG = 2, RULE_var_defG = 3, RULE_var = 4, 
		RULE_body = 5, RULE_syn_defG = 6, RULE_keyword = 7, RULE_syn_bind = 8, 
		RULE_expr = 9, RULE_cons = 10, RULE_formals = 11, RULE_application = 12, 
		RULE_datum = 13, RULE_number = 14, RULE_character = 15, RULE_string = 16, 
		RULE_listG = 17, RULE_abbr = 18, RULE_vector = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "form", "defG", "var_defG", "var", "body", "syn_defG", "keyword", 
			"syn_bind", "expr", "cons", "formals", "application", "datum", "number", 
			"character", "string", "listG", "abbr", "vector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'begin'", "')'", "'let'", "'letrec'", "'defGine'", "'.'", 
			"'defGine-syntax'", "'quote'", "'''", "'lambda'", "'if'", "'set'", "'!'", 
			"'\"'", "' '", "'`'", "','", "',@'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "SL", "WS", "ID", 
			"LETTER", "DIGIT", "OPS", "BooleanG", "SYMBOL"
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
	public String getGrammarFileName() { return "Tscheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TschemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__14) | (1L << ID) | (1L << LETTER) | (1L << DIGIT) | (1L << BooleanG))) != 0)) {
				{
				{
				setState(40);
				form();
				}
				}
				setState(45);
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

	public static class FormContext extends ParserRuleContext {
		public DefGContext defG() {
			return getRuleContext(DefGContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				defG();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expr();
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

	public static class DefGContext extends ParserRuleContext {
		public Var_defGContext var_defG() {
			return getRuleContext(Var_defGContext.class,0);
		}
		public Syn_defGContext syn_defG() {
			return getRuleContext(Syn_defGContext.class,0);
		}
		public TerminalNode SL() { return getToken(TschemeParser.SL, 0); }
		public List<DefGContext> defG() {
			return getRuleContexts(DefGContext.class);
		}
		public DefGContext defG(int i) {
			return getRuleContext(DefGContext.class,i);
		}
		public List<Syn_bindContext> syn_bind() {
			return getRuleContexts(Syn_bindContext.class);
		}
		public Syn_bindContext syn_bind(int i) {
			return getRuleContext(Syn_bindContext.class,i);
		}
		public DefGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defG; }
	}

	public final DefGContext defG() throws RecognitionException {
		DefGContext _localctx = new DefGContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defG);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				var_defG();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				syn_defG();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__0);
				self.ignore=True
				setState(54);
				match(T__1);
				self.ignore=False
				self.ignore=False
				setState(57);
				match(SL);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(58);
					defG();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(65);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(T__0);
				self.ignore=True
				setState(68);
				match(T__3);
				self.ignore=False
				setState(70);
				match(SL);
				setState(71);
				match(T__0);
				self.ignore=True
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(73);
					syn_bind();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(80);
				match(T__2);
				self.ignore=True
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(82);
					defG();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(T__0);
				self.ignore=True
				setState(91);
				match(T__4);
				self.ignore=True
				setState(93);
				match(T__0);
				self.ignore=True
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(95);
					syn_bind();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(102);
				match(T__2);
				self.ignore=True
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(104);
					defG();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__2);
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

	public static class Var_defGContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Var_defGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_defG; }
	}

	public final Var_defGContext var_defG() throws RecognitionException {
		Var_defGContext _localctx = new Var_defGContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_defG);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__0);
				self.ignore=True
				setState(115);
				match(T__5);
				setState(116);
				var();
				self.ignore=False
				setState(118);
				match(SL);
				setState(119);
				expr();
				self.ignore=True
				setState(121);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__0);
				self.ignore=True
				setState(125);
				match(T__5);
				self.ignore=True
				setState(127);
				match(T__0);
				setState(128);
				var();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(130);
					match(SL);
					setState(131);
					var();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(138);
				match(T__2);
				self.ignore=True
				setState(140);
				body();
				self.ignore=True
				setState(142);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__0);
				self.ignore=True
				setState(146);
				match(T__5);
				self.ignore=True
				setState(148);
				match(T__0);
				setState(149);
				var();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(151);
					match(SL);
					setState(152);
					var();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__6);
				self.ignore=True
				setState(160);
				var();
				self.ignore=True
				setState(162);
				match(T__2);
				self.ignore=True
				setState(164);
				body();
				self.ignore=True
				setState(166);
				match(T__2);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TschemeParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
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

	public static class BodyContext extends ParserRuleContext {
		public List<DefGContext> defG() {
			return getRuleContexts(DefGContext.class);
		}
		public DefGContext defG(int i) {
			return getRuleContext(DefGContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				self.ignore=True
				setState(173);
				defG();
				self.ignore=True
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				self.ignore=False
				setState(182);
				match(SL);
				setState(183);
				expr();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SL );
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

	public static class Syn_defGContext extends ParserRuleContext {
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Syn_defGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syn_defG; }
	}

	public final Syn_defGContext syn_defG() throws RecognitionException {
		Syn_defGContext _localctx = new Syn_defGContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_syn_defG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__0);
			self.ignore=True
			setState(190);
			match(T__7);
			self.ignore=False
			setState(192);
			match(SL);
			setState(193);
			keyword();
			self.ignore=False
			setState(195);
			match(SL);
			setState(196);
			expr();
			self.ignore=True
			setState(198);
			match(T__2);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TschemeParser.ID, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
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

	public static class Syn_bindContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode SL() { return getToken(TschemeParser.SL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Syn_bindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syn_bind; }
	}

	public final Syn_bindContext syn_bind() throws RecognitionException {
		Syn_bindContext _localctx = new Syn_bindContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_syn_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__0);
			self.ignore=True
			setState(204);
			keyword();
			self.ignore=False
			setState(206);
			match(SL);
			setState(207);
			expr();
			self.ignore=True
			setState(209);
			match(T__2);
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
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public List<Syn_bindContext> syn_bind() {
			return getRuleContexts(Syn_bindContext.class);
		}
		public Syn_bindContext syn_bind(int i) {
			return getRuleContext(Syn_bindContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				cons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__0);
				self.ignore=True
				setState(215);
				match(T__8);
				self.ignore=False
				setState(217);
				match(SL);
				setState(218);
				datum();
				self.ignore=True
				setState(220);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__9);
				self.ignore=True
				setState(224);
				datum();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(T__0);
				self.ignore=True
				setState(227);
				match(T__10);
				self.ignore=False
				setState(229);
				match(SL);
				setState(230);
				formals();
				self.ignore=False
				setState(232);
				match(SL);
				setState(233);
				body();
				self.ignore=True
				setState(235);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(T__0);
				self.ignore=True
				setState(239);
				match(T__11);
				self.ignore=False
				setState(241);
				match(SL);
				setState(242);
				expr();
				self.ignore=False
				setState(244);
				match(SL);
				setState(245);
				expr();
				self.ignore=False
				setState(247);
				match(SL);
				setState(248);
				expr();
				self.ignore=True
				setState(250);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(T__0);
				self.ignore=True
				setState(254);
				match(T__11);
				self.ignore=False
				setState(256);
				match(SL);
				setState(257);
				expr();
				self.ignore=False
				setState(259);
				match(SL);
				setState(260);
				expr();
				self.ignore=True
				setState(262);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				match(T__0);
				self.ignore=True
				setState(266);
				match(T__12);
				self.ignore=True
				setState(268);
				match(T__13);
				setState(269);
				var();
				self.ignore=False
				setState(271);
				match(SL);
				setState(272);
				expr();
				self.ignore=True
				setState(274);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				application();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				match(T__0);
				self.ignore=True
				setState(279);
				match(T__3);
				self.ignore=True
				setState(281);
				match(T__0);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(282);
					syn_bind();
					}
				}

				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(286);
					match(SL);
					setState(287);
					syn_bind();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(294);
				match(T__2);
				self.ignore=True
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(296);
					expr();
					}
					}
					setState(299); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__14) | (1L << ID) | (1L << LETTER) | (1L << DIGIT) | (1L << BooleanG))) != 0) );
				self.ignore=True
				setState(302);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(304);
				match(T__0);
				self.ignore=True
				setState(306);
				match(T__4);
				self.ignore=True
				setState(308);
				match(T__0);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(309);
					syn_bind();
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(313);
					match(SL);
					setState(314);
					syn_bind();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(321);
				match(T__2);
				self.ignore=True
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					expr();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__14) | (1L << ID) | (1L << LETTER) | (1L << DIGIT) | (1L << BooleanG))) != 0) );
				self.ignore=True
				setState(329);
				match(T__2);
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

	public static class ConsContext extends ParserRuleContext {
		public TerminalNode BooleanG() { return getToken(TschemeParser.BooleanG, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cons);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanG:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(BooleanG);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				number();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				character();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				string();
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

	public static class FormalsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formals);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(T__0);
				self.ignore=True
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(342);
					var();
					}
				}

				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(346);
					match(SL);
					setState(347);
					var();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(354);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(T__0);
				self.ignore=True
				setState(357);
				var();
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					self.ignore=False
					setState(359);
					match(SL);
					setState(360);
					var();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SL );
				self.ignore=True
				setState(366);
				match(T__6);
				self.ignore=True
				setState(368);
				var();
				self.ignore=True
				setState(370);
				match(T__2);
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

	public static class ApplicationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__0);
			self.ignore=True
			setState(376);
			expr();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SL) {
				{
				{
				self.ignore=False
				setState(378);
				match(SL);
				setState(379);
				expr();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			self.ignore=True
			setState(386);
			match(T__2);
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

	public static class DatumContext extends ParserRuleContext {
		public TerminalNode BooleanG() { return getToken(TschemeParser.BooleanG, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SYMBOL() { return getToken(TschemeParser.SYMBOL, 0); }
		public ListGContext listG() {
			return getRuleContext(ListGContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public DatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datum; }
	}

	public final DatumContext datum() throws RecognitionException {
		DatumContext _localctx = new DatumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datum);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanG:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(BooleanG);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				number();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				character();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				string();
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(SYMBOL);
				}
				break;
			case T__0:
			case T__9:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				listG();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				vector();
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TschemeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TschemeParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(397);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(TschemeParser.LETTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(LETTER);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(TschemeParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(TschemeParser.LETTER, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__14);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==LETTER) {
				{
				{
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==LETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(T__14);
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

	public static class ListGContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public AbbrContext abbr() {
			return getRuleContext(AbbrContext.class,0);
		}
		public ListGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listG; }
	}

	public final ListGContext listG() throws RecognitionException {
		ListGContext _localctx = new ListGContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listG);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__0);
				self.ignore=True
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << LETTER) | (1L << DIGIT) | (1L << BooleanG) | (1L << SYMBOL))) != 0)) {
					{
					setState(415);
					datum();
					}
				}

				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(419);
					match(SL);
					setState(420);
					datum();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(427);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(T__0);
				setState(429);
				datum();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					self.ignore=False
					setState(431);
					match(SL);
					setState(432);
					datum();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				self.ignore=True
				setState(439);
				match(T__6);
				self.ignore=True
				setState(441);
				datum();
				setState(442);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				abbr();
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

	public static class AbbrContext extends ParserRuleContext {
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public AbbrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbr; }
	}

	public final AbbrContext abbr() throws RecognitionException {
		AbbrContext _localctx = new AbbrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_abbr);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(T__9);
				self.ignore=True
				setState(449);
				datum();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__16);
				self.ignore=True
				setState(452);
				datum();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(T__17);
				self.ignore=True
				setState(455);
				datum();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(T__18);
				setState(457);
				datum();
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

	public static class VectorContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public List<TerminalNode> SL() { return getTokens(TschemeParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(TschemeParser.SL, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__19);
			self.ignore=True
			setState(462);
			match(T__0);
			self.ignore=True
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << LETTER) | (1L << DIGIT) | (1L << BooleanG) | (1L << SYMBOL))) != 0)) {
				{
				setState(464);
				datum();
				}
			}

			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SL) {
				{
				{
				self.ignore=False
				setState(468);
				match(SL);
				setState(469);
				datum();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			self.ignore=True
			setState(476);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u01e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\5\3"+
		"\63\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4"+
		"\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4c"+
		"\n\4\f\4\16\4f\13\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\5\4r\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009c\n\5\f\5\16\5\u009f\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7\3\7\3\7\3\7\6\7\u00bb\n\7\r"+
		"\7\16\7\u00bc\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011e\n\13\3\13\3\13"+
		"\3\13\7\13\u0123\n\13\f\13\16\13\u0126\13\13\3\13\3\13\3\13\3\13\6\13"+
		"\u012c\n\13\r\13\16\13\u012d\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0139\n\13\3\13\3\13\3\13\7\13\u013e\n\13\f\13\16\13\u0141\13"+
		"\13\3\13\3\13\3\13\3\13\6\13\u0147\n\13\r\13\16\13\u0148\3\13\3\13\3\13"+
		"\5\13\u014e\n\13\3\f\3\f\3\f\3\f\5\f\u0154\n\f\3\r\3\r\3\r\3\r\5\r\u015a"+
		"\n\r\3\r\3\r\3\r\7\r\u015f\n\r\f\r\16\r\u0162\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\6\r\u016c\n\r\r\r\16\r\u016d\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0177\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u017f\n\16\f\16\16\16"+
		"\u0182\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u018e"+
		"\n\17\3\20\6\20\u0191\n\20\r\20\16\20\u0192\3\21\3\21\3\22\3\22\7\22\u0199"+
		"\n\22\f\22\16\22\u019c\13\22\3\22\3\22\3\23\3\23\3\23\5\23\u01a3\n\23"+
		"\3\23\3\23\3\23\7\23\u01a8\n\23\f\23\16\23\u01ab\13\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u01b4\n\23\f\23\16\23\u01b7\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u01c0\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01cd\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u01d4\n\25\3\25\3\25\3\25\7\25\u01d9\n\25\f\25\16\25\u01dc\13\25\3\25"+
		"\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\3\4\2\22\22\32\32\2\u0208\2-\3\2\2\2\4\62\3\2\2\2\6q\3\2\2\2\b\u00aa"+
		"\3\2\2\2\n\u00ac\3\2\2\2\f\u00b4\3\2\2\2\16\u00be\3\2\2\2\20\u00ca\3\2"+
		"\2\2\22\u00cc\3\2\2\2\24\u014d\3\2\2\2\26\u0153\3\2\2\2\30\u0176\3\2\2"+
		"\2\32\u0178\3\2\2\2\34\u018d\3\2\2\2\36\u0190\3\2\2\2 \u0194\3\2\2\2\""+
		"\u0196\3\2\2\2$\u01bf\3\2\2\2&\u01cc\3\2\2\2(\u01ce\3\2\2\2*,\5\4\3\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\63\5"+
		"\6\4\2\61\63\5\24\13\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64r\5"+
		"\b\5\2\65r\5\16\b\2\66\67\7\3\2\2\678\b\4\1\289\7\4\2\29:\b\4\1\2:;\b"+
		"\4\1\2;?\7\27\2\2<>\5\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B"+
		"\3\2\2\2A?\3\2\2\2BC\b\4\1\2Cr\7\5\2\2DE\7\3\2\2EF\b\4\1\2FG\7\6\2\2G"+
		"H\b\4\1\2HI\7\27\2\2IJ\7\3\2\2JN\b\4\1\2KM\5\22\n\2LK\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\b\4\1\2RS\7\5\2\2SW\b\4\1"+
		"\2TV\5\6\4\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2"+
		"\2Zr\7\5\2\2[\\\7\3\2\2\\]\b\4\1\2]^\7\7\2\2^_\b\4\1\2_`\7\3\2\2`d\b\4"+
		"\1\2ac\5\22\n\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3"+
		"\2\2\2gh\b\4\1\2hi\7\5\2\2im\b\4\1\2jl\5\6\4\2kj\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pr\7\5\2\2q\64\3\2\2\2q\65\3\2\2\2"+
		"q\66\3\2\2\2qD\3\2\2\2q[\3\2\2\2r\7\3\2\2\2st\7\3\2\2tu\b\5\1\2uv\7\b"+
		"\2\2vw\5\n\6\2wx\b\5\1\2xy\7\27\2\2yz\5\24\13\2z{\b\5\1\2{|\7\5\2\2|\u00ab"+
		"\3\2\2\2}~\7\3\2\2~\177\b\5\1\2\177\u0080\7\b\2\2\u0080\u0081\b\5\1\2"+
		"\u0081\u0082\7\3\2\2\u0082\u0088\5\n\6\2\u0083\u0084\b\5\1\2\u0084\u0085"+
		"\7\27\2\2\u0085\u0087\5\n\6\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\b\5\1\2\u008c\u008d\7\5\2\2\u008d\u008e\b\5\1\2\u008e"+
		"\u008f\5\f\7\2\u008f\u0090\b\5\1\2\u0090\u0091\7\5\2\2\u0091\u00ab\3\2"+
		"\2\2\u0092\u0093\7\3\2\2\u0093\u0094\b\5\1\2\u0094\u0095\7\b\2\2\u0095"+
		"\u0096\b\5\1\2\u0096\u0097\7\3\2\2\u0097\u009d\5\n\6\2\u0098\u0099\b\5"+
		"\1\2\u0099\u009a\7\27\2\2\u009a\u009c\5\n\6\2\u009b\u0098\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\b\5\1\2\u00a2"+
		"\u00a3\5\n\6\2\u00a3\u00a4\b\5\1\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\b\5"+
		"\1\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\b\5\1\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aas\3\2\2\2\u00aa}\3\2\2\2\u00aa\u0092\3\2\2\2\u00ab"+
		"\t\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\13\3\2\2\2\u00ae\u00af\b\7\1\2\u00af"+
		"\u00b0\5\6\4\2\u00b0\u00b1\b\7\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00ba\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\7\1\2\u00b8\u00b9\7\27"+
		"\2\2\u00b9\u00bb\5\24\13\2\u00ba\u00b7\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00bf\7\3\2\2"+
		"\u00bf\u00c0\b\b\1\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\b\b\1\2\u00c2\u00c3"+
		"\7\27\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\b\b\1\2\u00c5\u00c6\7\27\2"+
		"\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\b\b\1\2\u00c8\u00c9\7\5\2\2\u00c9"+
		"\17\3\2\2\2\u00ca\u00cb\7\31\2\2\u00cb\21\3\2\2\2\u00cc\u00cd\7\3\2\2"+
		"\u00cd\u00ce\b\n\1\2\u00ce\u00cf\5\20\t\2\u00cf\u00d0\b\n\1\2\u00d0\u00d1"+
		"\7\27\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\b\n\1\2\u00d3\u00d4\7\5\2"+
		"\2\u00d4\23\3\2\2\2\u00d5\u014e\5\26\f\2\u00d6\u014e\5\n\6\2\u00d7\u00d8"+
		"\7\3\2\2\u00d8\u00d9\b\13\1\2\u00d9\u00da\7\13\2\2\u00da\u00db\b\13\1"+
		"\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\b\13\1\2\u00de"+
		"\u00df\7\5\2\2\u00df\u014e\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\b\13"+
		"\1\2\u00e2\u014e\5\34\17\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\b\13\1\2\u00e5"+
		"\u00e6\7\r\2\2\u00e6\u00e7\b\13\1\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\5"+
		"\30\r\2\u00e9\u00ea\b\13\1\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\5\f\7\2"+
		"\u00ec\u00ed\b\13\1\2\u00ed\u00ee\7\5\2\2\u00ee\u014e\3\2\2\2\u00ef\u00f0"+
		"\7\3\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3\b\13\1"+
		"\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5\5\24\13\2\u00f5\u00f6\b\13\1\2\u00f6"+
		"\u00f7\7\27\2\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9\b\13\1\2\u00f9\u00fa"+
		"\7\27\2\2\u00fa\u00fb\5\24\13\2\u00fb\u00fc\b\13\1\2\u00fc\u00fd\7\5\2"+
		"\2\u00fd\u014e\3\2\2\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\b\13\1\2\u0100"+
		"\u0101\7\16\2\2\u0101\u0102\b\13\1\2\u0102\u0103\7\27\2\2\u0103\u0104"+
		"\5\24\13\2\u0104\u0105\b\13\1\2\u0105\u0106\7\27\2\2\u0106\u0107\5\24"+
		"\13\2\u0107\u0108\b\13\1\2\u0108\u0109\7\5\2\2\u0109\u014e\3\2\2\2\u010a"+
		"\u010b\7\3\2\2\u010b\u010c\b\13\1\2\u010c\u010d\7\17\2\2\u010d\u010e\b"+
		"\13\1\2\u010e\u010f\7\20\2\2\u010f\u0110\5\n\6\2\u0110\u0111\b\13\1\2"+
		"\u0111\u0112\7\27\2\2\u0112\u0113\5\24\13\2\u0113\u0114\b\13\1\2\u0114"+
		"\u0115\7\5\2\2\u0115\u014e\3\2\2\2\u0116\u014e\5\32\16\2\u0117\u0118\7"+
		"\3\2\2\u0118\u0119\b\13\1\2\u0119\u011a\7\6\2\2\u011a\u011b\b\13\1\2\u011b"+
		"\u011d\7\3\2\2\u011c\u011e\5\22\n\2\u011d\u011c\3\2\2\2\u011d\u011e\3"+
		"\2\2\2\u011e\u0124\3\2\2\2\u011f\u0120\b\13\1\2\u0120\u0121\7\27\2\2\u0121"+
		"\u0123\5\22\n\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\b\13\1\2\u0128\u0129\7\5\2\2\u0129\u012b\b\13\1\2\u012a\u012c\5"+
		"\24\13\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\13\1\2\u0130\u0131\7"+
		"\5\2\2\u0131\u014e\3\2\2\2\u0132\u0133\7\3\2\2\u0133\u0134\b\13\1\2\u0134"+
		"\u0135\7\7\2\2\u0135\u0136\b\13\1\2\u0136\u0138\7\3\2\2\u0137\u0139\5"+
		"\22\n\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f\3\2\2\2\u013a"+
		"\u013b\b\13\1\2\u013b\u013c\7\27\2\2\u013c\u013e\5\22\n\2\u013d\u013a"+
		"\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b\13\1\2\u0143\u0144\7"+
		"\5\2\2\u0144\u0146\b\13\1\2\u0145\u0147\5\24\13\2\u0146\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\b\13\1\2\u014b\u014c\7\5\2\2\u014c\u014e\3\2\2\2"+
		"\u014d\u00d5\3\2\2\2\u014d\u00d6\3\2\2\2\u014d\u00d7\3\2\2\2\u014d\u00e0"+
		"\3\2\2\2\u014d\u00e3\3\2\2\2\u014d\u00ef\3\2\2\2\u014d\u00fe\3\2\2\2\u014d"+
		"\u010a\3\2\2\2\u014d\u0116\3\2\2\2\u014d\u0117\3\2\2\2\u014d\u0132\3\2"+
		"\2\2\u014e\25\3\2\2\2\u014f\u0154\7\35\2\2\u0150\u0154\5\36\20\2\u0151"+
		"\u0154\5 \21\2\u0152\u0154\5\"\22\2\u0153\u014f\3\2\2\2\u0153\u0150\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\27\3\2\2\2\u0155"+
		"\u0177\5\n\6\2\u0156\u0157\7\3\2\2\u0157\u0159\b\r\1\2\u0158\u015a\5\n"+
		"\6\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0160\3\2\2\2\u015b"+
		"\u015c\b\r\1\2\u015c\u015d\7\27\2\2\u015d\u015f\5\n\6\2\u015e\u015b\3"+
		"\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b\r\1\2\u0164\u0177\7\5"+
		"\2\2\u0165\u0166\7\3\2\2\u0166\u0167\b\r\1\2\u0167\u016b\5\n\6\2\u0168"+
		"\u0169\b\r\1\2\u0169\u016a\7\27\2\2\u016a\u016c\5\n\6\2\u016b\u0168\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\b\r\1\2\u0170\u0171\7\t\2\2\u0171\u0172\b\r"+
		"\1\2\u0172\u0173\5\n\6\2\u0173\u0174\b\r\1\2\u0174\u0175\7\5\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0155\3\2\2\2\u0176\u0156\3\2\2\2\u0176\u0165\3\2"+
		"\2\2\u0177\31\3\2\2\2\u0178\u0179\7\3\2\2\u0179\u017a\b\16\1\2\u017a\u0180"+
		"\5\24\13\2\u017b\u017c\b\16\1\2\u017c\u017d\7\27\2\2\u017d\u017f\5\24"+
		"\13\2\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b\16"+
		"\1\2\u0184\u0185\7\5\2\2\u0185\33\3\2\2\2\u0186\u018e\7\35\2\2\u0187\u018e"+
		"\5\36\20\2\u0188\u018e\5 \21\2\u0189\u018e\5\"\22\2\u018a\u018e\7\36\2"+
		"\2\u018b\u018e\5$\23\2\u018c\u018e\5(\25\2\u018d\u0186\3\2\2\2\u018d\u0187"+
		"\3\2\2\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\35\3\2\2\2\u018f\u0191\7\33\2"+
		"\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\37\3\2\2\2\u0194\u0195\7\32\2\2\u0195!\3\2\2\2\u0196\u019a"+
		"\7\21\2\2\u0197\u0199\t\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019e\7\21\2\2\u019e#\3\2\2\2\u019f\u01a0\7\3\2\2\u01a0"+
		"\u01a2\b\23\1\2\u01a1\u01a3\5\34\17\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5\b\23\1\2\u01a5\u01a6\7\27\2\2"+
		"\u01a6\u01a8\5\34\17\2\u01a7\u01a4\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\b\23\1\2\u01ad\u01c0\7\5\2\2\u01ae\u01af\7\3\2\2\u01af\u01b5\5"+
		"\34\17\2\u01b0\u01b1\b\23\1\2\u01b1\u01b2\7\27\2\2\u01b2\u01b4\5\34\17"+
		"\2\u01b3\u01b0\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\23\1\2"+
		"\u01b9\u01ba\7\t\2\2\u01ba\u01bb\b\23\1\2\u01bb\u01bc\5\34\17\2\u01bc"+
		"\u01bd\7\5\2\2\u01bd\u01c0\3\2\2\2\u01be\u01c0\5&\24\2\u01bf\u019f\3\2"+
		"\2\2\u01bf\u01ae\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0%\3\2\2\2\u01c1\u01c2"+
		"\7\f\2\2\u01c2\u01c3\b\24\1\2\u01c3\u01cd\5\34\17\2\u01c4\u01c5\7\23\2"+
		"\2\u01c5\u01c6\b\24\1\2\u01c6\u01cd\5\34\17\2\u01c7\u01c8\7\24\2\2\u01c8"+
		"\u01c9\b\24\1\2\u01c9\u01cd\5\34\17\2\u01ca\u01cb\7\25\2\2\u01cb\u01cd"+
		"\5\34\17\2\u01cc\u01c1\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c7\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\'\3\2\2\2\u01ce\u01cf\7\26\2\2\u01cf\u01d0"+
		"\b\25\1\2\u01d0\u01d1\7\3\2\2\u01d1\u01d3\b\25\1\2\u01d2\u01d4\5\34\17"+
		"\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01da\3\2\2\2\u01d5\u01d6"+
		"\b\25\1\2\u01d6\u01d7\7\27\2\2\u01d7\u01d9\5\34\17\2\u01d8\u01d5\3\2\2"+
		"\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\b\25\1\2\u01de\u01df\7\5\2\2"+
		"\u01df)\3\2\2\2&-\62?NWdmq\u0088\u009d\u00aa\u00b4\u00bc\u011d\u0124\u012d"+
		"\u0138\u013f\u0148\u014d\u0153\u0159\u0160\u016d\u0176\u0180\u018d\u0192"+
		"\u019a\u01a2\u01a9\u01b5\u01bf\u01cc\u01d3\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}