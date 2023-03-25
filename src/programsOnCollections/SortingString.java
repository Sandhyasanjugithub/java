package programsOnCollections;

import java.util.LinkedHashSet;

public class SortingString {

	public static void main(String[] args) {
		String s="abcddcbabacdcabd";
		LinkedHashSet<Character> l=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			l.add(s.charAt(i));
		}
		System.out.println(l);     //o/p:[a,b,c,d]
		for(Character list:l) {
			for(int i=0;i<s.length();i++) { //to compare the objects present in l to s
				if(list.equals(s.charAt(i))){
					System.out.print(list);
				}
			}
			System.out.println();
		}
		

	}

}
