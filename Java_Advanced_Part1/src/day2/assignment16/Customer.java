package day2.assignment16;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pinCode;
	
	public Customer() {};
	
	public Customer(int customerId, String customerName, String customerAddress,int pinCode ) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerId = customerId;
		this.setPinCode(pinCode);
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	

}
