package strings;

public class ReverseString {

	public static void main(String[] args) {
		String act="sanju";
		String rev="";
		for(int i=act.length()-1;i>=0;i--)
		{
			rev=rev+act.charAt(i);
		}
		System.out.println("reverse a string : "+rev);

	}

}
