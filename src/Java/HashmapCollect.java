package Java;

import java.util.HashMap;
import java.util.Map;

public class HashmapCollect {
public static void main(String[] args) {
	Map< String , Integer> map = new HashMap<String, Integer>();
	map.put("bye", null);
	map.put("Bye", 10);
	map.put("Ok", null);
	map.put(null , null);
	System.out.println(map);
	
	Map<String, Integer> Map2 = new HashMap<String ,Integer >();
	Map2.put("thanks", 2);
	Map2.putAll(map);
	System.out.println(Map2);
	
	System.out.println(Map2.get("Bye"));
	System.out.println(Map2.get("thanks"));
	System.out.println(Map2.remove("bye", null));
	
	Map2.put("Hello", 80);
	Map2.put("George", 100);
	
}
}
