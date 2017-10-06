package polymorphism;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * This class uses Circle and Square to draw two columns 
 * of shapes.
 * 
 * However, there is duplication between classes Circle
 * and Square AND there is duplication in their use in
 * ColoredShapeComponent.
 * 
 * For full credit, use INHERITANCE to remove the duplication
 * between Circle and Square classes, and remove the duplicate
 * functions in ColoredShapeComponent.
 * 
 * For half credit, you can use interfaces to remove the duplicate
 * functions in ColoredShapeComponent.
 * 
 * When your work is done, you the program should draw exactly
 * the same thing it does now.
 * 
 * @author hewner
 *
 */



public class ColoredShapeComponent extends JComponent{

	private static final int BORDER_WIDTH = 60;

	@Override
	protected void paintComponent(Graphics arg0) {
		Graphics2D g = (Graphics2D) arg0;
		Shapes c = new Circle(30, 25, 40);
		Shapes s = new Square(90, 25, 25);
		draw(g, c);
		draw(g, s);
	}

	public void draw(Graphics2D g, Shapes c) {
		for (int i = 0; i < 5; i++) {
			c.draw(g);
			c.transform(0, 40);
		}
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Polymorphism Question");

		ColoredShapeComponent c = new ColoredShapeComponent();
		c.setPreferredSize(new Dimension(200, 250));
		frame.add(c);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
