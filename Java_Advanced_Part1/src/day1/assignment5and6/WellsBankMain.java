package day1.assignment5and6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WellsBankMain {

	public static void main(String[] args) {
		
		Applicant emp1 = new Applicant("Paul","j","Anderson","Paul@wellsbank.com","Salary","3rd Jan 1985",'M',"Single");
		Applicant emp2 = new Applicant("John","","jacob","John@wellsbank.com","Non Salary","6th March 1985",'M',"Married");
		AccountType account;
		
		List<Applicant> applicants = new ArrayList<Applicant>();
		applicants.add(emp1);
		applicants.add(emp2);
		
		Iterator<Applicant> it = applicants.iterator();
		
		while(it.hasNext()) {
			
		Applicant emp =  it.next();
		
		if(emp.getAccountType().equalsIgnoreCase("Salary")){
		     account = new SalaryAccount(12334556);
		    account.setCustomerPrivileges();
		}
		
		else
		{
			account = new NonSalaryAccount(65894857);
		    account.setCustomerPrivileges();
		}
		
		account.getDetails();
		emp.displayDetails();
		System.out.println();
		System.out.println("************************");

	}
	}
}

