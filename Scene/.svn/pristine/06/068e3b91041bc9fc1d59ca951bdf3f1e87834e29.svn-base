import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.Object;

/**
 * Draws some pine trees on a graphics area.
 * 
 */

public class PineTreesComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		PineTree tree = new PineTree(100, 100, 100, 200);
		tree.drawOn(g2);

		PineTree littleTree = new PineTree(300, 200, 50, 100);
		littleTree.drawOn(g2);
	}
}
