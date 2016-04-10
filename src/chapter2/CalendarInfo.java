package chapter2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarInfo {

	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		// date 100 days from today
		cal.add(Calendar.DAY_OF_MONTH, 100);
		String date = stringWeekday(cal.get(Calendar.DAY_OF_WEEK)) + " " + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.YEAR);
		System.out.println("The date 100 days from today is: " + date);
		
		// date of my birthday
		cal.set(cal.get(Calendar.YEAR), 4, 30);
		System.out.println("The weekday of my birthday this year is: " + stringWeekday(cal.get(Calendar.DAY_OF_WEEK)));
		
		// date 10,000 days from my birthday
		cal.add(Calendar.DATE, 10000);
		date = stringWeekday(cal.get(Calendar.DAY_OF_WEEK)) + " " + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.YEAR);
		System.out.println("The date 10,000 days from my birthday this year is: " + date);
		
	}

	
	public static String stringWeekday(int day) {
		String stringDay = null;
		
		switch(day) {
		case 1:
			stringDay = "Sunday";
			break;
		case 2: 
			stringDay = "Monday";
			break;
		case 3: 
			stringDay = "Tuesday";
			break;
		case 4:
			stringDay = "Wednesday";
			break;
		case 5: 
			stringDay = "Thursday";
			break;
		case 6: 
			stringDay = "Friday";
			break;
		case 7:
			stringDay = "Saturday";
			break;
		default:
			stringDay = "ERROR";
			break;
		}
		
		return stringDay;
	}
		

}
