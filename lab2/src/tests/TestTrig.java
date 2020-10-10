package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cos.Cos;
import trig.Trig;

class TestTrig {

	static double eps = 0.0001;
	
    @Test
    public void testCsc1() {
        for (double i = eps; i < 4*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(Trig.calcCsc(i),1/Math.sin(i), eps);
        }
    }

    @Test
    public void testCsc2() {
        for (double i = 4*Math.PI/2+eps; i < 8*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(Trig.calcCsc(i),1/Math.sin(i), eps);
        }
    }

    @Test
    public void testCscInUndefinedPoints() {
        for (double i = -4*Math.PI/2; i <= 4*Math.PI/2 ; i += Math.PI) {
            assertEquals(Trig.calcCsc(i), Double.NaN);
        }
    }
	
    @Test
    public void testSec1() {
        for (double i = 3*Math.PI/2+eps; i < 5*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(Trig.calcSec(i),1/Math.cos(i), eps);
        }
    }

    @Test
    public void testSec2() {
        for (double i = 5*Math.PI/2+eps; i < 7*Math.PI/2 ; i += Math.PI/6) {
            assertEquals(Trig.calcSec(i),1/Math.cos(i), eps);
        }
    }

    @Test
    public void testSecInUndefinedPoints() {
        for (double i = -Math.PI/2; i <= Math.PI/2 ; i += Math.PI) {
            assertEquals(Trig.calcSec(i), Double.NaN);
        }
    }
	
    @Test
    public void testCot1() {
        for (double i = Math.PI/6; i <= 5*Math.PI/6 + eps ; i += Math.PI/6) {
            assertEquals(Trig.calcCot(i),Math.cos(i)/Math.sin(i), eps);
        }
    }

    @Test
    public void testCot2() {
        for (double i = -4*Math.PI + Math.PI/6; i <= -4*Math.PI  + 5*Math.PI/6 + eps ; i += Math.PI/6) {
        	assertEquals(Trig.calcCot(i),Math.cos(i)/Math.sin(i), eps);
        }
    }

    @Test
    public void testCotInUndefinedPoints() {
        for (double i = -5*Math.PI; i <= 5*Math.PI ; i += Math.PI) {

        	System.out.println(Math.cos(i));
        	System.out.println(Trig.calcSec(i));
        	System.out.println(1/Math.cos(i));
        	System.out.println(Trig.calcSecPer(i));
        	System.out.println(Trig.calcCot(i));
            assertEquals(Trig.calcCot(i), (Double.NaN));
        }
    }
}
