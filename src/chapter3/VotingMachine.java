package chapter3;

public class VotingMachine {

	public int numTory;
	public int numLabour;
	public int numGreen;
	
	public VotingMachine() {
		this.numGreen = 0;
		this.numLabour = 0;
		this.numTory = 0;
	}
	
	public void voteGreen() {
		this.numGreen++;
	}
	
	public void voteLabour() {
		this.numLabour++;
	}
	
	public void voteTory() {
		this.numTory++;
	}
	
	public void clear() {
		this.numGreen = 0;
		this.numLabour = 0;
		this.numTory = 0;	
	}
	
	
	
	public int getNumTory() {
		return this.numTory;
	}

	public int getNumLabour() {
		return this.numLabour;
	}

	public int getNumGreen() {
		return this.numGreen;
	}

	public void printTally() {
		System.out.println("Tally:");
		System.out.println("Conservative: " + this.getNumTory());
		System.out.println("Labour:       " + this.getNumLabour());
		System.out.println("Green:        " + this.getNumGreen());
	}
}
