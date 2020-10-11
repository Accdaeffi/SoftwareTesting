package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ln.Ln;
import sin.Sin;

class TestLn {

	@Test
	void testNaN() {
		Ln l = new Ln();
		
		assertEquals(l.ln(-0.01), Double.NaN);
	}
	
	@Test
	void testLn() {
		Ln l = new Ln();
		for (Double i = 0.01; i < 10; i += 0.1) {
			assertEquals(l.ln(i), Math.log(i), 0.0001);
		}
	}

}
