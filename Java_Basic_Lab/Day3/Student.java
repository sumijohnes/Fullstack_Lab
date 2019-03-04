public class Student {
	
	private int studentId;
	private char studentType;
	private String studentName;

	public Student() {
		
		this.studentId = 10;
		this.studentType = 'F';
	}


	public Student(int studentId, char studentType, String firstName, String lastName) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName +" "+ lastName;
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


	public void setStudentName(String firstName, String lastName){
		this.studentName = firstName +" "+ lastName;
	}

	public static void main(String[] args) {
		Student student = new Student();
		 student.setStudentId(100);
		 student.setStudentType('F');
		 student.setStudentName("Dennis","Leo");
		System.out.println("Stduent Id: "+ student.getStudentId());
		System.out.println("Student Type: "+ student.getStudentType());
		System.out.println("Student Name: "+ student.getStudentName());
		
		Student student1 = new Student(20,'F',"John","Mathew");
		System.out.println("Stduent Id: "+ student1.getStudentId());
		System.out.println("Student Type: "+ student1.getStudentType());
		System.out.println("Student Name: "+ student1.getStudentName());

	}

}
