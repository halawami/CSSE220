
public class LoopProbs {
	
	/**
	 * Returns the number of "xx" in the given string. 
	 * Overlapping is allowed, so "xxx" contains 2 "xx".
	 * 
	 * For example:
	 * "abcxx" should return 1
	 * "xxx" should return 2
	 * "xxxx" should return 3
	 * "" returns 0
	 */
	public static int countXX(String str) {
		if(str == null || str.length() == 0)
			return 0;
		
		int count = 0;
		int index = 0;
		
		while(index < str.length() - 1) {
			if(str.charAt(index) == 'x' && 
					str.charAt(index + 1) == 'x')
				++count;
			
			// Another way to do the above test using substring would be:
			// if(str.substring(index, index + 2).equals("xx"))
			//	++count
			
			++index;
		}
		return count;
	}
	
	/**
	 * Returns true if every "x" appear in pair.
	 * Returns false if no instance of "x" is found
	 * in the string.
	 * 
	 * For example:
	 * "aabb" should return false
	 * "axxbb" should return true
	 * "axaxax" should return false
	 * "xxxx" should return true
	 * "aaxxxb" should return false because the last x is followed by b
	 */
	public static boolean pairedX(String str) {
		// TODO: Please provide an implementation for this one
		if(str == null || str.length() < 2){
			return false;
		}
		int index = 0;
		while (index < str.length() - 2){
			if(str.charAt(index) == 'x' && str.charAt(index+1) == 'x'){
				index += 2;
			}
			else{
				return false;
			}
		}
		return true;
		
	}

	
	
	/**
	 * Returns a new string made of every other char 
	 * starting with the first. 
	 * Returns an empty string if the supplied string is 
	 * null or empty.
	 * 
	 * For example:
	 * "Hello" returns "Hlo"
	 * "Hi" returns "H"
	 * "Heeololeo" returns "Hello"
	 * null returns ""
	 */
	public static String stringBits(String str) {
		if(str == null || str.length() == 0)
			return "";
		
		String bits = "";
		for(int index = 0; index < str.length(); index += 2) { // Notice index += 2 here
			bits = bits + str.charAt(index);
		}
		
		return bits;
	}

	/**
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * If the supplied string is null or empty, then returns an empty string.
	 * 
	 * For example:
	 * "Code" returns "CCoCodCode"
	 * "abc" returns "aababc"
	 * "ab" returns "aab"
	 * "" return ""
	 */
	public static String stringSplosion(String str) {
		// TODO: Please provide an implementation for this one
		if(str == null || str.length() == 0){
			return "";
		}
		String bits = "";
		for (int i = 0; i < str.length();i++){
			int index = i;
			for (int k =0; k<=index;k++){
				bits = bits + str.charAt(k);
			}
		}
		return bits;
	}

	
}
