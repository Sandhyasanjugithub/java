package objectClass;

public class Employee {
String name;
int id;
float salary;

Employee(String name,int id,float salary)
{
	this.name=name;
	this.id=id;
	this.salary=salary;
}

@Override
public String toString() {
	return "name=" + name + ", id=" + id + ", salary=" + salary ;

}
public static void main(String[] args) {
	Employee e=new Employee("r",1, 001.23f);
	System.out.println(e);
}
}
