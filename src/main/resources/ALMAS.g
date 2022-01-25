grammar ALMAS;


/* 	PARSER */



program : (program_body)* EOF;
func_inputs : LEFT_P (primitive_type IDENTIFIER more_func_inputs?)?  RIGHT_P ;
program_body : statements | function ;


assignment : 
	STRING_TYPE IDENTIFIER string_assignment |
	DECIMAL_TYPE IDENTIFIER decimal_assignment |
	BOOLEAN_TYPE IDENTIFIER boolean_assignment ;
	
string_assignment: ASSIGNMENT_OP (STRING | function_call | string_cast | input | IDENTIFIER);
decimal_assignment: ASSIGNMENT_OP (decimal_expressions | function_call | decimal_cast | input | IDENTIFIER) ;
boolean_assignment: ASSIGNMENT_OP (BOOLEAN | expressions | function_call | boolean_cast |input | IDENTIFIER) ;

if_st :  bare_if elif? else_st? ;
bare_if: IF_SYMBOL LEFT_P expressions RIGHT_P CURLY_LEFT statements? CURLY_RIGHT ;
elif: ELSE_IF_SYMBOL LEFT_P expressions RIGHT_P CURLY_LEFT statements? CURLY_RIGHT elif? ;
else_st : ELSE_SYMBOL CURLY_LEFT statements? CURLY_RIGHT;

expressions:  expression ((BINARY_BOOLEAN_OP|EQUAL) expressions)?;
expression:  relop_expression | UNARY_OP* IDENTIFIER | UNARY_OP* BOOLEAN | UNARY_OP* LEFT_P expression RIGHT_P;
relop_expression:
	decimal_expressions RELATIONAL_OPERATOR decimal_expressions 
	| (decimal_expressions|STRING|BOOLEAN|IDENTIFIER) EQUAL (decimal_expressions|STRING|BOOLEAN| IDENTIFIER)
	| UNARY_OP* LEFT_P relop_expression RIGHT_P;

decimal_expressions: decimal_expression (BINARY_DECIMAL_OP decimal_expressions)?;
decimal_expression: (IDENTIFIER|DECIMAL) (BINARY_DECIMAL_OP (IDENTIFIER|DECIMAL))? | LEFT_P (IDENTIFIER|DECIMAL) (BINARY_DECIMAL_OP (IDENTIFIER|DECIMAL))? RIGHT_P ;

statements: (assignment | if_st | loop | function_call | print | input)+ ;
loop : FOR_SYMBOL LEFT_P IDENTIFIER COLON decimal_expressions? COLON decimal_expressions COLON decimal_expressions? RIGHT_P CURLY_LEFT loop_statements? CURLY_RIGHT ;
loop_statements: (statements | break_continue)+ ;
break_continue: CONTINUE_SYMBOL | BREAK_SYMBOL;

print: PRINT_OP LEFT_P (decimal_expressions|STRING|BOOLEAN|IDENTIFIER) RIGHT_P;
input: INPUT_OP LEFT_P (STRING|IDENTIFIER) RIGHT_P;

return_type : primitive_type | VOID_TYPE;
function : FUNCTION_SYMBOL return_type IDENTIFIER func_inputs CURLY_LEFT statements? return_st? CURLY_RIGHT;
		   
function_call : IDENTIFIER LEFT_P func_args? RIGHT_P;

more_func_inputs : COMMA primitive_type IDENTIFIER more_func_inputs? ;

return_st : RETURN_SYMBOL (IDENTIFIER|decimal_expressions|STRING|BOOLEAN|expressions);

func_args : (IDENTIFIER|decimal_expressions|STRING|BOOLEAN|expressions) more_func_args? ;

more_func_args : COMMA (IDENTIFIER|decimal_expressions|STRING|BOOLEAN|expressions) more_func_args?;

boolean_cast: BOOLEAN_CAST_SYMBOL LEFT_P IDENTIFIER RIGHT_P ; /* can be improved*/
decimal_cast: DECIMAL_CAST_SYMBOL LEFT_P IDENTIFIER RIGHT_P;
string_cast:  STRING_CAST_SYMBOL LEFT_P IDENTIFIER RIGHT_P;

primitive_type : STRING_TYPE | DECIMAL_TYPE | BOOLEAN_TYPE;


/*		 LEXER			 */




WS : ( ' ' | '\t' | '\r' | '\n') -> skip;



DECIMAL_TYPE: '#' ;
STRING_TYPE: '$';
BOOLEAN_TYPE: '?';
VOID_TYPE: '_';

ASSIGNMENT_OP: '=';
RELATIONAL_OPERATOR: '>' | '<' | '>=' | '<=';

fragment MUL: '*';
fragment DIV: '/';
fragment ADD: '+';
fragment SUB: '-';
fragment MOD: '%';
fragment INTEGER_DIV: '//';

fragment AND: '&' ;
fragment OR: '|' ;
fragment XOR: '^' ;

fragment NOT: '!' ;

EQUAL: 'is';

COMMA: ',';
COLON: ':';
CURLY_RIGHT: '}';
CURLY_LEFT: '{';
LEFT_P: '(';
RIGHT_P: ')';

PRINT_OP: '@print';
INPUT_OP: '@input';

BOOLEAN: 'yes' | 'no';
IF_SYMBOL: 'if';
ELSE_IF_SYMBOL: 'elif';
ELSE_SYMBOL: 'else';

FOR_SYMBOL: 'loop';
FUNCTION_SYMBOL: 'fn';
RETURN_SYMBOL: 'ret';
CONTINUE_SYMBOL: 'go';
BREAK_SYMBOL: 'break';

fragment SIGN : ADD | SUB ;
fragment NUMBER : ('0'..'9')+ ;
DECIMAL : SIGN? NUMBER | SIGN? NUMBER '.' NUMBER | SIGN? '.' NUMBER ;



BOOLEAN_CAST_SYMBOL: '@?';
STRING_CAST_SYMBOL: '@$';
DECIMAL_CAST_SYMBOL: '@#';

UNARY_OP: NOT;
BINARY_BOOLEAN_OP: AND | OR | XOR; 

BINARY_DECIMAL_OP: ADD | SUB | MUL | DIV | INTEGER_DIV | MOD ;

IDENTIFIER: ('a'..'z'|'A'..'Z') (NUMBER | 'a'..'z' | 'A'..'Z')*;

fragment STRING_LITERAL: '"' ;
STRING: STRING_LITERAL ANYCHAR* STRING_LITERAL;
fragment ANYCHAR: ~('"') ;
