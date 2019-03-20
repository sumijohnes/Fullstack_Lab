package day1.assignment8;

public class EmployeeGrade {
	
	int employeeNo;
	String employeeName;
	float customer1Feedback, customer2Feeddback,customer3Feedback, avgFeedback;
	char grade;
	
	public void initializeEmployee(	int employeeNo,String employeeName, float customer1Feedback, 
			float customer2Feeddback,float customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feeddback = customer2Feeddback;
		this.customer3Feedback = customer3Feedback;
		
	}
	
	public void calculateAvgFeedback() {
		
		this.avgFeedback = (this.customer1Feedback + this.customer2Feeddback + this.customer3Feedback)/3;
		
	}
	
	public void calculateGrade() {
		
		if(avgFeedback <= 3)
			grade = 'C';
		else if(avgFeedback >3 && avgFeedback <=6)
			grade = 'B';
		else
			grade = 'A';
	}
	
	public void displayInfo() {
		
		System.out.println(this.employeeNo);
		System.out.println(this.employeeName);
		System.out.println(avgFeedback);
		System.out.println(grade);

		
	}
	

}
