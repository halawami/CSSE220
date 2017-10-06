import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;

/**
 * Creates a new class for drawing a pine tree.
 */

public class PineTree {
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	// private int[] xPoints;
	// private int[] yPoints;

	public PineTree(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void drawOn(Graphics2D g2) {
		int[] xPoints = { this.x, this.x + this.width / 2, this.x + this.width };

		int[] yPoints = { this.y + height - height / 3, this.y - 2 * this.height / 3 + height - height / 3,
				this.y + height - height / 3 };
		Color brown = new Color(145, 112, 33);
		Color green = new Color(40, 135, 22);
		// Rectangle2D.Double
		g2.setColor(brown);

		g2.fillRect(this.x + width / 3, this.y + (2 * height / 3), width / 3, height / 3);
		g2.setColor(green);
		g2.fillPolygon(xPoints, yPoints, xPoints.length);
		System.out.println(this.y);
	}

}
