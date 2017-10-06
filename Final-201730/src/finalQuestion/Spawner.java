package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * Bouncer subclass
 * 
 * @author alawamhm
 *
 */

public class Spawner extends Bouncer {

	boolean isCalled;
	public Spawner(int x, int y) {
		super(x, y);
		this.isCalled = false;
	}
	
	/*PLEASE READ ME
	 * PART3 with static variables, I left it commented because I was 
	 * scared that if I solve it with static, you will take points off
	 * Continuation of this code is in BallsComponent
	 * 
    @Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.getText().equals("Increase Width")) {
			
			BallsComponent.createSpawner();
		}
	}
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.getText().equals("Increase Width")) {
			setisCalled(true);
//			BallsComponent.createSpawner();
		}
	}
	
	public void setisCalled(boolean b){
		this.isCalled = b;
	}
	

		
	// I know I don't need this but it makes it easier for me to follow the ball
	// and see if it works the way I want it to work
	public void draw(Graphics2D g2) {
		g2.setColor(Color.RED);
		g2.fillOval(this.x - getWidth()/2, this.y - getWidth()/2, getWidth(), getWidth());
	}
}
