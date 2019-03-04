
public class Hostelite extends Student {

	String hostelName;
	int roomNumber;

	public Hostelite() {

	}


	public Hostelite(int id, char type, String name, double fee, String hostelName, int roomNumber) {
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

	public void calculateFees(double semFee) {

		feesPerMonth = semFee/6;
		feesPerMonth = feesPerMonth + 1200;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Hostel Name: "+this.getHostelName());
		System.out.println("Room No: " +this.getRoomNumber());
	}




	}


