package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Basic bouncing
 * 
 * Modify this class if you like
 * 
 * @author Michael Hewner
 *
 */
public class Bouncer implements ActionListener{
	
	// you can make these variables protected if you like
	protected int minX;
	protected int maxX;
	protected int minY;
	protected int maxY;
	
	protected int xVel;
	protected int yVel;
	protected int x;
	protected int y;
	protected int width;
	
	public Bouncer(int x, int y) {
		this.x = x;
		this.y = y;
		this.xVel = 1;
		this.yVel = 1;
		this.width = 40;
	}
	
	public Bouncer(int x, int y,int xVel, int yVel) {
		this.x = x;
		this.y = y;
		this.xVel = 1;
		this.yVel = 1;
		this.width = 40;
	}
	
	public void setBounds(int minX, int maxX, int minY, int maxY) {
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}
	
	public void updatePosition() {
		if(minX == maxX)
			throw new RuntimeException("bouncer bounds have not been set");
		int updatedX = x + xVel;
		int updatedY = y + yVel;
		if(updatedX > maxX) {
			xVel = -Math.abs(xVel);
			updatedX = x; //so that we are not outside bounds
		}
		if(updatedX < minX) {
			xVel = Math.abs(xVel);
			updatedX = x; //so that we are not outside bounds
		}
		if(updatedY > maxY) {
			yVel = -Math.abs(yVel);
			updatedY = y; //so that we are not outside bounds
		}
		if(updatedY < minY) {
			yVel = Math.abs(yVel);
			updatedY = y; //so that we are not outside bounds
		}
		this.x = updatedX;
		this.y = updatedY;
	}
	
	public void updateWidth(){
		this.width += 1;
	}
	
	public int getWidth(){
		return this.width; 
	}

	public void draw(Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillOval(this.x - getWidth()/2, this.y - getWidth()/2, getWidth(), getWidth());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.getText().equals("Increase Width")) {
			this.updateWidth();
		}
	}
}
