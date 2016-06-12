package chapter5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Chapter5Tester {

	public static void main(String[] args) {
		
		/*QuadraticEquation qe = new QuadraticEquation(2,-2,-2);
		double s1 = qe.getSolution1();
		double s2 = qe.getSolution2();
		System.out.println("Soln1 = " + s1 + " Soln 2 = " + s2);
		
		
		Card c = new Card();
		System.out.println(c.getDescription());*/
		
		// set logging off
		Logger.getGlobal().setLevel(Level.OFF);
		
		Tax1913 t  = new Tax1913(500000);
		System.out.println("Should be = " + (50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05));
		System.out.println(t.calculateTax());
		
		/* FloatingPointComparison f = new FloatingPointComparison();
		f.compareRounded(); */
		
		/* UnitConverter converter = new UnitConverter();
		double result = converter.convert();
		converter.printResult(); */
		
		Line l = new Line(1,1,2,2);
		boolean equals = l.intersects(new Line(0,2,5,10));
		System.out.println("Is equal? " + equals);
		
		CombinationLock lock = new CombinationLock("MZS");
		lock.open();
		lock.turn('S');
		lock.turn('Z');
		lock.turn('M');
		lock.open();
		lock.turn('Z');
		lock.turn('S');
		lock.open();
		
	}
	
}
