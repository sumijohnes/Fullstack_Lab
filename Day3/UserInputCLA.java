public class UserInputCLA {

	public static void main(String[] args) {
		int number, iterations;
		
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
		System.out.println("Multplication table of "+number);
		
		for(int i =1 ; i<=iterations;i++)
		{
			System.out.println(number+" * "+i+" = "+number*i);
		}

	}

}