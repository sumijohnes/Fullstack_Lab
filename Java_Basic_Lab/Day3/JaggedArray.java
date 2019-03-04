public class JaggedArray {

	public static void main(String[] args) {
		
		String[][] student = {{"Tony","Java","C","C++"},{"Thomas","Java","Unix"},
				{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","Oracle"}};
		
		JaggedArray jaggedArray = new JaggedArray();
		jaggedArray.displayDetails(student,"Delvin");
		

	}
	
	public void displayDetails(String[][] student, String name) {
		int i = 0;
		while(student[i][0] != name) {
			i++;
		}
		
		for(int j=0;j<student[i].length;j++) {
			System.out.print(student[i][j]+" ");
		}
		
		
		
		
	}

}
