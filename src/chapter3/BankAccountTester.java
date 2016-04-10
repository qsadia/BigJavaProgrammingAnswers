package chapter3;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		account.withdraw(500);
		account.withdraw(400);
		
		System.out.println("Exepected balance: 100.0");
		System.out.println("Actual balance: " + account.getBalance());
		
		account.addInterest(10);
		
		System.out.println("Exepected balance: 110.0");
		System.out.println("Actual balance: " + account.getBalance());
		
		SavingsAccount savings = new SavingsAccount(1000,10);
		savings.addInterest();
		
		System.out.println("Exepected balance: 1100.0");
		System.out.println("Actual balance: " + savings.getBalance());
		
		
	}

}
