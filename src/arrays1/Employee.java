package arrays1;

public class Employee {
	//Step 1:global variables
	String name;
	int id;
	double salary;
	//Step 2:initializing constructor
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	//Step 4:creating static method to pass it as a parameter 
	public static void details(Employee empDetails[])
	{
		for(int i=0;i<empDetails.length;i++)
		{
			System.out.println(empDetails[i].name+" "+empDetails[i].id+" "+empDetails[i].salary);
		}
	}
//Step 3:creating an object with passing an array as an index
	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		
		e[0]= new Employee("sandhya",01,2000.2);
		e[1]= new Employee("sanju",02,20003.2);
		e[2]= new Employee("san",03,20005.2);
		//printing directly inside the main method
//		for(int i=0;i<e.length;i++)
//		{
//			System.out.println(e[i].name+" "+e[i].id+" "+e[i].salary);
//		}
		details(e);
		

	}

}
