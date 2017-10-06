package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionProblemsTest {

	@Test
	public void testPretify() {
		assertEquals("Hello. ", RecursionProblems.pretify("hello. "));
		assertEquals("Hello. Hi. ", RecursionProblems.pretify("hello. hi. "));
		assertEquals("Hello. Hi. Goodbye. ", RecursionProblems.pretify("hello. hi. Goodbye. "));
		assertEquals("I. ", RecursionProblems.pretify("i. "));
	}
}
