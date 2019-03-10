package day1.assignment6and7.transaction;

import day1.assignment4.Customer;
import day1.assignment6and7.account.Account;
import day1.assignment6and7.exception.InsufficientBalanceExcpetion;
import day1.assignment6and7.exception.UnauthorizedWithdrawTransactionException;
import day1.assignment6and7.security.Security;

public class WithdrawTransaction extends Security implements Runnable{
	
	private int transactionId;
	private Account account;
	private double amount;
	private Customer customer;
	
	public WithdrawTransaction() {
		
	}

	public WithdrawTransaction(int transactionId, Account account, double amount, Customer customer) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customer = customer;
	}


	public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceExcpetion {
		
		if(account.getBalance()>=amount) {
			account.setBalance(account.getBalance()-amount);
		}
		else
		{
			throw new InsufficientBalanceExcpetion();
		}
		
		return account.getBalance();
	}

	@Override
	public void run() {
		
		try {
			authorization(account,customer);
			double balance = withdraw(account, amount);
			System.out.println("Transaction completed with Transaction Id "+"\n"+transactionId+
					" Available balance in account "+account.getAccountNo()+" is "+balance);
			} catch (InsufficientBalanceExcpetion e) {
				System.out.println(transactionId+" Transaction Failed "+e.getMessage());
				e.printStackTrace();
			}
		  catch (UnauthorizedWithdrawTransactionException e) {
			  System.out.println(transactionId+" Transaction Failed due to "+e.getMessage());
		}finally {
			System.out.println("********************");

		}
		
	}

}
