package day2.assignment20.package2;
import day2.assignment20.package1.Base;
import day2.assignment20.package1.Child1;

public class Child2 extends Base {

	public Child2() {
		super();
	}
	
	
public void getValues() {
		//Base base = new Base();
	Base base = new Child2();
	//Child2 chil = new Child2();
		System.out.println(variable3);
		//System.out.println(base.variable3);
		System.out.println(variable4);

	}
	
public static void main(String[] args) {
	
	Child2 ch2 = new Child2();
	ch2.getValues();
	

}


}
