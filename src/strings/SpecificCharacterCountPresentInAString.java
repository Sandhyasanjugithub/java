package strings;

public class SpecificCharacterCountPresentInAString {

	public static void main(String[] args) {
		String s="swarnalatha";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i)=='a')
			{
			count++;	
			}
		}
	System.out.println("count of a is :"+count);	

	}

}
