import java.awt.Color;
import java.awt.Graphics2D;


/**
 * Creates a new class for drawing the house with a roof and filling it.
 */

public class House {
	private static final int HEIGHT = 50;
	private static final int WIDTH = 100;
	private static final int ROOF_HEIGHT = 20;
	private int x;
	private int y;
	private Color color;

	public House(int x, int y, Color color) {
		// TODO: save off the parameters into instance variables
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void drawOn(Graphics2D g2) {
		// TODO: Draw the house body (a rectangle) and the roof (3 lines or a
		// Polygon)

		g2.setColor(this.color);
		g2.drawLine(this.x, this.y, this.x + 50, this.y - 20);
		g2.drawLine(this.x + 100, this.y, this.x + 50, this.y - 20);
		g2.fillRect(this.x, this.y, 100, 50);
	}

}
