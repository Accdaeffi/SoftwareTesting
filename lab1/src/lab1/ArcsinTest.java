package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArcsinTest {

	@Test
	public void testArcsinTopAndBottom() {	
		double check = 1.01;
		
		double arcs = Arcsin.arcsin(check);
		double as = Math.asin(check);
		assertEquals("Wrong result:" 
				+ "\nValue:" + check
				+ "\nNormal:" + as
				+ "\nCalculated:" + arcs, as, arcs, 0.0001);
		
		check = -1.01;
		
		arcs = Arcsin.arcsin(check);
		as = Math.asin(check);
		assertEquals("Wrong result:" 
				+ "\nValue:" + check
				+ "\nNormal:" + as
				+ "\nCalculated:" + arcs, as, arcs, 0.0001);
	}
	
	@Test
	public void testArcsinNearZero() {		
		double check = 0.01;
		
		double arcs = Arcsin.arcsin(check);
		double as = Math.asin(check);
		assertEquals("Wrong result:" 
				+ "\nValue:" + check
				+ "\nNormal:" + as
				+ "\nCalculated:" + arcs, as, arcs, 0.0001);
		
		
		check = 0;
		
		arcs = Arcsin.arcsin(check);
		as = Math.asin(check);
		assertEquals("Wrong result:" 
				+ "\nValue:" + check
				+ "\nNormal:" + as
				+ "\nCalculated:" + arcs, as, arcs, 0.0001);
		
		check = -0.01;
		
		arcs = Arcsin.arcsin(check);
		as = Math.asin(check);
		assertEquals("Wrong result:" 
				+ "\nValue:" + check
				+ "\nNormal:" + as
				+ "\nCalculated:" + arcs, as, arcs, 0.0001);
	}
	
	@Test
	public void testArcsinGlobal() {
		
		for (double i=-1.1; i<=1.1; i=i+0.01) {
			double as = Math.toDegrees(Math.asin(i));
			double arcs = Math.toDegrees(Arcsin.arcsin(i));
		
			/*double as = Math.asin(i);
			double arcs = Arcsin.arcsin(i);
			*/
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.0001);
			
		}
	}

	
}
