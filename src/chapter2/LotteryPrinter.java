package chapter2;

import java.util.Random;

public class LotteryPrinter {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int count = 0;
		int value;
		
		System.out.println("Play this combination!");
		
		while (count < 6){
		
			value = generator.nextInt(49) + 1;
			System.out.print(value + " ");
			
			count++;
			
		}
		
		System.out.println();
		

	}

}
