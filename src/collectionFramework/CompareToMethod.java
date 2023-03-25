package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToMethod implements Comparable{//to call compareto() we have to implements the class

	
	int age;//global variables
	String name;
	
	CompareToMethod(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		
		return "age=" +age + ",name=" + name;
	
	}
	

	

	@Override
	public int compareTo(Object o)
	{
		CompareToMethod c=(CompareToMethod)o;	
		
		if(c.name.compareTo(name)<0)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
	CompareToMethod d=new CompareToMethod(1,"s");
	CompareToMethod d1=new CompareToMethod(2,"e");
	CompareToMethod d2=new CompareToMethod(3,"t");
	CompareToMethod d3=new CompareToMethod(4,"r");
	CompareToMethod d4=new CompareToMethod(5,"l");
	ArrayList s=new ArrayList();
	s.add(d);//here passing user-defined class objects
	s.add(d1);
	s.add(d2);
	s.add(d3);
	s.add(d4);
	//for sorting inorder to call compareto();
	Collections.sort(s);
	System.out.println(s);
	//for printing line by line
	for(Object list:s) {
		System.out.println(s);
	}

}
	}
