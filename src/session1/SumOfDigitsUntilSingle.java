package session1;



public class SumOfDigitsUntilSingle {

	
		
			static int digSum(int n)
			{
			if(n==0)
				//if number equals to 0,it returns 0
				return 0;
			return(n%9==0)?9:(n%9);
			}
			//driver code
			public static void main(String[] args) {
		int n=811;
		System.out.println("the sum of the digit is:"+digSum(n));
		}
			



	}


