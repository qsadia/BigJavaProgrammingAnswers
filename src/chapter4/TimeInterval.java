package chapter4;

import java.util.Scanner;

public class TimeInterval {
	
	private String time1;
	private String time2;
	
	public TimeInterval() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first time: ");
		this.time1 = input.nextLine();
		System.out.print("Please enter the second time: ");
		this.time2 = input.nextLine();
	}
	
	public int getHours(String time) {
		int hour = Integer.parseInt(time.substring(0,2));
		return hour;
	}
	
	public int getMinutes(String time) {
		int minutes = Integer.parseInt(time.substring(2));
		return minutes;
	}
	
	private boolean firstTimeGreater(){
		return this.getHours(time1) > this.getHours(time2);
	}
	
	public int getHourDifference() {
		int difference =  Math.abs(this.getHours(time1) - this.getHours(time2));
		
		if(this.firstTimeGreater()) {
			difference = 24 - difference;
			if(this.getMinutesDifference() > 0) {
				difference--;
			}
		}		
		
		return difference;
	}

	public int getMinutesDifference() {
		int difference =  Math.abs(this.getMinutes(time1) - this.getMinutes(time2));
		
		if (this.firstTimeGreater() && difference != 0) {
			difference = 60 - difference;
		}
		
		return difference;
	}
}
