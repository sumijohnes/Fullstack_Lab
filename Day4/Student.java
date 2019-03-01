package day4;


public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;

	
	
    public Student() {
	
    }
	
	public Student(int studentId,char studentType, String firstName, String lastName)
			{
		this.studentId = studentId;
		this.studentName = firstName+" "+lastName;
		this.setStudentType(studentType);
		
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}


	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public void calculateFees(double semFee) {
		feesPerMonth = semFee/6;
	}
	public void calculateFees(double semFee, double hostFee) {
		feesPerMonth = semFee/6;
		feesPerMonth = feesPerMonth + hostFee;
	}

	

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	

}