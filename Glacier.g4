grammar Glacier;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
program: (func|expr)*;

func: 'def' name  '::' (typeConstraint '=>')? params*  '{' (expr| func)* '}';


typeConstraint: '(' name (',' name)* ')';

expr: name
    | INT
    | FLOAT
    | 'True'
    | 'False'
    | expr '(' (expr (',' expr)*)? ')'
    | 'let' name (':' typeG)? '=' expr ('in' expr)?
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
    | 'foldl' '(' func | expr ',' expr ',' expr ')'
    | basicOp expr
    ;


basicOp: '@' basicFn;

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

customType:
name;

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

args: (SPACESL VAR|INT)+ ;
