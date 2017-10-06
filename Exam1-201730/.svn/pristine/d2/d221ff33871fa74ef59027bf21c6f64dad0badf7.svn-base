import java.util.ArrayList;

public class SmallProblems {

	/**
	 * Returns a new list by removing all occurrences of elementToRemove in the
	 * original list.
	 * 
	 * DON'T modify the original list!
	 * 
	 * For example: filterList([1,2,3,1,2,3], 3) returns [1,2,1,2]
	 * filterList([1,1], 1) returns [] [] returns []
	 * 
	 * @return
	 */
	public static ArrayList<Integer> filterList(ArrayList<Integer> list, int elementToRemove) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != elementToRemove) {
				output.add(list.get(i));
			}
		}
		return output;
	}

	/**
	 * Takes a list of Strings and returns the number of occurrences of the
	 * supplied search key in the list. If no key was found, then it returns 0.
	 * 
	 * Note that an entry may have more than one occurrences of the search key,
	 * we still count multiple occurrences in the same entry as 1. See the
	 * second example below.
	 * 
	 * In order to find a key in a string, it's easiest to use string.contains:
	 *
	 * boolean stringHasAFoo = myString.contains("foo");
	 *
	 * For example: searchString(["Hello there!", "Hi there!", "Bye now!"],
	 * "there") returns 2 searchString(["Love and Peace and Music", "Rock and
	 * Roll", "Hip and Hop"], "and") returns 3 searchString(["Love and Peace and
	 * Music", "Rock and Roll", "Hip and Hop"], "War") returns 0
	 * searchString([], "") returns 0
	 */
	public static int searchList(ArrayList<String> list, String searchKey) {
		int counter = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(searchKey)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * 
	 * Takes an integer n as input and returns a list of n Fibonacci numbers. or
	 * equal to that integer.
	 * 
	 * For example: for n <= 0, returns [] for n = 1, returns [1] for n = 2,
	 * returns [1,1] for n = 3, returns [1,1,2] for n = 4, returns [1,1,2,3] and
	 * so on.
	 * 
	 * HINT: A new Fibonacci number is computed by adding the two previous
	 * fibonacci numbers.
	 */
	public static ArrayList<Integer> fibonacci(int n) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		if (n <= 0) {
			return output;
		} else if (n == 1) {
			output.add(1);
			return output;
		} else if (n >= 2) {
			for (int i = 0; i < 2; i++) {
				output.add(1);
			}
			for (int j = 2; j < n; j++) {
				output.add(output.get(j - 2) + output.get(j - 1));
			}
		}
		return output;
	}
}
