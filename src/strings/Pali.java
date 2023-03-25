package strings;

public class Pali {
	public static void main(String[] args) {
		
	
String s="malayalam";
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
	
}
System.out.println(rev);
System.out.println(s.substring(1, 4));
System.out.println(s.substring(1, 8));
System.out.println(s.substring(2, 6));
}
	
}