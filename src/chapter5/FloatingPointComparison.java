package chapter5;

import java.util.Scanner;
import java.util.logging.Logger;

public class FloatingPointComparison {

	private double number1;
	private double number2;
	
	public FloatingPointComparison() {
		
		System.out.println("Please enter two floating point numbers");
		Scanner in = new Scanner(System.in);
		number1 = in.nextDouble();
		number2 = in.nextDouble();
		in.close();	
	}
	
	public void compareRounded() {
		
		double rounded1 = Math.round(number1 * 100d) / 100d;
		double rounded2 = Math.round(number2 * 100d) / 100d;
		Logger.getGlobal().info("Rounded 1: " + rounded1 + " Rounded 2: " + rounded2);
		
		if (rounded1 == rounded2) {
			System.out.println("They are the same when rounded to two decimal places.");
		}
		else {
			System.out.println("They are different when rounded to two decimal places.");
		}
		
		if (Math.abs(number1 - number2) < 0.01) {
			System.out.println("They differ by less than 0.01");
		}
	}
	
}
