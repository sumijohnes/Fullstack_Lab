public class Student2 {

	private int studentId = 504;
	private char studentType;
	private String studentName;
	static int counter = 505;
	
	public Student2() {
		    
			this.studentId = counter;
			counter ++;
		
	}
	
	public Student2(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName+lastName;
	}

	public void displayDetails(Student2 student) {
		
		System.out.println(student.studentId);
		System.out.println(student.studentType);
		System.out.println(student.studentName);
		
	}

	public static void main(String[] args) {
		
		
		Student2 studentOne = new Student2('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student2 studentTwo = new Student2('H',"Dinil","Jose");
		studentTwo.displayDetails(studentTwo);
		
		
		

	}

}