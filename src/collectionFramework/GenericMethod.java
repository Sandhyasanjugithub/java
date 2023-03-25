package collectionFramework;

import java.util.ArrayList;

public class GenericMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(65);
		l.add(2);
		l.add(56);
		l.add(null);
	
		System.out.println(l);
		
		
		System.out.println("using for each loop");
		for(Integer list:l) {
		System.out.println(list);
	}
	
		
		System.out.println("using for loop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}


	}

}
