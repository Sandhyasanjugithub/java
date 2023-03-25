package arrays1;

public class ToPrintSumOFEvenpositionsAndOddpositions {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+a[i];
				
			}
			else {
				oddsum=oddsum+a[i];
			}
			
		}
		System.out.println("EvenSum is "+evensum+"\n"+"oddsum is "+oddsum);

	}

}
