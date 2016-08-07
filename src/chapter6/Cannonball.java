package chapter6;

public class Cannonball {

	private double initialVelocity;
	private double velocity;
	private double position;

	// The gravitational force of the earth is 9.8m/s^2
	private final static double g = 9.8;

	/**
	 * Constructor with velocity as input
	 * @param velocity - the initial velocity in m/s
	 */
	public Cannonball(double velocity) {
		this.initialVelocity = velocity;
		this.velocity = velocity;
		this.position = 0;
	}

	/**
	 * Approximates the position and velocity of the
	 * cannonball after a specified time
	 * @param timeInterval in seconds
	 */
	public void move(double timeInterval) {
		velocity = velocity - g * timeInterval;
		position = position + velocity * timeInterval;
	}

	/**
	 * Calculates and returns the position by using calculus formula
	 * @param time
	 * @return position
	 */
	public double calculationPositionByFormula(double time) {
		double distance = (-0.5 * g * Math.pow(time, 2)) + (initialVelocity * time);

		return distance;
	}

	/**
	 * Returns the current velocity
	 * @return velocity
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * Returns the current position
	 * @return position
	 */
	public double getPosition() {
		return position;
	}
}
