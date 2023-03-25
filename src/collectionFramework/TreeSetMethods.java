package collectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(35);
		s.add(56);
		s.add(24);
		s.add(12);
		
		s.add(56);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
		

	}

}
