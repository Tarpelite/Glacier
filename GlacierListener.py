# Generated from Glacier.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a complete listener for a parse tree produced by GlacierParser.
class GlacierListener(ParseTreeListener):

    # Enter a parse tree produced by GlacierParser#program.
    def enterProgram(self, ctx:GlacierParser.ProgramContext):
        pass

    # Exit a parse tree produced by GlacierParser#program.
    def exitProgram(self, ctx:GlacierParser.ProgramContext):
        pass


    # Enter a parse tree produced by GlacierParser#func.
    def enterFunc(self, ctx:GlacierParser.FuncContext):
        pass

    # Exit a parse tree produced by GlacierParser#func.
    def exitFunc(self, ctx:GlacierParser.FuncContext):
        pass


    # Enter a parse tree produced by GlacierParser#expr.
    def enterExpr(self, ctx:GlacierParser.ExprContext):
        pass

    # Exit a parse tree produced by GlacierParser#expr.
    def exitExpr(self, ctx:GlacierParser.ExprContext):
        pass


    # Enter a parse tree produced by GlacierParser#binOp.
    def enterBinOp(self, ctx:GlacierParser.BinOpContext):
        pass

    # Exit a parse tree produced by GlacierParser#binOp.
    def exitBinOp(self, ctx:GlacierParser.BinOpContext):
        pass


    # Enter a parse tree produced by GlacierParser#unaryOp.
    def enterUnaryOp(self, ctx:GlacierParser.UnaryOpContext):
        pass

    # Exit a parse tree produced by GlacierParser#unaryOp.
    def exitUnaryOp(self, ctx:GlacierParser.UnaryOpContext):
        pass


    # Enter a parse tree produced by GlacierParser#name.
    def enterName(self, ctx:GlacierParser.NameContext):
        pass

    # Exit a parse tree produced by GlacierParser#name.
    def exitName(self, ctx:GlacierParser.NameContext):
        pass


    # Enter a parse tree produced by GlacierParser#params.
    def enterParams(self, ctx:GlacierParser.ParamsContext):
        pass

    # Exit a parse tree produced by GlacierParser#params.
    def exitParams(self, ctx:GlacierParser.ParamsContext):
        pass


    # Enter a parse tree produced by GlacierParser#typeG.
    def enterTypeG(self, ctx:GlacierParser.TypeGContext):
        pass

    # Exit a parse tree produced by GlacierParser#typeG.
    def exitTypeG(self, ctx:GlacierParser.TypeGContext):
        pass


    # Enter a parse tree produced by GlacierParser#basetypeG.
    def enterBasetypeG(self, ctx:GlacierParser.BasetypeGContext):
        pass

    # Exit a parse tree produced by GlacierParser#basetypeG.
    def exitBasetypeG(self, ctx:GlacierParser.BasetypeGContext):
        pass


    # Enter a parse tree produced by GlacierParser#shape.
    def enterShape(self, ctx:GlacierParser.ShapeContext):
        pass

    # Exit a parse tree produced by GlacierParser#shape.
    def exitShape(self, ctx:GlacierParser.ShapeContext):
        pass


    # Enter a parse tree produced by GlacierParser#args.
    def enterArgs(self, ctx:GlacierParser.ArgsContext):
        pass

    # Exit a parse tree produced by GlacierParser#args.
    def exitArgs(self, ctx:GlacierParser.ArgsContext):
        pass



del GlacierParser