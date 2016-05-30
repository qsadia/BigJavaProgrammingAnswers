package chapter4;

public class DataSet {

	private int sum;
	private double average;
	private int count;
	private int maximum;
	private int minimum;
	
	public DataSet() {
		this.sum = 0;
		this.average = 0;
		this.count = 0;
		this.maximum = 0;
		this.minimum = 0;
	}
	
	public void addValue(int x) {
		this.sum = this.sum + x;
		this.count++;
		this.average = (double)this.sum / this.count;
		
		if(count == 1) {
			this.maximum = x;
			this.minimum = x;
		}
		else {
			this.maximum = Math.max(this.maximum, x);
			this.minimum = Math.min(this.minimum, x);
		}
		
	}

	public int getLargest() {
		return maximum;
	}

	public int getSmallest() {
		return minimum;
	}

	public int getSum() {
		return this.sum;
	}

	public double getAverage() {
		return this.average;
	}
	
	
}