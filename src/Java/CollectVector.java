package Java;

import java.util.Vector;

public class CollectVector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.addElement(500);
		System.out.println(v.firstElement());
		System.out.println(v);
		System.out.println(v.elementAt(0));
		System.out.println(v.capacity());
		v.removeElementAt(0);
		System.out.println(v);
		v.removeElement(30);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
		
	}

}
