package trig;

import cos.Cos;
import sin.Sin;

public class Trig {
	
	public Cos cos = new Cos();
	public Sin sin = new Sin();	
	
	public double calcCsc(double x) {
		if ((x%Math.PI)!=0)
		return 1/sin.calcSin(x); else {
			return Double.NaN;
		}
	}
	
	public double calcSec(double x) {
		if (((x%(Math.PI/2))==0)&&((x%Math.PI)!=0))

			return Double.NaN; else {
			return 1/cos.calcCos(x);
		}
	}
	
	public double calcCot(double x) {
		if ((x%Math.PI)!=0)
		return cos.calcCos(x)/sin.calcSin(x); else {
			return Double.NaN;
		}
	}
	
	public double calcCscPer(double x) {
		return 1/Math.sin(x);
	}
	
	public double calcSecPer(double x) {
		return 1/Math.cos(x);
	}
	
	public double calcCotPer(double x) {
		return Math.cos(x)/Math.sin(x);
	}
}
