package strings1;

import java.util.Arrays;

public class Swapping2 {

	public static void main(String[] args) {
String s="a*#b*%d*$a_$";
char[] ch = s.toCharArray();
int j=0;
for(int i=0;i<ch.length;i++)
{
	if(i<ch.length/2-1) {
		j=ch.length/2-1;
	}
	if(i==ch.length/2) {
		j=ch.length-1;
	}
	for(int k=j;k>=0;k--) {
		if(i<k&&ch[i]>='a'&&ch[i]<='z'&&ch[k]>'a'&&ch[k]<='z') {
			char temp=ch[i];
			ch[i]=ch[k];
			ch[k]=temp;
		}
	}
}
System.out.println(Arrays.toString(ch));
	}

}
