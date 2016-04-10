package chapter3;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {
	
	private double purchase; 
	private double payment;
	private double salesTax;
	private double taxRate;
	private double totalSalesAmount;
	private int salesCount;
	
	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister(double taxRate) {
		this.purchase = 0;
		this.payment = 0;
		this.salesTax = 0;
		this.salesCount = 0;
		this.totalSalesAmount = 0;
		this.taxRate = taxRate;
	}
	
	/**
	 * Records the sale of an item.
	 * @param amount the price of the item 
	 */
	public void recordPurchase(double amount) {
		this.purchase = this.purchase + amount;
	}
	
	/**
	 * Records sale of taxable items
	 * @param amount the price of the item before tax
	 */
	public void recordTaxablePurchase(double amount) {
		this.salesTax = this.salesTax + this.taxRate * amount;
		this.purchase = this.purchase + amount;
	}
	
	/**
	 * Enters the payment received from the customer.
	 * @param amount the amount of the payment 
	 */
	public void enterPayment(double amount) {
		this.payment = amount;
	}
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 * @return the change due to the customer 
	 */
	public double giveChange() {
		double change = this.payment - (this.purchase + this.salesTax); 
		this.totalSalesAmount = this.totalSalesAmount + this.purchase;
		this.salesCount++;
		this.purchase = 0;
		this.payment = 0;
		this.salesTax = 0;
		return change;
	}
	
	/**
	 * Returns the total sales amount.
	 * @return amount total sales amount
	 */
	public double getSalesTotal() {
		return this.totalSalesAmount;
	}
	
	/**
	 * Returns the total number of sales.
	 * @return count total number of sales
	 */
	public int getSalesCount() {
		return this.salesCount;
	}
	
	/**
	 * Reset total sales count and amount
	 */
	public void reset() {
		this.totalSalesAmount = 0;
		this.salesCount = 0;
	}
	
}



