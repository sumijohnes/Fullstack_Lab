package day3;

import java.util.Scanner;

public class JavaDocExploration {

	public static void main(String[] args) {
		 System.out.println("Enter user name: ");
		 Scanner sc = new Scanner(System.in);
		 
		 String name = sc.next();
		 System.out.println("Length:" + name.length());
		 System.out.println("Hi "+ name);
		 StringBuffer name1 = new StringBuffer("name");
		 System.out.println(name.toLowerCase());
		 System.out.println(name.toUpperCase());
		 if(name.startsWith("a")) {
			 System.out.println("User name starts with 'a");
		 }
		 
		 name = "KRISHNA";
		 System.out.println(name);

	}

}
