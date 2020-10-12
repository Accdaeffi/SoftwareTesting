package cos;

import sin.Sin;


public class Cos {
	public Sin s = new Sin();
	
    public double calcCos(double x){
        return (Math.abs(x%Math.PI)< 1e-6) ? 1 : (s.calcSin(2 * x) / (2*s.calcSin(x)));
    }

}
