package arrays1;

public class ToPrintMissingArrays {

	public static void main(String[] args) {
	int a[]= {1,5,4,2,3};
	boolean status=true;//assuming the missing numbers are present in the array or flag rising event
	for(int i=1;i<=10;i++)//to fix the range
	{
		for(int j=0;j<a.length;j++)//for array
		{
		if(i==a[j])
		{

        status=false;
        break;
	}

	}
		if(status==true)
		{
			System.out.println(i+" ");
		}
		status=true;//re-initializing the status
	}
	}

}
