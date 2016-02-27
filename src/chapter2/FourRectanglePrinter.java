/**
 * 
 */
package chapter2;

import java.awt.Rectangle;

/**
 * @author mahfuzs
 *
 */
public class FourRectanglePrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(0,0,20,50);
		int width = (int)rect.getWidth();
		int height = (int)rect.getHeight();
		
		System.out.println("Position is: (" + rect.getX() +"," + rect.getY() + ")");
		rect.translate(width, 0);
		System.out.println("Position is: (" + rect.getX() +"," + rect.getY() + ")");
		rect.translate(-width, height);
		System.out.println("Position is: (" + rect.getX() +"," + rect.getY() + ")");
		rect.translate(width, 0);
		System.out.println("Position is: (" + rect.getX() +"," + rect.getY() + ")");

	}

}
