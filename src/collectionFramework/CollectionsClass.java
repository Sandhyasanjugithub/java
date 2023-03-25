package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
			ArrayList a=new ArrayList();
			a.add(65);
			a.add(2);
			a.add(null);
			a.add(56);
		
			
			
			
			
			Collections.reverse(a);
			System.out.println(a);
			
			Collections.shuffle(a);
			System.out.println(a);
			
			System.out.println(Collections.max(a));
			System.out.println(Collections.min(a));
			
	}
}