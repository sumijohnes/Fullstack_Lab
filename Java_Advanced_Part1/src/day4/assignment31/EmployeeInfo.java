package day4.assignment31;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		ArrayList<Integer> empId = new ArrayList<Integer>();
		empId.add(1001);
		empId.add(1002);
		//empId.add("1003");	
		
		 for(int i=0;i<empId.size();i++) {
			//System.out.println(empId.get(i));
			int num = (int) empId.get(i);
			System.out.println("Value in the int variable: "+num);
		} 
	

	}

}
