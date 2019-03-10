package day1.assignment11;

public class Wells {

	public static void main(String[] args) {
		
		EmployeeGrade[] emp = new EmployeeGrade[5];
		
		for(int i=0;i<emp.length;i++) {		
			
			emp[i] = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);		
			emp[i].calculateAvgFeedback();
			emp[i].calculateGrade();
			emp[i].displayInfo();
			System.out.println("***********");
		}
 		/* ram = new EmployeeGrade();		
		 ram.calculateAvgFeedback();
		ram.calculateGrade();
		ram.displayInfo(); 
		
		System.out.println("***********");
		
		EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);		
		james.calculateAvgFeedback();
		james.calculateGrade();
		james.displayInfo(); */
		
		

	}

}
