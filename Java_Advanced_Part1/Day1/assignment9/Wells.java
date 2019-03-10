package day1.assignment9;

public class Wells {

	public static void main(String[] args) {
		
		EmployeeGrade elvis = new EmployeeGrade();
		elvis.initializeEmployee(1001, "Elvis Mathew", 4.1f, 3.9f, 4.2f);
		elvis.calculateAvgFeedback();
		elvis.calculateGrade();
		elvis.displayInfo();
		
		
		System.out.println("*****************");
		
		EmployeeGrade martha = new EmployeeGrade();
		martha.initializeEmployee(1001, "Matha Mariam", 4.2f, 4.4f);
		martha.calculateAvgFeedback();
		martha.calculateGrade();
		martha.displayInfo();

	}

}
