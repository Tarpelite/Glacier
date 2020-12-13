from GlacierVisitor import GlacierVisitor
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

class GlacierSymbolVisitor(GlacierVisitor):
    def __init__(self):
        pass

    # Visit a parse tree produced by GlacierParser#program.
    def visitProgram(self, ctx:GlacierParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#func.
    def visitFunc(self, ctx:GlacierParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#typeConstraint.
    def visitTypeConstraint(self, ctx:GlacierParser.TypeConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Condition.
    def visitCondition(self, ctx:GlacierParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Fold.
    def visitFold(self, ctx:GlacierParser.FoldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#EName.
    def visitEName(self, ctx:GlacierParser.ENameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Call.
    def visitCall(self, ctx:GlacierParser.CallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Zero.
    def visitZero(self, ctx:GlacierParser.ZeroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Convert.
    def visitConvert(self, ctx:GlacierParser.ConvertContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#EBoolean.
    def visitEBoolean(self, ctx:GlacierParser.EBooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Bexpr.
    def visitBexpr(self, ctx:GlacierParser.BexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#EInt.
    def visitEInt(self, ctx:GlacierParser.EIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Subscript.
    def visitSubscript(self, ctx:GlacierParser.SubscriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Grad.
    def visitGrad(self, ctx:GlacierParser.GradContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Match.
    def visitMatch(self, ctx:GlacierParser.MatchContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Unfold.
    def visitUnfold(self, ctx:GlacierParser.UnfoldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Assignment.
    def visitAssignment(self, ctx:GlacierParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Ref.
    def visitRef(self, ctx:GlacierParser.RefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Primitive.
    def visitPrimitive(self, ctx:GlacierParser.PrimitiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#EList.
    def visitEList(self, ctx:GlacierParser.EListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Replicate.
    def visitReplicate(self, ctx:GlacierParser.ReplicateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Uexpr.
    def visitUexpr(self, ctx:GlacierParser.UexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#ETuple.
    def visitETuple(self, ctx:GlacierParser.ETupleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Let.
    def visitLet(self, ctx:GlacierParser.LetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#EFloat.
    def visitEFloat(self, ctx:GlacierParser.EFloatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#Lambda.
    def visitLambda(self, ctx:GlacierParser.LambdaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#block.
    def visitBlock(self, ctx:GlacierParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#caseBlock.
    def visitCaseBlock(self, ctx:GlacierParser.CaseBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GlacierParser#primitiveOp.
    def visitPrimitiveOp(self, ctx:GlacierParser.PrimitiveOpContext):
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

