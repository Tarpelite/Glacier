import sys
from antlr4 import *
from GlacierLexer import GlacierLexer
from GlacierParser import GlacierParser
from GlacierVisitor import GlacierVisitor

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = GlacierLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser  = GlacierParser(stream)
    tree = parser.program()

    visitor = GlacierVisitor()
    visitor.visit(tree)

if __name__ == "__main__":
    main(sys.argv)
