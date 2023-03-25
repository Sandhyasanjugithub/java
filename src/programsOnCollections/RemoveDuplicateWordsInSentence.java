package programsOnCollections;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInSentence {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		String[] sp = s.split(" ");
		LinkedHashSet<String> l=new LinkedHashSet();
		for(int i=0;i<sp.length;i++) {
			l.add(sp[i]);
		}
		
		for(String str:l) {
			int count=0;

			for(int i=0;i<sp.length;i++)
			{
				if(str.equals(sp[i])) {
					count++;
				}
			}
			//if(count==1)//this condition is used for only the o/p:india-1,tyss-1
			System.out.println(str+"-"+count);
		}
		
		 
			
		}


}

