package collectionFramework;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("sandhya");
		l.add("ram");
		l.add("raghu");
		l.add(null);
		l.add("raghu");
		System.out.println(l);
		
		LinkedList l1=new LinkedList(l);
		l1.add("sanju");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		System.out.println(l1);
		l1.addFirst("sandhya");
		l1.addLast("sanju");
		System.out.println(l1);
		l1.add(3, "star");
		System.out.println(l1);
	}

}
