package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Create a ball that moves randomly and change its color.
 * @author alawamhm
 *
 */

public class RainbowMaker extends AbstractBouncer {
	
	private Color myColor;
	private double diameter;
	private Color[] colors={Color.red,Color.blue,Color.pink,
			 				Color.yellow,Color.cyan,Color.magenta,
			 				Color.orange,Color.green,Color.white};
	
	public RainbowMaker(BallEnvironment e) {
		// TODO Auto-generated constructor stub
		super(e);
		this.myColor = Color.pink;
		this.diameter=20;
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
		this.myColor=colors[(int)(Math.random()*9)];
	}

	@Override
	public double getDiameter() {
		// TODO Auto-generated method stub
		return this.diameter;
	}

}
