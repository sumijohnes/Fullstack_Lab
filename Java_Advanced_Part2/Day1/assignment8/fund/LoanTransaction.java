package day1.assignment8.fund;

import day1.assignment8.exception.InsuffientException;

public class LoanTransaction {
	
	private BankFund bankFund;
	private int customerId;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
		super();
		this.bankFund = bankFund;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
	}
	
	public void run() throws InterruptedException {
		
		try {
			
			bankFund.checkFund(loanAmount);
			Thread.sleep((long) (2000 * Math.random()));
			double fundAvailable = bankFund.debitFund(loanAmount);
			System.out.println("Loan disbursed. Plase collect cash");
			System.out.println("Fund left in the bank: "+fundAvailable);
		}catch (InsuffientException e) {
			System.out.println("Sorry!!! "+customerId+" please try later as we are short of money");
		}
	}
	
	

}
