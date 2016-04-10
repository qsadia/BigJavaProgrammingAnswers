/**
 * 
 */
package chapter3;

/**
 * @author mahfuzs
 *
 */
public class SavingsAccount {
	
	private double balance;
	private double interest;

	/**
	* A savings account has a balance that can be changed by
	* deposits and withdrawals, and accrue interest.
	*/
	public SavingsAccount() {
		this.balance = 0;
		this.interest = 0;	
	}
	

	/**
	* Constructs a savings account with a given balance and interest rate.
	* @param balance the initial balance 
	* @param interest the interest rate
	*/
	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	/**
	* Deposits money into the savings account.
	* @param amount the amount to deposit 
	*/
	public void deposit(double amount) {
		this.balance = this.balance + amount; 
	}
	
	/**
	* Withdraws money from the savings account.
	* @param amount the amount to withdraw 
	*/
	public void withdraw(double amount) {
		this.balance = this.balance - amount; 
	}
	
	/**
	 * Adds interest at the supplied rate.
	 */
	public void addInterest() {
		this.balance = this.balance + (this.balance * this.interest / 100);
	}

	/**
	* Gets the current balance of the savings account.
	* @return the current balance 
	*/
	public double getBalance() {
		return this.balance; 
	}
	
	/**
	 * Gets the current interest rate of the savings account.
	 * @return the interest rate
	 */
	public double getInterest() {
		return this.interest;
	}

	/**
	 * Sets the current interest rate
	 * @param interest
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
}
