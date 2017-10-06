import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.NumericShaper;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.border.Border;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

/**
 * Creates a new class for drawing a sun.
 */

public class Sun {
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final int NUMBER_OF_RAYS = 8;
	private static final double RAY_LENGTH_SCALE = 0.5;
	private static final double RAY_WIDTH_SCALE = 0.1;
	private static final double RAY_DISTANCE_FROM_SUN_SCALE = .2;
	private static final double DEFAULT_SUN_DIAMETER = 100.0;
	private static final double DEFAULT_SUN_X = 100.0;
	private static final double DEFAULT_SUN_Y = 100.0;
	private static final Color DEFAULT_SUN_COLOR = Color.YELLOW;
	private static final double LITTLE_SUNS_X_OFFSET = 50;
	private double x;
	private double y;
	private double circleDiameter;
	private double rayLength;
	private double rayWidth;
	private double rayDistanceFromSun;
	private Color color;
	final static BasicStroke stroke = new BasicStroke(2.0f);

	public Sun(double x, double y, double circleDiameter, double rayLength, double rayWidth, int rayDistanceFromSun,
			Color color) {
		this.x = x;
		this.y = y;
		this.circleDiameter = circleDiameter;
		this.rayLength = rayLength;
		this.rayWidth = rayWidth;
		this.rayDistanceFromSun = rayDistanceFromSun;
		this.color = color;
	}

	public Sun() {
		this.x = DEFAULT_SUN_X;
		this.y = DEFAULT_SUN_Y;
		this.circleDiameter = DEFAULT_SUN_DIAMETER;
		this.rayLength = RAY_LENGTH_SCALE * DEFAULT_SUN_DIAMETER;
		this.rayWidth = RAY_WIDTH_SCALE * DEFAULT_SUN_DIAMETER;
		this.rayDistanceFromSun = RAY_DISTANCE_FROM_SUN_SCALE * DEFAULT_SUN_DIAMETER;
		this.color = DEFAULT_SUN_COLOR;
	}

	public Sun(double x, double y, double circleDiameter, Color color) {
		this.x = x;
		this.y = y;
		this.circleDiameter = circleDiameter;
		this.color = color;
	}

	public void drawOn(Graphics2D g2) {
		Ellipse2D.Double oval = new Ellipse2D.Double(x, y, circleDiameter, circleDiameter);
		g2.setStroke(stroke);
		g2.draw(oval);
		g2.setColor(color);
		g2.fill(oval);
		drawRay(g2, 45);

	}

	public void drawRay(Graphics2D g2, double angle) {
		g2.translate(circleDiameter / 2 + this.x, this.y + circleDiameter / 2);
		// g2.rotate(Math.toRadians(100));
		g2.rotate(2 * Math.PI / 8);
		for (int i = 0; i < NUMBER_OF_RAYS; i++) {
			if (i != 0) {
				g2.rotate(2 * Math.PI / NUMBER_OF_RAYS);

			}
			Rectangle2D.Double rays = new Rectangle2D.Double(0,
					circleDiameter / 2 + circleDiameter * RAY_DISTANCE_FROM_SUN_SCALE, circleDiameter * RAY_WIDTH_SCALE,
					circleDiameter * RAY_LENGTH_SCALE);
			g2.setColor(BORDER_COLOR);
			g2.draw(rays);
			g2.setColor(color);
			g2.fill(rays);
			g2.setColor(BORDER_COLOR);
		}
		// g2.rotate(Math.PI/2);
		g2.translate(-circleDiameter / 2 - this.x, -this.y - circleDiameter / 2);
	}
}
