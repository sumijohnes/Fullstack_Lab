package day1.assignment6and7.security;

import day1.assignment4.Customer;
import day1.assignment6and7.account.Account;
import day1.assignment6and7.exception.UnauthorizedWithdrawTransactionException;

public class Security {

	public synchronized void authorization(Account account, Customer customer) throws UnauthorizedWithdrawTransactionException{
		
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			
			throw new UnauthorizedWithdrawTransactionException();
		}
		
	}
}
