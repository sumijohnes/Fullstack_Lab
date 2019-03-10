package assessment3;

public class Account {
	
	private int accountNumber;
	private int balance;
	private static int totalAccounts;
	
	public Account() {
		
	}
	
	
	public Account(int accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	
	public void deposit(int amount) throws NegativeAmountException {
		try {
		if(amount>=0) {
		this.setBalance(this.getBalance()+amount);
		System.out.println("Available Current Balance: "+this.getBalance());
		}
		else
		{
			throw new NegativeAmountException();
		}
		}catch (NegativeAmountException e) {
			e.getMessage();
		}
		
	}
	
	public void withdraw(int amount) throws InsufficeintBalanceException {
		
		try {
		if(this.getBalance()>=amount) {
		this.setBalance(this.getBalance()-amount);
		System.out.println("Available Current Balance: "+this.getBalance());
		}
			else
			{
				throw new InsufficeintBalanceException();
			}
	} catch(InsufficeintBalanceException e) {
		e.getMessage();
	}
	}

}

