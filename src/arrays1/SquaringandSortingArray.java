package arrays1;

public class SquaringandSortingArray {

	public static void main(String[] args) {
		int []a= {6,5,2,2,3,3,1};
		int length=a.length;
		int j=0;//assign the values to k
		//steps for squaring/multiplying an array
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*a[i];
		}
		System.out.println("After squaring : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		//steps for sorting
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
		System.out.println();
		System.out.println("After Sorting: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	
	}

}
