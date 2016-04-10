package chapter3;

public class Moth {

	private double position;
	
	public Moth(double initialPosition) {
		this.position = initialPosition;
	}
	
	public void moveToLight(double lightPosition) {
		this.position = (position + lightPosition) / 2;
	}
	
	public double getPosition() {
		return this.position;
	}
}
