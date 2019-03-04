package studentpack;

public class Student {
	
	protected int studentId;
	protected char studentType;
	protected String studentName;


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void getDetails() {
		System.out.println("Id: "+ studentId);
		System.out.println("Type: "+studentType);
		System.out.println("Name: "+studentName);
		
	}

}