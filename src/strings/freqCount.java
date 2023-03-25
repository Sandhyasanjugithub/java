package strings;

public class freqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aaaaarrrrtttaa";
String s1 = s.toUpperCase();
char[] s2 = s1.toCharArray();
for(char ch='A';ch<='Z';ch++)
{
	int count = 0;
	for(int i=0;i<s2.length;i++) {
		if(ch==s2[i]) {
			
			count++;
		}
	}
	if(count>0) {
		System.out.print(ch+""+count);
	}
}
}
}