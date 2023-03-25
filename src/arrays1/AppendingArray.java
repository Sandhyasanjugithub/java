package arrays1;

public class AppendingArray {

	public static void main(String[] args) {
	int a[]= {1,0,1,0,1,0,0,1,0};
	int b[]=new int[a.length];
			
	int start=0;
	int end=a.length-1;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			b[end]=a[i];
			end--;
		}
		else
		{
			b[start]=a[i];
			start++;
		}
	}

	
	for(int i=0;i<b.length;i++)//for printing purpose
	{
		System.out.print(b[i]+"");
	}
		

}



		
	

	}


