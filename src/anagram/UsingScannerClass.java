package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class UsingScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string: ");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("enter the second string: ");
		String s2 = sc.nextLine().toLowerCase();
		//check if the length is same
		if(s1.length()==s2.length())
		{
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean res = Arrays.equals(ch1, ch2);
			
			if(res) {
				System.out.println(s1+ "and"+s2+ " are anagram");
			}
				else
				{
					System.out.println(s1+ " and " +s2+" are not anagram ");
				}
		}
		else
		{
			System.out.println(s1+ "and" +s2+" are not anagram ");
		}
		sc.close();
	}

					
			
		

	}


