import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void testFilterList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,1,2,3));
		
		ArrayList<Integer> result = SmallProblems.filterList(list, 3);

		assertTrue(list != result);
		assertEquals(Arrays.asList(1,2,1,2), result);
		
		list.clear();
		list.addAll(Arrays.asList(2,2));
		result = SmallProblems.filterList(list, 2);
		assertTrue(result.isEmpty());
		
		list.clear();
		result = SmallProblems.filterList(list, 1);
		assertTrue(result.isEmpty());
	}

	@Test
	public void testSearchList() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.addAll(Arrays.asList("Hello there!", "Hi there!", "Bye now!"));		
		int count = SmallProblems.searchList(list, "there");
		assertEquals(2, count);
		
		list.clear();
		list.addAll(Arrays.asList("Love and Peace and Music", "Rock and Roll", "Hip and Hop"));
		count = SmallProblems.searchList(list, "and");
		assertEquals(3, count);

		list.clear();
		list.addAll(Arrays.asList("Love and Peace and Music", "Rock and Roll", "Hip and Hop"));
		count = SmallProblems.searchList(list, "war");
		assertEquals(0, count);

		list.clear();
		count = SmallProblems.searchList(list, "war");
		assertEquals(0, count);
	}
	

	@Test
	public void testFibonacci() {
		ArrayList<Integer> result = SmallProblems.fibonacci(0);
		assertTrue(result.isEmpty());
		
		result = SmallProblems.fibonacci(1);
		assertEquals(Arrays.asList(1), result);

		result = SmallProblems.fibonacci(2);
		assertEquals(Arrays.asList(1,1), result);

		result = SmallProblems.fibonacci(3);
		assertEquals(Arrays.asList(1,1,2), result);

		result = SmallProblems.fibonacci(4);
		assertEquals(Arrays.asList(1,1,2,3), result);

		result = SmallProblems.fibonacci(5);
		assertEquals(Arrays.asList(1,1,2,3,5), result);

		result = SmallProblems.fibonacci(6);
		assertEquals(Arrays.asList(1,1,2,3,5,8), result);

		result = SmallProblems.fibonacci(7);
		assertEquals(Arrays.asList(1,1,2,3,5,8, 13), result);
	}
}
