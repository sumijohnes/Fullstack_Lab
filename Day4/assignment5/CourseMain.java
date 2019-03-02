package day4.assignment5;

public class CourseMain {

	public static void main(String[] args) {
		
		DayScholar dayScholar = new DayScholar(5,"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
		System.out.println("Id: "+dayScholar.getStudentId());
		System.out.println("Name: "+dayScholar.getStudentName());	
		System.out.println("Type: "+dayScholar.getStudentType());
		System.out.println("Course id: "+dayScholar.getPostCourseId());
		System.out.println("Course Name: "+dayScholar.getPostCourseName());
		dayScholar.calculateFees();

	}

}
