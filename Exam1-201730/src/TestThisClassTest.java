import static org.junit.Assert.*;

import org.junit.Test;

public class TestThisClassTest {

	@Test
	public void testWithinSquare() {

		// Tests a point inside the square
		double point1x = 0.5;
		double point1y = 0.5;
		assertTrue(TestThisClass.withinSquare(point1x, point1y));

		// Tests a point outside the square
		double point2x = 2;
		double point2y = -2;
		assertFalse(TestThisClass.withinSquare(point2x, point2y));

		// Tests a point in the edges of a square
		double point3x = 1;
		double point3y = 0;
		assertTrue(TestThisClass.withinSquare(point3x, point3y));

		// Tests a point that has an x coordinate inside and a y coordinate
		// outside
		double point4x = 0.5;
		double point4y = 2;
		assertFalse(TestThisClass.withinSquare(point4x, point4y));
	}

}
