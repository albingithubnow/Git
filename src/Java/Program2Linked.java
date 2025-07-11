package Java;

import java.util.LinkedList;

public class Program2Linked {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll  = new LinkedList<Integer>();
		ll.add(10);
		ll.offer(80);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		
	}

}
