/**
 * 
 */
package chapter2;

import java.awt.Rectangle;

/**
 * @author mahfuzs
 *
 */
public class IntersectionPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(50,50,50,50);
		Rectangle r2 = new Rectangle(75,50,50,50);
		
		printIntersection(r1, r2);
	}
	
	public static void printIntersection(Rectangle r1, Rectangle r2) {
		Rectangle r3 = r1.intersection(r2);
		
		if (r3.getWidth() < 0 || r3.getHeight() < 0) {
			System.out.println("The rectangles do not overlap!");
		}
		else {
			System.out.println("Intersection: " + r3);
		}

	}
	
}
