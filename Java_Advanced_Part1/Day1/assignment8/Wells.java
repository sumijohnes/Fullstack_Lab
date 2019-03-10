package day1.assignment8;

public class Wells {

	public static void main(String[] args) {
		
		EmployeeGrade elvis = new EmployeeGrade();
		elvis.initializeEmployee(1001, "Elvis Mathew", 4.1f, 6.7f, 7.8f);
		elvis.calculateAvgFeedback();
		elvis.calculateGrade();
		elvis.displayInfo();

	}

}
