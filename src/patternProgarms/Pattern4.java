package patternProgarms;

public class Pattern4 {

	public static void main(String[] args) {
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(i>=j) {
				System.out.print((char)('a'+i+j)+" ");
			}
			else {
				System.out.print("");
			}
		}
		System.out.println();
	}

	}

}
