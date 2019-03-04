package day4;

public class Hostelite extends Student {
	
	String hostelName;
	int roomNumber;
	
	public Hostelite() {
		
	}

	public Hostelite(String hostelName, int roomNumber) {
		super(100,'G',"Dennis","Mathew");
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}


	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public static void main(String[] args) {
		
		Hostelite hostelite = new Hostelite("HostelName",101);
	  hostelite.setResidentialStatus("Hostelite");
		
		 if(hostelite.getResidentialStatus()=="Day Scholar") {
				hostelite.calculateFees(1000);
			}
		 
		else if(hostelite.getResidentialStatus()=="Hostelite") {
			hostelite.calculateFees(1200, 350);
		} 
		
		    System.out.println("Id: "+hostelite.getStudentId());
			System.out.println("Type: "+hostelite.getStudentType());
			System.out.println("Name: "+hostelite.getStudentName());
			System.out.println("Residential Status: "+hostelite.getResidentialStatus());
			System.out.println("Fees Per Months:" + hostelite.getFeesPerMonth());

	}

}
