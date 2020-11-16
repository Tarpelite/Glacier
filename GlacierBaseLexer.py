from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys
from antlr4.Token import Token, CommonToken
#from glacierLexer import Vocab as GLX

HIDDEN = Token.HIDDEN_CHANNEL

class GLX:
    NEWLINE = 1
    TAB = 2
    WS = 3
    AS = 4
    CASE = 5
    CLASS = 6
    DATA = 7
    DEFAULT = 8
    DERIVING = 9
    DO = 10
    ELSE = 11
    HIDING = 12
    IF = 13
    IMPORT = 14
    IN = 15
    INFIX = 16
    INFIXL = 17
    INFIXR = 18
    INSTANCE = 19
    LET = 20
    MODULE = 21
    NEWTYPE = 22
    OF = 23
    QUALIFIED = 24
    THEN = 25
    TYPE = 26
    WHERE = 27
    WILDCARD = 28
    FORALL = 29
    FOREIGN = 30
    EXPORT = 31
    SAFE = 32
    INTERRUPTIBLE = 33
    UNSAFE = 34
    MDO = 35
    FAMILY = 36
    ROLE = 37
    STDCALL = 38
    CCALL = 39
    CAPI = 40
    CPPCALL = 41
    JSCALL = 42
    REC = 43
    GROUP = 44
    BY = 45
    USING = 46
    PATTERN = 47
    STOCK = 48
    ANYCLASS = 49
    VIA = 50
    LANGUAGE = 51
    OPTIONS_GHC = 52
    OPTIONS = 53
    INLINE = 54
    NOINLINE = 55
    SPECIALISE = 56
    SPECINLINE = 57
    SOURCE = 58
    RULES = 59
    SCC = 60
    DEPRECATED = 61
    WARNING = 62
    UNPACK = 63
    NOUNPACK = 64
    ANN = 65
    MINIMAL = 66
    CTYPE = 67
    OVERLAPPING = 68
    OVERLAPPABLE = 69
    OVERLAPS = 70
    INCOHERENT = 71
    COMPLETE = 72
    LCASE = 73
    DoubleArrow = 74
    DoubleColon = 75
    Arrow = 76
    Revarrow = 77
    LarrowTail = 78
    RarrowTail = 79
    LLarrowTail = 80
    RRarrowTail = 81
    Hash = 82
    Less = 83
    Greater = 84
    Ampersand = 85
    Pipe = 86
    Bang = 87
    Caret = 88
    Plus = 89
    Minus = 90
    Asterisk = 91
    Percent = 92
    Divide = 93
    Tilde = 94
    Atsign = 95
    DDollar = 96
    Dollar = 97
    DoubleDot = 98
    Dot = 99
    Semi = 100
    QuestionMark = 101
    Comma = 102
    Colon = 103
    Eq = 104
    Quote = 105
    DoubleQuote = 106
    ReverseSlash = 107
    BackQuote = 108
    AopenParen = 109
    AcloseParen = 110
    TopenTexpQuote = 111
    TcloseTExpQoute = 112
    TopenExpQuote = 113
    TopenPatQuote = 114
    TopenTypQoute = 115
    TopenDecQoute = 116
    TcloseQoute = 117
    OpenBoxParen = 118
    CloseBoxParen = 119
    OpenRoundBracket = 120
    CloseRoundBracket = 121
    OpenSquareBracket = 122
    CloseSquareBracket = 123
    CHAR = 124
    STRING = 125
    VARID = 126
    CONID = 127
    OpenPragmaBracket = 128
    ClosePragmaBracket = 129
    COMMENT = 130
    NCOMMENT = 131
    OCURLY = 132
    CCURLY = 133
    VOCURLY = 134
    VCCURLY = 135
    SEMI = 136
    DECIMAL = 137
    OCTAL = 138
    HEXADECIMAL = 139
    FLOAT = 140
    EXPONENT = 141



class GlacierBaseLexer(Lexer):

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None

        self.pendingDent =  True

        # Current indent
        self.indentCount = 0
        # A queue where extra tokens are pushed on
        self.tokenQueue = []
        # The stack that keeps key word and indent after that
        self.indentStack = []
        # Pointer keeps last indent token
        self.initialIndentToken = None
        self.lastKeyWord = ""

        self.prevWasEndl = False
        self.prevWasKeyWord = False
        # Need, for example, in {}-block
        self.ignoreIndent = False
        # Check moment, when you should calculate start indent
        # module ... where {now you should remember start indent}
        self.moduleStartIndent = False
        self.wasModuleExport   = False
        self.inPragmas         = False

        # Haskell saves indent before first() symbol as null indent
        self.startIndent = -1
        # Count of "active" key words in this moment
        self.nestedLevel = 0
    
    def processNEWLINEToken(self):
        if self.pendingDent:
            self._channel = HIDDEN
        self.indentCount = 0
        self.initialIndentToken = None
    
    def processTABToken(self):
        self._channel = HIDDEN
        if self.pendingDent:
            self.indentCount += 8* len(self.text);
    
    def processWSToken(self):
        self._channel = HIDDEN;
        if self.pendingDent:
            # print(self.text)
            # print(type(self.text))
            self.indentCount += len(self.text);
        
    
    def getSavedIndent(self):
        if len(self.indentStack) == 0:
            return self.startIndent
        else:
            return self.indentStack[-1][1]
    
    def createToken(self,type_s, text, next_s):
        token = CommonToken(type=type_s)
        token.text = text
        if self.initialIndentToken != None:
            token.start  = self.initialIndentToken.start 
            token.line  = self.initialIndentToken.line
            token.column = self.initialIndentToken.column
            token.stop = next_s.start - 1
        return token 
    
    def processINToken(self, next_s):
        while len(self.indentStack) != 0 and self.indentStack[-1][1] != "let":
            self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
            self.tokenQueue.append(self.createToken(GLX.VCCURLY, "VCCURLY", next_s))
            self.nestedLevel -= 1
            self.indentStack = self.indentStack[:-1]
        
        if len(self.indentStack) != 0 and self.indentStack[-1][1] == "let":
            self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
            self.tokenQueue.append(self.createToken(GLX.VCCURLY, "VCCURLY", next_s))
            self.nestedLevel -= 1
            self.indentStack = self.indentStack[:-1]
    
    def processEOFToken(self, next_s):
        self.indentCount = self.startIndent
        if not self.pendingDent:
            self.initialIndentToken = next_s
        
        while self.nestedLevel > len(self.indentStack):
            if self.nestedLevel > 0:
                self.nestedLevel -= 1
            
            self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s)
            )
            self.tokenQueue.append(self.createToken(GLX.VCCURLY, "VCCURLY", next_s))
        
        if self.indentCount == self.getSavedIndent():
            self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s)
            )
        
        if self.wasModuleExport:
            self.tokenQueue.append(self.createToken(GLX.VCCURLY, "VCCURLY", next_s))
        
        self.startIndent = -1 
    
    def nextToken(self):
        if not len(self.tokenQueue) == 0:
            res = self.tokenQueue[0]
            self.tokenQueue = self.tokenQueue[1:]
            return res
        
        next_s = super(GlacierBaseLexer, self).nextToken()
        type_s = next_s.type

        if type_s == GLX.OpenPragmaBracket:
            self.inPragmas =  True
        if self.startIndent == -1 and type_s not in [GLX.NEWLINE, GLX.WS, GLX.TAB, GLX.OCURLY]:
            if type_s == GLX.MODULE:
                self.moduleStartIndent = True
                self.wasModuleExport = True
            if type_s != GLX.MODULE and not self.moduleStartIndent and not self.inPragmas:
                self.startIndent = next_s.column 
            elif self.lastKeyWord == "where" and self.moduleStartIndent:
                self.lastKeyWord == ""
                self.prevWasKeyWord = False
                self.nestedLevel = 0
                self.moduleStartIndent = False
                self.prevWasEndl = False
                self.startIndent = next_s.column
                self.tokenQueue.append(self.createToken(GLX.VCCURLY, "VCCURLY", next_s))
                self.tokenQueue.append(self.createToken(type_s, next_s.text, next_s))

                res = self.tokenQueue[0]
                self.tokenQueue = self.tokenQueue[1:]
                return res
        
        if type_s == GLX.ClosePragmaBracket:
            self.inPragmas = False
        
        if type_s == GLX.OCURLY:
            if self.prevWasKeyWord:
                self.nestedLevel -= 1
                self.prevWasKeyWord = False
            
            if self.moduleStartIndent:
                self.moduleStartIndent = False
                self.wasModuleExport = False
            
            self.ignoreIndent = False
            self.prevWasEndl = False
        
        if self.prevWasKeyWord and not self.prevWasEndl and not self.moduleStartIndent and type_s not in [GLX.WS, GLX.NEWLINE, GLX.TAB, GLX.OCURLY]:
            self.prevWasKeyWord = False
            self.indentStack.append([self.lastKeyWord, next_s.column])
            self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
        
        if self.ignoreIndent and type_s in [GLX.WHERE, GLX.DO, GLX.MDO, GLX.LET, GLX.OF, GLX.LCASE, GLX.REC, GLX.CCURLY]:
            self.ignoreIndent = False
        
        if self.pendingDent and self.prevWasKeyWord and not self.ignoreIndent and self.indentCount <= self.getSavedIndent() and type_s not in [GLX.NEWLINE, GLX.WS]:
            self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
            self.prevWasKeyWord = False
            self.prevWasEndl =  True
        
        if self.pendingDent and self.prevWasEndl and not self.ignoreIndent and self.indentCount <= self.getSavedIndent() and  type_s not in [GLX.NEWLINE, GLX.WS, GLX.WS, GLX.WHERE, GLX.IN, GLX.DO, GLX.MDO, GLX.OF, GLX.LCASE, GLX.REC, GLX.CCURLY, -1 ]:
            # -1 means EOF
            while self.nestedLevel > len(self.indentStack):
                if self.nestedLevel > 0:
                    self.nestedLevel -= 1
            
                self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
                self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
            # Translate to 292

            while self.indentCount < self.getSavedIndent():
                # print(self.getSavedIndent())
                if len(self.indentStack) > 0 and self.nestedLevel > 0:
                    self.indentStack = self.indentStack[:-1] # pop
                    self.nestedLevel -= 1
                
                self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
                self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
            
            if self.indentCount == self.getSavedIndent():
                self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
            
            self.prevWasEndl = False

            if self.indentCount == self.startIndent:
                self.pendingDent = False
        
        if self.pendingDent and self.prevWasKeyWord and not self.moduleStartIndent and not self.ignoreIndent and self.indentCount > self.getSavedIndent() and type_s not in [GLX.NEWLINE, GLX.WS, -1]:
            self.prevWasKeyWord = False

            if self.prevWasEndl:
                self.indentStack.append([self.lastKeyWord, self.indentCount])
                self.prevWasEndl = False
            
            self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
        
        if self.pendingDent and self.initialIndentToken == None and type_s != GLX.NEWLINE:
            self.initialIndentToken = next_s
        
        if next_s != None and type_s == GLX.NEWLINE:
            self.prevWasEndl =  True
        
        if type_s in [GLX.WHERE, GLX.LET, GLX.DO, GLX.MDO, GLX.OF, GLX.LCASE, GLX.REC]:
            self.nestedLevel += 1
            self.prevWasKeyWord =  True
            self.prevWasEndl = False
            self.lastKeyWord = next_s.text

            if type_s == GLX.WHERE:
                if len(self.indentStack) != 0 and self.indentStack[-1][1] in ["do", "mdo"]:
                    self.tokenQueue.append(self.createToken(GLX.SEMI, "SEMI", next_s))
                    self.tokenQueue.append(self.createToken(GLX.VOCURLY, "VOCURLY", next_s))
                    self.indentStack = self.indentStack[:-1]
                    self.nestedLevel -= 1
            
        if next_s != None and type_s == GLX.OCURLY:
            self.prevWasKeyWord = False
        
        if next_s == None or HIDDEN == next_s.channel or GLX.NEWLINE == type_s:
            return next_s
        
        if type_s == GLX.IN:
            self.processINToken(next_s)
        
        if type_s == -1:
            self.processEOFToken(next_s)
        
        self.pendingDent =  True
        self.tokenQueue.append(next_s)

        res = self.tokenQueue[0]
        self.tokenQueue = self.tokenQueue[1:]
        return res
                






        