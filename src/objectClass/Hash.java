package objectClass;

import java.util.Objects;

public class Hash {

	
		String name;
		int id;
		float salary;

		Hash(String name,int id,float salary)
		{
			this.name=name;
			this.id=id;
			this.salary=salary;
		}

		@Override
		public String toString() {
			return "name=" + name + ", id=" + id + ", salary=" + salary ;

		}
		
		@Override
		public int hashCode() {
			return Objects.hash(id, name, salary);
		}

		@Override
		public boolean equals(Object obj) {
			
			Hash other = (Hash) obj;
			return id == other.id && Objects.equals(name, other.name)
					&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
		}

		public static void main(String[] args) {
			Hash e=new Hash("r",1, 001.23f);
			Hash e1=new Hash("e",2, 002.24f);
			Hash e2=new Hash("r",1, 001.23f);
			System.out.println(e.equals(e1));
			System.out.println(e.equals(e2));
			System.out.println(e.hashCode());
			
		}
		


	}


