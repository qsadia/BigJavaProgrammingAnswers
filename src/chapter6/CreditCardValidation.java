package chapter6;

import java.util.ArrayList;

public class CreditCardValidation {

	private int creditCardNumber;
	private static final int SIZE = 8;


	public CreditCardValidation(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}


	public boolean isValid() {

		int remainder = this.calculateCheckSum() % 10;
		boolean valid = false;

		if (remainder == 0) {
			System.out.println("The credit card number is valid.");
			valid = true;
		}
		else {
			System.out.println("Invalid number!");
			System.out.println("The last digit should be: " + calculateValidLastDigit());
		}

		return valid;
	}


	private int calculateValidLastDigit() {

		int remainder = this.calculateCheckSum() % 10;
		int actualLastDigit = this.creditCardNumber % 10;
		int correction = actualLastDigit - remainder;
		int lastDigitShouldBe = Math.abs(correction);

		return lastDigitShouldBe;
	}


	private int calculateCheckSum() {
		int checkSum = 0;

		// sum of right digits
		int rightSum = 0;
		int temp = this.creditCardNumber;

		for(int i = 0; i < SIZE / 2; i++) {
			rightSum = rightSum + (temp % 10);
			temp = temp / 100;
		}

		// construct array from left digits
		ArrayList<Integer> toSum = new ArrayList<>();
		temp = this.creditCardNumber;

		for(int i = 0; i < SIZE / 2; i++) {
			int digit = (temp % 100) / 10;
			digit *= 2;

			temp = temp / 100;

			while (digit > 0) {
				toSum.add(digit % 10);
				digit = digit / 10;
			}
		}

		// compute checksum
		checkSum = rightSum + toSum.stream().mapToInt(Integer::intValue).sum();

		return checkSum;
	}


}
