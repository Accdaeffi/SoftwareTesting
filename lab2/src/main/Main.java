package main;

import java.util.Scanner;

import cos.Cos;
import ln.Ln;
import log.Log;
import sin.Sin;
import trig.Trig;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		System.out.println(finalFunction(x));
		
		sc.close();
	}
	
	public static double finalFunction(double x) {
		if (x<=0) {
			return ((  (Math.pow(Math.pow(Sin.calcSin(x) - Trig.calcCsc(x), 2), 2)) + (Trig.calcCot(x) - Cos.calcCos(x))) + (Sin.calcSin(x) - (Math.pow((Trig.calcCsc(x) * Trig.calcSec(x)) + Cos.calcCos(x),2))));
		} else {
			return ( Math.pow( (  ((Math.pow(Ln.ln(x),3))-(Log.log(5,x)/Log.log(3,x))) * ((Log.log(5,x) + Log.log(2,x))/(Log.log(5,x)))) / (Log.log(10,x)),3));
		}
	}

}
