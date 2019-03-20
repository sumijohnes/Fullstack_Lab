package day1.assignment4;

import java.util.Iterator;
import java.util.List;

public class WellsBank {
	
	private static final CustomerDB customerDB= new CustomerDB();
	private static final Login login = new Login();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer(1001,"Tan",false);
		customerDB.saveCustomer(customer1);	
		login.addLogin(1001, "Wells123");
		
		Customer customer2 = new Customer(1002,"John",true);
		customerDB.saveCustomer(customer2);	
		login.addLogin(1002, "Wells123");
	
		
		Customer customer3 = new Customer(1003,"Sam",true);
		customerDB.saveCustomer(customer3);	
		login.addLogin(1003, "Wells123");

		
		Customer customer4 = new Customer(1004,"Raj",false);
		customerDB.saveCustomer(customer4);	
		login.addLogin(1004, "Wells123");

		
		List<Customer> customerList = customerDB.getAllCustomers();
		if(customerList.isEmpty()) {
			System.out.println("No customers in the List");
		}
		else
		{
			printCustomerList(customerList);
		}
			
		
	}
	
	public static void printCustomerList(List<Customer> customerList) {
		
		Iterator<Customer> it = customerList.iterator();
		System.out.println("                     Customer Details");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Customer Id\tCustomer Name\tLoan Availed");
		
		while(it.hasNext()) {
			Customer customer = it.next();
			System.out.print(customer.getCustomerId()+"\t\t");
			System.out.print(customer.getCustomerName()+"\t\t");
			
			String displayString = "NO";
			if(customer.isLoanAvailed())
				displayString = "YES";
			else
				displayString = "NO";
			
			System.out.println(displayString);
		}
		
		
	}

}
