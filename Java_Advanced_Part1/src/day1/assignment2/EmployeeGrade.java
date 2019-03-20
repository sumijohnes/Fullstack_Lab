package day1.assignment2;

public class EmployeeGrade {

	public static void main(String[] args) {
		
		int employeeId[] = {1001,1002,1003,1004,1005};
		float cutsomer1Feedback[] = {4.1f,3.8f,2.8f,3.9f,4.5f};
		float cutsomer2Feedback[] = {3.2f,2.7f,4.5f,4.3f,3.8f};
		float cutsomer3Feedback[] = {4.5f,3.6f,2.9f,4,7f,3.5f};
		float cutsomer4Feedback[] = {3.4f,3.7f,2.8f,4.5f,4.6f};
		float cutsomer5Feedback[] = {3.9f,4.6f,4.4f,2.7f,3.4f};
		
		float[] avgFeedback = new float[5];
		char[] grade = new char[5];
		
		for(int i=0;i<5;i++) {
			avgFeedback[i] = (cutsomer1Feedback[i] + cutsomer2Feedback[i] + cutsomer3Feedback[i] 
					+ cutsomer4Feedback[i] + cutsomer5Feedback[i])/5;
			
		}
		
		for(int i = 0; i<5;i++) {
			
			float avg = avgFeedback[i];
			
			if(avg>=0 && avg <1f)
				grade[i] = 'E';
			else if(avg>=1f && avg <2f)
				grade[i] = 'D';
			else if(avg>=2f && avg <3f)
				grade[i] = 'C';
			else if(avg>=3f && avg <4f)
				grade[i] = 'B';
			else if(avg>=4f && avg <5f)
				grade[i] = 'A';
			else
				grade[i] = 'F';				
			
		}
		
		for(int i = 0; i<5;i++) {
			
			System.out.println("Employee ID: "+employeeId[i]+", "+"Feed back: "+avgFeedback[i]+", "+"Grade: "+grade[i]);
		}
		
		
		

 		
		
 
	}

}
