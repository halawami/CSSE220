package recursion;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely
 * used library functions, for loops, or while loops.
 * 
 * You can use recursive helper functions if you choose.
 * 
 * Solve all 3 of these problems
 * 
 */

public class Recursion {
	/**
	 * Doubles each character in a string.
	 * 
	 * For example:
	 * 
	 * "abc" returns "aabbcc"
	 * "foo" returns "ffoooo"
	 * 
	 * Hint: it's not a good idea to add two primitive chars together - it won't form a string.
	 * Instead, add the chars one at a time an an existing string.
	 * 
	 * 
	 */
	public static String doubleString(String input) {
		if(input.length()==0){
			return "";
		}
		String output = "";
		output += input.charAt(0);
		output+= input.charAt(0);
		return output + doubleString(input.substring(1));
	}

	/**
	 * Compares two integer arrays, and returns true if the first
	 * is the reverse of the second.
	 * 
	 * You can assume the arrays are the same length
	 * 
	 * You'll want a recursive helper function for this problem
	 * 
	 * For example
	 * 
	 * {1,2,3} and {3,2,1} returns true
	 * {1,2,3} and {1,2,3} returns false
	 * {7,44} and {44,7} returns true
	 * {7} and {7} returns true
	 * 
	 */
	public static boolean isReversed(int[] array1, int[] array2) {
		return isReversedHelper(array1, array2, 0);
	}
	
	public static boolean isReversedHelper(int[] array1, int[] array2, int index){
		if(index >= array1.length){
			return true;
		}
		if(array1[index]==array2[array2.length-1-index]){
			return isReversedHelper(array1,array2,index+1);
		}
		else{
			return false;
		}
	}
	
	
	/**
	 * Given a number, returns the part of the number's prime factorization that
	 * is a product of 2s and 3s (or returns 1 if the prime factorization contains
	 * no 2s or 3s).  For example:
	 * 
	 * 30 (2*3*5) returns 6
	 * 63 (3*3*7) returns 9
	 * 54 (3*3*3*2) returns 54
	 * 33 (3*11) returns 3
	 * 35 (5*7) returns 1 
	 */
	public static int just2sAnd3s(int num) {
		if(num%3==0){
			return 3*just2sAnd3s(num/3);
		}
		if(num%2==0){
			return 2*just2sAnd3s(num/2);
		}
		return 1;
	}
		
}
