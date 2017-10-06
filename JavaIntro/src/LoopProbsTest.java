import static org.junit.Assert.*;

import org.junit.Test;

public class LoopProbsTest {

	@Test
	public void testCountXX() {
		assertEquals(0, LoopProbs.countXX(null));
		assertEquals(0, LoopProbs.countXX(""));
		assertEquals(0, LoopProbs.countXX("abx"));
		assertEquals(1, LoopProbs.countXX("abxxcd"));
		assertEquals(1, LoopProbs.countXX("abcxx"));
		assertEquals(2, LoopProbs.countXX("xxx"));
		assertEquals(3, LoopProbs.countXX("xxxx"));
	}

	@Test
	public void testStringBits() {
		assertEquals("", LoopProbs.stringBits(null));
		assertEquals("", LoopProbs.stringBits(""));
		assertEquals("Hlo", LoopProbs.stringBits("Hello"));
		assertEquals("H", LoopProbs.stringBits("Hi"));
		assertEquals("Hello", LoopProbs.stringBits("Heeololeo"));
		assertEquals("Ac", LoopProbs.stringBits("Abc"));
	}

	@Test
	public void testPairedX() {
		assertFalse(LoopProbs.pairedX("aabb"));
		assertFalse(LoopProbs.pairedX("x"));
		assertTrue(LoopProbs.pairedX("axxbb"));
		assertFalse(LoopProbs.pairedX("axaxax"));
		assertFalse(LoopProbs.pairedX("aaxxxb"));
		assertFalse(LoopProbs.pairedX("aaxxbbx"));
		assertTrue(LoopProbs.pairedX("xxxx"));
	}

	@Test
	public void testStringSplosion() {
		assertEquals("", LoopProbs.stringSplosion(null));
		assertEquals("", LoopProbs.stringSplosion(""));
		assertEquals("CCoCodCode", LoopProbs.stringSplosion("Code"));
		assertEquals("aababc", LoopProbs.stringSplosion("abc"));
		assertEquals("aab", LoopProbs.stringSplosion("ab"));
	}
}
