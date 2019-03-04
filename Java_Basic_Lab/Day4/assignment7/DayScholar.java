package day4.assignment7;

public final class DayScholar extends Student{
	
	private String residentialAddress;
	
	public DayScholar() {
		
	}

	public DayScholar(int id, char tuype, String name, double fee, String residentialAddress) {
		super();
		this.residentialAddress = residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void displayDetails() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Residential Adrress: "+residentialAddress);
	
	}

}
