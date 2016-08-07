package chapter6;

/**
 * Solution to P6.8
 * @author mahfuzs
 *
 */
public class FactorGenerator {

	private int numberToFactor;
	private int current;

	public FactorGenerator(int numberToFactor) {
		this.numberToFactor = numberToFactor;
		this.current = numberToFactor;
	}

	/**
	 * Calculates the next factor
	 * @return the next factor
	 */
	public int nextFactor() {
		int factor = 0;
		for (int i = 2; i <= current; i++) {
			if(current % i == 0) {
				factor = i;
				current /= i;
				break;
			}
		}
		return factor;
	}

	/**
	 * Determines whether or not all factors have been found
	 * @return whether there are still more factors
	 */
	public boolean hasMoreFactors() {
		if (current == 1) {
			return false;
		}
		return true;
	}

}
