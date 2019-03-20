package day4.assignment32;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) {
		
		//class.forName() requires fully qualified path
		try {
			Class object = Class.forName("day4.assignment32.Employee");
			//System.out.println(object.getTypeParameters());
			System.out.println(object.getName());
			Method[] methods = object.getMethods();
			
			for(int i=0;i<methods.length;i++)
				System.out.println(methods[i]);
			
			Field[] fields = object.getDeclaredFields();
			for(int i=0;i<fields.length;i++) {
				Class type = fields[i].getType();
				System.out.println("Field Name is: "+fields[i]+" and Data Type is: "+type.getName());
			}
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

			System.out.println("Error");
		}

	}

}
