package objectClass;

import java.util.Objects;



public class Employees {
	String name;
	int id;
	float salary;
	
	Employees(String name,int id,float salary)
	{
		this.name=name;//assigning global variables to local variables
		this.id=id;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", salary=" + salary ;

	}
	
	

	@Override
	public boolean equals(Object obj) {
		
		Employees other = (Employees) obj;
		
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}

	public static void main(String[] args) {
		Employees e=new Employees("r",1, 001.23f);
		Employees e1=new Employees("e",2, 001.24f);
		Employees e2=new Employees("r",1, 001.23f);
		
		System.out.println(e.equals(e2));
		System.out.println(e.equals(e2));
	}

	
	}



