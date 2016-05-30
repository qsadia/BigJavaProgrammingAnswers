package chapter4;

import java.util.Scanner;

public class Pair {

	private double x;
	private double y;
	
	public Pair() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		this.x = input.nextDouble();
		System.out.print("Enter number 2: ");
		this.y = input.nextDouble();
	}
	
	public double getSum() {
		return x + y;
	}
	
	public double getDifference() {
		return x - y;
	}
	
	public double getProduct() {
		return x * y;
	}
	
	public double getAverage() {
		return (x + y) / 2;
	}
	
	public double getDistance() {
		return Math.abs(x - y);
	}
	
	public double getMaximum() {
		return Math.max(x, y);
	}
	
	public double getMinimum() {
		return Math.min(x, y);
	}
}
