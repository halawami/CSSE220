package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;

public class Teleporter extends Bouncer {	
	
	public Teleporter(int x, int y){
		super(x,y);
	}
	
	
	@Override
	public void updatePosition() {
		if(minX == maxX)
			throw new RuntimeException("bouncer bounds have not been set");
		int updatedX = x + xVel;
		int updatedY = y + yVel;
		if(updatedX > maxX) {
			updatedX = minX; //so that we are not outside bounds
		}
		if(updatedX < minX) {
			updatedX = maxX; //so that we are not outside bounds
		}
		if(updatedY > maxY) {
			updatedY = minY; //so that we are not outside bounds
		}
		if(updatedY < minY) {
			updatedY = maxY; //so that we are not outside bounds
		}
		this.x = updatedX;
		this.y = updatedY;
	}
	
	// I know I don't need this but it makes it easier for me to follow the ball
	// and see if it works the way I want it to work
	public void draw(Graphics2D g2) {
		g2.setColor(Color.YELLOW);
		g2.fillOval(this.x - getWidth()/2, this.y - getWidth()/2, getWidth(), getWidth());
	}
		

}
