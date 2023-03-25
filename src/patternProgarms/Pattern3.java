package patternProgarms;

public class Pattern3 {

	public static void main(String[] args) {
		char ch='a';
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++)
		{
			if(i>=j) {
				System.out.print(ch++  +" ");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}

}
