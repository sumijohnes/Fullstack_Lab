public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'R';


		switch(grade) {

		case 'A':
			System.out.println("Range of Marks: 80-100");
			break;
		case 'B':
			System.out.println("Range of Marks: 73-79");
			break;
		case 'C':
			System.out.println("Range of Marks: 65-72");
			break;
		case 'D':
			System.out.println("Range of Marks: 55-64");
			break;
		case 'E':
			System.out.println("Range of Marks: <55");
			break;
		default:
			System.out.println("Grade does not exist");
			break;

		}

	}
}