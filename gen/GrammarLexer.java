// Generated from /home/koalaa13/IntelijIdeaProjects/MTLab3/src/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BOOL_OR=14, BOOL_AND=15, BOOL_NOT=16, 
		BOOL_FALSE=17, BOOL_TRUE=18, NEW_LINE=19, SPACE=20, TAB=21, VAR=22, INT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "BOOL_OR", "BOOL_AND", "BOOL_NOT", 
			"BOOL_FALSE", "BOOL_TRUE", "NEW_LINE", "SPACE", "TAB", "VAR", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def '", "'('", "'):'", "'return '", "','", "'print('", "')'", 
			"'='", "'int(input())'", "'*'", "'/'", "'+'", "'-'", "'or'", "'and'", 
			"'not'", "'False'", "'True'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOL_OR", "BOOL_AND", "BOOL_NOT", "BOOL_FALSE", "BOOL_TRUE", 
			"NEW_LINE", "SPACE", "TAB", "VAR", "INT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\6\24}\n\24\r\24\16\24~\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\7\27\u0087\n\27\f\27\16\27\u008a\13\27\3\30"+
		"\6\30\u008d\n\30\r\30\16\30\u008e\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\b\4\2\f\f\17\17\3\2\"\"\3\2\13\13\4\2C\\c|\6\2\62;C\\aac"+
		"|\3\2\62;\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2\t;\3\2\2\2\13C"+
		"\3\2\2\2\rE\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25]\3\2\2\2\27"+
		"_\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37h\3\2\2\2!l\3\2\2\2#p"+
		"\3\2\2\2%v\3\2\2\2\'|\3\2\2\2)\u0080\3\2\2\2+\u0082\3\2\2\2-\u0084\3\2"+
		"\2\2/\u008c\3\2\2\2\61\62\7f\2\2\62\63\7g\2\2\63\64\7h\2\2\64\65\7\"\2"+
		"\2\65\4\3\2\2\2\66\67\7*\2\2\67\6\3\2\2\289\7+\2\29:\7<\2\2:\b\3\2\2\2"+
		";<\7t\2\2<=\7g\2\2=>\7v\2\2>?\7w\2\2?@\7t\2\2@A\7p\2\2AB\7\"\2\2B\n\3"+
		"\2\2\2CD\7.\2\2D\f\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2"+
		"\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20\3\2\2\2NO\7?\2\2O\22\3\2\2\2PQ\7"+
		"k\2\2QR\7p\2\2RS\7v\2\2ST\7*\2\2TU\7k\2\2UV\7p\2\2VW\7r\2\2WX\7w\2\2X"+
		"Y\7v\2\2YZ\7*\2\2Z[\7+\2\2[\\\7+\2\2\\\24\3\2\2\2]^\7,\2\2^\26\3\2\2\2"+
		"_`\7\61\2\2`\30\3\2\2\2ab\7-\2\2b\32\3\2\2\2cd\7/\2\2d\34\3\2\2\2ef\7"+
		"q\2\2fg\7t\2\2g\36\3\2\2\2hi\7c\2\2ij\7p\2\2jk\7f\2\2k \3\2\2\2lm\7p\2"+
		"\2mn\7q\2\2no\7v\2\2o\"\3\2\2\2pq\7H\2\2qr\7c\2\2rs\7n\2\2st\7u\2\2tu"+
		"\7g\2\2u$\3\2\2\2vw\7V\2\2wx\7t\2\2xy\7w\2\2yz\7g\2\2z&\3\2\2\2{}\t\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177(\3\2\2\2\u0080\u0081"+
		"\t\3\2\2\u0081*\3\2\2\2\u0082\u0083\t\4\2\2\u0083,\3\2\2\2\u0084\u0088"+
		"\t\5\2\2\u0085\u0087\t\6\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089.\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008d\t\7\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\60\3\2\2\2\6\2~\u0088\u008e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}