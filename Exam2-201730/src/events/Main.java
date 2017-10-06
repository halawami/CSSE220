package events;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.sun.org.apache.xerces.internal.util.Status;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.createAndShowWindow();
	}	
	
	public void createAndShowWindow() {
		// Create an Oracle object for fortune telling, 
		// which loads 5 random fortune cookies quotes in the object
		Oracle oracle = new Oracle(5);
		
		// NOTE, you can use this object to: 
		// 		1. Get the next fortune quote by calling oracle.next()
		//		3. Replace the 5 quotes with each of a new one by calling oracle.reset() 
		//		4. Get a status string, e.g, "Showing 1 of 5 fortunes", by calling oracle.info()
		

		// Create GUI Window
		JFrame frame = new JFrame("Fortune Cookies Shuffle");
		
		// TODO: Add Reset and Forward buttons here
		JButton resetButton = new JButton("Reset");
		
		JButton forwardButton = new JButton(">>");
		
		
		
		// Text area to display fortune cookie quotes
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setColumns(20);
		textArea.setRows(10);
		frame.add(textArea);

		// Display the first fortune text in the textArea 
		textArea.setText(oracle.next());

		// Status bar to show fortune status
		JLabel statusLabel = new JLabel();
		statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// TODO: You will have to figure out how to add that statusLabel
		// to the window yourself
		
		frame.add(statusLabel,BorderLayout.SOUTH );
		
		// Display the printer-friendly fortune status in the statusLabel
		statusLabel.setText(oracle.info());

		// TODO: Setup action listeners here

//		ArrayList<Oracle> newOracle = new ArrayList<Oracle>();
		Oracle newOracle = new Oracle(5);
		String[] oracles = new String[5];
		for(int i =0;i<5;i++){
			oracles[i] = oracle.next();
		}
//		
		ResetListener resetButtonListener = new ResetListener(textArea, newOracle,statusLabel);
		resetButton.addActionListener(resetButtonListener);
		
//		String nextFortune = oracle.next();
		ForwardListener forwardButtonListener = new ForwardListener(textArea, newOracle,statusLabel);
		forwardButton.addActionListener(forwardButtonListener);
		
		
		frame.add(resetButton,BorderLayout.NORTH);
		frame.add(forwardButton, BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);		
	}
}
