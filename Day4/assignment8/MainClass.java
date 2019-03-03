

public class MainClass {

	public static void main(String[] args) {

		Student student;
		String residentialStatus = args[0];
		if(residentialStatus.equalsIgnoreCase("Hostelite")) {

			student = new Hostelite(100,'G',"Dennis Mathew",550.0,"HostelName",101);
		}
		else {
			student = new DayScholar(102,'G',"Leo John",550.0,"Home address");
		}

		student.calculateFees(1200);
		student.displayDetails();

	}

}
