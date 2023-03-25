package maps;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableMethods {

	public static void main(String[] args) {
		Hashtable<String,Integer> t=new Hashtable();
		t.put("prabhas", 001);
		t.put("nani", 002);
		t.put("rana", 003);
		t.put("venky", 004);
		System.out.println(t);
		
		//to print only keys present in hashtable
		Set<String> ks = t.keySet();
		for(String kset:ks)
		{
			System.out.println(kset);
		}
		
		//to print only values present in hashtable
        Collection<Integer> v = t.values();
        for(Integer val:v) {
	    System.out.println(val);
        }

         //to print entries present in hashtable
        Set<Entry<String, Integer>> es = t.entrySet();

         //to print entries in line by line
         Iterator i = es.iterator();
         while(i.hasNext()) {
	     System.out.println(i.next());
         }

	}

}
