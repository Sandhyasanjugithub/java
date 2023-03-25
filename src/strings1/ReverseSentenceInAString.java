package strings1;

public class ReverseSentenceInAString {

	public static void main(String[] args) {
		String s="katam ta ta bye bye";
		String str[]=s.split("");
		String r="";
//		char[] ch = s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			//whatever the loop get itterated it will store into k
//			int k=i;
//			while(i>=0 && ch[i]!=' ')
//			{
//				i--;
//				}
//			int j=i+1;
//			//to reverse the stored string
//			while(j<=k)
//			{
//				r=r+ch[j];
//				j++;
//			}
//			
//			r=r+' ';
//		}
//		System.out.println(r);
//
//	}
//
//	}
for(int i=0;i<str.length;i++)
{
	r=str[i]+""+r;

	}
System.out.println(r);
	}
	}

		

