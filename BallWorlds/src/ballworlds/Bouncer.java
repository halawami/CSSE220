package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Creates a ball the moves in a random direction and a random speed that bounces between the edges.
 * @author alawamhm
 *
 */

public class Bouncer extends AbstractBouncer {
	
	private Color myColor;
	private double diameter;
	
	public Bouncer (BallEnvironment e){
		super(e);	
		myColor = Color.YELLOW;
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
		super.updatePosition();

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
