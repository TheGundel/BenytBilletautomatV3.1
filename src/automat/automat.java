package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class automat {

	@Test
	public void testGetBilletpris() {
		Billetautomat b = new Billetautomat();
		assertEquals(10, b.getBilletpris());
	}

}
