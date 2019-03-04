package day4.assignment7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private final int semFee = 12000;
	private int feePerMonth;
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName +" "+lastName;
	}
	
	public void calculateFee() {
		feePerMonth = semFee/6;
	}
	
	public final void displayDetail() {
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Type: "+studentType);

		
		
	}
	
	

}
