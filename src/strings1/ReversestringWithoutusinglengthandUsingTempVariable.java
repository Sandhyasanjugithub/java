package strings1;

public class ReversestringWithoutusinglengthandUsingTempVariable {

	public static void main(String[] args) {
		String s="Testyantra";
		char[] ch = s.toCharArray();
		int count=0;
		String rev="";
		for(char c:ch)
		{
			count++;
		}
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}




	}


