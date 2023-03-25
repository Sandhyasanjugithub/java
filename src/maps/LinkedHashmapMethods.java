package maps;

import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashmapMethods {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> t=new LinkedHashMap();
		t.put("prabhas", 001);
		t.put("nani", 002);
		t.put("rana", 003);
		t.put("venky", 004);
		t.put(null, 005);
		t.put(null, null);
		t.put("raja", null);
		System.out.println(t);
		
		//to print only keys present in linkedhashmap
		Set<String> ks = t.keySet();
		for(String kset:ks)
		{
			System.out.println(kset);
		}
		
		//to print only values present in linkedhashmap
        Collection<Integer> v = t.values();
        for(Integer val:v) {
	    System.out.println(val);
        }

         //to print entries present in linkedhashmap
        Set<Entry<String, Integer>> es = t.entrySet();

       //to print entries in line by line
//         Iterator i = es.iterator();
//         while(i.hasNext()) {
//	     System.out.println(i.next());
        
        for(Entry<String, Integer> eSet:es) {
        	System.out.println(eSet.getKey()+"="+eSet.getValue());


	}

}
}
