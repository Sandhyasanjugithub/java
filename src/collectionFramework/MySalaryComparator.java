package collectionFramework;

import java.util.Comparator;

public class MySalaryComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Data m=(Data)o1;
		Data m1=(Data)o2;
		if(m.salary<m1.salary)
		{
			return 1;
		}
		else if(m.salary>m1.salary)
		{
			return -1;
		}
		
		return 0;
	}



		
	}


