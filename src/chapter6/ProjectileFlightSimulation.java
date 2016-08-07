package chapter6;

/**
 * Solution to P6.4
 * @author mahfuzs
 *
 */

import java.util.Scanner;

public class ProjectileFlightSimulation {

	private Cannonball c;

	public ProjectileFlightSimulation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an input velocity in m/s: ");
		double velocity = in.nextDouble();
		c = new Cannonball(velocity);
		in.close();
	}

	public void runSimulation() {
		// Set position to a value > 0
		double position = 100;

		// Set time interval to 0.01s
		double timeInterval = 0.01;
		double totalTime = timeInterval;

		int count = 0;
		double formulaPos = 0;

		// Get the approximate position by simulation every 0.01 seconds
		// Also get the position determined by calculus
		// Print the estimates every 1 second
		System.out.println("Time(s)\tSimulation\tCalculus");
		while(position > 0) {
			c.move(timeInterval);
			position = c.getPosition();
			formulaPos = c.calculationPositionByFormula(totalTime);
			totalTime += timeInterval;
			count++;
			if (count % 100 == 0) {
				System.out.format("%7d\t%10.2f\t%8.2f\n", count/100, position, formulaPos);
			}
		}

	}

}
