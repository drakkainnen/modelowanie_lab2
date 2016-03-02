grammar Expr;

options {
  output=AST;
  ASTLabelType=CommonTree;
}





prog
    : (stat )+ EOF!;

stat
    : expr NL -> expr 
    | ID PODST expr NL -> ^(PODST ID expr)
    | NL ->
    ;
    
expr
    : multExpr
      ( PLUS^ multExpr
      | MINUS^ multExpr
      )*
    ;
    
multExpr
    : atom
      ( MUL^ atom
      | DIV^ atom
      )*
    ;
    
atom
    : INT
    | ID
    | LP! expr RP!
    ;
    
    
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT : '0'..'9'+;

NL : '\r'? '\n' ;

WS : (' ' | '\t')+ {$channel = HIDDEN;} ;


LP
  : '('
  ;

RP
  : ')'
  ;

PODST
  : '='
  ;

PLUS
  : '+'
  ;

MINUS
  : '-'
  ;

MUL
  : '*'
  ;

DIV
  : '/'
  ;
    