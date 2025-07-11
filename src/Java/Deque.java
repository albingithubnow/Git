package Java;

import java.util.LinkedList;

public class Deque {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		ll.offerLast(90);
		ll.offerFirst(50);
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
	}
}
