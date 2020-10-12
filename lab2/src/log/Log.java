package log;

import ln.Ln;

public class Log {
	
	public Ln ln = new Ln();
	
	public double log(double c, double b) {
		
		double logB = ln.ln(b);
		double logC = ln.ln(c);
		
		if ((logB == Double.NaN) || (logC == Double.NaN) || (Double.isInfinite(logB)) || (Double.isInfinite(logC)))
			return Double.NaN;
		
		return logB/logC;
	}
}
