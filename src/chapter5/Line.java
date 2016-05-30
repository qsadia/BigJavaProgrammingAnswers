package chapter5;

public class Line {
	
	private Double slope;
	private double yIntercept;
	private boolean isVertical;
	
	public Line(double x, double y, double slope) {
		this.slope = slope;
		this.yIntercept = y - (x * slope);
		this.isVertical = false;
	}
	
	public Line(double x1, double y1, double x2, double y2) {
		this.slope = (y2 - y1) / (x2 - x1);
		this.yIntercept = y1 - (x1 * slope);
		this.isVertical = false;
	}
	
	public Line(double slope, double yIntercept) {
		this.slope = slope;
		this.yIntercept = yIntercept;
		this.isVertical = false;
	}

	public Line(double x) {
		this.slope = null;
		this.isVertical = true;
	}
	
	public boolean intersects(Line other) {
		return !this.isParallel(other);
	}
	
	public boolean equals(Line other) {
		boolean isEqual = false;
		
		if (this.slope == other.getSlope() && this.getYIntersept() == other.getYIntersept()) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	public boolean isParallel(Line other) {
		boolean parallel = false;
		
		if(this.isVertical && other.getIsVertical()) {
			parallel = true;
		}
		else if(this.slope == other.getSlope()) {
			parallel = true;
		}
		
		return parallel;
	}
	
	public double getSlope() {
		return this.slope;
	}
	
	public boolean getIsVertical() {
		return this.isVertical;
	}
	
	public double getYIntersept(){
		return this.yIntercept;
	}
	
}
