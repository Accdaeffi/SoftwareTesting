package log;

import ln.Ln;

public class Log {
	
	public Ln ln = new Ln();
	
	public double log(double c, double b) {
		return ln.ln(b)/ln.ln(c);
	}
}
