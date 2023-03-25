package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {//o1=d;02=d(upcasting)
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1>i2)
		{
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(65);
		a.add(56);
		a.add(21);
		a.add(12);
		a.add(35);
		Demo d=new Demo();
		Collections.sort(a,d);
		System.out.println(a);
	}

}
