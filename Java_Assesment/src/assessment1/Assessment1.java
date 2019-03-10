package assessment1;

import java.util.HashMap;
import java.util.Map;

public class Assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		
		Assessment1 test1 = new Assessment1();
		
		test1.printValue(map,3);
	
	}
	
	public void printValue(Map<Integer,String> map,int key) {
		
		System.out.println(map.get(key));
	}
	
}
