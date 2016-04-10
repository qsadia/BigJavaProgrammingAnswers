/**
 * 
 */
package chapter3;

/**
 * @author mahfuzs
 *
 */
/**
 * @author mahfuzs
 *
 */
public class Car {

	public double fuelEfficiency;
	public double fuelLevel;
	
	/**
	 * Constructs car with fuelEfficiency and empty fuel tank.
	 * @param fuelEfficiency in km/litres
	 */
	public Car(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = 0;
	}
	
	/**
	 * Drive a given distance. Enough fuel in tank is required.
	 * @param distance in km
	 */
	public void drive(double distance) {
		double fuelUsed = distance / this.fuelEfficiency;
		if (fuelUsed <= fuelLevel) {
			this.fuelLevel = this.fuelLevel - fuelUsed;
		}
		else {
			System.out.println("Not enough fuel to drive " + distance + "km.");
		}
	}
	
	/**
	 * Add fuel (in litres) to tank.
	 * @param amount in litres
	 */
	public void addGas(double amount) {
		this.fuelLevel = this.fuelLevel + amount;
	}
	
	/**
	 * Returns the current level on fuel in tank (in litres).
	 * @return fuelLevel in litres
	 */
	public double getGasInTank() {
		return this.fuelLevel;
	}
	
}
