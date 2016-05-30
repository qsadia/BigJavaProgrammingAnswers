package chapter5;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean hasSolutions() {
		boolean hasSolution = true;
		
		if (this.getDiscriminant() < 0 ) {
			System.out.println("There are no real solutions.");
			hasSolution = false;
		}
		
		return hasSolution;
	}
	
	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}
	
	public double getSolution1() {
		double solution = 0;
		
		if (this.hasSolutions()) {
			solution = ((-1 * b) + Math.sqrt(this.getDiscriminant())) / (2 * a);
		}
		
		return solution;
		
	}
	
	public double getSolution2() {
		double solution = 0;
		
		if (this.hasSolutions()) {
			solution = ((-1 * b) - Math.sqrt(this.getDiscriminant())) / (2 * a);
		}
		
		return solution;
	}
	
}
