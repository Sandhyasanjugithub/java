package arrays;

public class ToPrintMaximumValueWithOutSorting {

	public static void main(String[] args) {
		int [] a= {5,8,2,6,12,1,0,4};
		int max=a[0];//5 8 12
		for(int i=0;i<a.length;i++)
		{  //i=0,1,2,3,4,5,6,7,8 //8>8
			if(a[i]>max)//5>5 (f) //8>5(t) //2>8(f) //6>8(f) //12>8 (t) //1>12(f)
			{
				max=a[i];//max=8 , max=12
			}
		}
		System.out.println(max);
	}

}
