package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorListInteratorInterface {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(65);
		l.add(2);
		l.add(56);
		l.add(null);
	
		System.out.println(l);
		
		 ListIterator i = l.listIterator();//we can traverse in both directions in this interface
		 System.out.println("forward direction: ");
		while(i.hasNext()) {//for forward direction
			System.out.println(i.next());

	}
		System.out.println("backward direction: ");
		while(i.hasPrevious()) {
			System.out.println(i.previous());// for backward direction
		}

}
}
