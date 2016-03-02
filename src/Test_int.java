import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class Test_int {
	public static void main(String[] args) throws Exception {

		// Tworzymy analizator leksykalny i każemy mu czytać z stdin
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		ExprLexer lexer = new ExprLexer(input);

		// Tworzymy bufor na tokeny pomiędzy analizatorem leksykalnym a parserem
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Tworzymy parser czytający z powyższego bufora
		ExprParser parser = new ExprParser(tokens);

		try {
			// Wywołujemy parser generujący drzewo startując od reguły prog (Z
			// klasy Expr)
			ExprParser.prog_return root = parser.prog();

			// Wypisujemy drzewo na standardowe wyjście
			System.out.println(((CommonTree) root.tree).toStringTree());

			// Tworzymy bufor na węzły drzewa
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.tree);

			// Tworzymy parser drzew korzystający z powyższego bufora
			TExpr1 walker = new TExpr1(nodes);

			// Wywołujemy parser drzew - startując od reguły prog (Tym razem z
			// klasy TExpr1!)
			walker.prog();

		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}