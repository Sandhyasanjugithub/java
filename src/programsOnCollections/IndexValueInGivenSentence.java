package programsOnCollections;

import java.util.LinkedHashSet;

public class IndexValueInGivenSentence {

	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> h=new LinkedHashSet();
		for(int i=0;i<s1.length;i++) {
			h.add(s1[i]);
		}
		for(String str:h) {
			for(int i=0;i<s1.length;i++)
			{
				if(str.equals(s1[i])) {
					System.out.println(str+" position is "+(i+1));
					break;
				}
			}
		}

	}

}
