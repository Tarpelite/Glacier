import sys
from antlr4 import *
from glacierLexer import GlacierLexer
from glacierParser import GlacierParser
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = GlacierLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GlacierParser(stream)
    tree = parser.module()
    print(type(tree))
    print(tree.toStringTree())
 
if __name__ == '__main__':
    main(sys.argv)
