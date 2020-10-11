package sin;

public class Sin {
	
	private double calibrateX(double x) {
        double del = Math.PI * 2;
        if (x < 0)
            del *= -1;
        while (Math.abs(x) > 4.0) {
            x -= del;
        }
        return x;
    }

    public double calcSin(double x) {
        double eps = 1e-10;
    	
        x = calibrateX(x);
        double xn = x;
        double prevSum = 0.0;
        double sum = x;


        for (int n = 1; Math.abs(xn) > eps; n++) {
            prevSum = sum;
            xn *= (-x*x)/((2*n+1)*2*n);
            sum += xn;
        }
        return sum;

    }
}
