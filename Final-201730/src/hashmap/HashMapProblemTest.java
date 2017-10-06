package hashmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class HashMapProblemTest {
	
	@Test
	public void test() {	
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("C1", "P1");
		map.put("C2", "P1");
		map.put("C3", "P1");
		map.put("C4", "P1");
		map.put("C5", "P2");
		map.put("C6", "P3");
		map.put("C7", "P3");

		assertTrue(HashMapProblem.getSiblings(map, "C8").isEmpty());
		
		List<String> siblings = HashMapProblem.getSiblings(map, "C5"); 
		assertTrue(siblings.isEmpty());

		List<String> expected = Arrays.asList("C2", "C3", "C4");
		List<String> actual = HashMapProblem.getSiblings(map, "C1");
		
		assertEquals(expected.size(), actual.size());
		assertTrue(actual.containsAll(expected));
	}
}
