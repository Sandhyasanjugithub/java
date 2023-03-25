package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveMethodInListIteratorInterface {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(65);
		l.add(2);
		l.add(56);
		l.add(null);
	
		System.out.println(l);
		ListIterator<Integer> i = l.listIterator();
		while(i.hasNext())
		{
			Integer obj = i.next();
			if(obj.equals(65)) {
				i.remove();
				System.out.println("65 has been removed");
				break;
			}
		}
		System.out.println(l);
			}
		

	}


