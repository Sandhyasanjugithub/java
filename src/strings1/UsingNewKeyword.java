package strings1;

public class UsingNewKeyword {

	public static void main(String[] args) {
		String s=new String("hyd");
		String s1=new String("hyd");
		String s2=new String("bng");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		s1=s2;
		

	}

}
