package collectionFramework;

import java.util.ArrayList;

public class PassingThreeCollections {

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
		
		ArrayList a2=new ArrayList();
		a2.addAll(0, a);
		a2.add(l);
		a2.add(26);
		
		System.out.println(a2);
		System.out.println(a2.size());
		
	
	}

}
