package strings1;

public class RemoveTheDuplicatesInAString {

	public static void main(String[] args) {
		String s="aaabbbcccddd";
	char[] s1 = s.toCharArray();
	String s2="";
	
for(int i=0;i<s1.length;i++) {
	char ch = s1[i];
	if(s2.indexOf(ch)==-1)
	{
		s2=s2+ch;
	}
}
System.out.println(s2);
}
}