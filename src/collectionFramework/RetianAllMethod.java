package collectionFramework;

import java.util.ArrayList;

public class RetianAllMethod {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		
		
		ArrayList a=new ArrayList();
		a.add(67);
		
		a.addAll(l);
		System.out.println(a);
		System.out.println(a.size());
		boolean re=a.retainAll(l);//retainAll() will retain which are similar
		System.out.println(re);
		
	

	}

}
