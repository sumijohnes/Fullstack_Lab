package assessment3;

public class NegativeAmountException extends Exception{
	
	NegativeAmountException(){
		System.out.println("Please deposit appropriate amount");
	}

}
