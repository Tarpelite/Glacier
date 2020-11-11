# Generated from glacier.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .glacierParser import glacierParser
else:
    from glacierParser import glacierParser

# This class defines a complete listener for a parse tree produced by glacierParser.
class glacierListener(ParseTreeListener):

    # Enter a parse tree produced by glacierParser#item.
    def enterItem(self, ctx:glacierParser.ItemContext):
        pass

    # Exit a parse tree produced by glacierParser#item.
    def exitItem(self, ctx:glacierParser.ItemContext):
        pass


    # Enter a parse tree produced by glacierParser#operator.
    def enterOperator(self, ctx:glacierParser.OperatorContext):
        pass

    # Exit a parse tree produced by glacierParser#operator.
    def exitOperator(self, ctx:glacierParser.OperatorContext):
        pass


    # Enter a parse tree produced by glacierParser#definition.
    def enterDefinition(self, ctx:glacierParser.DefinitionContext):
        pass

    # Exit a parse tree produced by glacierParser#definition.
    def exitDefinition(self, ctx:glacierParser.DefinitionContext):
        pass


    # Enter a parse tree produced by glacierParser#expr.
    def enterExpr(self, ctx:glacierParser.ExprContext):
        pass

    # Exit a parse tree produced by glacierParser#expr.
    def exitExpr(self, ctx:glacierParser.ExprContext):
        pass


    # Enter a parse tree produced by glacierParser#binOp.
    def enterBinOp(self, ctx:glacierParser.BinOpContext):
        pass

    # Exit a parse tree produced by glacierParser#binOp.
    def exitBinOp(self, ctx:glacierParser.BinOpContext):
        pass


    # Enter a parse tree produced by glacierParser#unaryOp.
    def enterUnaryOp(self, ctx:glacierParser.UnaryOpContext):
        pass

    # Exit a parse tree produced by glacierParser#unaryOp.
    def exitUnaryOp(self, ctx:glacierParser.UnaryOpContext):
        pass


    # Enter a parse tree produced by glacierParser#gtype.
    def enterGtype(self, ctx:glacierParser.GtypeContext):
        pass

    # Exit a parse tree produced by glacierParser#gtype.
    def exitGtype(self, ctx:glacierParser.GtypeContext):
        pass


    # Enter a parse tree produced by glacierParser#basegtype.
    def enterBasegtype(self, ctx:glacierParser.BasegtypeContext):
        pass

    # Exit a parse tree produced by glacierParser#basegtype.
    def exitBasegtype(self, ctx:glacierParser.BasegtypeContext):
        pass


    # Enter a parse tree produced by glacierParser#shape.
    def enterShape(self, ctx:glacierParser.ShapeContext):
        pass

    # Exit a parse tree produced by glacierParser#shape.
    def exitShape(self, ctx:glacierParser.ShapeContext):
        pass


    # Enter a parse tree produced by glacierParser#kind.
    def enterKind(self, ctx:glacierParser.KindContext):
        pass

    # Exit a parse tree produced by glacierParser#kind.
    def exitKind(self, ctx:glacierParser.KindContext):
        pass


    # Enter a parse tree produced by glacierParser#globalId.
    def enterGlobalId(self, ctx:glacierParser.GlobalIdContext):
        pass

    # Exit a parse tree produced by glacierParser#globalId.
    def exitGlobalId(self, ctx:glacierParser.GlobalIdContext):
        pass


    # Enter a parse tree produced by glacierParser#localId.
    def enterLocalId(self, ctx:glacierParser.LocalIdContext):
        pass

    # Exit a parse tree produced by glacierParser#localId.
    def exitLocalId(self, ctx:glacierParser.LocalIdContext):
        pass


    # Enter a parse tree produced by glacierParser#gtypeId.
    def enterGtypeId(self, ctx:glacierParser.GtypeIdContext):
        pass

    # Exit a parse tree produced by glacierParser#gtypeId.
    def exitGtypeId(self, ctx:glacierParser.GtypeIdContext):
        pass


    # Enter a parse tree produced by glacierParser#realNumber.
    def enterRealNumber(self, ctx:glacierParser.RealNumberContext):
        pass

    # Exit a parse tree produced by glacierParser#realNumber.
    def exitRealNumber(self, ctx:glacierParser.RealNumberContext):
        pass


