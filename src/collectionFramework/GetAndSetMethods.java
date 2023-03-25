package collectionFramework;

import java.util.ArrayList;

public class GetAndSetMethods {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.get(2));
		l.set(0, false);
		System.out.println(l);

	}

}
