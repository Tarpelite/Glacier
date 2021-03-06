import sys
from antlr4 import *
from GlacierLexer import GlacierLexer
from GlacierParser import GlacierParser
from GlacierVisitor import GlacierVisitor
from GlacierSymbolVisitor import GlacierSymbolVisitor
from GlacierSymbolDef import GlacierSymbolDef
from GlacierTranslator import GlacierTranslator

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = GlacierLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser  = GlacierParser(stream)
    tree = parser.program()

    visitor = GlacierSymbolVisitor()
    # import ipdb; ipdb.set_trace()
    visitor.visit(tree)
    defphase = GlacierSymbolDef()
    walker = ParseTreeWalker()
    walker.walk(defphase,tree)
    translator = GlacierTranslator(defphase.scopes)
    walker.walk(translator, tree)
    # import ipdb; ipdb.set_trace()


if __name__ == "__main__":
    main(sys.argv)
