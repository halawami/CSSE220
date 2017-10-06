package recursion;

import javax.sound.midi.Soundbank;

public class RecursionProblems {

	/**
	 * Takes a string as input and converts all of the starting letter of sentences in the
	 * input string to uppercase.
	 * 
	 * You are not allowed to use any Java loops to implement this feature. You may need 
	 * a recursive helper function for this problem.
	 * 
	 * You can assume that the sentences are separated only use periods, i.e. "."
	 * You can also assume that a period is always followed by a space before starting 
	 * the next sentence (if any).
	 * You can also assume that your input will have at least one sentence in it.
	 * 
	 * Example:
	 * pretify("hello. "), return "Hello. "
	 * pretify("hello. hi. "), return "Hello. Hi. "
	 * pretify("hello. hi. Good bye. "), return "Hello. Hi. Good bye. "
	 * 
	 * Hint 1:
	 * To change smallcase character to uppercase, you may use the following:
	 * char a = 'a';
	 * char A = Character.toUpperCase(a);
	 * 
	 * Hint 2:
	 * You will also need to use String.substring() method.
	 */
	public static String pretify(String text) {
		char a = text.charAt(0);
		char A = Character.toUpperCase(a);
		String output = A +"";
		return pretifyHelper(text.substring(1),output);
	}	
	public static String pretifyHelper(String text,String text2){	
		String output = text2;
		if(text.length()==0){
			return output;
		}
		if(text.charAt(0)=='.' && text.length()>3){
			char toChange = text.charAt(2);
			char changed = Character.toUpperCase(toChange);
			output +=". "+ changed;
			return pretifyHelper(text.substring(3),output);
		}else{
			output += text.charAt(0);
			return pretifyHelper(text.substring(1),output);
		}
		
	}
}
