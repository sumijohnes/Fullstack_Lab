package day1.assignment6and7;

import day1.assignment4.Customer;
import day1.assignment6and7.account.Account;
import day1.assignment6and7.transaction.DepositTransaction;
import day1.assignment6and7.transaction.WithdrawTransaction;

public class WellsBankMain {

	public static void main(String[] args) {
		
		Customer customerOne = new Customer(1001,"Sumi");
		Account accountOne = new Account(2001,customerOne,20000);
		
		Customer customerTwo = new Customer(1002,"Rosh");
		Account accountTwo = new Account(2002,customerTwo,20000);
		
		DepositTransaction firstDeposit = new DepositTransaction(9001,accountTwo,4000,5001);
		firstDeposit.start();
		
		DepositTransaction secondDeposit = new DepositTransaction(9002,accountOne,7000,5002);
		secondDeposit.start();
		
		
		WithdrawTransaction firstWIthdraw = new WithdrawTransaction(9003,accountOne,500,customerOne);
		Thread firstWIthdrawThread = new Thread(firstWIthdraw);
		firstWIthdrawThread.start();
		
		WithdrawTransaction secondWIthdraw = new WithdrawTransaction(9004,accountTwo,30000,customerTwo);
		Thread secondWIthdrawThread = new Thread(secondWIthdraw);
		secondWIthdrawThread.start();	
		

	}

}
