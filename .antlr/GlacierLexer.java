// Generated from /mnt/d/workspace/2020_fall/PL/Glacier/Glacier.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GlacierLexer extends Lexer {
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
		T__45=46, T__46=47, T__47=48, WS=49, COMMENT=50, VAR=51, INT=52, SPACESL=53, 
		FLOAT=54;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "WS", 
			"COMMENT", "VAR", "INT", "SPACESL", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'::'", "'{'", "'}'", "'True'", "'False'", "'('", "','", 
			"')'", "'let'", "':'", "'='", "'in'", "'['", "']'", "'if'", "'then'", 
			"'else'", "'Zero'", "'Grad'", "'Ref'", "'!'", "':='", "'\\'", "'->'", 
			"'unfoldr'", "'replicate'", "'foldl'", "'+'", "'-'", "'*'", "'/'", "'!='", 
			"'<'", "'<='", "'>='", "'>'", "'map'", "'fold'", "'unfold'", "'tail'", 
			"'filter'", "'Tensor'", "'Int'", "'UInt'", "'Float'", "'Bool'", "'Shape'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "COMMENT", "VAR", "INT", "SPACESL", "FLOAT"
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


	public GlacierLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Glacier.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0150\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\6\62\u012b\n\62\r\62\16"+
		"\62\u012c\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0135\n\63\f\63\16\63\u0138"+
		"\13\63\3\63\3\63\3\63\3\63\3\64\6\64\u013f\n\64\r\64\16\64\u0140\3\65"+
		"\6\65\u0144\n\65\r\65\16\65\u0145\3\66\6\66\u0149\n\66\r\66\16\66\u014a"+
		"\3\67\3\67\3\67\3\67\3\u0136\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|\2\u0154"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13z\3\2\2\2\r\177\3\2\2"+
		"\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2"+
		"\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0096\3\2\2\2\37"+
		"\u0098\3\2\2\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a2\3\2\2\2\'\u00a7\3"+
		"\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00bf\3\2\2\2\67\u00c7\3\2\2\29\u00d1"+
		"\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd\3\2\2\2C"+
		"\u00df\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K\u00ea\3\2"+
		"\2\2M\u00ec\3\2\2\2O\u00f0\3\2\2\2Q\u00f5\3\2\2\2S\u00fc\3\2\2\2U\u0101"+
		"\3\2\2\2W\u0108\3\2\2\2Y\u010f\3\2\2\2[\u0113\3\2\2\2]\u0118\3\2\2\2_"+
		"\u011e\3\2\2\2a\u0123\3\2\2\2c\u012a\3\2\2\2e\u0130\3\2\2\2g\u013e\3\2"+
		"\2\2i\u0143\3\2\2\2k\u0148\3\2\2\2m\u014c\3\2\2\2op\7f\2\2pq\7g\2\2qr"+
		"\7h\2\2r\4\3\2\2\2st\7<\2\2tu\7<\2\2u\6\3\2\2\2vw\7}\2\2w\b\3\2\2\2xy"+
		"\7\177\2\2y\n\3\2\2\2z{\7V\2\2{|\7t\2\2|}\7w\2\2}~\7g\2\2~\f\3\2\2\2\177"+
		"\u0080\7H\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2"+
		"\u0083\u0084\7g\2\2\u0084\16\3\2\2\2\u0085\u0086\7*\2\2\u0086\20\3\2\2"+
		"\2\u0087\u0088\7.\2\2\u0088\22\3\2\2\2\u0089\u008a\7+\2\2\u008a\24\3\2"+
		"\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e\26"+
		"\3\2\2\2\u008f\u0090\7<\2\2\u0090\30\3\2\2\2\u0091\u0092\7?\2\2\u0092"+
		"\32\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\34\3\2\2\2\u0096"+
		"\u0097\7]\2\2\u0097\36\3\2\2\2\u0098\u0099\7_\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\"\3\2\2\2\u009d\u009e\7v\2\2\u009e"+
		"\u009f\7j\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1$\3\2\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6&\3\2\2\2\u00a7\u00a8\7\\\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7t"+
		"\2\2\u00aa\u00ab\7q\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7I\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7f\2\2\u00b0*\3\2\2\2\u00b1\u00b2"+
		"\7T\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7h\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7<\2\2\u00b8\u00b9\7?\2\2\u00b9\60"+
		"\3\2\2\2\u00ba\u00bb\7^\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		"\u00be\7@\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7h\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7f\2\2"+
		"\u00c5\u00c6\7t\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7"+
		"g\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7e\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"8\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7f\2\2\u00d5\u00d6\7n\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8"+
		"<\3\2\2\2\u00d9\u00da\7/\2\2\u00da>\3\2\2\2\u00db\u00dc\7,\2\2\u00dc@"+
		"\3\2\2\2\u00dd\u00de\7\61\2\2\u00deB\3\2\2\2\u00df\u00e0\7#\2\2\u00e0"+
		"\u00e1\7?\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3F\3\2\2\2\u00e4\u00e5"+
		"\7>\2\2\u00e5\u00e6\7?\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7@\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7"+
		"o\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7r\2\2\u00efN\3\2\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"P\3\2\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7h\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7f\2\2\u00fbR\3\2\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7n\2\2"+
		"\u0100T\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7k\2\2\u0103\u0104\7n\2"+
		"\2\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107V\3\2"+
		"\2\2\u0108\u0109\7V\2\2\u0109\u010a\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7q\2\2\u010d\u010e\7t\2\2\u010eX\3\2\2\2\u010f\u0110"+
		"\7K\2\2\u0110\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112Z\3\2\2\2\u0113\u0114"+
		"\7W\2\2\u0114\u0115\7K\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117"+
		"\\\3\2\2\2\u0118\u0119\7H\2\2\u0119\u011a\7n\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7v\2\2\u011d^\3\2\2\2\u011e\u011f\7D\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7q\2\2\u0121\u0122\7n\2\2\u0122`\3\2\2\2\u0123"+
		"\u0124\7U\2\2\u0124\u0125\7j\2\2\u0125\u0126\7c\2\2\u0126\u0127\7r\2\2"+
		"\u0127\u0128\7g\2\2\u0128b\3\2\2\2\u0129\u012b\t\2\2\2\u012a\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\b\62\2\2\u012fd\3\2\2\2\u0130\u0131\7\61\2"+
		"\2\u0131\u0132\7\61\2\2\u0132\u0136\3\2\2\2\u0133\u0135\13\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\f\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\b\63\2\2\u013cf\3\2\2\2\u013d\u013f\t\3\2\2"+
		"\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141h\3\2\2\2\u0142\u0144\4\62;\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146j\3\2\2\2"+
		"\u0147\u0149\7\"\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014bl\3\2\2\2\u014c\u014d\5i\65\2\u014d"+
		"\u014e\7\60\2\2\u014e\u014f\5i\65\2\u014fn\3\2\2\2\b\2\u012c\u0136\u0140"+
		"\u0145\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}