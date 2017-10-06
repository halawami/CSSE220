package polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends GeometricShapes implements Shapes  {
	private int centerX;
	private int centerY;
	private int width;
	
	public Circle(int centerX, int centerY, int diameter) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.width = diameter;
	}
	
	public void transform(int x, int y) {
		this.centerX += x;
		this.centerY += y;
	}
	
	public int upperLeftX() {
		return this.centerX - this.width/2;
	}
	
	public int upperLeftY() {
		return this.centerY - this.width/2;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillOval(upperLeftX(),upperLeftY(), getWidth(), getWidth());
	}
}
