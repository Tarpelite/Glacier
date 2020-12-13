from GlacierListener import GlacierListener
from SymbolScope import *
from antlr4 import *
import antlr4
import names
from random import randint
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a listener for translation to python code
class GlacierTranslator(GlacierListener):
    def __init__(self, scopes, target_filename = "output.py"):
        self.target = []
        self.scopes = scopes
        self.target_filename = target_filename
        self.INDENT = "    "
        self.indent_cnt = 0
        pass 

    def append_to_target(self, lines):
        for line in lines:
            self.target.append(self.indent_cnt * self.INDENT + line + "\n")

    # Enter a parse tree produced by GlacierParser#program.
    def enterProgram(self, ctx:GlacierParser.ProgramContext):
        program_header = []
        program_header.append("import torch")
        program_header.append("import torch.nn as nn")
        program_header.append("import torch.nn.functional as F")
        program_header.append("from predefine import *")
        program_header.append("")
        self.append_to_target(program_header)
        children = list(ctx.getChildren())
        children.reverse()
        for child in children:
            if not isinstance(child, GlacierParser.FuncContext):
                child.is_top_expression = True

    # Exit a parse tree produced by GlacierParser#program.
    def exitProgram(self, ctx:GlacierParser.ProgramContext):
        with open(self.target_filename,'w') as fout:
            fout.writelines(self.target)

    # Enter a parse tree produced by GlacierParser#func.
    def enterFunc(self, ctx:GlacierParser.FuncContext):
        func_scope = self.scopes[ctx]
        # import ipdb; ipdb.set_trace()
        arg_list = ", ".join(list(func_scope.arguments.keys())[:-1])
        func_header = f"def {func_scope.name}({arg_list}):"
        self.append_to_target([func_header])
        self.indent_cnt += 1
        # reverse child list to tagging terminal expression & ignore the last terminal node '}'
        children = list(ctx.getChildren())
        children.reverse()
        children = children[1:]
        code_stack = []
        ctx.last_expr = None
        for child in children:
            if isinstance(child, antlr4.tree.Tree.TerminalNodeImpl):
                break
            if not isinstance(child, GlacierParser.FuncContext):
                child.is_top_expression = True
            if ctx.last_expr is None:
                ctx.last_expr = child
        

    # Exit a parse tree produced by GlacierParser#func.
    def exitFunc(self, ctx:GlacierParser.FuncContext):
        # import ipdb; ipdb.set_trace()
        final_code = []
        return_name = "None"
        if ctx.last_expr is not None:
            if isinstance(ctx.last_expr, GlacierParser.AssignmentContext):
                return_name = ctx.last_expr.expr(0).target_code
            elif isinstance(ctx.last_expr, GlacierParser.LetContext):
                return_name = ctx.last_expr.name().getText()
            elif isinstance(ctx.last_expr, GlacierParser.FuncContext):
                return_name = ctx.last_expr.name().getText()
            if return_name is not "None":
                final_code.append(f"return {return_name}")
            else:
                final_code.append("return " + self.target[-1].strip())
                self.target.pop()
        else:
            final_code.append("pass")
        final_code.append("")
        self.append_to_target(final_code)
        self.indent_cnt -= 1

    # Enter a parse tree produced by GlacierParser#params.
    def enterParams(self, ctx:GlacierParser.ParamsContext):
        pass

    # Exit a parse tree produced by GlacierParser#params.
    def exitParams(self, ctx:GlacierParser.ParamsContext):
        # TODO replace with structured type
        # self.return_type[ctx] = ctx.param()[-1].typeG().getText() if ctx.param()[-1].typeG() else None
        pass


    # Exit a parse tree produced by GlacierParser#param.
    def exitParam(self, ctx):
        # stype = ctx.typeG().getText() if ctx.typeG() is not None else None
        # name = ctx.VAR().getText() if ctx.VAR() is not None else self.get_rondom_name()
        # var = VariableSymbol(name, stype)
        # self.currentScope.define(var)
        pass

    # Enter a parse tree produced by GlacierParser#EInt.
    def enterEInt(self, ctx:GlacierParser.EIntContext):
        pass

    # Exit a parse tree produced by GlacierParser#EInt.
    def exitEInt(self, ctx:GlacierParser.EIntContext):
        ctx.target_code = f"{ctx.INT().getText()}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Subscript.
    def enterSubscript(self, ctx:GlacierParser.SubscriptContext):
        pass

    # Exit a parse tree produced by GlacierParser#Subscript.
    def exitSubscript(self, ctx:GlacierParser.SubscriptContext):
        ctx.target_code = f"{ctx.expr()[0].target_code}[{ctx.expr()[1].target_code}]"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Grad.
    def enterGrad(self, ctx:GlacierParser.GradContext):
        pass

    # Exit a parse tree produced by GlacierParser#Grad.
    def exitGrad(self, ctx:GlacierParser.GradContext):
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Match.
    def enterMatch(self, ctx:GlacierParser.MatchContext):
        pass

    # Exit a parse tree produced by GlacierParser#Match.
    def exitMatch(self, ctx:GlacierParser.MatchContext):
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Unfold.
    def enterUnfold(self, ctx:GlacierParser.UnfoldContext):
        pass

    # Exit a parse tree produced by GlacierParser#Unfold.
    def exitUnfold(self, ctx:GlacierParser.UnfoldContext):
        ctx.target_code = f"unfoldr{ctx.expr().target_code}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Fold.
    def enterFold(self, ctx:GlacierParser.FoldContext):
        pass

    # Exit a parse tree produced by GlacierParser#Fold.
    def exitFold(self, ctx:GlacierParser.FoldContext):
        ctx.target_code = f"foldl({ctx.expr(0).target_code}, {ctx.expr(1).target_code}, {ctx.expr(2).target_code})"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Assignment.
    def enterAssignment(self, ctx:GlacierParser.AssignmentContext):
        pass

    # Exit a parse tree produced by GlacierParser#Assignment.
    def exitAssignment(self, ctx:GlacierParser.AssignmentContext):
        ctx.target_code = f"{ctx.expr(0).target_code} = {ctx.expr(1).target_code}"
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Ref.
    def enterRef(self, ctx:GlacierParser.RefContext):
        pass

    # Exit a parse tree produced by GlacierParser#Ref.
    def exitRef(self, ctx:GlacierParser.RefContext):
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Primitive.
    def enterPrimitive(self, ctx:GlacierParser.PrimitiveContext):
        pass

    # Exit a parse tree produced by GlacierParser#Primitive.
    def exitPrimitive(self, ctx:GlacierParser.PrimitiveContext):
        ctx.target_code = f"F.{ctx.primitiveOp().basicFn().getText()}({ctx.expr().target_code})"
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#EList.
    def enterEList(self, ctx:GlacierParser.EListContext):
        pass

    # Exit a parse tree produced by GlacierParser#EList.
    def exitEList(self, ctx:GlacierParser.EListContext):
        elements = [exp.target_code for exp in ctx.expr()]
        elements = ', '.join(elements)
        # import ipdb; ipdb.set_trace()
        ctx.target_code = f"[{elements}]"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Replicate.
    def enterReplicate(self, ctx:GlacierParser.ReplicateContext):
        pass

    # Exit a parse tree produced by GlacierParser#Replicate.
    def exitReplicate(self, ctx:GlacierParser.ReplicateContext):
        ctx.target_code = f"replicate{ctx.expr().target_code}"
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Uexpr.
    def enterUexpr(self, ctx:GlacierParser.UexprContext):
        pass

    # Exit a parse tree produced by GlacierParser#Uexpr.
    def exitUexpr(self, ctx:GlacierParser.UexprContext):
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#ETuple.
    def enterETuple(self, ctx:GlacierParser.ETupleContext):
        pass

    # Exit a parse tree produced by GlacierParser#ETuple.
    def exitETuple(self, ctx:GlacierParser.ETupleContext):
        elements = [exp.target_code for exp in ctx.expr()]
        elements = ', '.join(elements)
        # import ipdb; ipdb.set_trace()
        ctx.target_code = f"({elements})"
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#Let.
    def enterLet(self, ctx:GlacierParser.LetContext):
        pass

    # Exit a parse tree produced by GlacierParser#Let.
    def exitLet(self, ctx:GlacierParser.LetContext):
        ctx.target_code = f"{ctx.name().getText()} = {ctx.expr(0).target_code}"
        self.exitExpr(ctx)


    # Enter a parse tree produced by GlacierParser#EFloat.
    def enterEFloat(self, ctx:GlacierParser.EFloatContext):
        pass

    # Exit a parse tree produced by GlacierParser#EFloat.
    def exitEFloat(self, ctx:GlacierParser.EFloatContext):
        ctx.target_code = f"{ctx.FLOAT().getText()}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#EBoolean.
    def enterEBoolean(self, ctx:GlacierParser.EBooleanContext):
        pass

    # Exit a parse tree produced by GlacierParser#EBoolean.
    def exitEBoolean(self, ctx:GlacierParser.EBooleanContext):
        ctx.target_code = f"{ctx.BOOLEAN().getText()}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Lambda.
    def enterLambda(self, ctx:GlacierParser.LambdaContext):
        pass

    # Exit a parse tree produced by GlacierParser#Lambda.
    def exitLambda(self, ctx:GlacierParser.LambdaContext):
        # import ipdb; ipdb.set_trace()
        ctx.target_code = f"lambda {ctx.expr(0).target_code[1:-1]}: {ctx.expr(1).target_code}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#EName.
    def enterEName(self, ctx:GlacierParser.ENameContext):
        pass

    # Exit a parse tree produced by GlacierParser#EName.
    def exitEName(self, ctx:GlacierParser.ENameContext):
        ctx.target_code = f"{ctx.name().getText()}"
        self.exitExpr(ctx)

    # Enter a parse tree produced by GlacierParser#Bexpr.
    def enterBexpr(self, ctx:GlacierParser.BexprContext):
        pass

    # Exit a parse tree produced by GlacierParser#Bexpr.
    def exitBexpr(self, ctx:GlacierParser.BexprContext):
        ctx.target_code = f"{ctx.expr(0).target_code} {ctx.binOp().getText()} {ctx.expr(1).target_code}"
        self.exitExpr(ctx)
    
    # Enter a parse tree produced by GlacierParser#Call.
    def enterCall(self, ctx:GlacierParser.CallContext):
        pass

    # Exit a parse tree produced by GlacierParser#Call.
    def exitCall(self, ctx:GlacierParser.CallContext):
        args = [exp.target_code for exp in ctx.expr()[1:]]
        arg_code = ', '.join(args)
        # import ipdb; ipdb.set_trace()
        ctx.target_code = f"gpartial({ctx.expr(0).target_code}, {arg_code})"
        self.exitExpr(ctx)
        
    def exitExpr(self, ctx):
        if hasattr(ctx,"is_top_expression") and ctx.is_top_expression:
            self.append_to_target([ctx.target_code])


    def get_rondom_name(self):
        return 'r_' + names.get_last_name()