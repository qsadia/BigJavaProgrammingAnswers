package chapter4;

public class Chapter4Tester {

	public static void main(String[] args) {
		
		// Pair tester
		/*Pair p = new Pair();
		System.out.println("Sum = " + p.getSum());
		System.out.println("Difference = " + p.getDifference());
		System.out.println("Product = " + p.getProduct());
		System.out.println("Average = " + p.getAverage());
		System.out.println("Distance = " + p.getDistance());
		System.out.println("Maximum = " + p.getMaximum());
		System.out.println("Minimum = " + p.getMinimum());
		
		// DataSet tester
		DataSet d = new DataSet();
		
		d.addValue(10);
		d.addValue(5);
		d.addValue(70);
		d.addValue(25);
		
		System.out.println("Expected sum = " + 110);
		System.out.println("Expected average = " + 27.5);
		System.out.println("Expected minimum = " + 5);
		System.out.println("Expected maximum = " + 70);
		System.out.println("Actual sum = " + d.getSum());
		System.out.println("Actual average = " + d.getAverage());
		System.out.println("Actual minimum = " + d.getSmallest());
		System.out.println("Actual maximum = " + d.getLargest());

		// Digit Extractor tester
		DigitExtractor de = new DigitExtractor(16384);
		for (int i = 0; i < 5; i++) {
			System.out.println(de.nextDigit());
		}*/
		
		// TimeInterval tester
		TimeInterval ti = new TimeInterval();
		int hourDiff = ti.getHourDifference();
		int minuteDiff = ti.getMinutesDifference();
		System.out.println(hourDiff + " hours " + minuteDiff + " minutes");
		
	}
	
}
