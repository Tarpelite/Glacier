// Generated from /mnt/d/workspace/2020_fall/PL/Glacier/Tscheme.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TschemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, SL=21, WS=22, ID=23, LETTER=24, DIGIT=25, 
		OPS=26, BooleanG=27, SYMBOL=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "SL", "WS", "ID", "LETTER", "DIGIT", "OPS", 
			"BooleanG", "SYMBOL"
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

	 
	    self.ignore = True
	    

	public TschemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tscheme.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			self.processWSToken()
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\6\26\u0090\n\26"+
		"\r\26\16\26\u0091\3\27\3\27\3\27\3\30\6\30\u0098\n\30\r\30\16\30\u0099"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00a6\n\34\3\35"+
		"\3\35\6\35\u00aa\n\35\r\35\16\35\u00ab\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\7\5\2\13\f\17\17\"\"\5\2"+
		"\62;C\\c|\4\2C\\c|\3\2\62;\n\2##&(,,\61\61<<>A`a\u0080\u0080\2\u00b1\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2"+
		"\2\2\5=\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13I\3\2\2\2\rP\3\2\2\2\17X\3\2\2"+
		"\2\21Z\3\2\2\2\23i\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31x\3\2\2\2\33{\3\2"+
		"\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087"+
		"\3\2\2\2\'\u0089\3\2\2\2)\u008c\3\2\2\2+\u008f\3\2\2\2-\u0093\3\2\2\2"+
		"/\u0097\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2\2\2\67"+
		"\u00a5\3\2\2\29\u00a9\3\2\2\2;<\7*\2\2<\4\3\2\2\2=>\7d\2\2>?\7g\2\2?@"+
		"\7i\2\2@A\7k\2\2AB\7p\2\2B\6\3\2\2\2CD\7+\2\2D\b\3\2\2\2EF\7n\2\2FG\7"+
		"g\2\2GH\7v\2\2H\n\3\2\2\2IJ\7n\2\2JK\7g\2\2KL\7v\2\2LM\7t\2\2MN\7g\2\2"+
		"NO\7e\2\2O\f\3\2\2\2PQ\7f\2\2QR\7g\2\2RS\7h\2\2ST\7I\2\2TU\7k\2\2UV\7"+
		"p\2\2VW\7g\2\2W\16\3\2\2\2XY\7\60\2\2Y\20\3\2\2\2Z[\7f\2\2[\\\7g\2\2\\"+
		"]\7h\2\2]^\7I\2\2^_\7k\2\2_`\7p\2\2`a\7g\2\2ab\7/\2\2bc\7u\2\2cd\7{\2"+
		"\2de\7p\2\2ef\7v\2\2fg\7c\2\2gh\7z\2\2h\22\3\2\2\2ij\7s\2\2jk\7w\2\2k"+
		"l\7q\2\2lm\7v\2\2mn\7g\2\2n\24\3\2\2\2op\7)\2\2p\26\3\2\2\2qr\7n\2\2r"+
		"s\7c\2\2st\7o\2\2tu\7d\2\2uv\7f\2\2vw\7c\2\2w\30\3\2\2\2xy\7k\2\2yz\7"+
		"h\2\2z\32\3\2\2\2{|\7u\2\2|}\7g\2\2}~\7v\2\2~\34\3\2\2\2\177\u0080\7#"+
		"\2\2\u0080\36\3\2\2\2\u0081\u0082\7$\2\2\u0082 \3\2\2\2\u0083\u0084\7"+
		"\"\2\2\u0084\"\3\2\2\2\u0085\u0086\7b\2\2\u0086$\3\2\2\2\u0087\u0088\7"+
		".\2\2\u0088&\3\2\2\2\u0089\u008a\7.\2\2\u008a\u008b\7B\2\2\u008b(\3\2"+
		"\2\2\u008c\u008d\7%\2\2\u008d*\3\2\2\2\u008e\u0090\7\"\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		",\3\2\2\2\u0093\u0094\t\2\2\2\u0094\u0095\b\27\2\2\u0095.\3\2\2\2\u0096"+
		"\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\60\3\2\2\2\u009b\u009c\t\4\2\2\u009c\62"+
		"\3\2\2\2\u009d\u009e\t\5\2\2\u009e\64\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\7%\2\2\u00a2\u00a6\7v\2\2\u00a3\u00a4\7%\2\2\u00a4"+
		"\u00a6\7h\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a68\3\2\2\2\u00a7"+
		"\u00aa\t\3\2\2\u00a8\u00aa\5\65\33\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		":\3\2\2\2\b\2\u0091\u0099\u00a5\u00a9\u00ab\3\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}