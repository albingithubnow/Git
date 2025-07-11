package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKeyset {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Bye", 50);
		map.put("ok", 90);
  Set<String> s = map.keySet();
  
  for (String key : s) {
	  System.out.println(key);
		}
	}

}
