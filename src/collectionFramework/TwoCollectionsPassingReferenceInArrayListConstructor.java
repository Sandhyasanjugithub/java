package collectionFramework;

import java.util.ArrayList;

public class TwoCollectionsPassingReferenceInArrayListConstructor {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		System.out.println(l.isEmpty());
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		
		
		ArrayList a=new ArrayList(l);
		a.add(67);
		
		
		System.out.println(a);
		System.out.println(a.size());
		
	

	}

}
