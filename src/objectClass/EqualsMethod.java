package objectClass;

import java.util.Objects;

public class EqualsMethod {

	public static void main(String[] args) {
		//purpose of equals()
		EqualsMethod c=new EqualsMethod();
		EqualsMethod c1=new EqualsMethod();
		
		System.out.println(c.equals(c1));
		c=c1;
		System.out.println(c.equals(c1));
		

	}
}
