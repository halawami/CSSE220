package recursion;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void testDoubleString(){		
		assertEquals("aabbcc", Recursion.doubleString("abc"));
		assertEquals("xxyy", Recursion.doubleString("xy"));
		assertEquals("hheelllloo", Recursion.doubleString("hello"));
		assertEquals("", Recursion.doubleString(""));
	}
	
	@Test
	public void testIsReversed(){		
		assertTrue(Recursion.isReversed(new int[] {1,2,3}, new int[] {3,2,1}));
		assertTrue(Recursion.isReversed(new int[] {9,8,44,2}, new int[] {2,44,8,9}));
		assertFalse(Recursion.isReversed(new int[] {9,8,44}, new int[] {44,8,8}));
		assertFalse(Recursion.isReversed(new int[] {9,8,44}, new int[] {0,8,9}));
		assertTrue(Recursion.isReversed(new int[] {7}, new int[] {7}));
	}
	
	
	@Test
	public void testJust2sAnd3s() {
		assertEquals(3,Recursion.just2sAnd3s(15));
		assertEquals(2,Recursion.just2sAnd3s(14));
		assertEquals(9,Recursion.just2sAnd3s(45));
		assertEquals(6,Recursion.just2sAnd3s(42));
		assertEquals(2*2*2*3,Recursion.just2sAnd3s(7*5*2*2*2*3));
		assertEquals(2*2*3*3,Recursion.just2sAnd3s(11*19*2*2*3*3));
		assertEquals(1,Recursion.just2sAnd3s(23));
	}
}

	
	