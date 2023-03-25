package programsOnCollections;

import java.util.LinkedHashSet;

public class SortigStringWel {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		LinkedHashSet<String> l=new LinkedHashSet();
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			l.add(s1[i]);
		}
		for(String str:l) {
			int count=0;
			for(int i=0;i<s1.length;i++) {
				if(str.equals(s1[i])) {
					count++;
				}
			}
			if(count<=1)
			{
				System.out.println(str+"-"+count);
			}
		}

	}

}
