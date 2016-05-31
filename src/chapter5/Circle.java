package chapter5;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Circle {

	private Ellipse2D.Double circle;
	private Point2D.Double centre;
	private double radius;
	
	/**
	 * Constructs circle with centre at (200,200) and radius of 100
	 */
	public Circle() {	
		this.centre = new Point2D.Double(200, 200);
		this.radius = 100;
		this.circle = new Ellipse2D.Double(centre.getX() - radius, centre.getY() - radius, radius*2, radius*2);
	}
	
	/**
	 * Constructs circle
	 * @param centre the centre point
	 * @param radius the radius
	 */
	public Circle(Point2D.Double centre, double radius) {
		this.centre = centre;
		this.circle = new Ellipse2D.Double(centre.getX() - radius, centre.getY() - radius, radius*2, radius*2);		
		this.radius = radius;
	}


	/**
	 * @return circle
	 */
	public Ellipse2D.Double getCircle() {
		return circle;
	}
	
	/**
	 * @return
	 */
	public double getRadius(){
		return this.radius;
	}
	
	/**
	 * @return
	 */
	public Point2D.Double getCentre() {
		return centre;
	}
	
	
	/**
	 * @param other
	 * @return
	 */
	public boolean intersects(Circle other) {
		double combinedRadius = this.getRadius() + other.getRadius();
		double xDiff = Math.abs(this.getCentre().getX() - other.getCentre().getX());
		double yDiff = Math.abs(this.getCentre().getY() - other.getCentre().getY());
		if(xDiff * xDiff + yDiff * yDiff > combinedRadius * combinedRadius) {
			return false;
		}
		
		return true;
	}
	
	
	/**
	 * @param p a point
	 * @return isInside whether the point is inside the circle
	 */
	public boolean isInside(Point2D.Double p) {
		if (this.getCircle().contains(p)) {
			return true;
		}
		return false;	
	}

}
