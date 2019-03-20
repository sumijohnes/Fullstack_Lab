package day2.assignment13;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public Customer() {};
	
	public Customer(String customerName, String customerAddress, int customerId) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerId = customerId;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	

}
