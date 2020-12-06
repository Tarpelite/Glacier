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


    # Enter a parse tree produced by GlacierParser#Condition.
    def enterCondition(self, ctx:GlacierParser.ConditionContext):
        pass

    # Exit a parse tree produced by GlacierParser#Condition.
    def exitCondition(self, ctx:GlacierParser.ConditionContext):
        pass


    # Enter a parse tree produced by GlacierParser#Fold.
    def enterFold(self, ctx:GlacierParser.FoldContext):
        pass

    # Exit a parse tree produced by GlacierParser#Fold.
    def exitFold(self, ctx:GlacierParser.FoldContext):
        pass


    # Enter a parse tree produced by GlacierParser#EName.
    def enterEName(self, ctx:GlacierParser.ENameContext):
        pass

    # Exit a parse tree produced by GlacierParser#EName.
    def exitEName(self, ctx:GlacierParser.ENameContext):
        pass


    # Enter a parse tree produced by GlacierParser#Comment.
    def enterComment(self, ctx:GlacierParser.CommentContext):
        pass

    # Exit a parse tree produced by GlacierParser#Comment.
    def exitComment(self, ctx:GlacierParser.CommentContext):
        pass


    # Enter a parse tree produced by GlacierParser#Call.
    def enterCall(self, ctx:GlacierParser.CallContext):
        pass

    # Exit a parse tree produced by GlacierParser#Call.
    def exitCall(self, ctx:GlacierParser.CallContext):
        pass


    # Enter a parse tree produced by GlacierParser#Zero.
    def enterZero(self, ctx:GlacierParser.ZeroContext):
        pass

    # Exit a parse tree produced by GlacierParser#Zero.
    def exitZero(self, ctx:GlacierParser.ZeroContext):
        pass


    # Enter a parse tree produced by GlacierParser#Convert.
    def enterConvert(self, ctx:GlacierParser.ConvertContext):
        pass

    # Exit a parse tree produced by GlacierParser#Convert.
    def exitConvert(self, ctx:GlacierParser.ConvertContext):
        pass


    # Enter a parse tree produced by GlacierParser#EBoolean.
    def enterEBoolean(self, ctx:GlacierParser.EBooleanContext):
        pass

    # Exit a parse tree produced by GlacierParser#EBoolean.
    def exitEBoolean(self, ctx:GlacierParser.EBooleanContext):
        pass


    # Enter a parse tree produced by GlacierParser#Bexpr.
    def enterBexpr(self, ctx:GlacierParser.BexprContext):
        pass

    # Exit a parse tree produced by GlacierParser#Bexpr.
    def exitBexpr(self, ctx:GlacierParser.BexprContext):
        pass


    # Enter a parse tree produced by GlacierParser#EInt.
    def enterEInt(self, ctx:GlacierParser.EIntContext):
        pass

    # Exit a parse tree produced by GlacierParser#EInt.
    def exitEInt(self, ctx:GlacierParser.EIntContext):
        pass


    # Enter a parse tree produced by GlacierParser#Subscript.
    def enterSubscript(self, ctx:GlacierParser.SubscriptContext):
        pass

    # Exit a parse tree produced by GlacierParser#Subscript.
    def exitSubscript(self, ctx:GlacierParser.SubscriptContext):
        pass


    # Enter a parse tree produced by GlacierParser#Grad.
    def enterGrad(self, ctx:GlacierParser.GradContext):
        pass

    # Exit a parse tree produced by GlacierParser#Grad.
    def exitGrad(self, ctx:GlacierParser.GradContext):
        pass


    # Enter a parse tree produced by GlacierParser#Unfold.
    def enterUnfold(self, ctx:GlacierParser.UnfoldContext):
        pass

    # Exit a parse tree produced by GlacierParser#Unfold.
    def exitUnfold(self, ctx:GlacierParser.UnfoldContext):
        pass


    # Enter a parse tree produced by GlacierParser#Assignment.
    def enterAssignment(self, ctx:GlacierParser.AssignmentContext):
        pass

    # Exit a parse tree produced by GlacierParser#Assignment.
    def exitAssignment(self, ctx:GlacierParser.AssignmentContext):
        pass


    # Enter a parse tree produced by GlacierParser#Ref.
    def enterRef(self, ctx:GlacierParser.RefContext):
        pass

    # Exit a parse tree produced by GlacierParser#Ref.
    def exitRef(self, ctx:GlacierParser.RefContext):
        pass


    # Enter a parse tree produced by GlacierParser#Primitive.
    def enterPrimitive(self, ctx:GlacierParser.PrimitiveContext):
        pass

    # Exit a parse tree produced by GlacierParser#Primitive.
    def exitPrimitive(self, ctx:GlacierParser.PrimitiveContext):
        pass


    # Enter a parse tree produced by GlacierParser#EList.
    def enterEList(self, ctx:GlacierParser.EListContext):
        pass

    # Exit a parse tree produced by GlacierParser#EList.
    def exitEList(self, ctx:GlacierParser.EListContext):
        pass


    # Enter a parse tree produced by GlacierParser#Replicate.
    def enterReplicate(self, ctx:GlacierParser.ReplicateContext):
        pass

    # Exit a parse tree produced by GlacierParser#Replicate.
    def exitReplicate(self, ctx:GlacierParser.ReplicateContext):
        pass


    # Enter a parse tree produced by GlacierParser#Uexpr.
    def enterUexpr(self, ctx:GlacierParser.UexprContext):
        pass

    # Exit a parse tree produced by GlacierParser#Uexpr.
    def exitUexpr(self, ctx:GlacierParser.UexprContext):
        pass


    # Enter a parse tree produced by GlacierParser#ETuple.
    def enterETuple(self, ctx:GlacierParser.ETupleContext):
        pass

    # Exit a parse tree produced by GlacierParser#ETuple.
    def exitETuple(self, ctx:GlacierParser.ETupleContext):
        pass


    # Enter a parse tree produced by GlacierParser#Let.
    def enterLet(self, ctx:GlacierParser.LetContext):
        pass

    # Exit a parse tree produced by GlacierParser#Let.
    def exitLet(self, ctx:GlacierParser.LetContext):
        pass


    # Enter a parse tree produced by GlacierParser#EFloat.
    def enterEFloat(self, ctx:GlacierParser.EFloatContext):
        pass

    # Exit a parse tree produced by GlacierParser#EFloat.
    def exitEFloat(self, ctx:GlacierParser.EFloatContext):
        pass


    # Enter a parse tree produced by GlacierParser#primitiveOp.
    def enterPrimitiveOp(self, ctx:GlacierParser.PrimitiveOpContext):
        pass

    # Exit a parse tree produced by GlacierParser#primitiveOp.
    def exitPrimitiveOp(self, ctx:GlacierParser.PrimitiveOpContext):
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