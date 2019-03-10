package day2.assignment8;

public class LoanMainClass {

	public static void main(String[] args) {
		
	/*	Loan loan1 = new Loan();
		Loan loan2 = new Loan();
		Loan loan3 = new Loan();
		Loan loan4 = new Loan(121377,366,8789.773f,3,8.9f);
		Loan loan5 = new Loan(121378,368,8789.773f,3,8.8f);
		Loan loan6 = new Loan(121379,369,8789.773f,3,8.6f); */
		
		Loan loan = Loan.getInstance();
		
		System.out.println(loan.getNumberOfObjects());

	}

} 
