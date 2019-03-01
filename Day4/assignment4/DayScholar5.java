package day4.assignment4;

public class DayScholar5 extends Student5{
	
	private String residentialAddress;

	

	public DayScholar5(int studentId, char studentType, String studName,
			int semFees, String residentialAddress, String cName) {
		
		super(studentId,studentType,studName,semFees,cName);
		this.residentialAddress = residentialAddress;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

void displayDetails() {
	super.displayDetails();
	System.out.println("Address: "+this.getResidentialAddress());
	
		
	}
	
}
