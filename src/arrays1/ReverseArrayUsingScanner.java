package arrays1;

import java.util.Scanner;

public class ReverseArrayUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values : ");
//int a[]= {1,2,3,4,5};	
		
		for(int i=0;i<a.length;i++)//it is used to insert values
		{
			a[i]=sc.nextInt();
	}
		for(int j=a.length-1;j>=0;j--)
		{
			
			System.out.println(a[j]+"");
		}
	}
	}


			
//			System.out.println("The array values are: ");
//			for(int i=0;i<a.length;i++)//it is used for printing the values
//			{
//				System.out.println(a[i]+"");
//		}
//			int start=0;
//			int end=a.length-1;
//			for(int i=0;i<a.length;i++)//for swapping
//			{
//				if(start<end)
//				{
//					int temp=a[start];
//					a[start]=a[end];
//					a[end]=temp;
//					start++;
//					end--;
//				}
//			}
//			System.out.println();
//			System.out.println("The reverse values are: ");
//			for(int i=0;i<a.length;i++)//for printing purpose
//			{
//				System.out.print(a[i]+"");
//			}
//				
//
//	}
//
//}
