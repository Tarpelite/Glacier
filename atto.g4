grammar atto;

WS: [\t\r\n] -> skip;

func: 'fn' SPACESL name args? SPACESL 'is' SPACESL expr;
expr: 
    | 'if' SPACESL expr SPACESL expr SPACESL expr
    | 'head' SPACESL expr
    | 'tail' SPACESL expr
    | '+' SPACESL expr SPACESL expr
    | '-' SPACESL expr SPACESL expr
    | '=' SPACESL expr SPACESL expr
    | '*' SPACESL expr SPACESL expr
    | name
;

name: VAR;

VAR: [a-zA-Z0-9]+;
INT: [0-9]+;
SPACESL: ' '+;

args: (SPACESL VAR|INT)+ ;