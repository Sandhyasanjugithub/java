package arrays1;

public class AscendingOrderAndRemoveDuplicatesInArray {

	public static void main(String[] args) {
		int []a= {6,5,2,2,3,3,1};
		//int length=a.length;
		int j=0;//assign the values to k
		for(int i=0;i<a.length;i++)
		{
			for( int k=i+1;k<a.length;k++)
			{
				if(a[i]>a[k])
				{
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("after sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	
	
	for(int i=0;i<a.length-1;i++)
	{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
	a[j++]=a[a.length-1];
	System.out.println();
	System.out.println("remove the duplicates:");
	for(int k=0;k<j;k++)
	{
		System.out.print(a[k]);
	}
	}
}
	



	


