package day4.assignment4;

public class CourseRegistration {
	
	static protected int regId;
	protected String courseName;
	CourseRegistration(){
		regId++;
		
	}
	CourseRegistration(String cName){
		this();
		courseName = cName;
		
	}
	
	public void disaplyDetails() {
		
		System.out.println("Registration Id: "+this.regId);
		System.out.println("Course Name: "+this.courseName);

	}

}
