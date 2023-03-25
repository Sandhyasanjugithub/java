package arrays1;

import java.util.Scanner;

public class ArrayKey {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int key=3;//how many iterations we want to do on the array/how many values we have to pass
		
		for(int i=0;i<key;i++)
		{
			int temp=a[0];//to store/pass the values at the end	
			for(int j=1;j<a.length;j++)//for forwarding   
			{
				a[j-1]=a[j];//for forwarding purpose we write j-1
			}
			a[a.length-1]=temp;//hardcoding to store the last element in temp
			
		}
		
				
		for(int i=0;i<a.length;i++)//for printing purpose
		{
			System.out.println(a[i]+" ");
		}
	}
}
			
			

		
