package automat;

/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int billetpris; // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har
										// solgt
	private boolean montørtilstand;

	/**
	 * Opret en billetautomat der sælger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Giver prisen for en billet.
	 */
	public int getBilletpris() {
		int resultat = billetpris;
		return resultat;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	//FIXED//
	public void indsætPenge(int beløb) {
		
		if(beløb <0)
		{
			System.out.println("Du kan ikke indsætte negative beløb!");
			System.out.println(balance);

		} 
		else 
		{
			balance = balance + beløb;
		}
	}

	/**
	 * Giver balancen (beløbet maskinen har modtaget til den næste billet).
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Udskriv en billet. Opdater total og nedskriv balancen med billetprisen
	 */
	//Tjekker nu også om balance er mindre end 0. Udskriver ikke længere en billet hvis man ikke har penge//
	public void udskrivBillet() {
		if (balance < 10 | balance < 0 ) {
			System.out.println("Du mangler at indbetale nogle penge");
		}
		else
		{	
		System.out.println("##########B##T#########");
		System.out.println("# BlueJ Trafikselskab #");
		System.out.println("#                     #");
		System.out.println("#        Billet       #");
		System.out.println("#        " + billetpris + " kr.       #");
		System.out.println("#                     #");
		System.out.println("##########B##T#########");
		System.out.println("# Du har " + (balance - billetpris) + " kr til gode       #");
		System.out.println("##########B##T#########");
		System.out.println();
		}
		antalBilletterSolgt = antalBilletterSolgt + 1;
		balance = balance - billetpris; // Billetter koster 10 kroner
	}

	public int returpenge() {

		// FixED//
		int returbeløb = balance;
		balance = 0;
		if (balance < 0)
			System.out.println("Du får nada retur");
		else
			System.out.println("Du får " + returbeløb + " kr retur");
		return returbeløb;
	}

	void montørLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			montørtilstand = true;
			System.out.println("Montørtilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
		} else {
			montørtilstand = false;
			System.out.println("Montørtilstand deaktiveret");
		}
	}

	public int getTotal() {
		if (montørtilstand) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (montørtilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
		// Du kan ikke længere sætte billetprisen til en negativ value ^^//
		if (montørtilstand) {

			if (billetpris > 0) {

				this.billetpris = billetpris;
			} else {
				System.out.println("Du er en tard");
			}
		} else {
			System.out.println("Afvist - log ind først");
		}

	}
		// Nulstiller nu også billetprisen så den bliver de standard 10kr//
	public void nulstil() {
		if (montørtilstand) {
			antalBilletterSolgt = 0;
			billetpris = 10;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montørtilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public boolean erMontør() {
		return montørtilstand;
	}
}