 package arrays;



public class FrequencyCountOfArray {

	public static void main(String[] args) {
		String str="sannn";
		char[] ch=str.toCharArray();
		int size=ch.length;
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					int k=j;
					while(k<size-1)
					{
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					size--;
				}
				System.out.print(ch[i]+ " "+count);
			}
		}
	}

}
