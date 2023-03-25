  package arrays;

public class PrintFirstandSecondMaxValues {

	public static void main(String[] args) {
		int [] a= {5,8,2,6,12,1,0,4};
		//         0 1 2 3  4 5 6 7 
		int fmax=a[0];//5
		int smax=a[0];//5
 		for(int i=0;i<a.length;i++)//i=0,1,2,3,4,5
		{
			if(a[i]>fmax)//5>5 8>5 //2>8(f) //6>8(f) //12>8(t) //1>12(f)
			{
				smax=fmax;//smax=5 smax=8
				
				fmax=a[i];//fmax=8  fmax=12
			}
			else if(a[i]>smax)//5>5 8>5 2>8(f) 6>8(f) 12>8(t)
			{
			smax=a[i];	//smax=8 //12
			}
		}
		System.out.println(fmax+"\n"+smax);

	}

}
