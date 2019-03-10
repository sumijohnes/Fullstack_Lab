package day4.assignment28;

import java.util.Calendar;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String address;
	private int pinCode;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int Id) {
		customerId = Id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String name) {
		customerName = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adrs) {
		address = adrs;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pin) {
		pinCode = pin;
	}
	
	
}
