import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws sun on a graphics area.
 * 
 */

public class SunComponent extends JComponent {

	private static final double LITTLE_SUN_SIZE = 30.0;
	private static final double LITTLE_SUN_SEPERATION = 100.0;
	private static final int NUM_LITTLE_SUNS = 5;
	private static final double LITTLE_SUNS_Y = 400.0;
	private static final Color LITTLE_SUN_COLOR = Color.RED;
	private static final double LITTLE_SUNS_X_OFFSET = 50;

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		Sun sun = new Sun();
		sun.drawOn(g2);

		// draws a rectangle around the default sun
		g2.drawRect(30, 30, 240, 240);

		// draws a rectangle around a new sun in a particular position
		Sun s = new Sun(550, 100, 50, Color.BLUE);
		s.drawOn(g2);
		g2.drawRect(515, 65, 120, 120);

		for (int i = 0; i < NUM_LITTLE_SUNS; i++) {
			Sun smallSun = new Sun(LITTLE_SUNS_X_OFFSET + LITTLE_SUN_SEPERATION * i, LITTLE_SUNS_Y, LITTLE_SUN_SIZE,
					LITTLE_SUN_COLOR);
			smallSun.drawOn(g2);
		}

		// Create a Sun using the default (parameterless) constructor,
		// then draw it to the frame
		s = new Sun();
		sun.drawOn(g2);

		// Draw a rectangle around the default sun
		g2.drawRect(30, 30, 240, 240);

		// Draw a rectangle around a new sun in a particular position
		s = new Sun(550, 100, 50, Color.BLUE);
		s.drawOn(g2);
		g2.drawRect(515, 65, 120, 120);

		// Draw little suns
		double x = SunComponent.LITTLE_SUNS_X_OFFSET;
		for (int i = 0; i < SunComponent.NUM_LITTLE_SUNS; i++) {
			s = new Sun(x, SunComponent.LITTLE_SUNS_Y, SunComponent.LITTLE_SUN_SIZE, SunComponent.LITTLE_SUN_COLOR);
			s.drawOn(g2);
			x += SunComponent.LITTLE_SUN_SEPERATION;
		}

		// Sun sun = new Sun(100,100,40,40);
		// g2.drawOval(100, 100, 40, 40);
	}

}
