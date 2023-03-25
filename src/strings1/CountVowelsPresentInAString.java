package strings1;

public class CountVowelsPresentInAString {

	public static void main(String[] args) {
		
			String s="testyantra";
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					System.out.println(s.charAt(i));
					count++;
				}
			}
	System.out.println("count of vowels :"+count);
		}

	


	}


