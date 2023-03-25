package collectionFramework;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector l=new Vector();
		l.add("sandhya");
		l.add("ram");
		l.add("raghu");
		l.add(null);
		l.add("raghu");
		l.addElement(45);
		System.out.println(l);
		System.out.println(l.elementAt(3));
		System.out.println(l.firstElement());
		System.out.println(l.lastElement());
		l.removeElement(45);
		System.out.println(l);
		l.removeAllElements();
		System.out.println(l);
	}

}
