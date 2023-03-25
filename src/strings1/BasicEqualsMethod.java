package strings1;

public class BasicEqualsMethod {

	public static void main(String[] args) {
		String s="Testyantra";
		String s1="Testyantra";
		String s2="tyss";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);//compare with address
		System.out.println(s.equals(s1));//compare with properties
		System.out.println(s==s2);
		s=s2;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	

	}

}
