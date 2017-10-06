import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Draws the full scene on a graphics area.
 * 
 */

public class SceneComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Sun sun = new Sun();
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 0, 750, 375);
		g2.setColor(Color.GREEN);
		g2.fillRect(0, 375, 750, 225);
		sun.drawOn(g2);
		for (int j = 0; j < 5; j++) {
			House newHouse = new House(70 + j * 110, 450, Color.RED);
			newHouse.drawOn(g2);
		}

		for (int i = 0; i < 25; i++) {
			PineTree pinetree = new PineTree(160 + 20 * i, 350, 10, 40);
			pinetree.drawOn(g2);
		}

		for (int k = 0; k < 15; k++) {
			PineTree pinetree = new PineTree(165 + 30 * k, 340, 20, 80);
			pinetree.drawOn(g2);
		}

	}

}
