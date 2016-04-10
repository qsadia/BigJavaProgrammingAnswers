package chapter3;

public class RoachPopulation {

	private int population;
	
	public RoachPopulation(int initialPopulation) {
		this.population = initialPopulation;
	}
	
	public void breed() {
		this.population *= 2;
	}
	
	public void spray() {
		this.population = (int) (0.9 * this.population);
	}
	
	public int getRoaches() {
		return this.population;
	}

}


