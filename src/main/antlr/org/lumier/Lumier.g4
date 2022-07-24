grammar Lumier;

@header {
package org.lumier;
}
compilationUnit: function*;
function:
    FUNCTION_KEYWORD function_signature
    block;
function_signature: IDENTIFIER parameters ('--' return_types)? 'in';
parameters: type*;
return_types: type*;
type: IDENTIFIER;
END_KEYWORD : 'end';
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment DIGIT : [0-9] ;
FUNCTION_KEYWORD : 'function';
IDENTIFIER : (LOWERCASE | UPPERCASE | '_' ) (LOWERCASE | UPPERCASE | '_' | DIGIT)+ ;
STRING : '"' .*? '"';
if_block: 'if' block (else_block)?;
else_block: 'else' block;
block : statement* END_KEYWORD;
statement: if_block|push_value_statement | function_call | operation;
push_value_statement: expr;
function_call: IDENTIFIER;
operation:
   '+' #add
 | '-' #sub
 | '*' #mul
 | '/' #div
 | '%' #mod
 | '^' #pow
 | '=' #equals;
NUMBER: DIGIT+;
expr: STRING | NUMBER;
N : ('\n' | '\r\n')+ -> skip;
WS : (' ' | '\t')+ -> skip;