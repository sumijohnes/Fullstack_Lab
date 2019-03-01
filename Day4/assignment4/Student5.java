package day4.assignment4;


public class Student5 extends CourseRegistration {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int feesPerMonth;
	protected int semesterFees;
	
    public Student5(int studentId, String cName) {
    	super(cName);
    	this.studentId = studentId;
	
    }
	
	public Student5(int studentId,char studentType, String studName, int semFee, String cName)
			{
		this(studentId,cName);
		//this.studentId = studentId;
		//super(cName);
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

	

	public int getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(int feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	
	

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	void displayDetails() {
		super.disaplyDetails();
		System.out.println("Student Id: "+this.getStudentId());
		System.out.println("Student Type: "+this.getStudentType());
		System.out.println("Student Name: "+this.getStudentName());
		System.out.println("Semester Fee: "+this.getSemesterFees());
		
	}

	public int getSemesterFees() {
		return semesterFees;
	}

	public void setSemesterFees(int semesterFees) {
		this.semesterFees = semesterFees;
	}

	

}