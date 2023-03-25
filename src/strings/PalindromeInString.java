package strings;

public class PalindromeInString {
	public static void main(String[] args)
	{
		String s="madam";
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
        r=r+s.charAt(i);	
        }
        System.out.println("Actual String:"+s);
        System.out.println("Reverse String:"+r);
	if(s.equals(r))
	{
		System.out.println("Given String is Palindrome");
	}
	String s1=s.substring(2);
	System.out.println(s1);
			
}
}



