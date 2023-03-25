package strings1;

public class FindMaxWordInTheSentenceAndCount {

	public static void main(String[] args) {
	String s="I am from hyderabad";
	String s1[]=s.split(" ");
	int max=0;
	
	
	String temp=null;
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i].length()>max)
		{
			max=s1[i].length();
			 temp = s1[i]+" "+max;
			
		}
	}
	System.out.println(temp);
	

	}

}
