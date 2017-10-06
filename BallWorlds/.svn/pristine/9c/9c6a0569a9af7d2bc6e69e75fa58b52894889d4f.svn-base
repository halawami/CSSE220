package ballworlds;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

/**
 * Creates a ball that moves randomly but its size increases and when it reaches a certain point it splits up into two other balls.  
 ** @author alawamhm
 *
 */

public class Exploder extends AbstractBouncer {

	private Color myColor;
	private double maxDimension;
	private double diameter;
	
	
	public Exploder(BallEnvironment e){
		super(e);
		this.myColor = Color.green;
		this.diameter = 20;
		this.maxDimension=this.diameter*(int)(Math.random()*9+2);
	}
	
	public Exploder(BallEnvironment e, Point2D.Double center){
		super(e,center);
		this.myColor = Color.green;
		this.diameter = 20;
		this.maxDimension=this.diameter*(int)(Math.random()*9+2);
	}
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return myColor;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		super.updatePosition();
	}

	@Override
	public void updateSize() {
		// TODO Auto-generated method stub
		if(this.getDiameter()==this.maxDimension){
			Point2D.Double finalPosition = (Double) this.getCenterPoint();
			super.die();
			Exploder ball = new Exploder(getWorld(),finalPosition);
			super.getWorld().addBall(ball);
			Exploder ball2 = new Exploder(getWorld(),new Point2D.Double((double)finalPosition.getX()+10,(double)finalPosition.getY()+10));
			super.getWorld().addBall(ball2);
			
		}
		this.diameter+=0.5;

	}

	@Override
	public void updateColor() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDiameter() {
		// TODO Auto-generated method stub
		return this.diameter;
	}

}
