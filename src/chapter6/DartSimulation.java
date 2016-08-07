package chapter6;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Random;

/**
 * Solution to P6.14
 * @author mahfuzs
 *
 */
public class DartSimulation {

	private Random r;
	private double pi;

	public DartSimulation() {
		r = new Random();
	}

	public Point2D throwDart() {
		Point2D p;
		double x = r.nextDouble() * 2 - 1;
		double y = r.nextDouble() * 2 - 1;

		p = new Point2D.Double(x,y);
		return p;
	}

	public void runSimulation(int numTimes) {
		int count = 0;
		int numInCircle = 0;

		Ellipse2D.Double circle = new Ellipse2D.Double(-1, -1, 1, 1);
		while (count < numTimes)
		{
			Point2D p = this.throwDart();
			if ((p.getX() * p.getX() + p.getY() * p.getY()) <= 1) {
				numInCircle++;
			}
			count++;
		}
		System.out.println(numInCircle);
		pi = 4 * (double)numInCircle / numTimes;
	}

	public double getPiApprox() {
		return pi;
	}

}
