package day1.assignment5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {
	
	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<Object>();
		
		set.add("John");
		set.add("Mark");
		set.add("Sam");
		
		Debug debug = new Debug();
		System.out.println("Printing Records**********");
		debug.showRecords(set);
		
		
		
	}

	private void showRecords(Set<Object> set) {
		// TODO Auto-generated method stub
		
		if(!set.isEmpty()) {
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		}
		else
		{
			System.out.println("Set is empty");
		}
		
	}

}
