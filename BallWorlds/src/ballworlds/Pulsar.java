package ballworlds;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.concurrent.TimeUnit;

/**
 * Creates a ball that is stationary but its color smoothly changes from black to white.
 * @author alawamhm
 *
 */

public class Pulsar extends Ball {

	private Color myColor;
	private double diameter;
	private int colorDegree;
	private int dc;
	
	public Pulsar(BallEnvironment e){
		super(e,new Point2D.Double((double) (Math.random()*e.getSize().getWidth()),
				 	 			   (double) (Math.random()*e.getSize().getHeight())));
		myColor = Color.BLACK;
		this.diameter = 20;
		this.dc = 0;
		this.colorDegree=0;
	}
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return myColor;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void updateSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateColor() {
		if(this.colorDegree>=250){
			this.dc=-5;
		}if(this.colorDegree<=0){
			this.dc = 5;
		}
		colorDegree+=dc;
		this.myColor = new Color(colorDegree,colorDegree,colorDegree);
	}

	@Override
	public double getDiameter() {
		// TODO Auto-generated method stub
		return this.diameter;
	}

}
