package arrays1;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int start=0;
		int end=a.length-1;
		for(int i=0;i<a.length;i++)//for swapping
		{
			if(start<end)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
	
		System.out.println("The reverse values are: ");
		for(int i=0;i<a.length;i++)//for printing purpose
		{
			System.out.print(a[i]+"");
		}
			

}

	}


