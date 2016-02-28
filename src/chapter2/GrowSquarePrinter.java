package chapter2;

import java.awt.Rectangle;

public class GrowSquarePrinter {
	
	public static void main (String[] args) {
		
		Rectangle square = new Rectangle(100,100,50,50);
		System.out.println("Original: " + square);
		
		int growBy = (int)(square.getWidth() / 2);
		square.grow(growBy, growBy);
		square.translate(growBy, growBy);
		
		System.out.println("Transformed: " + square);
		
	}

}

