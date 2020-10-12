package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import cos.Cos;
import sin.SinMock;

class TestCos {
	
	@Test
	void testModule() {
		Cos cos = new Cos();
		cos.s = new SinMock();
		
		
		for (double i=-100; i<=100; i=i+0.01) {
			double as = Math.cos(i);
			double arcs = cos.calcCos(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
		
	}

	@Test
	void testCos() {
		Cos cos = new Cos();
		
		
		for (double i=-100; i<=100; i=i+0.01) {
			double as = Math.cos(i);
			double arcs = cos.calcCos(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
	}
}
