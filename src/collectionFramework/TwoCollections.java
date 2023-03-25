package collectionFramework;

import java.util.ArrayList;

public class TwoCollections {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		System.out.println(l.isEmpty());
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		
		
		ArrayList a=new ArrayList();
		a.add(67);
		a.add(l);
		a.addAll(l);
		System.out.println(a);
		System.out.println(a.size());
		
	
	}

}
