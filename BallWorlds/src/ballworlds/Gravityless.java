package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import ballworlds.Ball;
import ballworlds.BallEnvironment;

/**
 * Creates a ball and I do not know how to explain what it does.
 * @author alawamhm
 *
 */

public class Gravityless extends Ball {

	
	private Color myColor;
	private double diameter;
	private double dx,dy;
	
	public Gravityless(BallEnvironment e){
		super(e, e.getCenterPoint());
		this.myColor = Color.cyan;
		this.diameter = 20;
		this.dx = 0;
		this.dy = 0;
	}
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return myColor;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		double x=(1+(int)(Math.random()*3));
		double y=(1+(int)(Math.random()*3));
		double[] direction = {-1,1};
		this.dx = this.getCenterPoint().getX()+direction[(int)(Math.random()*2)]*x;
		this.dy = this.getCenterPoint().getY()+direction[(int)(Math.random()*2)]*y;
		this.setCenterPoint(new Point2D.Double(this.dx,this.dy));
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
