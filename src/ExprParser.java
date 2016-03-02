// $ANTLR 3.4 /home/uml/workspace/bartek/src/Expr.g 2016-03-02 14:15:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/workspace/bartek/src/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/workspace/bartek/src/Expr.g:9:1: prog : ( stat )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.stat_return stat1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /home/uml/workspace/bartek/src/Expr.g:10:5: ( ( stat )+ EOF !)
            // /home/uml/workspace/bartek/src/Expr.g:10:7: ( stat )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/workspace/bartek/src/Expr.g:10:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= LP)||LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/workspace/bartek/src/Expr.g:10:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog35);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog40); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/uml/workspace/bartek/src/Expr.g:12:1: stat : ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token ID5=null;
        Token PODST6=null;
        Token NL8=null;
        Token NL9=null;
        ExprParser.expr_return expr3 =null;

        ExprParser.expr_return expr7 =null;


        CommonTree NL4_tree=null;
        CommonTree ID5_tree=null;
        CommonTree PODST6_tree=null;
        CommonTree NL8_tree=null;
        CommonTree NL9_tree=null;
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/workspace/bartek/src/Expr.g:13:5: ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->)
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case LP:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==PODST) ) {
                    alt2=2;
                }
                else if ( (LA2_2==DIV||(LA2_2 >= MINUS && LA2_2 <= PLUS)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NL:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/workspace/bartek/src/Expr.g:13:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat53);
                    expr3=expr();

                    state._fsp--;

                    stream_expr.add(expr3.getTree());

                    NL4=(Token)match(input,NL,FOLLOW_NL_in_stat55);  
                    stream_NL.add(NL4);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 13:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/workspace/bartek/src/Expr.g:14:7: ID PODST expr NL
                    {
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_stat68);  
                    stream_ID.add(ID5);


                    PODST6=(Token)match(input,PODST,FOLLOW_PODST_in_stat70);  
                    stream_PODST.add(PODST6);


                    pushFollow(FOLLOW_expr_in_stat72);
                    expr7=expr();

                    state._fsp--;

                    stream_expr.add(expr7.getTree());

                    NL8=(Token)match(input,NL,FOLLOW_NL_in_stat74);  
                    stream_NL.add(NL8);


                    // AST REWRITE
                    // elements: ID, PODST, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 14:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/workspace/bartek/src/Expr.g:14:27: ^( PODST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/uml/workspace/bartek/src/Expr.g:15:7: NL
                    {
                    NL9=(Token)match(input,NL,FOLLOW_NL_in_stat92);  
                    stream_NL.add(NL9);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 15:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/uml/workspace/bartek/src/Expr.g:18:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS11=null;
        Token MINUS13=null;
        ExprParser.multExpr_return multExpr10 =null;

        ExprParser.multExpr_return multExpr12 =null;

        ExprParser.multExpr_return multExpr14 =null;


        CommonTree PLUS11_tree=null;
        CommonTree MINUS13_tree=null;

        try {
            // /home/uml/workspace/bartek/src/Expr.g:19:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/workspace/bartek/src/Expr.g:19:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr115);
            multExpr10=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr10.getTree());

            // /home/uml/workspace/bartek/src/Expr.g:20:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PLUS) ) {
                    alt3=1;
                }
                else if ( (LA3_0==MINUS) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/uml/workspace/bartek/src/Expr.g:20:9: PLUS ^ multExpr
            	    {
            	    PLUS11=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr125); 
            	    PLUS11_tree = 
            	    (CommonTree)adaptor.create(PLUS11)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS11_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr128);
            	    multExpr12=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr12.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/workspace/bartek/src/Expr.g:21:9: MINUS ^ multExpr
            	    {
            	    MINUS13=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr138); 
            	    MINUS13_tree = 
            	    (CommonTree)adaptor.create(MINUS13)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS13_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr141);
            	    multExpr14=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /home/uml/workspace/bartek/src/Expr.g:25:1: multExpr : atom ( MUL ^ atom | DIV ^ atom )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL16=null;
        Token DIV18=null;
        ExprParser.atom_return atom15 =null;

        ExprParser.atom_return atom17 =null;

        ExprParser.atom_return atom19 =null;


        CommonTree MUL16_tree=null;
        CommonTree DIV18_tree=null;

        try {
            // /home/uml/workspace/bartek/src/Expr.g:26:5: ( atom ( MUL ^ atom | DIV ^ atom )* )
            // /home/uml/workspace/bartek/src/Expr.g:26:7: atom ( MUL ^ atom | DIV ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr171);
            atom15=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom15.getTree());

            // /home/uml/workspace/bartek/src/Expr.g:27:7: ( MUL ^ atom | DIV ^ atom )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MUL) ) {
                    alt4=1;
                }
                else if ( (LA4_0==DIV) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/workspace/bartek/src/Expr.g:27:9: MUL ^ atom
            	    {
            	    MUL16=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr181); 
            	    MUL16_tree = 
            	    (CommonTree)adaptor.create(MUL16)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL16_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr184);
            	    atom17=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/workspace/bartek/src/Expr.g:28:9: DIV ^ atom
            	    {
            	    DIV18=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr194); 
            	    DIV18_tree = 
            	    (CommonTree)adaptor.create(DIV18)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV18_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr197);
            	    atom19=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom19.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/workspace/bartek/src/Expr.g:32:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT20=null;
        Token ID21=null;
        Token LP22=null;
        Token RP24=null;
        ExprParser.expr_return expr23 =null;


        CommonTree INT20_tree=null;
        CommonTree ID21_tree=null;
        CommonTree LP22_tree=null;
        CommonTree RP24_tree=null;

        try {
            // /home/uml/workspace/bartek/src/Expr.g:33:5: ( INT | ID | LP ! expr RP !)
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case LP:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/uml/workspace/bartek/src/Expr.g:33:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT20=(Token)match(input,INT,FOLLOW_INT_in_atom227); 
                    INT20_tree = 
                    (CommonTree)adaptor.create(INT20)
                    ;
                    adaptor.addChild(root_0, INT20_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/workspace/bartek/src/Expr.g:34:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID21=(Token)match(input,ID,FOLLOW_ID_in_atom235); 
                    ID21_tree = 
                    (CommonTree)adaptor.create(ID21)
                    ;
                    adaptor.addChild(root_0, ID21_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/workspace/bartek/src/Expr.g:35:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP22=(Token)match(input,LP,FOLLOW_LP_in_atom243); 

                    pushFollow(FOLLOW_expr_in_atom246);
                    expr23=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr23.getTree());

                    RP24=(Token)match(input,RP,FOLLOW_RP_in_atom248); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog35 = new BitSet(new long[]{0x00000000000004E0L});
    public static final BitSet FOLLOW_EOF_in_prog40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat53 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat68 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PODST_in_stat70 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_stat72 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr115 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_PLUS_in_expr125 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr128 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_MINUS_in_expr138 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr141 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_atom_in_multExpr171 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_MUL_in_multExpr181 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr184 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_DIV_in_multExpr194 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr197 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_INT_in_atom227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom243 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_atom246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RP_in_atom248 = new BitSet(new long[]{0x0000000000000002L});

}