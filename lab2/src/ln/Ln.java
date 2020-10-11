package ln;

public class Ln {

	public double ln(double x) {

		double ln10 = 2.302585092994045684017991454684364207601101488628772976033;
		double eps = 0.0000001;
		
		if (x <= 0) {
    		return Double.NaN;
		}

		double result = 0.0, tmp = 1.0;

		while (x > 1) {
			result += ln10;
			x = x/10;
		}

		for (int n = 1; Math.abs(tmp) > eps; n++) {
			tmp = Math.pow((-1), (n+1)) * Math.pow((x - 1.0), n) / n ;
			result += tmp;
		}
		return result;
	}
}
