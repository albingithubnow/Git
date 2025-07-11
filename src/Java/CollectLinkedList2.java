package Java;

import java.util.LinkedList;

public class CollectLinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
	
		System.out.println(ll);
		
		
		System.out.println("----------------------------------");
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("----------------------------------");

		}
	}
	
