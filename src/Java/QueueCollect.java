package Java;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollect {
public static void main(String[] args) {
	Queue<Integer> q = new PriorityQueue<Integer>();
	
	q.add(50);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(60);
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q.peek());
	System.out.println(q.element());
	System.out.println(q.offer(25));
}
}
