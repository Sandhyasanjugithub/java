package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueP {

	public static void main(String[] args) {
		PriorityQueue l=new PriorityQueue();
		l.offer("sandhya");
		l.offer("ram");
		l.offer("raghu");
		
		l.offer("raghu");
		System.out.println(l);
		System.out.println(l.peek());
		
		 Iterator i = l.iterator();
		 System.out.println("removed elements are ");
		 while(i.hasNext())
		 {
			 System.out.println(l.poll());
		 }

	}

}
		
