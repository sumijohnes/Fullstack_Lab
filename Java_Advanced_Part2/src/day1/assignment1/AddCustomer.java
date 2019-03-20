package day1.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {
	
	public void printCustomers(List<String> customer) {
		
		Iterator<String> it = customer.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

	public static void main(String[] args) {
		
		List<String> customer = new ArrayList<String>();
		
		customer.add("Jack");
		customer.add("Harry");
		customer.add("John");
		customer.add("James");
		
		AddCustomer addCustomer = new AddCustomer();
		System.out.println(customer);
		addCustomer.printCustomers(customer);
		
		
		

	}

}
