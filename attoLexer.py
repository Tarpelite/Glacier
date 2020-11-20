# Generated from atto.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17")
        buf.write("K\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5")
        buf.write("\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3")
        buf.write("\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f>\n\f\r\f\16\f?\3\r")
        buf.write("\6\rC\n\r\r\r\16\rD\3\16\6\16H\n\16\r\16\16\16I\2\2\17")
        buf.write("\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31")
        buf.write("\16\33\17\3\2\5\4\2\13\f\17\17\5\2\62;C\\c|\3\2\62;\2")
        buf.write("M\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13")
        buf.write("\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3")
        buf.write("\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2")
        buf.write("\2\2\3\35\3\2\2\2\5 \3\2\2\2\7#\3\2\2\2\t&\3\2\2\2\13")
        buf.write("+\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23")
        buf.write("\66\3\2\2\2\258\3\2\2\2\27=\3\2\2\2\31B\3\2\2\2\33G\3")
        buf.write("\2\2\2\35\36\7h\2\2\36\37\7p\2\2\37\4\3\2\2\2 !\7k\2\2")
        buf.write("!\"\7u\2\2\"\6\3\2\2\2#$\7k\2\2$%\7h\2\2%\b\3\2\2\2&\'")
        buf.write("\7j\2\2\'(\7g\2\2()\7c\2\2)*\7f\2\2*\n\3\2\2\2+,\7v\2")
        buf.write("\2,-\7c\2\2-.\7k\2\2./\7n\2\2/\f\3\2\2\2\60\61\7-\2\2")
        buf.write("\61\16\3\2\2\2\62\63\7/\2\2\63\20\3\2\2\2\64\65\7?\2\2")
        buf.write("\65\22\3\2\2\2\66\67\7,\2\2\67\24\3\2\2\289\t\2\2\29:")
        buf.write("\3\2\2\2:;\b\13\2\2;\26\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?")
        buf.write("\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\30\3\2\2\2AC\t\4\2\2BA\3")
        buf.write("\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\32\3\2\2\2FH\7\"")
        buf.write("\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\34\3\2\2")
        buf.write("\2\6\2?DI\3\b\2\2")
        return buf.getvalue()


class attoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    WS = 10
    VAR = 11
    INT = 12
    SPACESL = 13

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'fn'", "'is'", "'if'", "'head'", "'tail'", "'+'", "'-'", "'='", 
            "'*'" ]

    symbolicNames = [ "<INVALID>",
            "WS", "VAR", "INT", "SPACESL" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "WS", "VAR", "INT", "SPACESL" ]

    grammarFileName = "atto.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


