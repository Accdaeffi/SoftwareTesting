package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.InOrder;

import ln.Ln;
import log.Log;

class TestLog {

	static Log l;
	
	/*@BeforeClass
	public static void init() {
		l = new Log();
	}*/
	
	@Test
	void testBadBase() {
		
		l = new Log();
		
		assertEquals(l.log(-100, 100), Double.NaN);
		assertEquals(l.log(0, 100), Double.NaN);
		assertEquals(l.log(1, 100), Double.POSITIVE_INFINITY);
	}
	
	@Test
	void testBadValue() {
		
		l = new Log();
		assertEquals(l.log(5, -100), Double.NaN);
		assertEquals(l.log(5, 0), Double.NaN);
	}
	
	@Test
	void testLog() {
		l = new Log();
		assertEquals(l.log(10, 15), Math.log10(15), 0.00001);
		assertEquals(l.log(3, 432), 5.52371901, 0.00001);
		assertEquals(l.log(0.3, 432), -5.04033444, 0.00001);
	}
	
	@Test
	void testIntegro() {
		l = new Log();
		Ln ln = mock(Ln.class);
		when(ln.ln(20)).thenReturn((double) 2.9957322735539909934352235);
		when(ln.ln(3)).thenReturn((double) 1.0986122886681096913952452);
		
		l.ln = ln;
		
		assertEquals(l.log(3, 20), 2.72683302786084, 0.00001);
		
	}
	
}
