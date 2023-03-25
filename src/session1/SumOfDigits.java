package session1;

import java.util.Scanner;

public class SumOfDigits {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			count++;
			
		}
		System.out.println("the sum of the digit present in the number :"+sum);
		System.out.println("the count of the digit present in the number :"+count);
		}
		}

		

		
		
	
	

			


	


