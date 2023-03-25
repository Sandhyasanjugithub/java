package arrays1;

import java.util.Scanner;

public class GivingValuesInRunTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        System.out.println("The values of an array is: ");
        for(int i=0;i<a.length;i++) {
	    System.out.print(a[i]+" ");
	    }
	}

}
