package strings1;

public class MinCountInASentence {

	public static void main(String[] args) {
		String s="I am from hyderabad";
		String[] s1 = s.split(" ");
		String s2=" ";
		int min=s1.length;
		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			if(str.length()<min)
			{
				min=str.length();
				s2=str;
			}
		}
System.out.println(s2+" = "+min);
	}

}
