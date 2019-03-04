

public class Student3 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;



    public Student3() {

    }

	public Student3(int studentId,char studentType, String firstName, String lastName)
			{
		this.studentId = studentId;
		this.studentName = firstName+" "+lastName;
		this.studentType= studentType;

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

public void displayDetails() {
	System.out.println("Id: "+this.getStudentId());
	System.out.println("Type: "+this.getStudentType());
	System.out.println("Name: "+this.getStudentName());
	System.out.println("Fees Per Months:" + this.getFeesPerMonth());
}


}