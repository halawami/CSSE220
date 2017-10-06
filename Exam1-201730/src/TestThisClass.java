
public class TestThisClass {

	/**
	 * Returns true if a point is within the square with upper left coordinate
	 * (0,1) and lower right (1,0). Points on the edge count as within the
	 * square.
	 *
	 * @param x
	 * @param y
	 * @return true if within square
	 */
	public static boolean withinSquare(double x, double y) {
		if (x > 1 || x < 0)
			return false;
		if (y > 1 || y < 0)
			return false;
		return true;
	}
}
