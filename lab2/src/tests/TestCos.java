package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cos.Cos;

class TestCos {

	@Test
	void testCos() {
		for (double i=-100; i<=100; i=i+0.01) {
			double as = Math.cos(i);
			double arcs = Cos.calcCos(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
	}
}
