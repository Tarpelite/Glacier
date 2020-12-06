grammar Glacier;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
program: (func|expr)*;

func: 'def' name  '::' (typeConstraint '=>')? params*  '{' (expr| func)* '}';


typeConstraint: '(' name (',' name)* ')';

expr: name                                              # EName
    | INT                                               # EInt
    | FLOAT                                             # EFloat
    | BOOLEAN                                           # EBoolean
    | expr '(' (expr (',' expr)*)? ')'                  # Call
    | 'let' name (':' typeG)? '=' expr ('in' expr)?     # Let
    | '(' typeG ')' expr                                # Convert
    | expr binOp expr                                   # Bexpr
    | unaryOp expr                                      # Uexpr
    | '(' (expr (',' expr)*)? ')'                       # ETuple
    | expr '[' INT ']'                                  # Subscript
    |'[' expr (',' expr)* ']'                           # EList
    | 'if' expr 'then' expr 'else' expr                 # Condition
    | 'Zero' expr                                       # Zero
    | 'Grad' expr                                       # Grad
    | 'Ref' expr                                        # Ref
    | expr ':=' expr                                    # Assignment
    |'\\' expr '->' expr                                # Comment
    | 'unfoldr' expr                                    # Unfold
    | 'replicate' expr                                  # Replicate
    | primitiveOp expr                                  # Primitive
    | 'foldl' '(' (func | expr) ',' expr ',' expr ')'   # Fold
    ;


primitiveOp: '@' basicFn;

basicFn:
    'relu'
    | 'softmax';

binOp: '+'
    | '-'
    | '*'
    |'/'
    |'!='
    |'='
    |'<'
    |'<='
    |'>='
    |'>'
    |'map'
    ;

unaryOp: '-'
    |'fold'
    |'unfold'
    |'map'
    |'tail'
    |'filter'
    | '!'
    ;

name: VAR;

param: (listG | tupleG | VAR) (':' typeG)?;

listG: '[' expr (',' expr)* ']';

tupleG: '(' expr (',' expr)* ')';

params: param ('->' param )*;

typeG: basetypeG
| shape
| 'Tensor' '(' basetypeG  (',' '(' INT (',' INT)* ')' )* ')'
| typeG '->' typeG
| '(' (typeG ('->' typeG)*)? ')'
| '['typeG (',' typeG)? ']'
| 'List' '[' name? ']'
| customType

;

customType: name;

basetypeG: 'Int' 
    | 'UInt'  
    | 'Float' 
    | 'Bool'
    | 'List'
    | 'Func'
    ;

shape: 
    'Shape' '(' (INT (','INT)*)? ')';

VAR: [a-zA-Z_] ([a-zA-Z_] | INT)*;

INT: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+;

SPACESL: ' '+;
FLOAT: INT '.' INT;
BOOLEAN: 'True' | 'False' ;
args: (SPACESL VAR|INT)+ ;
