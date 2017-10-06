import java.awt.Dimension;
import javax.swing.JFrame;


/**
 * Draws a bunch of pine trees, via the PineTreesComponent and PineTree class.
 * 
 * Constructs and displays a JFrame
 * 
 */

public class PineTreesViewer {

	public static final Dimension PINE_TREES_SIZE = new Dimension(500, 400);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(PINE_TREES_SIZE);
		frame.setTitle("I see Trees!");

		frame.add(new PineTreesComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
