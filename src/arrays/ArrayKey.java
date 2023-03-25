package arrays;

import java.util.Scanner;

public class ArrayKey {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5};
	int size=a.length;
	int b[]= new int [size];
	int key=sc.nextInt();
	int i=0;
	for(int j=key-1;j<size;j++)
	{
		a[j]=b[i];
		j++;
	}
	for(int j=0;j<key;j++)
	{
		a[j]=b[i];
		i++;
	}
	
		
		

	}

}
