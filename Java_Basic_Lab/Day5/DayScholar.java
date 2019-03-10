package registrationpack;

import studentpack.Student;

public class DayScholar extends Student {

	private String residentialAddress;

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public void getDetails() {
		System.out.println("Id: "+ studentId);
		System.out.println("Name: "+ studentName);
		//System.out.println("Type: "+ studentType);
		System.out.println("Address: "+residentialAddress);
	}
}
