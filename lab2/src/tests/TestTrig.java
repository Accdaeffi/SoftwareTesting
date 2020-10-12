package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cos.Cos;
import cos.CosMock;
import sin.Sin;
import sin.SinMock;
import trig.Trig;

class TestTrig {

	static double eps = 0.0001;
	static Trig trig = new Trig();
	
    @Test
    public void testModuleCot() {
    	
    	Trig trig = new Trig();
    	
    	
    	SinMock sinPer = new SinMock();
    	CosMock cosPer = new CosMock();

    	Trig trigPer = new Trig();
    	trigPer.sin = sinPer;
    	trigPer.cos = cosPer;
    	
		for (double i=-100; i<=100; i=i+0.01) {
			double as = trigPer.calcCot(i);
			double arcs = trig.calcCot(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
    }
    
    @Test
    public void testModuleCsc() {
    	
    	Trig trig = new Trig();
    	
    	
    	SinMock sinPer = new SinMock();
    	CosMock cosPer = new CosMock();

    	Trig trigPer = new Trig();
    	trigPer.sin = sinPer;
    	trigPer.cos = cosPer;
    
		for (double i=-100; i<=100; i=i+0.01) {
			double as = trigPer.calcCsc(i);
			double arcs = trig.calcCsc(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
    }
    
    @Test
    public void testModuleSec() {
    	
    	Trig trig = new Trig();
    	
    	
    	SinMock sinPer = new SinMock();
    	CosMock cosPer = new CosMock();

    	Trig trigPer = new Trig();
    	trigPer.sin = sinPer;
    	trigPer.cos = cosPer;
		
		for (double i=-100; i<=100; i=i+0.01) {
			double as = trigPer.calcSec(i);
			double arcs = trig.calcSec(i);
		
			assertEquals("Wrong result:" 
					+ "\nValue:" + i
					+ "\nNormal:" + as
					+ "\nCalculated:" + arcs, as, arcs, 0.01);
			
		}
    }
	
    @Test
    public void testCsc1() {
        for (double i = eps; i < 4*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(trig.calcCsc(i),1/Math.sin(i), eps);
        }
    }

    @Test
    public void testCsc2() {
        for (double i = 4*Math.PI/2+eps; i < 8*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(trig.calcCsc(i),1/Math.sin(i), eps);
        }
    }

    @Test
    public void testCscInUndefinedPoints() {
        for (double i = -4*Math.PI/2; i <= 4*Math.PI/2 ; i += Math.PI) {
            assertEquals(trig.calcCsc(i), Double.NaN, 1);
        }
    }
	
    @Test
    public void testSec1() {
        for (double i = 3*Math.PI/2+eps; i < 5*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(trig.calcSec(i),1/Math.cos(i), eps);
        }
    }

    @Test
    public void testSec2() {
        for (double i = 5*Math.PI/2+eps; i < 7*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(trig.calcSec(i),1/Math.cos(i), eps);
        }
    }

    @Test
    public void testSecInUndefinedPoints() {
        for (double i = -Math.PI/2; i <= Math.PI/2 ; i += Math.PI) {
            assertEquals(trig.calcSec(i), Double.NaN, 1);
        }
    }
	
    @Test
    public void testCot1() {
        for (double i = Math.PI/6; i <= 5*Math.PI/6 + eps ; i += Math.PI/6) {
            assertEquals(trig.calcCot(i),Math.cos(i)/Math.sin(i), eps);
        }
    }

    @Test
    public void testCot2() {
        for (double i = -4*Math.PI + Math.PI/6; i <= -4*Math.PI  + 5*Math.PI/6 + eps ; i += Math.PI/6) {
        	assertEquals(trig.calcCot(i),Math.cos(i)/Math.sin(i), eps);
        }
    }

    @Test
    public void testCotInUndefinedPoints() {
        for (double i = -5*Math.PI; i <= 5*Math.PI ; i += Math.PI) {
            assertEquals(trig.calcCot(i), (Double.NaN), 1);
        }
    }  
}
