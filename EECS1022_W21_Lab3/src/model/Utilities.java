package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		int diff = upper - lower;
		if (diff == 0) {
			result  = "1 number between " + lower + " and " + upper + ": ";
		}else if (diff > 0) {
			diff += 1;
			result = diff  + " numbers between " + lower + " and " + upper + ": ";
		}
		result += "<";
		for (int i = lower; i <= upper; i++) {
			if (i % 3 == 0) {
				result += "(" + i + ")";
			}else if (i % 3 == 1) {
				result += "[" + i + "]";
			}else if (i % 3 == 2) {
				result += "{" + i + "}";
			}
			if (i < upper) {
				result += ", ";
			}
		}
		result += ">";
		if (upper < 0 || lower < 0) {
			result = "Error: both bounds must be non-negative";
		}else if (diff < 0) {
			result = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
		}
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		result += "{";
		int term = ft;
		int sum = 0;
		double average = 0.0;
		String format = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					result += "[sum of ";
				}
				if (j == 1) {
					result += "<";
				}
				if ( i > 1 && j == 1) {
					term = ft;
					sum += term;
				}else {
					sum += term;
				}
				result += term;
				if (j < i) {
					result += ", ";
				}
				term += d;
			}
			result += ">: " + sum + " ; avg of " ;
			term -=(i * d);
			sum = 0;
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					result += "<";
				}
				if (j > 1 && i == 1) {
					term -= d;
				}
				result += term;
				if ( i > 1 && j == 1) {
					term = ft;
					sum += term;
				}else {
					sum += term;
				}
				if (j < i) {
					result += ", ";
				}
				term += d;
			}
			average = ((double) sum / i);
			format = String.format("%.2f", average);
			result += ">: " + format + "]";
			if (i < n) {
				result+= ", ";
			}
			sum = 0;
			term -=d;
		}
			
		result += "}";
		
		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result += "<";
		int term1 = ft1;
		int term2 = ft2;
		if (n1 > n2) {
			for(int i = 1; i<= n1; i++) {
				result +="(" + term1 + ")";
				term1 += d1;
				if ( i < n1) {
					result +=  ", ";
				}
				if (i <= n2) {
					result += "[" + term2 +"]";
					term2 += d2;
				}
				if ( i <= n2) {
					result +=  ", ";
				}
			}
		}else {
			for(int i = 1; i <= n2; i++) {
				if (n1 > 0 && i <= n1) {
					result += "(" + term1 +")";
					term1 += d1;
				}if ( i <= n1) {
					result +=  ", ";
				}
				result +="[" + term2 + "]";
				term2 += d2;
				if ( i < n2) {
					result +=  ", ";
				}
			}
		}
		
		result += ">";
		/* Your implementation ends here. */
		return result;
	}	
}
