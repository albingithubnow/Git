package Java;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		ll.addFirst(88);
		ll.addLast(99);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println("----------------------------------");
		
//		for (Integer integer : ll) {
//			System.out.println(integer);
//		}
//
//		System.out.println("----------------------------------");
//		
//		Iterator<Integer> i = ll.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		System.out.println("----------------------------------");
		for (int i = 0; i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}
}
