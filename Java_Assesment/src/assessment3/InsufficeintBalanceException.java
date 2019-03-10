package assessment3;

public class InsufficeintBalanceException extends Exception{
	
	InsufficeintBalanceException(){
		System.out.println("You dont have sufficient balance in your account");
	}

}
