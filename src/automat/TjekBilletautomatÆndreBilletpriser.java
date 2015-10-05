package automat;

public class TjekBilletautomatÆndreBilletpriser
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		automat.setBilletpris(20); // burde ikke være muligt at ændre billet prisen
		
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
			antalFejl= antalFejl+1;
			
		}
		
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
		
	}
}