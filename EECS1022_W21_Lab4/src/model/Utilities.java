package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int counter =  0;
		for (int i =0; i < numbers.length; i++) {
			if(numbers[i] % 3 == 0) {
				counter  += 1;
			}
		}
		int[] third = new int[counter];
		int counter2 = 0;
		for (int i =0; i < numbers.length; i++) {
			if(numbers[i] % 3 == 0) {
				third[counter2] = numbers[i];
				counter2 += 1;
			}
		}
		result = third;
		
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int counter =  0;
		for (int i =0; i < numbers.length; i++) {
			if(numbers[i] != n) {
				counter  += 1;
			}
		}
		int[] filter = new int[counter];
		int counter2 = 0;
		for (int i =0; i < numbers.length; i++) {
			if(numbers[i] != n) {
				filter[counter2] = numbers[i];
				counter2  += 1;
			}
		}
		result = filter;
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		String combine = "";
		String[] combination = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			combine += "[";
			for (int j = 0; j <= i; j++) {
				combine += numbers[j];
				if (j < i) {
					combine += ", ";
				}
			}
			combine += "]";
			combination[i] = combine;
			if (i < numbers.length - 1) {
				combine += ", ";
			}
			combine = "";
		}
		result = combination;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int[] divisible = new int[numbers.length];
		int counter1 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				divisible[counter1] = numbers[i];
				counter1 += 1;
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 1) {
				divisible[counter1] = numbers[i];
				counter1 += 1;
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 2) {
				divisible[counter1] = numbers[i];
				counter1 += 1;
			}
		}
		result = divisible;
		
		/* Your implementation ends here. */
		
		return result;
	}
}
