package chapter6;

/**
 * Solution to P6.9
 * @author mahfuzs
 *
 */
public class PrimeGenerator {

	private int nextPrime;

	/**
	 * Constructs a prime generator
	 */
	public PrimeGenerator() {
		this.nextPrime = 0;
	}

	/**
	 * Determines the next prime number
	 * @return the next prime number
	 */
	public int nextPrime() {
		if (nextPrime == 0) {
			nextPrime = 2;
		}

		else {
			boolean foundPrime = false;

			while (!foundPrime) {
				nextPrime++;
				for (int i = 2; i <= nextPrime; i++) {
					if (i == nextPrime) {
						// Number is not divisible by anything other that 1 and itself
						foundPrime = true;
					}
					else if (nextPrime % i == 0) {
						break;
					}
				}
			}
		}

		return nextPrime;
	}

}
