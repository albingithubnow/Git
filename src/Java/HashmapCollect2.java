package Java;

import java.util.HashMap;
import java.util.Map;

public class HashmapCollect2 {
public static void main(String[] args) {
	Map<String , Integer> map = new HashMap<String, Integer>();
	
	map.put("Bye", null);
	map.put("Bye", 10);
	map.put("ok", null);
	map.put(null, null);
	System.out.println(map);
	
	Map<String , Integer> map2 = new HashMap<String, Integer>();
	map2.put("thanks", 2);
	map2.putAll(map);
	System.out.println(map);
	
	System.out.println(map.get("Bye"));
	System.out.println(map.get("ok"));
	
	System.out.println(map.remove("Bye", null));
	System.out.println(map.remove(null, null));
	
	System.out.println(map.containsKey("Bye"));
	System.out.println(map.containsKey("no"));
	System.out.println(map.containsValue(10));
	
	System.out.println(map2.size());
	
	System.out.println(map.replace("Bye", 10, 99));
	System.out.println(map.replace("Bye", 99, 77));
}
}
