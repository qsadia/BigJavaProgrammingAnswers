package chapter5;

import java.util.logging.Logger;

public class Tax1913 {
	
	private double income;
	private double taxRates[] = {0.01, 0.02, 0.03, 0.04, 0.05, 0.06};
	private double brackets[] = {50000, 75000, 100000, 250000, 500000};
	
	
	public Tax1913(double income) {
		this.income = income;
	}
	
	public double calculateTax() {
		
		double tax = 0;
		int i = 1;
		
		if(income <= 0 ) {
			tax = 0;
		}
		else if(income <= brackets[0]) {
			tax = taxRates[0] * income;
		}
		else {
			
			// Calculate tax for the first bracket
			tax = tax + brackets[0] * taxRates[0];
			double incomeLeft = income - brackets[0];
			
			// Calculate tax for earnings up to $500,000
			while(incomeLeft > 0 && i < taxRates.length-1) {
				Logger.getGlobal().info("I is " + i);
				if(incomeLeft - (brackets[i] - brackets[i-1]) <= 0) {
					tax = tax + taxRates[i] * incomeLeft;
					incomeLeft = 0;
					Logger.getGlobal().info("First if Tax is " + tax);
					break;
				}
				
				incomeLeft = incomeLeft - (brackets[i] - brackets[i-1]);
				tax = tax + taxRates[i] * (brackets[i] - brackets[i-1]);
				Logger.getGlobal().info("In while Tax is " + tax);
				i++;
			}
			
			// Calculate tax for earnings over $500,000
			if (incomeLeft > 0) { 
				tax = tax + incomeLeft * taxRates[taxRates.length - 1];
				Logger.getGlobal().info("End if Tax is " + tax);
			}
		}
		return tax;
	}

}
