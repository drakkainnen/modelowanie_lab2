tree grammar TExpr1;

options {
  tokenVocab=Expr;
  ASTLabelType=CommonTree;
}


@header {
  import java.util.HashMap;
}

@members {
HashMap<String, Integer> memory = new HashMap();
}


prog : (e=expr {System.out.println ($e.out);})* ;

expr returns [Integer out]
        : ^(PLUS  e1=expr e2=expr) {$out = $e1.out + $e2.out;}
        | ^(MINUS e1=expr e2=expr) {$out = $e1.out - $e2.out;} 
        | ^(MUL   e1=expr e2=expr) {$out = $e1.out * $e2.out;} 
        | ^(DIV   e1=expr e2=expr) {$out = $e1.out / $e2.out;} 
        | ^(PODST i1=ID   e2=expr) {memory.put($i1.text, new Integer($e2.out)); } 
        | INT                      {$out = Integer.parseInt($INT.text);}
        ;
        
