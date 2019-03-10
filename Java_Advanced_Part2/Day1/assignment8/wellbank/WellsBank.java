package day1.assignment8.wellbank;

import day1.assignment8.fund.BankFund;
import day1.assignment8.fund.LoanTransaction;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BankFund wellsBankFund = new BankFund(900000);
		LoanTransaction[] loanTransaction = new LoanTransaction[100];
		
		for(int i=0;i<loanTransaction.length;i++) {
			loanTransaction[i] = new LoanTransaction(wellsBankFund, (1000+i),25000);
			
		}
		
		for(int i=0;i<loanTransaction.length;i++) {
			
			loanTransaction[i].run();
			
		}
		
		
		
		
		
		

	}

}
