package programsOnCollections;

import java.util.HashMap;
import java.util.Set;

public class Set111 {

	

	public static void main(String[] args) {
		String s="tester";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> h=new HashMap();
		for(int i=0;i<ch.length;i++) {
			if(h.containsKey(ch[i])==false) {
				h.put(ch[i], 1);
			}
			else {
				int oldvalue=h.get(ch[i]);
				int newvalue=oldvalue+1;
				h.put(ch[i], newvalue);
			}
		}
		
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
//		Set<Character> ks=h.keySet();
//		for(Character kSet:ks) {
//			
//			System.out.println(kSet);
//		}
//
	}

}
