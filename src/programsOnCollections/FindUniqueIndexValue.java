package programsOnCollections;

import java.util.LinkedHashSet;

public class FindUniqueIndexValue {

	public static void main(String[] args) {
		String s="testyantra";
		LinkedHashSet<Character> h=new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			h.add(s.charAt(i));
		}
		for(Character ch:h) {
			for(int i=0;i<s.length();i++) {
			if(ch.equals(s.charAt(i))) {
				System.out.println(ch+":"+(i+1));
				break;
			}
				
			}
		}

	}

}
