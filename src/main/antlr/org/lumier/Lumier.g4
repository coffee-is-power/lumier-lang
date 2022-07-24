grammar Lumier;

@header {
package org.lumier;
}
compilationUnit: function*;
function:
    FUNCTION_KEYWORD function_signature
    block;
function_signature: IDENTIFIER parameters ('--' return_types)?;
parameters: type*;
return_types: type*;
type: IDENTIFIER | array_type;
array_type : '[' IDENTIFIER ']';
END_KEYWORD : 'end';
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment DIGIT : [0-9] ;
FUNCTION_KEYWORD : 'function';
IDENTIFIER : (LOWERCASE | UPPERCASE | '_' ) (LOWERCASE | UPPERCASE | '_' | DIGIT)+ ;
STRING : '"' .*? '"';
block : statement* END_KEYWORD;
statement: push_value_statement | method_call | operation;
push_value_statement: expr;
method_call: IDENTIFIER;
operation:
   '+' #add
 | '-' #sub
 | '*' #mul
 | '/' #div
 | '%' #mod
 | '^' #pow;
NUMBER: DIGIT+;
expr: STRING | NUMBER;
N : ('\n' | '\r\n')+ -> skip;
WS : (' ' | '\t')+ -> skip;