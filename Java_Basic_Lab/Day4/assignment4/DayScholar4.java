package day4;

public class DayScholar4 extends Student4{
	
	private String residentialAddress;

	
	public DayScholar4(int studentId, char studentType, String studName,
			double semFees, String residentialAddress) {
		
		super(studentId,studentType,studName,semFees);
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
	System.out.println(this.getResidentialAddress());
	
		
	}
	
}
