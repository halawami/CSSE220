package ballworlds;

import java.awt.geom.Point2D;

/**
 * A ball that bounces off the walls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public abstract class AbstractBouncer extends Ball {
	// nothing here... yet

	private double[] direction = {-1,1};
	private double x = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double y = direction[(int)(Math.random()*2)]*(1+(int)((Math.random()*3)));
	private double dx,dy;
	
	
	/**
	 * Constructs a abstract bouncer in the given world.
	 * 
	 * @param world
	 */
	public AbstractBouncer(BallEnvironment world) {
		super(world,world.getCenterPoint());
		this.dx=0;
		this.dy=0;
	}
	
	public AbstractBouncer(BallEnvironment world, Point2D.Double center) {
		super(world,center);
		this.dx=0;
		this.dy=0;
	}
		
	@Override
	public void updatePosition(){
		this.dx = getCenterPoint().getX()+this.x;
		this.dy = getCenterPoint().getY()+this.y;
		Point2D.Double newCenter = new Point2D.Double(this.dx,this.dy);
		if(this.dx > this.getWorld().getSize().getWidth()||this.dx<0){
			this.x = -this.x;
		}
		else if(this.dy > this.getWorld().getSize().getHeight()||this.dy<0){
			this.y = -this.y;
		}
		this.setCenterPoint(newCenter);
	}
}
