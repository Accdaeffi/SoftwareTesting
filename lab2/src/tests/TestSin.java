package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sin.Sin;

class TestSin {

	@Test
	void testSin() {
		Sin s = new Sin();
		
		
		for (double i=-100; i<=100; i=i+0.01) {
			double as = Math.sin(i);
			double arcs = s.calcSin(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.001);
			
		}
	}
}
