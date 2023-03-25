package strings1;

public class AlphanumericProgram {

	public static void main(String[] args) {
		int sum=0;
		String s="a11b22c33";
	
		for(int i=0;i<s.length();i++)
		{
			 char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
			sum+=(ch-'0');
//				int num=s.charAt(i)-48;
//				sum=sum+num;
			}
		}
		System.out.println("Sum of all digits: "+sum);
		

	}

}
