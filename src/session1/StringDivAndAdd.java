package session1;

public class StringDivAndAdd {

	public static void main(String[] args) {
		int sum=0;
		String str="a11b22c33";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
			sum+=(str.charAt(i)-'0');	
			}
		}
		System.out.println("Sum of all digits: "+sum);
		

	}

}
