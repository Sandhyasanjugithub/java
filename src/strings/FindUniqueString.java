package strings;

public class FindUniqueString {

	public static void main(String[] args) {
		String s="palindromepalinpali";
		String us="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(us.indexOf(ch)==-1)
			{
				us=us+ch;
			}
		}
		System.out.println("unique string:"+us);

	}

}
