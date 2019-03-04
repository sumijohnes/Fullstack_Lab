package day4;

public class Hostelite2 extends Student2 {
	
	String hostelName;
	int roomNumber;
	
	public Hostelite2() {
		
	}

	
	public Hostelite2(int id, char type, String name, double fee, String hostelName, int roomNumber) {
		super(id,type,name.substring(0, name.indexOf(' ')),name.substring((name.indexOf(' ')), name.length()));
		super.feesPerMonth = fee;
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
		
		Hostelite2 hostelite = new Hostelite2(100,'G',"Dennis Mathew",550.0,"HostelName",101);
		
		
		    System.out.println("Id: "+hostelite.getStudentId());
			System.out.println("Type: "+hostelite.getStudentType());
			System.out.println("Name: "+hostelite.getStudentName());
			System.out.println("Residential Status: "+hostelite.getResidentialStatus());
			System.out.println("Fees Per Months:" + hostelite.getFeesPerMonth());

	}

}
