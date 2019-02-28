public class PassByVal {

	public static void main(String[] args) {
		
		int sId = 25;
		PassByVal val = new PassByVal();
		System.out.println(sId);
		Student student = new Student();
		//val.passTheValueMethod(sId);
		val.passTheValueMethod(student);
		
		

	}

	private void passTheValueMethod(Student student) {
		System.out.println("The sId are "+student.getStudentId());

	}

	/* private void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("The sId are "+sId);
		
	}*/
	
	

}