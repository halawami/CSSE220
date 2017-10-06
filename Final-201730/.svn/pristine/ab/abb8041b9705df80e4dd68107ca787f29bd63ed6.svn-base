package finalQuestion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Basic viewer classes.  Nothing too exciting here.
 * 
 * @author hewner
 *
 */
public class Main {

	private static final Dimension FRAME_SIZE = new Dimension(640,480);
	

	/**
	 * The main - creates the window.
	 * 
	 * You can modify this if you want but you probably don't need to.
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("Final Question");
		
		BallsComponent bars = new BallsComponent(frame);
		bars.setPreferredSize(FRAME_SIZE);
		frame.add(bars);		
		
		frame.pack();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
