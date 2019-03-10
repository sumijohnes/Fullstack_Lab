package day1.assignment6and7.transaction;

import day1.assignment6and7.account.Account;

public class DepositTransaction extends Thread{
	
	private int transactionId;
	private Account account;
	private double amount;
	private int customerId;
	
	public DepositTransaction() {
		
	}
	
	public DepositTransaction(int transactionId, Account account, double amount, int customerId) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customerId = customerId;
	}
	
	public synchronized void deposit(Account account, double amount) {
		
		account.setBalance(account.getBalance()+amount);
	}
	
	public void run() {
		
		deposit(account,amount);
		System.out.println("Transaction completed with Transaction ID: "+transactionId+"\n"+customerId+
				" Thank you for depositing to your account "+account.getAccountNo());
		System.out.println("********************");
		                                            
		
	}

}
