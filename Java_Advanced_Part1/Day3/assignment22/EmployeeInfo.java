package day3.assignment22;

import java.util.Iterator;
import java.util.Vector;

public class EmployeeInfo {
	
	

	public static void main(String[] args) {
		
		Vector<Integer> empList = new Vector<Integer>();
		int empNo = 1000;
		
		for(int i=0;i<5;i++) {
			
			empNo++;
			
			//Integer empId = new Integer(empNo);
			
			//Integer empId = Integer.valueOf(empNo);
			
			Integer empId = empNo; //Autoboxing
			
			empList.add(empId);
			
		}
		
		/* for(int i=0;i<empList.size();i++) {
			System.out.println(empList.get(i));
		} */
		
		System.out.println("Autoboxed");
		Iterator<Integer> it = empList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

		int[] arr = new int[5];
		
		for(int i=0;i<5;i++) {
			
			arr[i] = empList.get(i); //Unboxing 
		}
		
		System.out.println("Unboxed");
        for(int i=0;i<5;i++) {		
			System.out.println(arr[i]);
		}

	}

}
