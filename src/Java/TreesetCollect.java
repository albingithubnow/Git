package Java;

import java.util.TreeSet;

public class TreesetCollect {

	public static void main(String[] args) {
		TreeSet<Integer> ts  = new TreeSet<Integer>();
		ts.add(10);
		ts.add(35);
		ts.add(62);
		ts.add(36);
		ts.add(-89);
		ts.add(90);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower(40));
		System.out.println(ts.higher(62));
		System.out.println(ts.ceiling(62));
		System.out.println(ts.floor(36));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}
}
