import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MapAnd2DArrayProblemsTest {

	@Test
	public void testTransponse() {
		int[][] test1 = { { 0, 1 }, { 2, 3 }};
		int[][] expected1 = { { 0, 2 }, { 1, 3 }};

		int[][] test2 = {{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}};
		int[][] expected2 = {{1, 1, 1}, {0, 1, 1}, {0, 0, 1}, {0, 0, 0}};
		
		int[][] actual1 = MapAnd2DArrayProblems.transpose(test1);
		assertArrayEquals(expected1, actual1);
		
		int[][] actual2 = MapAnd2DArrayProblems.transpose(test2);
		assertArrayEquals(expected2, actual2);
	}


	@Test
	public void testGetWordsWithMinFrequency() {
		String[] input1 = new String[0];
		ArrayList<String> actual1 = MapAnd2DArrayProblems.getWordsWithMinFrequency(input1, 0); 
		assertTrue(actual1.isEmpty());

		ArrayList<String> expected = new ArrayList<String>();
		
		String[] input2 = {"hello", "good", "bye"};
		expected.addAll(Arrays.asList("hello", "good", "bye"));
		ArrayList<String> actual2 = MapAnd2DArrayProblems.getWordsWithMinFrequency(input2, 1);
		assertEquals(expected.size(), actual2.size());
		assertTrue(expected.containsAll(actual2));

		String[] input3 = {"hello", "hello", "hello"};
		expected.clear();
		expected.addAll(Arrays.asList("hello"));
		ArrayList<String> actual3 = MapAnd2DArrayProblems.getWordsWithMinFrequency(input3, 2); 
		assertEquals(expected.size(), actual3.size());
		assertTrue(expected.containsAll(actual3));

		String[] input4 = {"hello", "hello", "hello"};
		expected.clear();
		expected.addAll(Arrays.asList("hello"));
		ArrayList<String> actual4 = MapAnd2DArrayProblems.getWordsWithMinFrequency(input4, 3); 
		assertEquals(expected.size(), actual4.size());
		assertTrue(expected.containsAll(actual4));

		String[] input5 = {"hello", "hello", "hello", "hi"};
		ArrayList<String> actual5 = MapAnd2DArrayProblems.getWordsWithMinFrequency(input5, 4); 
		assertTrue(actual5.isEmpty());
	}

}
