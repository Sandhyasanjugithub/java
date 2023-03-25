package strings1;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="mom";
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
	
			
}




	}


