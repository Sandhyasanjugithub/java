package strings;

public class IndexOff {

	public static void main(String[] args) {
		String s="Diamond";
		int i=s.indexOf(2);
		System.out.println(i);
		int j=s.indexOf("mon");
		System.out.println(j);
		int k=s.indexOf('m', 3);
		System.out.println(k);
		int l=s.indexOf("iam", 4);
		System.out.println(l);

	}

}
