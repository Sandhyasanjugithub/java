package arrays1;

public class SwappingSentence {

	public static void main(String[] args) {
//		String s="hyderabad";
//		String s1="banglaore";
//		s=s+s1;
//		s1=s.substring(0, s.length()-s1.length());
//		s=s.substring(s1.length());
//		System.out.println(s+"\n"+s1);//\n is printing in a new line
String s="I am in hyderabad";
String[] str = s.split(" ");
//swapping
String temp = str[0];
str[0]=str[str.length-1];
str[str.length-1]=temp;

//initializing
for(int i=0;i<str.length;i++)
{
	System.out.print(str[i]+" ");
}
	}

}
