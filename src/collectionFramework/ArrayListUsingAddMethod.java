package collectionFramework;

import java.util.ArrayList;

public class ArrayListUsingAddMethod {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		System.out.println(l.isEmpty());
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		l.clear();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(true));
		System.out.println(l.remove(0));
		

	}

}
