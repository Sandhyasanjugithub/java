package strings1;

public class Exam {
//	 public static String
//	    swap(String str)
//	    {
//	 
//	       
//	        if (str.length() < 2)
//	            return str;
//	 char[] ch = str.toCharArray();
//	 
//    
//     char temp = ch[0];
//     ch[0] = ch[ch.length - 1];
//     ch[ch.length - 1] = temp;
//
//    
//     return String.valueOf(ch);
// }
//
// // Driver Code
public static void
 main(String args[])
 {
  
     String s = "Testyantra";
    char[] ch = s.toCharArray();
    for(int i=0;i<ch.length;i++) {
    	for(int j=0;j<ch.length;j++)
    	{
    		if(i==0&&j==ch.length-1)
    		{
    			char temp=ch[0];
    			ch[0]=ch[ch.length-1];
    			ch[ch.length-1]=temp;
    		}
    	}
    }
    for(int i=0;i<ch.length;i++)
    {
    	System.out.println(ch);
    	break;
    }
 }
}

   
     

