grammar Glacier;

item
    : operator
    | definition
    ;

WS : [ \t\r\n;]+ -> skip ;

operator
    : 'operator' globalId ':' typeG
    ;

definition
    : 'def' globalId ( '(' localId ':' typeG ')' )* '->' typeG '{' expr '}'
    ;

encodingRNN
    : 'unfold' Identifier Identifier;

expr
    : localId
    |  realNumber
    | 'True'
    | 'False'
    | expr '(' (expr (',' expr)*)? ')'
    | 'let' localId (':' typeG )?'=' expr ('in' expr)?
    | '(' typeG ')' expr
    | expr binOp expr
    | unaryOp expr
    | '(' (expr (',' expr)*)?')'
    | expr '[' Number ']'
    | '[' expr ( ',' expr)* ']'
    | 'if' expr 'then' expr 'else' expr
    | 'Zero' typeG
    | 'Grad' expr
    | 'Ref' expr
    | '!' expr
    | expr ':=' expr
    | encodingRNN
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

typeG
    :  baseType
    |  shape
    | 'Tensor' '(' typeG ',' typeG ')'
    |  typeG '->' typeG
    |  typeId
    |  'forall' '(' typeId ':' kind ')' ',' typeG
    |  'refType' '(' typeG ')' 
    |  '(' (typeG (',' typeG )*)? ')'
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



