package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Data implements  Comparable{
int age;
String name;
long salary;
Data(int age,String name,long salary)
{
	this.age=age;
	this.name=name;
	this.salary=salary;
}

	@Override
public String toString() {
	
	return "age=" + age + ",name=" + name + ",salary=" + salary;
}

	@Override
	public int compareTo(Object o) {
		Data d=(Data)o;
		if(d.age<age)
		{
			return 1;
		}
		else if(d.age>age) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Data d=new Data(26,"saff",6778970);
		Data d1=new Data(23,"ram",400000);
		Data d2=new Data(25,"raghu",350000);
		ArrayList a=new ArrayList();
		a.add(d);
		a.add(d1);
		a.add(d2);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		MyNameComparator mc=new MyNameComparator();
		Collections.sort(a,mc);
		System.out.println(a);
		
		Collections.sort(a,new MySalaryComparator());
		System.out.println(a );

	}

}
