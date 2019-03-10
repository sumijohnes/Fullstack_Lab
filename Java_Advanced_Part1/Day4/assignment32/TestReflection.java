package day4.assignment32;

public class TestReflection {

	public static void main(String[] args) {
		
		//class.forName() requires fully qualified path
		try {
			Class object = Class.forName("day4.assignment32.Employee");
			//System.out.println(object.getTypeParameters())	
			System.out.println(object.getName());
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

			System.out.println("Error");
		}

	}

}
