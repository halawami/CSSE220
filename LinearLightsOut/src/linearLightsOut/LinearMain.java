package linearLightsOut;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.corba.se.pept.transport.EventHandler;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author Hussein Alawami. Created Jan 18, 2010.
 */
public class LinearMain {

	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nButtonsString = JOptionPane.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		JFrame myFrame = new JFrame("Linear Lights Out");

		JPanel myPanel = new JPanel();
		String[] array = { "X", "O" };
		JButton[] buttons = new JButton[nButtons];
		for (int i = 0; i < nButtons; i++) {
			buttons[i] = new JButton(array[(int) (Math.random() * (2))]);
			myPanel.add(buttons[i], BorderLayout.EAST);
		}

		LinearMainListener[] listeners = new LinearMainListener[nButtons];

		JLabel status = new JLabel("Status of Player");
		boolean hasWon = true;
		for (int j = 0; j < nButtons - 1; j++) {
			if (buttons[j].getText() != buttons[j + 1].getText()) {
				hasWon = false;
			}
		}
		if (hasWon == true) {
			status.setText("You Win");
		} else {
			status.setText("Keep Trying");
		}
		for (int i = 0; i < nButtons; i++) {
			listeners[i] = new LinearMainListener(buttons, buttons[i], status);
			buttons[i].addActionListener(listeners[i]);
		}

		JPanel myPanel2 = new JPanel();

		JButton newGameButton = new JButton("New Game ");
		myPanel2.add(newGameButton, BorderLayout.CENTER);
		NewGameListener newGameListener = new NewGameListener(buttons, status);
		newGameButton.addActionListener(newGameListener);

		JButton quitButton = new JButton("Quit ");
		myPanel2.add(quitButton, BorderLayout.CENTER);
		LinearMainListener quitListener = new LinearMainListener(quitButton);
		quitButton.addActionListener(quitListener);

		myPanel2.add(status);

		myFrame.add(myPanel);
		myFrame.add(myPanel2, BorderLayout.SOUTH);

		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}

}
