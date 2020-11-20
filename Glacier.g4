grammar Glacier;

/* Skips */
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

/* programs */

program: form*;

form : definition | expr;

/* Definitions */

definition: var_def
        | syntax_def
        | '(' 'begin'  definition* ')'
        | '(' 'let' '(' syntax_binding* ')' definition* ')'
        | '(' 'letrec' '(' syntax_binding* ')' definition* ')' 
        ;
var_def: '(' 'define' var expr ')'
        | '(' 'define' '(' var var* ')' body ')'
        | '(' 'define' '(' var var* '.' var ')' body ')'
        ;

var : idG;
body: definition* expr+;
syntax_def: '(' 'define-syntax' keyword expr ')';
keyword: idG;
syntax_binding: '(' keyword expr ')';

/* Expressions */

expr: cons
    | var
    | '(' 'quote' datum ')' | '\'' datum
    | '(' 'lambda' formals body ')'
    | '(' 'if' expr ' '+ expr ' '+ expr')' | '(' 'if' ' '+ expr ' '+ expr ')'
    | '(' 'set' '!' var expr ')'
    | application
    | '(' 'let' '(' syntax_binding* ')' expr+ ')'
    | '(' 'letrec' '(' syntax_binding* ')' expr+ ')'
    ;
cons: booleanG | number | character | string;
formals: var | '(' var* ')' | '('var+ '.' var')';
application: '(' expr (' '+ expr)* ')';

/* idGentifiers */
idG: initial subsequent*|'+'|'-'|'...';
initial: LETTER | '!' | '$' | '&' | '*' | '/' | ':' | '<' | '='| '>' | '?' | '~' | '_' | '^';
subsequent: initial | DIGIT | '.' | '+' | '-';
LETTER : [a-z];
DIGIT: [0-9];

/* Data */
datum: booleanG | number | character | string | symbol | listG | vector;
booleanG: '#t' | '#f';
number:  '@'(real | real '@' real
        | real '+' imag | real '-' imag
        | '+' imag | '-' imag) ;
character: '#' any_character ;
string: '"' any_character* '"';
symbol: idG ;
listG: '(' datum* ')' | '(' datum+ '.' datum ')' | abbr;
abbr: '\'' datum | '`' datum | ',' datum | ',@' datum;
vector: '#' '(' datum* ')';


/* Numbers */
imag: 'i' | ureal 'i';
real:  sign? ureal;
ureal: uinteger | decimal;
uinteger: DIGIT+ '#'*;

decimal: uinteger exponent
    | '.' DIGIT+ '#'* suffix?
    | DIGIT+ '.' DIGIT* '#' suffix?
    | DIGIT+ '#' + '.' '#' suffix?
    ;

suffix: exponent;
exponent: exponent_marker sign? DIGIT+;
exponent_marker: 'e' | 's' | 'f' | 'd' | 'l';
sign: '+' | '-';

any_character: decimal | LETTER | LARGE
            | DIGIT | ',' | ';' | '(' | ')'
              | '[' | ']' | '`' | '"';

LARGE: [A-Z];