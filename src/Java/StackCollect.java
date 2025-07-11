package Java;

import java.util.Stack;

public class StackCollect {
 public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer> ();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	System.out.println(s.empty());
	System.out.println(s.push(88));
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.search(30));
	
}
}
