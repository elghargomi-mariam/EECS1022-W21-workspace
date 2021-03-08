package model;

public class Utilities {
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library class (e.g., ArrayList, Arrays)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 	- You can define helper methods if you wish.
	 * 
	 * Only write lines of code within the methods given to you. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests  
	 */
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  -  Return another array of strings, each of which denoting a non-empty suffix of the input array.
	 *     
	 *     A suffix of array `seq` contains its last n elements (where 1 <= n <= seq.length). 
	 *     
	 *  	For example, if the input array is:
	 *   
	 *  		<3, 1, 4>
	 *  
	 *  	Then the output or returned array of string values is:
	 *  		
	 *  		<"[3, 1, 4]", "[1, 4]", "[4]">
	 *  	
	 *  	where each suffix is structured as a comma-separated list surrounded by square brackets.	
	 *  
	 *  	Note that the length of the output array is equal to the length of the input array. 
	 *  	
	 *  	Also, elements in the output array are ``sorted'' by the lengths of the suffixes. 
	 *  		(e.g,. the last element is the suffix of length 1, the second last element is the suffix of length 2).
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String[] task1(int[] seq) {
		String[] result = null;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		String[] stri = new String[seq.length];
		int counter = seq.length;
		for (int i = 0; i < seq.length; i++) {
			stri[i] = "[";
			for (int m =0; m < counter; m ++) {
				if (i > 0) {
					stri[i] += seq[m + (i)];
				}else {
					stri[i] += seq[m];
				}
				
				if (m < counter -1) {
					stri[i] += ", ";
				}
			}
			counter -= 1;
			stri[i] += "]";
		}
		result = stri;

		// Do not modify this return statement. 
        return result;
    }

	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers
	 *	- `n`: a non-negative integer 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty.
	 * 	- Input integer `n` is non-negative (>= 0).
	 *  
	 * What to return?
	 *  - Given an array `seq` of integers and an integer `n`, 
	 *  	return a new array whose elements correspond to those of `seq` by 
	 *  	shifting every element in `seq` to the right by `n` positions. 
	 *  - The shifts are ***circular***: 
	 *  	any elements that would "go off the boundary" are 
	 *  	wrapped around back from the beginning of the array.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task2(int[] seq, int n) {
    	int[] result = null;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		int[] answer = new int[seq.length];
		for (int i = seq.length - 1; i >= 0; i --) {
			if ((i - n) >= 0) {
				answer[i] = seq[i - n];
			}else if (seq.length - n >= 0) {
				answer[i] = seq[seq.length - n];
			}else {
				answer[i] = seq[seq.length - 1 -i];
			}
			
		}
    	
		result = answer;
		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: an array of integers
	 *	- `indices`: an array of integers (each of which may or may not be a valid index for `seq`) 
	 *
	 * Assumptions:
	 * 	- `seq` may be empty.
	 * 	- `indices` may be empty. 
	 * 	- `indices` may contain duplicates.
	 *  
	 * What to return?
	 *  - For each integer value in `indices`, if it is a valid index for input array `seq`, 
	 *  	then use it to index into `seq` and include the result in the output array.
	 *  
	 *  For example: Say `seq` is {23, 46, 69} and `indices` is {2, -1, 0, 3, 0, 2}
	 *  	(where indices -1 and 3 are invalid, so only indices 2, 0, 0, 2 are used)
	 *   	Then the method should return {69, 23, 23, 69} 
	 *   
	 *  Note: Order of elements in the output array corresponds to the order in which
	 *  		valid indices in the `indices` array are arranged. 
	 *  
	 *  That is, the output array may be empty if the input array `seq` is empty,
	 *  	or if the input array `indices` does not contain any valid indices.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task3(int[] seq, int[] indices) {
		int[] result = null;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		int counter = 0;
		for (int i = 0; i < indices.length; i++ ) {
			if ((indices[i] < seq.length) && indices[i] >= 0) { 
				counter += 1;
			}
		}
		int[] index = new int[counter];
		int[] answer = new int [counter];
		counter = 0;
		for (int m = 0; m < indices.length; m++ ) {
			if ((indices[m] < seq.length) && indices[m] >= 0) { 
				index[counter] = indices[m];
				counter += 1;
			}
		}
		for (int k = 0; k < index.length; k ++) {
			answer[k] = seq[index[k]];
		}
		result = answer;
		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  - Return an array that represents an encoding of `seq`, by adopting the following principle:
	 *  	Element at each even index (e.g., at index 0, at index 2, and so on) of the return array specifies 
	 *  		how many times the element at the next odd index (e.g., at index 1, at index 3, and so on) repeats 
	 *  		in the input array `seq`.
	 *  	
	 *  	For example, {4, 2, 3, 1} encodes that value 2 (at odd index 1) should repeat 4 times (as specified at even index 0), 
	 *  		and similarly, value 1 should repeat 3 times. 
	 *  		
	 *  		Say `seq` is {2, 2, 2, 2, 1, 1, 1}.
	 *  		Then the method should return an encoded array {4, 2, 3, 1}.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task4(int[] seq) {
        int[] result = null; 
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		int counter = 0;
        for (int i = 0; i < seq.length; i ++) {
			if (i %2 == 0) {
				counter += seq[i];
			}
		}
        counter -= 2;
        int[] answer = new int[counter];
        boolean  flag = false;
        int spot = 0;
        int number = 0;
        for (int m = 0; m < seq.length; m ++) {
			if (m % 2 == 0) {
				flag = true;
				number = seq[m];
			}
        	if (m %2 != 0 && flag == true) {
				for (int j =spot; j < number; j++) {
					answer[j] = seq[m];
				}
				spot += number;
				flag = false;
				number = 0;
			}
		}
        
     /*
       int hang = 0;
       boolean flags = false;
       int counters = 0;
        for (int i = 0; i < seq.length; i ++) {
			hang = seq[i];
			if (i > 0) {
				if (hang == seq[i -1]) {
					counters += 1;
				}else {
					flags = true;
				}
			if (flag == true) {
				
			}
			}
		}
        
        */
        
        result = answer;
		// Do not modify this return statement. 
        return result;
    }	
}

