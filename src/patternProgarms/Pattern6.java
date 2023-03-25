package patternProgarms;

public class Pattern6 {

	public static void main(String[] args) {
		int k=0;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++)
			{
				if(i>=j)
				{
					System.out.print((k++%9)+1+" ");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
