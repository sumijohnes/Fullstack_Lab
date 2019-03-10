package day2.assignment13;

public class SavingsAccount extends Account {
	
	private double minBalance;
	private int interestRate;
	
	public SavingsAccount() {}
	
	public SavingsAccount(double minBalance, int interestRate) {
		super();
		this.minBalance = minBalance;
		this.interestRate = interestRate;
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
	
	
    public void depositCash() {
		
	}
	
	
	public void balanceEnquiry() {
		
	}
	
	public void calculateInterest() {
		
		
	}

}
