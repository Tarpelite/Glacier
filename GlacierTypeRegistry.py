from GlacierListener import GlacierListener
from SymbolScope import *
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GlacierParser import GlacierParser
else:
    from GlacierParser import GlacierParser

# This class defines a listener for symbol table construction
class GlacierSymbolDef(GlacierListener):
    def __init__(self):
        self.globals = None
        self.currentScope = None
        self.typetree = {}
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
        import ipdb; ipdb.set_trace()
        name = ctx.name().getText()
        stype = ctx.params()[0].param()[-1].typeG().getText()
        pass

    # Exit a parse tree produced by GlacierParser#func.
    def exitFunc(self, ctx:GlacierParser.FuncContext):
        pass

    # Enter a parse tree produced by GlacierParser#params.
    def enterParams(self, ctx:GlacierParser.ParamsContext):
        pass

    # Exit a parse tree produced by GlacierParser#params.
    def exitParams(self, ctx:GlacierParser.ParamsContext):
        pass