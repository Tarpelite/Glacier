import sys
from antlr4 import *
from GlacierLexer import GlacierLexer
from GlacierParser import GlacierParser
from GlacierListener import GlacierListener

class GlacierPrintListener(GlacierListener):
    def enterUnfold(self, ctx):
        print("Enterhere: %s" % ctx.Identifier()[1].getText())

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = GlacierLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GlacierParser(stream)
    tree = parser.expr()
    printer = GlacierPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
 
if __name__ == '__main__':
    main(sys.argv)