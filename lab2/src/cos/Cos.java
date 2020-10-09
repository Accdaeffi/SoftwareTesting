package cos;

import sin.Sin;

public class Cos {
    public static double calcCos(Double x){
        return (Math.abs(x%Math.PI)< 1e-6) ? 1 : Sin.calcSin(2 * x) / (2*Sin.calcSin(x));
    }

}
