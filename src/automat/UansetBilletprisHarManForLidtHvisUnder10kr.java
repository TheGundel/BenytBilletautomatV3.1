package automat;

public class UansetBilletprisHarManForLidtHvisUnder10kr
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;



		System.out.println("*** Tjek at den totalle indkomst viser rigtigt");
		automat.setBilletpris(5);
		automat.indsætPenge(5);
		automat.udskrivBillet();
		retur = automat.getTotal();
		if (retur != 1){
			System.out.println("FEJL, getTotal() skulle returnere 1, men den returnerer "+retur);
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