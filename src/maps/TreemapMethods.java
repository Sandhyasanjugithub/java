package maps;


import java.util.TreeMap;
import java.util.Collection;
import java.util.NavigableSet;

public class TreemapMethods {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap();
		t.put(12, "s");
		t.put(2,"a");
		t.put(6,null);
		t.put(8,"r");
		t.put(4,"d");
		
		System.out.println(t);
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.headMap(8));
		System.out.println(t.tailMap(6));
		
		NavigableSet<Integer> dsk = t.descendingKeySet();
		for(Object dSet : dsk) {
			System.out.println(dSet);
		}
Collection<String> dval = t.descendingMap().values();
for(String dvalues:dval) {
	System.out.println(dvalues);
}
System.out.println(t.subMap(2, 8));
	}

}
