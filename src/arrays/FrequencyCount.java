package arrays;



public class FrequencyCount
{

	public static void main(String[] args) 
	{
		String s="aabccddfaa";
		int freCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
					
				}
				else
				{
					break;
				}
			}
				if(count>1)
				{
					freCount++;
				}
			}
		System.out.print("");
		System.out.print(s+" "+freCount);
	}
}








