/*
 * This is a very small assignment.  It's mostly to show that you can
 * check out and check in code successfully.
 * 
 * @author Hussein Alawami
 */
public class HW1 {

	/**
	 * This method takes in 4 separate integers. The first two comprise the first fraction
	 * as the numerator and denominator, respectively.  The third and forth integers 
	 * comprise the second fraction.
	 * 
	 * This method returns the decimal result of adding the two fractions
	 * 
	 * Example
	 * 
	 * addFraction(1,2,1,4) returns 0.75
	 */
	
	/*
	 * This function converts both fractions into a double data type so we do not lose the decimal and adds them together. 
	 */
	public static double addFraction(int num1, int den1, int num2, int den2) {
		return ((double)num1/den1)+((double)num2/den2);
	}
	
	/**
	 * Takes a string that is all Ts or Fs.
	 * 
	 * T stands for touchdown and is worth 7 points.
	 * F stands for fieldgoal and is worth 3 points.
	 * 
	 * Returns the total score.
	 * 
	 * For example:
	 * "TT" returns 14
	 * "FTF" returns 13
	 * "FFFF" returns 12
	 * "" returns 0;
	 *  
	 * 
	 * @param a string only Ts and Fs
	 * @return a score
	 */
	
	/*
	 * This function counts a score for a football 'match', it counts T as 7 points and F as 3 points.
	 * It does that by using a while loop and going through the whole string and then it checks whether it is 
	 * a 'T' or 'F' and adds it.
	 */
	public static int footballScore(String input) {
		if (input == null || input.length() == 0){
			return 0;
		}
		int index = 0;
		int count = 0;
		while (index < input.length()){
			if (input.charAt(index)=='T'){
				count += 7;
			}
			else if (input.charAt(index)=='F'){
				count += 3;
			}
			++index;
		}
		return count;
	}
	
}//end class HW1
