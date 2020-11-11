grammar glacier;

item
    : operator
    | definition
    ;

WS : [ \t\r\n;]+ -> skip ;

operator
    : 'operator' globalId ':' type
    ;

definition
    : 'def' globalId ( '(' localId ':' type ')' )* '->' type '{' expr '}'
    ;

expr
    : localId
    |  realNumber
    | 'True'
    | 'False'
    | expr '(' (expr (',' expr)*)? ')'
    | 'let' localId (':' type )?'=' expr ('in' expr)?
    | '(' type ')' expr
    | expr binOp expr
    | unaryOp expr
    | '(' (expr (',' expr)*)?')'
    | expr '[' Number ']'
    | '[' expr ( ',' expr)* ']'
    | 'if' expr 'then' expr 'else' expr
    | 'Zero' type
    | 'Grad' expr
    | 'Ref' expr
    | '!' expr
    | expr ':=' expr
    ;

binOp
    : '+'
    | '-'
    | '*'
    | '/'
    | '!='
    | '='
    | '<'
    | '<='
    | '>'
    | '>='
    ;

unaryOp
    : '-'
    | 'sq'
    ;

type
    :  baseType
    |  shape
    | 'Tensor' '(' type ',' type ')'
    |  type '->' type
    |  typeId
    |  'forall' '(' typeId ':' kind ')' ',' type
    |  'refType' '(' type ')' 
    |  '(' (type (',' type )*)? ')'
    ;

baseType
    : 'IntType'  '(' Number ')'
    | 'UIntType' '(' Number ')'
    | 'FloatType' '(' Number ')'
    | 'BoolType'
    ;

shape
    : 'Shape' '(' (Number (',' Number)*)? ')'
    ;

kind 
    : 'BaseType'
    | 'Shape'
    | 'Type'
    ;

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

IdentifierNondigit
    :   Nondigit
    |   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

Nondigit
    :   [a-zA-Z_]
    ;

Digit
    :   [0-9]
    ;

UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

HexadecimalDigit
    :   [0-9a-fA-F]
    ;

globalId
    : '@' Identifier
    ;

localId
    : '%' Identifier
    ;

typeId
    : Nondigit
    ;

Number
    : '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'
    ;
    

realNumber
  : ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+;








