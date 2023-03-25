package arrays;

public class BubbleSort {
public static void main(String[] args)
{
	int []a= {5,8,2,6,12,1,0,4};
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
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}
