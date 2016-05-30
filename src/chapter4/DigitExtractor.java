package chapter4;

public class DigitExtractor {

	private int inputInteger;
	
	// We are working with base 10 numbers.
	private final int divisionFactor = 10;
	
	public DigitExtractor(int inputInteger) {
		this.inputInteger = inputInteger;
	}
	
	public int nextDigit() {
		int next = this.inputInteger % this.divisionFactor;
		this.inputInteger = this.inputInteger / 10;
		return next;
	}
	
}
