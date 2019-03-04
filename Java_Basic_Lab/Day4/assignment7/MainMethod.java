package day4.assignment7;

public class MainMethod {

	public static void main(String[] args) {
		
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas", "John");
		dayScholar.setResidentialAddress("No 32/3 Vijayanagar");
		dayScholar.calculateFee();
		dayScholar.displayDetail();
		dayScholar.displayDetails();	

	}

}
