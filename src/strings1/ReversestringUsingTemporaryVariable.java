package strings1;

public class ReversestringUsingTemporaryVariable {

	public static void main(String[] args) {
String s="Testyantra";
		
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}
		System.out.print(rev);

	}
	

}

