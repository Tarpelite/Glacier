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


    # Enter a parse tree produced by GlacierParser#typeConstraint.
    def enterTypeConstraint(self, ctx:GlacierParser.TypeConstraintContext):
        pass

    # Exit a parse tree produced by GlacierParser#typeConstraint.
    def exitTypeConstraint(self, ctx:GlacierParser.TypeConstraintContext):
        pass


    # Enter a parse tree produced by GlacierParser#expr.
    def enterExpr(self, ctx:GlacierParser.ExprContext):
        pass

    # Exit a parse tree produced by GlacierParser#expr.
    def exitExpr(self, ctx:GlacierParser.ExprContext):
        pass


    # Enter a parse tree produced by GlacierParser#basicOp.
    def enterBasicOp(self, ctx:GlacierParser.BasicOpContext):
        pass

    # Exit a parse tree produced by GlacierParser#basicOp.
    def exitBasicOp(self, ctx:GlacierParser.BasicOpContext):
        pass


    # Enter a parse tree produced by GlacierParser#basicFn.
    def enterBasicFn(self, ctx:GlacierParser.BasicFnContext):
        pass

    # Exit a parse tree produced by GlacierParser#basicFn.
    def exitBasicFn(self, ctx:GlacierParser.BasicFnContext):
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


    # Enter a parse tree produced by GlacierParser#param.
    def enterParam(self, ctx:GlacierParser.ParamContext):
        pass

    # Exit a parse tree produced by GlacierParser#param.
    def exitParam(self, ctx:GlacierParser.ParamContext):
        pass


    # Enter a parse tree produced by GlacierParser#listG.
    def enterListG(self, ctx:GlacierParser.ListGContext):
        pass

    # Exit a parse tree produced by GlacierParser#listG.
    def exitListG(self, ctx:GlacierParser.ListGContext):
        pass


    # Enter a parse tree produced by GlacierParser#tupleG.
    def enterTupleG(self, ctx:GlacierParser.TupleGContext):
        pass

    # Exit a parse tree produced by GlacierParser#tupleG.
    def exitTupleG(self, ctx:GlacierParser.TupleGContext):
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


    # Enter a parse tree produced by GlacierParser#customType.
    def enterCustomType(self, ctx:GlacierParser.CustomTypeContext):
        pass

    # Exit a parse tree produced by GlacierParser#customType.
    def exitCustomType(self, ctx:GlacierParser.CustomTypeContext):
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