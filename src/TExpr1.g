tree grammar TExpr1;

options {
  tokenVocab=Expr;
  ASTLabelType=CommonTree;
}

prog : (e=expr {System.out.println ($e.out);})* ;

expr returns [Integer out]
        : ^(PLUS  e1=expr e2=expr) {$out = $e1.out + $e2.out;}
        | ^(MINUS e1=expr e2=expr) 
        | ^(MUL   e1=expr e2=expr) 
        | ^(DIV   e1=expr e2=expr) 
        | ^(PODST i1=ID   e2=expr) 
        | INT                      {$out = Integer.parseInt($INT.text);}
        ;
        