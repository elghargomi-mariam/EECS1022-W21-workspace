package model;

public class ArrayUtilities {
	/*
	 * e.g., Given <2, 3, 4>, return the sums for subarrays: <2, 5, 9>
	 */
	
	public static int[] getIntermediateSums(int[] ns) {
		int[] result = null; //array variable stores no address
		int sum = 0;
		int[] sums = new int[ns.length];
		for(int i = 0; i < ns.length ; i++) {
			sum += ns[i];
			sums[i] = sum;
		}
		result = sums;
		return result;
	}

}
