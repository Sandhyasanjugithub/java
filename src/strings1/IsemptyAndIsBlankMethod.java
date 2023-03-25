package strings1;

public class IsemptyAndIsBlankMethod {

	public static void main(String[] args) {
		String s="";
		System.out.println(s.isBlank());//it will consider space
		System.out.println(s.isEmpty());//it will not consider space

	}

}
