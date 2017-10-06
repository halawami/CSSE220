import java.util.ArrayList;
import java.util.HashMap;

public class MapAnd2DArrayProblems {

	/**
	 * Given a matrix (n by m array), return a new transposed matrix (m by n
	 * array), i.e, previous rows become new columns and previous columns become
	 * new rows.
	 * 
	 * Example #1: {{0, 1}, {2, 3}}
	 * 
	 * would return:
	 * 
	 * {{0, 2}, {1, 3}}
	 * 
	 * 
	 * Example #2:
	 * 
	 * {{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}}
	 * 
	 * would return:
	 * 
	 * {{1, 1, 1}, {0, 1, 1}, {0, 0, 1}, {0, 0, 0}}
	 * 
	 * @param matrix
	 *            - The input array
	 */
	public static int[][] transpose(int[][] matrix) {
		int[][] output = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				output[j][i] = matrix[i][j];
			}
		}
		return output;
	}

	/**
	 * Given an array of strings as input, return a list of words with at least
	 * the supplied number of frequency in the input array.
	 * 
	 * Please use a hash map and a single for loop to solve this problem.
	 *
	 * Examples: getWordsWithMinFrequency([], 0) returns []
	 * getWordsWithMinFrequency(["hello", "good", "bye"], 1) returns ["hello",
	 * "good", "bye"] getWordsWithMinFrequency(["hello", "hello", "hello"], 3)
	 * returns ["hello"] getWordsWithMinFrequency(["hello", "hello", ,"foo",
	 * "hi", "hi"], 2) returns ["hello", "hi"]
	 * getWordsWithMinFrequency(["hello", "hello", "hello", "hi"], 2) returns
	 * ["hello"] getWordsWithMinFrequency(["hello", "hello", "hello", "hi"], 4)
	 * returns []
	 */
	public static ArrayList<String> getWordsWithMinFrequency(String[] words, int frequency) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> output = new ArrayList<String>();
		if (words.length == 0) {
			return output;
		}
		for (int i = 0; i < words.length; i++) {
			if (!map.containsKey(words[i])) {
				map.put(words[i], 1);
			} else if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);
			}
			if (map.get(words[i]) >= frequency && !output.contains(words[i])) {
				output.add(words[i]);
			}
		}
		System.out.println(output);
		return output;
	}
}
