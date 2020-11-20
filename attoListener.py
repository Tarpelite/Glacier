# Generated from atto.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .attoParser import attoParser
else:
    from attoParser import attoParser

# This class defines a complete listener for a parse tree produced by attoParser.
class attoListener(ParseTreeListener):

    # Enter a parse tree produced by attoParser#func.
    def enterFunc(self, ctx:attoParser.FuncContext):
        pass

    # Exit a parse tree produced by attoParser#func.
    def exitFunc(self, ctx:attoParser.FuncContext):
        pass


    # Enter a parse tree produced by attoParser#expr.
    def enterExpr(self, ctx:attoParser.ExprContext):
        pass

    # Exit a parse tree produced by attoParser#expr.
    def exitExpr(self, ctx:attoParser.ExprContext):
        pass


    # Enter a parse tree produced by attoParser#name.
    def enterName(self, ctx:attoParser.NameContext):
        pass

    # Exit a parse tree produced by attoParser#name.
    def exitName(self, ctx:attoParser.NameContext):
        pass


    # Enter a parse tree produced by attoParser#args.
    def enterArgs(self, ctx:attoParser.ArgsContext):
        pass

    # Exit a parse tree produced by attoParser#args.
    def exitArgs(self, ctx:attoParser.ArgsContext):
        pass



del attoParser