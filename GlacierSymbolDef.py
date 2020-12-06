from GlacierListener import GlacierListener
from SymbolScope import *
from antlr4 import *
import names
from random import randint
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a listener for symbol table construction
class GlacierSymbolDef(GlacierListener):
    def __init__(self):
        self.globals = None
        self.currentScope = None
        self.scopes = {}
        self.return_type = {}
        pass 

    # Enter a parse tree produced by GlacierParser#program.
    def enterProgram(self, ctx:GlacierParser.ProgramContext):
        self.globals = GlobalScope(None)
        self.currentScope = self.globals
        self.scopes = {}

    # Exit a parse tree produced by GlacierParser#program.
    def exitProgram(self, ctx:GlacierParser.ProgramContext):
        print(self.globals)
        pass

    # Enter a parse tree produced by GlacierParser#func.
    def enterFunc(self, ctx:GlacierParser.FuncContext):
        # import ipdb; ipdb.set_trace()
        name = ctx.name().getText()
        # stype = ctx.params()[0].param()[-1].typeG().getText()
        function = FunctionSymbol(name, None, self.currentScope)
        self.currentScope.define(function)
        self.scopes[ctx] = function
        self.currentScope = function
        pass

    # Exit a parse tree produced by GlacierParser#func.
    def exitFunc(self, ctx:GlacierParser.FuncContext):
        stype = self.return_type[ctx.params()[0]]
        self.currentScope.type = stype
        print(self.currentScope)
        self.currentScope = self.currentScope.getEnclosingScope()
        pass

    # Enter a parse tree produced by GlacierParser#params.
    def enterParams(self, ctx:GlacierParser.ParamsContext):
        pass

    # Exit a parse tree produced by GlacierParser#params.
    def exitParams(self, ctx:GlacierParser.ParamsContext):
        # TODO replace with structured type
        self.return_type[ctx] = ctx.param()[-1].typeG().getText() if ctx.param()[-1].typeG() else None


    # Exit a parse tree produced by GlacierParser#param.
    def exitParam(self, ctx):
        stype = ctx.typeG().getText() if ctx.typeG() is not None else None
        name = ctx.VAR().getText() if ctx.VAR() is not None else self.get_rondom_name()
        var = VariableSymbol(name, stype)
        self.currentScope.define(var)
        pass

    def get_rondom_name(self):
        return 'r_' + names.get_last_name()