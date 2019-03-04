public class Student3 {

	private int studentId = 504;
	private char studentType;
	private String studentName;
	static int studentCount;

	static {
		studentCount = 10;
	}

	public Student3() {
		studentCount++;
		this.studentId = studentCount;

	}

	public Student3(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName+lastName;
	}

	public static int getStudentCount() {

		return studentCount;

	}

	public void displayDetails(Student3 student) {

		System.out.println(student.studentId);
		System.out.println(student.studentType);
		System.out.println(student.studentName);

	}

	public static void main(String[] args) {


		Student3 studentOne = new Student3('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student3 studentTwo = new Student3('H',"Dinil","Jose");
		studentTwo.displayDetails(studentTwo);
		System.out.println(getStudentCount());




	}

}
