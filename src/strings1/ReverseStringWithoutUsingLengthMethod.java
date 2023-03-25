package strings1;

public class ReverseStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s="Testyantra";
		char[] ch = s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]+"");
		}
	}

}
