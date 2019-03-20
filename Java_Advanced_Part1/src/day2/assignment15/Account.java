package day2.assignment15;

public class Account {
	
	private long accountNo;
	private Customer customer;
	protected double balance;
	
	public Account() {};
	
	public Account(long accountNo, Customer customer, double balance) {
		super();
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void depositCash(double amount) {
		
		this.balance = this.balance + amount;
		
	}
	
	

}
