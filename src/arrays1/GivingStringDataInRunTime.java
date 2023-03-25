package arrays1;

import java.util.Scanner;

public class GivingStringDataInRunTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data: ");
		int size =sc.nextInt();
		String a[]=new String[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
        System.out.println("The values of an array is: ");
        for(int i=0;i<a.length;i++) {
	    System.out.print(a[i]+" ");
	    }
	}
}