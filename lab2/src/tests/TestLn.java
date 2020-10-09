package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ln.Ln;

class TestLn {

	@Test
	void testNaN() {
		assertEquals(Ln.ln(-0.01), Double.NaN);
	}
	
	@Test
	void testLn() {
		for (Double i = 0.01; i < 10; i += 0.1) {
			assertEquals(Ln.ln(i), Math.log(i), 0.0001);
		}
	}

}
