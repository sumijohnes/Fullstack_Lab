package day2.assignment8;

public class Loan {
	
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	
	private static int loanCounter;
	
	static {
		
		loanCounter = 101;
	}
	
	private Loan() {
		loanCounter++;
	}

	private Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
		super();
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		loanCounter++;
	}
	
	public static Loan getInstance() {
		
		return new Loan();
		
	}
	
	public int getNumberOfObjects() {
		return loanCounter;
		
		
	}



	public int getLoanNo() {
		return loanNo;
	}



	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}



	public int getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}



	public int getCustomerNo() {
		return customerNo;
	}



	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}



	public float getLoanAmount() {
		return loanAmount;
	}



	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}



	public int getLoanDuration() {
		return loanDuration;
	}



	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}



	public float getInterest() {
		return interest;
	}



	public void setInterest(float interest) {
		this.interest = interest;
	}

public float calculateInstallments() {
	
	
	return accountNo;	
	
}

/* public static void main(String[] args) {
	
	Loan loan1 = new Loan();
	Loan loan2 = new Loan();
	Loan loan3 = new Loan();
	Loan loan4 = new Loan(121377,366,8789.773f,3,8.9f);
	Loan loan5 = new Loan(121378,368,8789.773f,3,8.8f);
	Loan loan6 = new Loan(121379,369,8789.773f,3,8.6f);
	
	System.out.println(loanCounter);

} */
	

}
