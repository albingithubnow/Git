package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollectionValues {

	public static void main(String[] args) {
    Map <String , Integer> map = new HashMap<>();
		map.put("Apple", 100);
		map.put("Mango", 89);
		map.put("Banana", 69);
		
		System.out.println(map);
		
		
		//loop through key and values
		System.out.println("\nKey-Value Pairs:");
		for (Map.Entry<String , Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " +entry.getValue());
			
		}
		
	//	loop through keys
		System.out.println("KEYS");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		
		//loop through values
		System.out.println("values");
		for(Integer value : map.values()) {
			System.out.println(value);
		}
	
		
	}

}
