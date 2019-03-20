package day1.assignment3.wellsbank.login;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoginDetails {
	
	public void addSameKey(Map<Integer,String> map) {
		if(map.containsKey(1003)) {
			System.out.println("Key already present");
		}
		else
		{
			map.put(1003,"John");
		}
		
	}
	
	public void printDetails(Map<Integer,String> map) {
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			
			int key = it.next();
			//System.out.println(it.next());
			System.out.println(key+" "+map.get(key));
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1000, "Sam");
		map.put(1001, "Tom");
        map.put(1002, "Zen");
        map.put(1003, "Zen");
        
        System.out.println("Map before adding the same kay 1003: "+map);
        
        LoginDetails login = new LoginDetails();
        login.addSameKey(map);
        
        System.out.println("Value for 1003, after addSameKey(): "+map.get(1003));
        System.out.println("Map after adding the same kay 1003: "+map);

        login.printDetails(map);
        

	}

}
