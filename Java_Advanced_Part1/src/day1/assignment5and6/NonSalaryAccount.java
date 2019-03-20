package day1.assignment5and6;

public class NonSalaryAccount implements AccountType {
	
    long accountNumber;
    static int minBankBalance = 10000;	
    
	String multiCityChequeBook, discountOnShopping, atmCard;
	
	public NonSalaryAccount() {};
	
	public NonSalaryAccount(long accountNumber) {
		this.accountNumber = accountNumber;
	};

	@Override
	public void setCustomerPrivileges() {
		
		multiCityChequeBook = "No";
		discountOnShopping = "Yes";
		atmCard = "Yes";	
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

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static int getMinBankBalance() {
		return minBankBalance;
	}

	public static void setMinBankBalance(int minBankBalance) {
		NonSalaryAccount.minBankBalance = minBankBalance;
	}

	public String getMultiCityChequeBook() {
		return multiCityChequeBook;
	}

	public void setMultiCityChequeBook(String multiCityChequeBook) {
		this.multiCityChequeBook = multiCityChequeBook;
	}

	public String getDiscountOnShopping() {
		return discountOnShopping;
	}

	public void setDiscountOnShopping(String discountOnShopping) {
		this.discountOnShopping = discountOnShopping;
	}

	public String getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(String atmCard) {
		this.atmCard = atmCard;
	}

	


}
