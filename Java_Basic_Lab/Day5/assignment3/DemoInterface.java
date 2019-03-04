interface InterfaceOne {
	
	int varOne = 1;
	int varTwo = 100;
	void methodOne();
	void methodTwo();
}

class Example implements InterfaceOne {
	
	public void methodOne() {
		
		System.out.println("Value of varTwo: "+varTwo);
		System.out.println("Good Morning");
	}

	@Override
	public void methodTwo() {
		System.out.println("Good Afternoon");

		
	}
}
public class DemoInterface {

	public static void main(String[] args) {
		
		Example obj = new Example();
		obj.methodOne();
		obj.methodTwo();
		

	}

}
