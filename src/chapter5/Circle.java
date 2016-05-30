package chapter5;

import java.util.Scanner;

public class Circle {

	private int userX;
	private int userY;
	
	public Circle() {	
	
		System.out.print("Please enter (x,y) coordinates: ");
		Scanner in = new Scanner(System.in);
		this.userX = in.nextInt();
		this.userY = in.nextInt();
		in.close();
	}
	
	
	
	public boolean isInside() {
		return false;
		
	}

}
