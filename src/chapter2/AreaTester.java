/**
 * 
 */
package chapter2;

import java.awt.Rectangle;

/**
 * @author Syeda Sadia Mahfuz
 *
 */
public class AreaTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Rectangle
		Rectangle rect = new Rectangle(0,0,10,30);
		double area = 0;
		double x = rect.getWidth();
		double y = rect.getHeight();
		
		area = x * y ;
		
		System.out.println("Area: " + area);
		System.out.println("Expected: 300");

	}

}
