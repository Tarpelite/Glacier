# Generated from Glacier.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a complete generic visitor for a parse tree produced by GlacierParser.

class GlacierVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GlacierParser#program.
    def visitProgram(self, ctx:GlacierParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#func.
    def visitFunc(self, ctx:GlacierParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#typeConstraint.
    def visitTypeConstraint(self, ctx:GlacierParser.TypeConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#expr.
    def visitExpr(self, ctx:GlacierParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#basicOp.
    def visitBasicOp(self, ctx:GlacierParser.BasicOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#basicFn.
    def visitBasicFn(self, ctx:GlacierParser.BasicFnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#binOp.
    def visitBinOp(self, ctx:GlacierParser.BinOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#unaryOp.
    def visitUnaryOp(self, ctx:GlacierParser.UnaryOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#name.
    def visitName(self, ctx:GlacierParser.NameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#param.
    def visitParam(self, ctx:GlacierParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#listG.
    def visitListG(self, ctx:GlacierParser.ListGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#tupleG.
    def visitTupleG(self, ctx:GlacierParser.TupleGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#params.
    def visitParams(self, ctx:GlacierParser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#typeG.
    def visitTypeG(self, ctx:GlacierParser.TypeGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#customType.
    def visitCustomType(self, ctx:GlacierParser.CustomTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#basetypeG.
    def visitBasetypeG(self, ctx:GlacierParser.BasetypeGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#shape.
    def visitShape(self, ctx:GlacierParser.ShapeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#args.
    def visitArgs(self, ctx:GlacierParser.ArgsContext):
        return self.visitChildren(ctx)



del GlacierParser