package day2.assignment17;

public class SavingsAccount extends Account {
	
	private double minBalance = 500;
	private int interestRate = 12;
	
	public SavingsAccount() {}
	
	public SavingsAccount(long accountNumber, Customer customer, double balance) {
		super(accountNumber,customer,balance);
		
	}
	
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
 public void withdrawCash(double amount) {
	
	if(super.getBalance()- amount >= minBalance)
	{
		System.out.println("SA: Proceed with withdrawal");
		super.setBalance(super.getBalance()- amount);
	}
	
	else
	{
		System.out.println("SA: You don't have sufficient balance");
	}
		
	} 
	
	
	public void calculateInterest() {
		
		float interest = (float) ((super.getBalance()* interestRate) /100);
		System.out.println("Interest is: "+ interest);
		
	}

}
