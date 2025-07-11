package Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollect {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		System.out.println(s.add(20));
		s.add(30);
		s.add(40);
		s.add(null);
		s.add(null);
		System.out.println("-------------------------------");
		
		Iterator<Integer>  i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-------------------------------");
		for(Integer integer:s) {
			System.out.println(integer);
		}
	}
}
