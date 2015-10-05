package automat;

public class NegativIndsaetningAfPenge {

	public static void main(String[] arg) {
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.indsætPenge(-10);
		automat.udskrivBillet();
		System.out.println("Blev billetten udskrevet? Tast 1 for ja eller tast 2 for nej.");
		int svar = tastatur.nextInt();
		if (svar == 1) {
			System.out.println("FEJL, billetten skulle ikke udskrives.");
			antalFejl = antalFejl + 1;
		}
		System.out.println();
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}
	}
}