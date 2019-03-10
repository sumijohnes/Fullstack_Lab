package day3.assignment24;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		String name = "John";
		int total = 100, count = 0;
		
		try {
			int avg = total/count;
			System.out.println(avg);
		    System.out.println(name.length());
		    System.out.println("End of try Block");
		} 
		
		catch(ArithmeticException exception) {
			System.out.println("Arithmetic Exception:"+exception.getMessage());
			
		} 
		
		catch(NullPointerException exception) {
			System.out.println("Object is null");
		}
		finally {
			System.out.println("Within finally block");
		}
		
		System.out.println("Continuing the execution...");		
		
	}

}
