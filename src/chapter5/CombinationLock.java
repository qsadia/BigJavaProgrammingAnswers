package chapter5;

public class CombinationLock {

	private String key;
	private String inputKey;
	private boolean isOpen;
	
	public CombinationLock(String key) {
		this.key = key;
		this.isOpen = false;
		this.inputKey = "";
	}

	public void turn(char position) {
		if(this.inputKey.length() < 3) {
			this.inputKey += position;
		}
		else {
			this.inputKey = this.inputKey.substring(1) + position;
		}
	}
	
	public void open() {
		if(isOpen) {
			System.out.println("It is already open!");
		}
		else if (inputKey.equals(this.key)) {
			this.isOpen = true;
			this.inputKey = "";
			System.out.println("Opened!");		
		}
		else {
			System.out.println("Oops - key mismatch! Try Again.");
		}
	}
	
	public void lock() {
		this.isOpen = false;
		this.inputKey = "";
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}
	
}
