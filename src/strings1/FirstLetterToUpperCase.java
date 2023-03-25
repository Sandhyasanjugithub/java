package strings1;

public class FirstLetterToUpperCase {
	public static void main(String[] args) {
		String s="welcome to india";
	    String[] str = s.split(" ");
	
	String allLetters="";	
	    
    for (String w : str) {
    	
	String lowercase = w.substring(0, 1).toUpperCase();
			String remainingLetters = w.substring(1);
		allLetters = allLetters+lowercase+remainingLetters+" ";			
		}
	    System.out.println(allLetters);
	
	}

}

