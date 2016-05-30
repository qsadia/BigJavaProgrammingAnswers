package chapter3;

public class BullsEye {

	private int numRings;
	private double radius;
	
	public BullsEye() {
		this.numRings = 5;
		this.radius = 100;
	}
	
	public BullsEye(int numRings, int radius) {
		this.numRings = numRings;
		this.radius = radius;
	}

	public int getNumRings() {
		return this.numRings;
	}

	public void setNumRings(int numRings) {
		this.numRings = numRings;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
		
	
	
}
