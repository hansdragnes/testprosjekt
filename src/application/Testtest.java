package application;
import static org.junit.Assert.*;

import org.junit.Test;

public class Testtest {

	@Test
	public void testSquare() {
		Beregner test= new Beregner();
		int result=test.square(10);
		assertEquals(100, result);
	}

	@Test
	public void testIsEqual() {
		Beregner test= new Beregner();
		boolean result = test.isEqual(10, 10);
		assertTrue("Skulle vært sann", result);
	}

}
