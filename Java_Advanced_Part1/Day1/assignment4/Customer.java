package day1.assignment4;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String address;
	private int pinCode;

	public static void main(String[] args) {
		
		Customer  customer = new Customer();
		customer.customerId = "1234";
		customer.customerName = "John";
		customer.address = "PHA-Sawan apts., Yadavgiri Mysore";
		customer.pinCode = 57002;
		
		System.out.println("Customer ID: "+customer.customerId);
		System.out.println("Customer Name: "+customer.customerName);
		System.out.println("Customer Address: "+customer.address);
		System.out.println("Pin Code: "+customer.pinCode);
	

	}

}
