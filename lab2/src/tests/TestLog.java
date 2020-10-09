package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import log.Log;

class TestLog {

	@Test
	void testBadBase() {
		assertEquals(Log.log(-100, 100), Double.NaN);
		assertEquals(Log.log(0, 100), Double.NaN);
		assertEquals(Log.log(1, 100), Double.POSITIVE_INFINITY);
	}
	
	@Test
	void testBadValue() {
		assertEquals(Log.log(5, -100), Double.NaN);
		assertEquals(Log.log(5, 0), Double.NaN);
	}
	
	@Test
	void testLog() {
		assertEquals(Log.log(10, 15), Math.log10(15), 0.00001);
		assertEquals(Log.log(3, 432), 5.52371901, 0.00001);
		assertEquals(Log.log(0.3, 432), -5.04033444, 0.00001);
	}
}
