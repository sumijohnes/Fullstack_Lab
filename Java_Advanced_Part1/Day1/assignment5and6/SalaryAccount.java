package day1.assignment5and6;

public class SalaryAccount implements AccountType{
	
	long accountNumber;
	static int minBankBalance = 0;
	
	String multiCityChequeBook, discountOnShopping, atmCard;
	
	public SalaryAccount() {};
	
	public SalaryAccount(long accountNumber) {
		this.accountNumber = accountNumber;
	};

	@Override
	public void setCustomerPrivileges() {
		
		multiCityChequeBook = "No";
		discountOnShopping = "No";
		atmCard = "Yes";	
	}
	
	

	public long getAccountNumber() {
		return accountNumber;
	}

	public static int getMinBankBalance() {
		return minBankBalance;
	}

	public String getMultiCityChequeBook() {
		return multiCityChequeBook;
	}

	public String getDiscountOnShopping() {
		return discountOnShopping;
	}

	public String getAtmCard() {
		return atmCard;
	}

	@Override
	public void getDetails() {
		
		System.out.println("Account Number: "+this.getAccountNumber());
		System.out.println("Bank Balance: "+getMinBankBalance());
		System.out.println("Cutomer Privileges");
		System.out.println("Multi City Cheque Book: "+this.getMultiCityChequeBook());
		System.out.println("Discount On Shoppoing: "+this.getDiscountOnShopping());
		System.out.println("ATM Card: "+this.atmCard);
		
	}

}
