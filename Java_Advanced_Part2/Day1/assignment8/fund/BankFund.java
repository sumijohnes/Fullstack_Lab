package day1.assignment8.fund;

import day1.assignment8.exception.InsuffientException;

public class BankFund {
	
	private double fund;
	
	public BankFund(double fund) {
		
		this.fund = fund;
		
	}
	
	public synchronized  int checkFund(double amount) throws InsuffientException{
		
		if(fund<amount) {
			throw new InsuffientException("Insufficient fund ");
			
		}
		return 0;
		
		
	}
	
	public double debitFund(double amount) {
		
		fund-=amount;
		
		return fund;
		
	}

}
