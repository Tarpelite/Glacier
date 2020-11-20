grammar Glacier;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
program: (func|expr)*;

func: 'def' name  '::' params*  '{' expr? '}';


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
    ;

unaryOp: '-'
    |'fold'
    |'unfold'
    |'map'
    |'tail'
    |'filter'
    ;

name: VAR;

params: name ':' typeG ('->' name ':' typeG)*;

typeG: basetypeG
| shape
| 'Tensor' '(' INT (',' INT)* ')'
| typeG '->' typeG
| '(' (typeG ('->' typeG)*)? ')'
;

basetypeG: 'Int' '(' INT ')'
    | 'UInt' '(' INT ')'
    | 'Float' '(' INT ')'
    | 'Bool'
    ;

shape: 
    'Shape' '(' (INT (','INT)*)? ')';

VAR: [a-zA-Z]+;

INT: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+;

SPACESL: ' '+;
FLOAT: INT '.' INT;

args: (SPACESL VAR|INT)+ ;