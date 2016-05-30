package chapter5;

import java.util.Scanner;
import java.util.logging.Logger;

public class UnitConverter {

	private double input;
	private String inputUnit;
	private String outputUnit;
	private double output;
	
	public UnitConverter() {
		Scanner in = new Scanner(System.in);
		System.out.println("Convert From:");
		inputUnit = in.nextLine();
		System.out.println("Convert To:");
		outputUnit = in.nextLine();
		System.out.println("Value:");
		input = in.nextDouble();	
		in.close();
	}
	
	public double convert() {
		output = 0;
		
		if (inputUnit.equals(outputUnit)) {
			output = input;
		}
		else {
	
			// Convert to metres
			double inputMetres = input * this.getMetreMultiplier(inputUnit);
			Logger.getGlobal().info("input in m is " + inputMetres);
			// Convert to output unit
			output = inputMetres / this.getMetreMultiplier(outputUnit);
					
		}
		
		return output;
	}
	
	public void printResult() {
		System.out.println( input + " " + inputUnit + " is " + output + " " + outputUnit);
	}
	
	public double getMetreMultiplier(String unit) {
		double multiplier = 0;
		
		switch(unit) {
		case "mm":
			multiplier = 0.001;
			break;
		case "cm":
			multiplier = 0.01;
			break;
		case "m":
			multiplier = 1;
			break;
		case "km":
			multiplier = 1000;
			break;
		case "mi":
			multiplier = 1609.34;
			break;
		case "in":
			multiplier = 0.0254;
			break;
		case "ft":
			multiplier = 0.3048;
			break;
		}
		
		return multiplier;
	}
	
}
