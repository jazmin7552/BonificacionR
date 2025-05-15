package bonifcacion;

public class combinaciones {
	
	  public static int combinacion(int n, int k) {
	        if (k > n) {
	        	return 0;
	        }
	        if (k == 0 || k == n) {
	        	return 1;
	        }
	        return combinacion(n - 1, k) + combinacion(n - 1, k - 1);
	    }
	

}
