package day1.assignment6and7.exception;

public class UnauthorizedWithdrawTransactionException extends Exception {

	public UnauthorizedWithdrawTransactionException() {
		System.out.println("User is unauthorized for the withdrawal");
	}
	
}
