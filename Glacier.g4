grammar Glacier;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
program: (func|expr)*;

func: 'def' name  typeConstraint? '=>' params*  '{' expr? '}';

typeConstraint: '(' typeG name (',' name)* ')';

expr: name
    | INT
    | FLOAT
    | 'True'
    | 'False'
    | expr '(' (expr (',' expr)*)? ')'
    | 'let' name ':' typeG '=' expr ('in' expr)?
    | '(' typeG ')' expr
    | expr binOp expr
    | unaryOp expr
    | '(' (expr (',' expr)*)? ')'
    | expr '[' INT ']'
    |'[' expr (',' expr)* ']'
    | 'if' expr 'then' expr 'else' expr
    | 'Zero' expr
    | 'Grad' expr
    | 'Ref' expr
    | '!' expr
    | expr ':=' expr
    |'\\' expr '->' expr
    | 'unfoldr' expr 
    | 'replicate' expr
    | 'foldl' expr
    ;



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
    ;

name: VAR;

param: listG | tupleG | VAR;

listG: '[' expr (',' expr)* ']';

tupleG: '(' expr (',' expr)* ')';

params: param ('->' param )*;

typeG: basetypeG
| shape
| 'Tensor' '(' INT (',' INT)* ')'
| typeG '->' typeG
| '(' (typeG ('->' typeG)*)? ')'
;

basetypeG: 'Int' 
    | 'UInt' 
    | 'Float' 
    | 'Bool'
    ;

shape: 
    'Shape' '(' (INT (','INT)*)? ')';

VAR: [a-zA-Z]+;

INT: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+;

SPACESL: ' '+;
FLOAT: INT '.' INT;

args: (SPACESL VAR|INT)+ ;
