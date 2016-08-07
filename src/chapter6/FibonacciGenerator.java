package chapter6;

/**
 * Solution to P6.6
 * @author mahfuzs
 *
 */
public class FibonacciGenerator {

	private int fold1;
	private int fold2;
	private int count;

	/**
	 * Constructs a Fibonacci Generator and sets the first two values
	 */
	public FibonacciGenerator() {
		fold1 = 1;
		fold2 = 1;
		count = 0;
	}

	/**
	 * Calculates the next number in the Fibonacci sequence
	 * @return the next Fibonacci number
	 */
	public int nextNumber() {
		if (count < 2) {
			count++;
			return 1;
		}

		int fnew = fold1 + fold2;
		fold2 = fold1;
		fold1 = fnew;

		return fnew;
	}

}
