package day1.assignment9;

public class EmployeeGrade {
	
	int employeeNo;
	String employeeName;
	float customer1Feedback, customer2Feeddback,customer3Feedback, avgFeedback;
	char grade;
	int customerCount = 0;
	
	public void initializeEmployee(	int employeeNo,String employeeName, float customer1Feedback, 
			float customer2Feeddback,float customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feeddback = customer2Feeddback;
		this.customer3Feedback = customer3Feedback;
		customerCount = 3;
		
	}
	
	public void initializeEmployee(	int employeeNo,String employeeName, float customer1Feedback, 
			float customer2Feeddback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feeddback = customer2Feeddback;
		customerCount = 2;
		
	}
	
	public void calculateAvgFeedback() {
		
		if(customerCount == 3)
		this.avgFeedback = (this.customer1Feedback + this.customer2Feeddback + this.customer3Feedback)/customerCount;
		else
		this.avgFeedback = (this.customer1Feedback + this.customer2Feeddback )/customerCount;
		
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
