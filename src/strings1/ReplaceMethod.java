package strings1;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s="sandhya";
		System.out.println(s.replace('a', 'p'));
		System.out.println(s.replace("sa", "pr"));
		System.out.println(s.replaceAll("[aeiou]", "s"));
		System.out.println(s.replaceAll("[a-z]","0"));
		System.out.println(s.replaceFirst("s","h"));

	}

}
