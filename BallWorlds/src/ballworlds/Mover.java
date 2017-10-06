package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Creates a ball the moves in a random direction and a random speed without bouncing of anything.
 * @author alawamhm
 *
 */

public class Mover extends Ball {

	private Color myColor;
	private double diameter;
	
	private double[] direction = {-1,1};
	private double x = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double y = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double dx,dy;
	
	public Mover (BallEnvironment e){
		super(e,e.getCenterPoint());
		myColor = Color.pink;
		this.diameter = 20;
		
	}
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return myColor;
	}

	

	
	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		this.dx = getCenterPoint().getX()+this.x;
		this.dy = getCenterPoint().getY()+this.y;
		Point2D.Double newCenter = new Point2D.Double(this.dx,this.dy);
		this.setCenterPoint(newCenter);
	}

	@Override
	public void updateSize() {
		// TODO Auto-generated method stub

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