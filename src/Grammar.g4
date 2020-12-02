grammar Grammar;

start: (while_statement | whole_if | func | (expr NEW_LINE))* ;

while_statement: 'while' SPACE* while_cond SPACE* ':' NEW_LINE if_else_body ;
while_cond: expr_calc ;

if_statement: 'if ' SPACE* if_cond SPACE* ':' NEW_LINE if_else_body;
if_with_else_statement: if_statement else_statement;
else_statement: 'else' SPACE* ':' NEW_LINE if_else_body ;
if_else_body: (TAB if_else_line)+ ;
if_else_line: if_else_expr NEW_LINE ;
if_else_expr: if_else_assign
            | expr_calc
            | if_else_input
            | if_else_output
            ;
whole_if: if_with_else_statement
        | if_statement
        ;
if_cond: expr_calc ;

if_else_output: 'print(' SPACE* VAR SPACE* ')' ;
if_else_input: VAR SPACE* '=' SPACE* 'int(input())' ;
if_else_assign: VAR SPACE* '=' SPACE* expr_calc ;

func: func_def NEW_LINE func_body;

func_def: 'def ' func_name '(' func_args '):' ;
func_body: (TAB func_line)* TAB func_ret NEW_LINE ;
func_ret: 'return ' expr_calc ;
func_line: func_expr NEW_LINE ;
func_args: (SPACE* func_arg SPACE* ',' SPACE*)* func_arg SPACE* ;
func_invoke_args: (SPACE* expr_calc SPACE* ',' SPACE*)* expr_calc SPACE* ;
func_arg: VAR;
func_name: VAR;
func_expr: func_expr_assign
         | expr_calc
         | func_expr_input
         | func_expr_output
         ;

func_expr_output: 'print(' SPACE* VAR SPACE* ')' ;
func_expr_input: VAR SPACE* '=' SPACE* 'int(input())' ;
func_expr_assign: VAR SPACE* '=' SPACE* expr_calc;

expr: expr_assign
    | expr_calc
    | expr_input
    | expr_output
    ;

expr_assign: VAR SPACE* '=' SPACE* expr_calc;

expr_calc: expr_bool
         | expr_math
         ;

expr_bool: expr_bool_not SPACE* expr_bool
         | expr_bool SPACE* expr_bool_and SPACE* expr_bool
         | expr_bool SPACE* expr_bool_or SPACE* expr_bool
         | expr_bool_true
         | expr_bool_false
         | expr_bool_var
         | '(' SPACE* expr_bool_ SPACE* ')'
         ;

expr_bool_: expr_bool ;
expr_bool_var: VAR ;
expr_bool_or: BOOL_OR ;
BOOL_OR: 'or' ;
expr_bool_and: BOOL_AND ;
BOOL_AND: 'and' ;
expr_bool_not: BOOL_NOT ;
BOOL_NOT: 'not' ;
expr_bool_false: BOOL_FALSE ;
BOOL_FALSE: 'False' ;
expr_bool_true: BOOL_TRUE ;
BOOL_TRUE: 'True' ;

expr_math: expr_math SPACE* ('*'|'/') SPACE* expr_math
         | expr_math SPACE* ('+'|'-') SPACE* expr_math
         | INT
         | func_call
         | VAR
         | '(' SPACE* expr_math SPACE* ')'
         ;

func_call: func_name '(' func_invoke_args ')' ;

expr_output: 'print(' SPACE* VAR SPACE* ')' ;

expr_input: VAR SPACE* '=' SPACE* 'int(input())' ;

NEW_LINE : [\r\n]+ ;
SPACE    : [ ] ;
TAB      : [\t] ;
VAR      : [a-zA-Z][a-zA-Z0-9_]* ;
INT      : [0-9]+ ;
