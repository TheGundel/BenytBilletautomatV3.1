package automat;

public class DenTotaleIndkomstErForkert
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;



		System.out.println("*** Tjek at den totalle indkomst viser rigtigt");
		automat.montørLogin("1234");
		automat.indsætPenge(90);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
		retur = automat.getTotal();
		if (retur != 30){
			System.out.println("FEJL, getTotal() skulle returnere 30, men den returnerer "+retur);
			antalFejl =antalFejl+1;
		}

		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");                      
		}
	}
}