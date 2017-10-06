package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ForwardListener implements ActionListener {

	JTextArea textArea;
	Oracle newOracle;
	JLabel status;
	String[] oracles;
	
	public ForwardListener(JTextArea label, Oracle oracle, JLabel statusLabel){
		this.textArea = label;
		this.newOracle = oracle;
		this.status= statusLabel;
//		this.oracles=oraclesList;
	}
	
	int counter =0;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(counter>=5){
//			this.textArea.setText(oracles[counter-5]);
//			counter++;
			counter = 0;
		}
		this.textArea.setText(newOracle.next());
		this.oracles[counter] = newOracle.next();
		this.status.setText(newOracle.info());
		counter++;
		
		
	}

}
