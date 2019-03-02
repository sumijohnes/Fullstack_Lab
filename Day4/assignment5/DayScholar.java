package day4.assignment5;

public class DayScholar extends PostGraduateStudent{

	private String address;
	
	public DayScholar(int postCourseId, String postCourseName, int postCourseFees, 
			int sid, char sType, String sName, String rAddress) {
		super(postCourseId, postCourseName, postCourseFees, sid, sType, sName);
		
	}
	
	public void calculateFees() {
		
		int fees = super.getPostCourseFees()/6;
		System.out.println("Fees:" + fees);
		
	}
	
	
	

	

}
