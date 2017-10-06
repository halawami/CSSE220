package linearLightsOut;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class LinearMainListener implements ActionListener {

	JButton[] buttons;
	JButton thisButton;
	JLabel statusLabel;

	public LinearMainListener(JButton[] button, JButton specificButton, JLabel label) {
		this.buttons = button;
		this.thisButton = specificButton;
		this.statusLabel = label;
	}

	public LinearMainListener(JButton specificButton) {
		this.thisButton = specificButton;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (this.thisButton.getText().equals("Quit ")) {
			System.exit(0);
		}

		if (hasWon()) {
			this.statusLabel.setText("You Win");
		}
		int number = 0;
		for (int i = 0; i < this.buttons.length; i++) {
			if (this.buttons[i] == this.thisButton) {
				number = i;
			}
		}
		buttonChanger(buttons[number]);
		if (number == 0 && number != this.buttons.length - 1) {
			buttonChanger(buttons[number + 1]);
		} else if (number != this.buttons.length - 1 || number == this.buttons.length) {
			buttonChanger(buttons[number + 1]);
			buttonChanger(buttons[number - 1]);
		} else if (number == this.buttons.length - 1) {
			buttonChanger(buttons[number - 1]);
		}
		if (hasWon()) {
			this.statusLabel.setText("You Win");
		}

	}

	/**
	 * This function changes the button's label from X to O or vice versa.
	 * @param buttonToChange
	 */
	public void buttonChanger(JButton buttonToChange) {
		if (buttonToChange.getText() == "X") {
			buttonToChange.setText("O");
		} else {
			buttonToChange.setText("X");
		}
	}

	/**
	 * This function checks if there is a winner.
	 * @param buttonToChange
	 */
	public boolean hasWon() {
		boolean presentWinner = true;
		for (int j = 0; j < this.buttons.length - 1; j++) {
			if (!buttons[j].getText().equals(buttons[j + 1].getText())) {
				presentWinner = false;
			}
		}
		return presentWinner;
	}
}
