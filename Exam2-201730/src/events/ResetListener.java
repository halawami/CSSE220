package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ResetListener implements ActionListener {

	JTextArea textArea;
	Oracle newOracle;
	JLabel status;
	String[] oracles;
	
	public ResetListener(JTextArea label, Oracle oracle, JLabel statusLabel){
		this.textArea = label;
		this.newOracle = oracle;
		this.status= statusLabel;
//		this.oracles=oraclesList;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		newOracle.reset();
		this.textArea.setText(newOracle.next());
		this.status.setText(newOracle.info());
	}

}
