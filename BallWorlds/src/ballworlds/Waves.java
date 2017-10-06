package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

/**
 * Creates a ball similar to the exploder that moves randomly and ends up looking like a wave.
 * @author alawamhm
 *
 */

public class Waves extends Ball {
	
	private Color myColor;
	private double diameter;
	private double maxDimension;
	private double[] direction = {-1,1};
	private double x = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double y = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double dx,dy;
	
	public Waves(BallEnvironment e){
		super(e,new Point2D.Double(10,e.getSize().getHeight()-20));
		this.myColor = Color.lightGray;
		this.diameter=20;
		this.maxDimension=this.diameter*(int)(Math.random()*9+2);
	}
	
	public Waves(BallEnvironment e, Point2D.Double center){
		super(e,center);
		this.myColor = Color.lightGray;
		this.diameter=20;
		this.maxDimension=this.diameter*(int)(Math.random()*9+2);
	}
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.myColor;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		this.dx = getCenterPoint().getX()+this.x;
		this.dy = getCenterPoint().getY()+this.y;
		Point2D.Double newCenter = new Point2D.Double(this.dx,this.dy);
		if(this.dx > this.getWorld().getSize().getWidth()||this.dx<0){
			this.x = -this.x;
		}
		else if(this.dy > this.getWorld().getSize().getHeight()||this.dy<this.getWorld().getSize().getHeight()/2+20){
			this.y = -this.y;
		}
		this.setCenterPoint(newCenter);

	}

	@Override
	public void updateSize() {
		// TODO Auto-generated method stub
		if(this.getDiameter()==this.maxDimension){
			Point2D.Double finalPosition = (Double) this.getCenterPoint();
			super.die();
			Waves ball = new Waves(getWorld(),finalPosition);
			this.getWorld().addBall(ball);
			Waves ball2 = new Waves(getWorld(),new Point2D.Double((double)finalPosition.getX()+10,(double)finalPosition.getY()+10));
			this.getWorld().addBall(ball2);
			
		}else{
		this.diameter += 0.5;
		}
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
