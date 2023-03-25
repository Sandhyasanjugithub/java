package arrays;

public class BubbleSortSpecificNumber {

	public static void main(String[] args) {
		int [] a= {5,8,6,12,2,1,0,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((i==0 && j==4)|| (i==5 && i==7))
				{
					int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
				}
			}
		
				
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
