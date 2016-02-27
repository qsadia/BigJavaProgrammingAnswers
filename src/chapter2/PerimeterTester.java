package chapter2;

import java.awt.Rectangle;

public class PerimeterTester {

	public static void main(String[] args) {
		// Rectangle object
		
		Rectangle rect = new Rectangle(10,10,100,125);
		double perimetre = 0;
		double x = rect.getWidth();
		double y = rect.getHeight();
		
		perimetre = x*2 + y*2;
		
		System.out.println("Perimetre: " + perimetre);
		System.out.println("Expected: 450");
		
	}

}
