package part12;

public class Arcsin {


	public static double modified_fact (int n)
	{
	    if (n == 0) return 1;
	    else
	    {
	        double result = 1;
	        int i;
	        for (i = 1; i <= n; i++)
	        {
	            double di = i;
	            result = result * ((n + di) / (4.0 * di));
	        }
	        return result;
	    }
	}
	
	public static double dfact(int n) {
        double res = 1.0;
        for (int i = n; i >= 1; i -= 2) {
            res *= i;
        }
        return res;
    }
    
    public static double arcsin(double x) {
 
    	if (Math.abs(x)<0.9) {
	        double eps = 0.0000000001; //точность
	        double retVal = 0;   
	        int k = 1;
	        double prev = 0;   //предыдущее значение для сравнения
	        try {
	            do {
	                prev = retVal;
	                retVal += (dfact(2 * k - 1) * Math.pow(x, 2 * k + 1))
	                        / (dfact(2 * k) * (2 * k + 1));
	 
	                k++;
	            } while ((Math.abs(retVal - prev)) > eps);
	 
	        } catch (Exception ee) {
	            System.out.print(ee.toString());
	        }
	        return retVal + x;
    	} else {
    		if (x>0) {
    			return arccos(Math.sqrt(1-Math.pow(x, 2)));
    			//return Math.acos(Math.sqrt(1-Math.pow(x, 2)));
    		} else {
    			return -arccos(Math.sqrt(1-Math.pow(x, 2)));
    			//return -Math.acos(Math.sqrt(1-Math.pow(x, 2)));
    		}
    	}
    }
    
    
    
    public static double arccos(double x) {

    	double eps = 0.0000000001; //точность
        double retVal = 0;   
        double prev = 0; 
    	
        int n = 0;
        do {
        	prev = retVal; 
        	retVal += (modified_fact (n) / (2 * n + 1)) * Math.pow(x, 2 * n + 1);
                n++;
            } while ((Math.abs(retVal - prev)) > eps);

        return Math.PI/2 - retVal;
    }
}
