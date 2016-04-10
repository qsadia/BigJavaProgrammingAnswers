package chapter3;

public class Bug {

	int currentPosition;
	boolean facingRight;
	
	public Bug(int initialPosition) {
		this.currentPosition = initialPosition;
		this.facingRight = true;
	}
	
	public void move() {
		if(facingRight) {
			this.currentPosition++;
		}
		else {
			this.currentPosition--;
		}
	}
	
	public void turn() {
		this.facingRight = !this.facingRight;
	}
	
	public int getPosition() {
		return this.currentPosition;
	}
}
