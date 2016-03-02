// $ANTLR 3.4 /home/uml/workspace/bartek/src/TExpr1.g 2016-03-02 14:15:08

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int RP=13;
    public static final int WS=14;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TExpr1(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr1(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TExpr1.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/workspace/bartek/src/TExpr1.g"; }



    // $ANTLR start "prog"
    // /home/uml/workspace/bartek/src/TExpr1.g:8:1: prog : (e= expr )* ;
    public final void prog() throws RecognitionException {
        Integer e =null;


        try {
            // /home/uml/workspace/bartek/src/TExpr1.g:8:6: ( (e= expr )* )
            // /home/uml/workspace/bartek/src/TExpr1.g:8:8: (e= expr )*
            {
            // /home/uml/workspace/bartek/src/TExpr1.g:8:8: (e= expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||LA1_0==INT||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/workspace/bartek/src/TExpr1.g:8:9: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog34);
            	    e=expr();

            	    state._fsp--;


            	    System.out.println (e);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "expr"
    // /home/uml/workspace/bartek/src/TExpr1.g:10:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT );
    public final Integer expr() throws RecognitionException {
        Integer out = null;


        CommonTree i1=null;
        CommonTree INT1=null;
        Integer e1 =null;

        Integer e2 =null;


        try {
            // /home/uml/workspace/bartek/src/TExpr1.g:11:9: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT )
            int alt2=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case INT:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:11:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr60); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr65);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr69);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 + e2;

                    }
                    break;
                case 2 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:12:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr85); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr89);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr93);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:13:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr114);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr118);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:14:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr133); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr139);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr143);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:15:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr158); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr162); 

                    pushFollow(FOLLOW_expr_in_expr168);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // /home/uml/workspace/bartek/src/TExpr1.g:16:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr182); 

                    out = Integer.parseInt((INT1!=null?INT1.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return out;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog34 = new BitSet(new long[]{0x0000000000001B52L});
    public static final BitSet FOLLOW_PLUS_in_expr60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr65 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr89 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr114 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr139 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr162 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr182 = new BitSet(new long[]{0x0000000000000002L});

}