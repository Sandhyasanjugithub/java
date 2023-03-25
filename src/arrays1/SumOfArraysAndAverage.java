package arrays1;

public class SumOfArraysAndAverage {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("The sum of an array is"+sum);
		avg=sum/a.length;
		System.out.println("The avg of an array is"+avg);
	}

}
