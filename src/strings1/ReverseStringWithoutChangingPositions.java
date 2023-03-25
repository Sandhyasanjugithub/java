package strings1;

public class ReverseStringWithoutChangingPositions {

	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String rev=" ";
			for(int j=0;j<word.length();j++)
			{
				rev=word.charAt(j)+rev;
			}
			System.out.print(rev);

		}
	}

}
