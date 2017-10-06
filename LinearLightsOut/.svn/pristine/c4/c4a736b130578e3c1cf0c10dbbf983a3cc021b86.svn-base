package linearLightsOut;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class NewGameListener implements ActionListener {

	JLabel statusLabel;
	JButton[] buttons;
	String[] array = { "X", "O" };

	public NewGameListener(JButton[] button, JLabel label) {
		this.statusLabel = label;
		this.buttons = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.buttons.length; i++) {
			buttons[i].setText((array[(int) (Math.random() * (2))]));
		}
		this.statusLabel.setText("Keep Trying");
		boolean presentWinner = true;
		for (int j = 0; j < this.buttons.length - 1; j++) {
			if (!buttons[j].getText().equals(buttons[j + 1].getText())) {
				presentWinner = false;
			}
		}
		if(presentWinner){
			this.statusLabel.setText("You win");
		}
	}

}
