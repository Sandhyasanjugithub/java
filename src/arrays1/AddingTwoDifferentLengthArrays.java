 package arrays1;

public class AddingTwoDifferentLengthArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4,5};
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try
			{
				System.out.println(a[i]+b[i]+" ");
			}
			catch(Throwable t)
			{
			if(a.length>b.length)
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(b[i]);
			}
			}
		}
				

	}

}
