package strings;

public class CountNoOfWordsInAString {

	public static void main(String[] args) {
		String s="  I Am A Automation Tester    ";
		System.out.println("before trimming:"+s);
		String s1=s.trim();
		System.out.println("After trimming:"+s1);
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' '  && s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("No of Words:"+count);

	}

}
