package programsOnCollections;
import java.util.LinkedHashSet;
public class FreqCountInString {
	public static void main(String[] args) {
			 String s="india";
			 LinkedHashSet<Character> l=new LinkedHashSet();
			 for(int i=0;i<s.length();i++)
			 {
				 l.add(s.charAt(i));
			 }
			 for(Character ch:l) {
				// System.out.println(ch);//close all remain
				 int count=0;
				 for(int i=0;i<s.length();i++) {
					 if(ch.equals(s.charAt(i))) {
						 count++;
					 }
				 }
				 //if(count==1)
				 System.out.println(ch+"="+count);
			 }
			 
			

	

	}
}
