package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class testetst {

	@Test
	public void testBilletautomat() {
	}

	@Test
	public void testGetBilletpris() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.setBilletpris(-10);
		assertEquals(10, b.getBilletpris());
	}

	@Test
	public void testIndsætPenge() {
		Billetautomat b = new Billetautomat();
		int beløb = -9;
		b.indsætPenge(beløb);
		assertEquals(0, b.getBalance());
	}

	@Test
	public void testGetBalance() {
		Billetautomat b = new Billetautomat();
		b.indsætPenge(10);
		assertEquals(10, b.getBalance());
	}

//	@Test
//	public void testUdskrivBillet() {
//		Billetautomat b = new Billetautomat();
//		
//	}

	@Test
	public void testReturpenge() {
		Billetautomat b = new Billetautomat();
		assertEquals(0, b.returpenge());
	}
//
//	@Test
//	public void testMontørLogin() {
//		
//	}

	@Test
	public void testGetTotal() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.getTotal();
		assertEquals(0, b.getTotal());
	}

	@Test
	public void testGetAntalBilletterSolgt() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.setAntalBilletterSolgt(20);
		assertEquals(20,b.getAntalBilletterSolgt());
	}

	@Test
	public void testSetBilletpris() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.setBilletpris(200);
		assertEquals(200, b.getBilletpris());
	}

	@Test
	public void testNulstil() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.setAntalBilletterSolgt(20);
		b.setBilletpris(20);
		b.nulstil();
		assertEquals(0,b.getAntalBilletterSolgt());
		assertEquals(10,b.getBilletpris());
	}

	@Test
	public void testSetAntalBilletterSolgt() {
		Billetautomat b = new Billetautomat();
		b.montørLogin("1234");
		b.setAntalBilletterSolgt(543);
		assertEquals(543, b.getAntalBilletterSolgt());
	}

//	@Test
//	public void testErMontør() {
//		Billetautomat b = new Billetautomat();
//		b.montørLogin("1234");
//		assertEquals(true,montørtilstand);
//	}

}
