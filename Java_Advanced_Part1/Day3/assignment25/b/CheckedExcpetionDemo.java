package day3.assignment25.b;

public class CheckedExcpetionDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("day3.assignment25.a.ExceptionDemo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excpetion : " + e);
		}

	}

}
