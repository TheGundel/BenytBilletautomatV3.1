package automat;

public class PrisenAendresIkkeNaarDuNulstiller {
	public static void main(String[] arg) {
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.montørLogin("1234");
		automat.setBilletpris(30);
		automat.nulstil();
		retur = automat.getBilletpris();
		if (retur == 30) {
			System.out.println("Billetprisen skulle gerne ændres tilbage til 10 kr.");
			antalFejl++;
		}
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}

	}
}