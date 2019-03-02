package day4.assignment5;

public class PostGraduateStudent extends Student{
	
	protected int postCourseId;
	protected String postCourseName;
	protected int postCourseFees;
	
	
	public PostGraduateStudent(int postCourseId, String postCourseName, int postCourseFees, 
			int sid, char sType, String sName) {
		super(sid,sType,sName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCourseFees = postCourseFees;
	}
	
	public int getPostCourseId() {
		return postCourseId;
	}
	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}
	public String getPostCourseName() {
		return postCourseName;
	}
	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}
	public int getPostCourseFees() {
		return postCourseFees;
	}
	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}
	
	

}
