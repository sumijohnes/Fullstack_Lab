package day1.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EntrySet {
	
	public void printRecords(Set<String> set) {
		
		if(set.isEmpty()) {
			System.out.println("Set is empty");
		}
		else
		{
			System.out.println(set);
		}
		
		
	}

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Jack");
		set.add("Harry");
		set.add("John");
		set.add("James");
		
		EntrySet entrySet = new EntrySet();
		entrySet.printRecords(set);
		
		Set<String> set1 = new HashSet<String>();
		entrySet.printRecords(set1);


		
		
		

	}

}
