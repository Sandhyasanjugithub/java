package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceMethods {

	public static void main(String[] args) {
		Queue l=new LinkedList();
		l.offer("sandhya");
		l.offer("ram");
		l.offer("raghu");
		l.offer(null);
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
