package day1.assignment3;

public class EmployeeFeedback {

	public static void main(String[] args) {
		
		int[][] employeeInfo = {{1001,4,5},{1002,2,4,5}};
		
		for (int i =0;i<employeeInfo.length;i++) {
			for(int j=0; j<employeeInfo[i].length;j++) {
				
				System.out.print(employeeInfo[i][j]+" ");				
			}
			System.out.println();
		}
		

	}

}
