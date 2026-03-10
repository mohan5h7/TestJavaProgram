package TestPrograms;

public class ReverseString2 {

	static String Rev = "Selenium";
	
	public static void main(String args[]) {
		
	StringBuilder Str = new StringBuilder(Rev);
	
	System.out.println("Reverse String is "+ Str.reverse());
		
	}
	
}
/*
 static String str = "Selenium";
	 static String rev = "";
	
	public static void main(String args[]) 
	{
	
		for (int i = str.length() - 1; i >= 0; i--) {
		    rev = rev + str.charAt(i);
		   
		}
		   System.out.println(rev);
	}
*/