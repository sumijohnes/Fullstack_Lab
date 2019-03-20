package day4.assignment30;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");	
		List<Employee> empList = new ArrayList<Employee>();
		
		
		//Months are indexed o to 11 in Calendar class
		Employee emp1 = new Employee();	
		emp1.setEmployeeId(1);
		emp1.setEmpName("sumi");
		emp1.setdOB(new GregorianCalendar(1988,00,10));
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(2);
		emp2.setEmpName("Rosh");
		emp2.setdOB(new GregorianCalendar(1987,11,9));
		
		Employee emp3 = new Employee();
		emp3.setEmployeeId(3);
		emp3.setEmpName("Renu");
		emp3.setdOB(new GregorianCalendar(1987,04,22));		
		
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		Iterator<Employee> it = empList.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.getEmployeeId());
			System.out.println(emp.getEmpName());
			System.out.println(sdf.format(emp.getdOB().getTime()));
			//System.out.println((emp.getdOB().getTime()));


		}

		

	}

}
