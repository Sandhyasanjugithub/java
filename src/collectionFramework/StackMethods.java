package collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack l=new Stack();
		l.add("sandhya");
		l.add("ram");
		l.add("raghu");
		l.add(null);
		l.add("raghu");
		System.out.println(l);
//		System.out.println(l.peek());//methods
//		System.out.println(l.pop());
//		System.out.println(l.peek());
//		System.out.println(l.pop());
//		System.out.println(l);

		
		 Iterator i = l.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(l.pop());
		 }
	}

}
