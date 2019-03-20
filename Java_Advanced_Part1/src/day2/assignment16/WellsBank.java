package day2.assignment16;

public class WellsBank {
	
	public static void transaction(Account account, double amount) {
		account.depositCash(amount);
		
	}
	
	public static void main(String[] args) {
		
		Customer john = new Customer(1,"John Mathew","Address",645567);
		
		SavingsAccount johnSA = new SavingsAccount(101,john,1000);
		transaction(johnSA,1000);	
		System.out.println("Avaialble Balance in Account Number 101: "+johnSA.getBalance());
		johnSA.withdrawCash(1600);
		System.out.println("Balance in Account Number 101: "+johnSA.getBalance());
		
		System.out.println("********************");
		
		Customer jenny = new Customer(2,"Jenny Leo","Address",640967);
		OverdraftAccount jennySA = new OverdraftAccount(201,jenny,500,2000);
		transaction(jennySA,1500);	
		System.out.println("Avaialble Balance in Account Number 201: "+(jennySA.getBalance()+jennySA.getEligibilityAmount()));	
		jennySA.withdrawCash(1000);
		System.out.println("Avaialble Balance in Account Number 201: "+(jennySA.getBalance()+jennySA.getEligibilityAmount()));	
		jennySA.withdrawCash(4000);
		System.out.println("Avaialble Balance in Account Number 201: "+(jennySA.getBalance()+jennySA.getEligibilityAmount()));
		jennySA.withdrawCash(3000);
		System.out.println("Avaialble Balance in Account Number 201: "+(jennySA.getBalance()+jennySA.getEligibilityAmount()));
			
	}

}
