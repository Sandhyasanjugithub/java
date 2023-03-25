package arrays1;

public class RemoveTheDuplicateArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3,4,5};
		int length=a.length;
		int j=0;//assign the values to k
		for(int i=0;i<length-1;i++)
		{
				if(a[i]!=a[i+1])
				{
					a[j++]=a[i];
				}
			}
		a[j++]=a[length-1];
		for(int k=0;k<j;k++)
		{
			System.out.print(a[k]);
		}
	}
}

