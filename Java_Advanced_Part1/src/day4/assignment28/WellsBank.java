package day4.assignment28;

public class WellsBank {

	public static void main(String[] args) {

		Customer john = new Customer();
		
		john.setCustomerId(101);
		john.setCustomerName("John");
		john.setAddress("address");
		john.setPinCode(12647);
		
		System.out.println(john.getCustomerId());
		System.out.println(john.getCustomerName());
		System.out.println(john.getAddress());
		System.out.println(john.getPinCode());

	}

}
