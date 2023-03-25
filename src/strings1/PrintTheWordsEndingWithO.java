package strings1;

public class PrintTheWordsEndingWithO {

	public static void main(String[] args) {
		String s="hello who are you";
		 String[] s1 = s.split(" ");
		 for(int i=0;i<s1.length;i++)
		 {
if( s1[i].endsWith("o"))

	

		System.out.println(s1[i]);
		

	}

}
}
