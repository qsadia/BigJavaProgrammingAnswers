package chapter6;

/**
 * Solution to P6.5
 * @author mahfuzs
 *
 */
public class PowerGenerator {

	private double factor;
	private double current;

	/**
	 * Constructs a power Generator.
	 * @param aFactor the number that will be multiplied by itself
	 */
	public PowerGenerator(double aFactor) {
		this.factor = aFactor;
		current = 1;
	}

	/**
	 * Calculates the next power.
	 * @return the next power
	 */
	public double nextPower() {
		current = current * factor;
		return current;
	}
}
