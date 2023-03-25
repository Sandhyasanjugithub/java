package strings;

public class RemoveSpecialCharactersInAString {

	public static void main(String[] args) {
		String s="This#string%contains^special&characters*";
		String s1=s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s1);

	}

}
