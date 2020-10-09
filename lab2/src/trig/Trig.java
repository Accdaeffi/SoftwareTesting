package trig;

import cos.Cos;
import sin.Sin;

public class Trig {
	public static double calcCsc(double x) {
		if ((x%Math.PI)!=0)
		return 1/Sin.calcSin(x); else {
			return Double.NaN;
		}
	}
	
	public static double calcSec(double x) {
		if (((x-Math.PI/2)%Math.PI)!=0)
		return 1/Cos.calcCos(x); else {
			return Double.NaN;
		}
	}
	
	public static double calcCot(double x) {
		if ((x%Math.PI)!=0)
		return Cos.calcCos(x)/Sin.calcSin(x); else {
			return Double.NaN;
		}
	}
	
	public static double calcCscPer(double x) {
		return 1/Math.sin(x);
	}
	
	public static double calcSecPer(double x) {
		return 1/Math.cos(x);
	}
	
	public static double calcCotPer(double x) {
		return Math.cos(x)/Math.sin(x);
	}
}
