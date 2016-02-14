package chapter1;

public class Sum10{

	public static void main(String[] args){
		int numbers = 10;
		int sum = 0;
		int count = 0;

		while (count < numbers){
			sum = sum + count + 1;
			count++;
		}

		System.out.println("1 + 2 + ... + " + numbers +" = " + sum);
	}

}