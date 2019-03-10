package day3.assignment26;

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


public  void withdrawCash(double amount) throws InsufficientBalanceException {
		if(amount <= super.getBalance()) {
			System.out.println("Proceed with withdrawal");
			super.setBalance(super.getBalance()-amount);
		}
		else if (amount <= getEligibilityAmount() + super.getBalance() ) {
			System.out.println("Proceed with withdrawal");
			System.out.println(super.getBalance());
			super.setBalance(super.getBalance()-amount);
			System.out.println(super.getBalance());
			
		}
		else
		{
			throw new InsufficientBalanceException();
			//System.out.println("You dont have sufficient balance");
		}
		
	}


public double getEligibilityAmount() {
	
	return 10000;
}

}
