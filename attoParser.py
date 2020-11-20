# Generated from atto.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("I\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2")
        buf.write("\17\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5\3")
        buf.write("\5\6\5E\n\5\r\5\16\5F\3\5\2\2\6\2\4\6\b\2\2\2O\2\n\3\2")
        buf.write("\2\2\4=\3\2\2\2\6?\3\2\2\2\bD\3\2\2\2\n\13\7\3\2\2\13")
        buf.write("\f\7\17\2\2\f\16\5\6\4\2\r\17\5\b\5\2\16\r\3\2\2\2\16")
        buf.write("\17\3\2\2\2\17\20\3\2\2\2\20\21\7\17\2\2\21\22\7\4\2\2")
        buf.write("\22\23\7\17\2\2\23\24\5\4\3\2\24\3\3\2\2\2\25>\3\2\2\2")
        buf.write("\26\27\7\5\2\2\27\30\7\17\2\2\30\31\5\4\3\2\31\32\7\17")
        buf.write("\2\2\32\33\5\4\3\2\33\34\7\17\2\2\34\35\5\4\3\2\35>\3")
        buf.write("\2\2\2\36\37\7\6\2\2\37 \7\17\2\2 >\5\4\3\2!\"\7\7\2\2")
        buf.write("\"#\7\17\2\2#>\5\4\3\2$%\7\b\2\2%&\7\17\2\2&\'\5\4\3\2")
        buf.write("\'(\7\17\2\2()\5\4\3\2)>\3\2\2\2*+\7\t\2\2+,\7\17\2\2")
        buf.write(",-\5\4\3\2-.\7\17\2\2./\5\4\3\2/>\3\2\2\2\60\61\7\n\2")
        buf.write("\2\61\62\7\17\2\2\62\63\5\4\3\2\63\64\7\17\2\2\64\65\5")
        buf.write("\4\3\2\65>\3\2\2\2\66\67\7\13\2\2\678\7\17\2\289\5\4\3")
        buf.write("\29:\7\17\2\2:;\5\4\3\2;>\3\2\2\2<>\5\6\4\2=\25\3\2\2")
        buf.write("\2=\26\3\2\2\2=\36\3\2\2\2=!\3\2\2\2=$\3\2\2\2=*\3\2\2")
        buf.write("\2=\60\3\2\2\2=\66\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\7\r")
        buf.write("\2\2@\7\3\2\2\2AB\7\17\2\2BE\7\r\2\2CE\7\16\2\2DA\3\2")
        buf.write("\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2")
        buf.write("\2\6\16=DF")
        return buf.getvalue()


class attoParser ( Parser ):

    grammarFileName = "atto.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'fn'", "'is'", "'if'", "'head'", "'tail'", 
                     "'+'", "'-'", "'='", "'*'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "WS", "VAR", "INT", "SPACESL" ]

    RULE_func = 0
    RULE_expr = 1
    RULE_name = 2
    RULE_args = 3

    ruleNames =  [ "func", "expr", "name", "args" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    WS=10
    VAR=11
    INT=12
    SPACESL=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class FuncContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACESL(self, i:int=None):
            if i is None:
                return self.getTokens(attoParser.SPACESL)
            else:
                return self.getToken(attoParser.SPACESL, i)

        def name(self):
            return self.getTypedRuleContext(attoParser.NameContext,0)


        def expr(self):
            return self.getTypedRuleContext(attoParser.ExprContext,0)


        def args(self):
            return self.getTypedRuleContext(attoParser.ArgsContext,0)


        def getRuleIndex(self):
            return attoParser.RULE_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc" ):
                listener.enterFunc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc" ):
                listener.exitFunc(self)




    def func(self):

        localctx = attoParser.FuncContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_func)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.match(attoParser.T__0)
            self.state = 9
            self.match(attoParser.SPACESL)
            self.state = 10
            self.name()
            self.state = 12
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.state = 11
                self.args()


            self.state = 14
            self.match(attoParser.SPACESL)
            self.state = 15
            self.match(attoParser.T__1)
            self.state = 16
            self.match(attoParser.SPACESL)
            self.state = 17
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACESL(self, i:int=None):
            if i is None:
                return self.getTokens(attoParser.SPACESL)
            else:
                return self.getToken(attoParser.SPACESL, i)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(attoParser.ExprContext)
            else:
                return self.getTypedRuleContext(attoParser.ExprContext,i)


        def name(self):
            return self.getTypedRuleContext(attoParser.NameContext,0)


        def getRuleIndex(self):
            return attoParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = attoParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.state = 59
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [attoParser.EOF, attoParser.SPACESL]:
                self.enterOuterAlt(localctx, 1)

                pass
            elif token in [attoParser.T__2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.match(attoParser.T__2)
                self.state = 21
                self.match(attoParser.SPACESL)
                self.state = 22
                self.expr()
                self.state = 23
                self.match(attoParser.SPACESL)
                self.state = 24
                self.expr()
                self.state = 25
                self.match(attoParser.SPACESL)
                self.state = 26
                self.expr()
                pass
            elif token in [attoParser.T__3]:
                self.enterOuterAlt(localctx, 3)
                self.state = 28
                self.match(attoParser.T__3)
                self.state = 29
                self.match(attoParser.SPACESL)
                self.state = 30
                self.expr()
                pass
            elif token in [attoParser.T__4]:
                self.enterOuterAlt(localctx, 4)
                self.state = 31
                self.match(attoParser.T__4)
                self.state = 32
                self.match(attoParser.SPACESL)
                self.state = 33
                self.expr()
                pass
            elif token in [attoParser.T__5]:
                self.enterOuterAlt(localctx, 5)
                self.state = 34
                self.match(attoParser.T__5)
                self.state = 35
                self.match(attoParser.SPACESL)
                self.state = 36
                self.expr()
                self.state = 37
                self.match(attoParser.SPACESL)
                self.state = 38
                self.expr()
                pass
            elif token in [attoParser.T__6]:
                self.enterOuterAlt(localctx, 6)
                self.state = 40
                self.match(attoParser.T__6)
                self.state = 41
                self.match(attoParser.SPACESL)
                self.state = 42
                self.expr()
                self.state = 43
                self.match(attoParser.SPACESL)
                self.state = 44
                self.expr()
                pass
            elif token in [attoParser.T__7]:
                self.enterOuterAlt(localctx, 7)
                self.state = 46
                self.match(attoParser.T__7)
                self.state = 47
                self.match(attoParser.SPACESL)
                self.state = 48
                self.expr()
                self.state = 49
                self.match(attoParser.SPACESL)
                self.state = 50
                self.expr()
                pass
            elif token in [attoParser.T__8]:
                self.enterOuterAlt(localctx, 8)
                self.state = 52
                self.match(attoParser.T__8)
                self.state = 53
                self.match(attoParser.SPACESL)
                self.state = 54
                self.expr()
                self.state = 55
                self.match(attoParser.SPACESL)
                self.state = 56
                self.expr()
                pass
            elif token in [attoParser.VAR]:
                self.enterOuterAlt(localctx, 9)
                self.state = 58
                self.name()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NameContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(attoParser.VAR, 0)

        def getRuleIndex(self):
            return attoParser.RULE_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterName" ):
                listener.enterName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitName" ):
                listener.exitName(self)




    def name(self):

        localctx = attoParser.NameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_name)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(attoParser.VAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACESL(self, i:int=None):
            if i is None:
                return self.getTokens(attoParser.SPACESL)
            else:
                return self.getToken(attoParser.SPACESL, i)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(attoParser.VAR)
            else:
                return self.getToken(attoParser.VAR, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(attoParser.INT)
            else:
                return self.getToken(attoParser.INT, i)

        def getRuleIndex(self):
            return attoParser.RULE_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs" ):
                listener.enterArgs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs" ):
                listener.exitArgs(self)




    def args(self):

        localctx = attoParser.ArgsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_args)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 66
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [attoParser.SPACESL]:
                        self.state = 63
                        self.match(attoParser.SPACESL)
                        self.state = 64
                        self.match(attoParser.VAR)
                        pass
                    elif token in [attoParser.INT]:
                        self.state = 65
                        self.match(attoParser.INT)
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 68 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





