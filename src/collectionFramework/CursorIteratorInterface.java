package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIteratorInterface {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(65);
		l.add(2);
		l.add(56);
		l.add(null);
	
		System.out.println(l);
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//forwarding direction only
		}

	}

}
