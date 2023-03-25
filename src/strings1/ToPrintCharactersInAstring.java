 package strings1;

public class ToPrintCharactersInAstring {

	public static void main(String[] args) {
		String s="Testyantra";
		char[] ch = s.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
