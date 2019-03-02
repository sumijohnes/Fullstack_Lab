package day4.assignment5;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public Student() {
		
	}
	
	public Student(int studentId, char studentType, String studentName) {
		this();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


}
