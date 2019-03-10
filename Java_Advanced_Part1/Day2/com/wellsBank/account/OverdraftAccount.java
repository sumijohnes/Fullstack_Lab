package day2.com.wellsBank.account;

import day2.com.wellsBank.customer.Customer;

public class OverdraftAccount extends Account {
	
	private double currentAmount;

	public OverdraftAccount() {}
	
	public OverdraftAccount(long accountNumber, Customer customer, double balance, double currentAmount) {
		super(accountNumber,customer,balance);
		this.currentAmount = currentAmount;
	}

	public double getFixedAmount() {
		return currentAmount;
	}

	public void setFixedAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}


public  void withdrawCash(double amount) {
		if(amount <= super.getBalance()) {
			System.out.println("OA: Proceed with withdrawal");
			super.setBalance(super.getBalance()-amount);
		}
		else if (amount <= getEligibilityAmount() + super.getBalance() ) {
			System.out.println("OA: Proceed with withdrawal");
			System.out.println(super.getBalance());
			super.setBalance(super.getBalance()-amount);
			System.out.println(super.getBalance());
			
		}
		else
		{
			System.out.println("OA: You dont have sufficient balance");
		}
		
	}


public double getEligibilityAmount() {
	
	return 10000;
}

}
