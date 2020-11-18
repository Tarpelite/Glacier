# Generated from Glacier.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a complete listener for a parse tree produced by GlacierParser.
class GlacierListener(ParseTreeListener):

    # Enter a parse tree produced by GlacierParser#item.
    def enterItem(self, ctx:GlacierParser.ItemContext):
        pass

    # Exit a parse tree produced by GlacierParser#item.
    def exitItem(self, ctx:GlacierParser.ItemContext):
        pass


    # Enter a parse tree produced by GlacierParser#operator.
    def enterOperator(self, ctx:GlacierParser.OperatorContext):
        pass

    # Exit a parse tree produced by GlacierParser#operator.
    def exitOperator(self, ctx:GlacierParser.OperatorContext):
        pass


    # Enter a parse tree produced by GlacierParser#definition.
    def enterDefinition(self, ctx:GlacierParser.DefinitionContext):
        pass

    # Exit a parse tree produced by GlacierParser#definition.
    def exitDefinition(self, ctx:GlacierParser.DefinitionContext):
        pass


    # Enter a parse tree produced by GlacierParser#encodingRNN.
    def enterEncodingRNN(self, ctx:GlacierParser.EncodingRNNContext):
        pass

    # Exit a parse tree produced by GlacierParser#encodingRNN.
    def exitEncodingRNN(self, ctx:GlacierParser.EncodingRNNContext):
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


    # Enter a parse tree produced by GlacierParser#typeG.
    def enterTypeG(self, ctx:GlacierParser.TypeGContext):
        pass

    # Exit a parse tree produced by GlacierParser#typeG.
    def exitTypeG(self, ctx:GlacierParser.TypeGContext):
        pass


    # Enter a parse tree produced by GlacierParser#baseType.
    def enterBaseType(self, ctx:GlacierParser.BaseTypeContext):
        pass

    # Exit a parse tree produced by GlacierParser#baseType.
    def exitBaseType(self, ctx:GlacierParser.BaseTypeContext):
        pass


    # Enter a parse tree produced by GlacierParser#shape.
    def enterShape(self, ctx:GlacierParser.ShapeContext):
        pass

    # Exit a parse tree produced by GlacierParser#shape.
    def exitShape(self, ctx:GlacierParser.ShapeContext):
        pass


    # Enter a parse tree produced by GlacierParser#kind.
    def enterKind(self, ctx:GlacierParser.KindContext):
        pass

    # Exit a parse tree produced by GlacierParser#kind.
    def exitKind(self, ctx:GlacierParser.KindContext):
        pass


    # Enter a parse tree produced by GlacierParser#globalId.
    def enterGlobalId(self, ctx:GlacierParser.GlobalIdContext):
        pass

    # Exit a parse tree produced by GlacierParser#globalId.
    def exitGlobalId(self, ctx:GlacierParser.GlobalIdContext):
        pass


    # Enter a parse tree produced by GlacierParser#localId.
    def enterLocalId(self, ctx:GlacierParser.LocalIdContext):
        pass

    # Exit a parse tree produced by GlacierParser#localId.
    def exitLocalId(self, ctx:GlacierParser.LocalIdContext):
        pass


    # Enter a parse tree produced by GlacierParser#typeId.
    def enterTypeId(self, ctx:GlacierParser.TypeIdContext):
        pass

    # Exit a parse tree produced by GlacierParser#typeId.
    def exitTypeId(self, ctx:GlacierParser.TypeIdContext):
        pass


    # Enter a parse tree produced by GlacierParser#realNumber.
    def enterRealNumber(self, ctx:GlacierParser.RealNumberContext):
        pass

    # Exit a parse tree produced by GlacierParser#realNumber.
    def exitRealNumber(self, ctx:GlacierParser.RealNumberContext):
        pass



del GlacierParser