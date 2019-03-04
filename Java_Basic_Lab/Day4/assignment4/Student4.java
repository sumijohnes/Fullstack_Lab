package day4;


public class Student4 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	protected double semesterFees;
	
    public Student4(int studentId) {
    	this.studentId = studentId;
	
    }
	
	public Student4(int studentId,char studentType, String studName, double semFee)
			{
		this(studentId);
		//this.studentId = studentId;
		this.studentName = studName;
		this.studentType = studentType;
		this.semesterFees = semFee;
		
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

	

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	
	

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	void displayDetails() {
		System.out.println(this.getStudentId());
		System.out.println(this.getStudentType());
		System.out.println(this.getStudentName());
		System.out.println(this.getSemesterFees());
		
	}

	public double getSemesterFees() {
		return semesterFees;
	}

	public void setSemesterFees(double semesterFees) {
		this.semesterFees = semesterFees;
	}

	

}