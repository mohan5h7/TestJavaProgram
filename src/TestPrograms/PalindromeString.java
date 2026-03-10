package TestPrograms;

public class PalindromeString {

	//A palindrome string is a word that reads the same forward and backward.
	static String Str ="madam";//level//radar
	static String Rev="";
	
	public static void main(String args[]) {
		
		for(int i=Str.length()-1;i>=0;i--) {
			
			Rev = Rev+Str.charAt(i);
			
		}
		
		System.out.println("Reverse String is " +Rev);
		
		if(Str.equals(Rev)) {
			
			System.out.println("Palindrome String");
		}
			else {
				System.out.println("Not Palindrome String");
			}
			
			
		}
		
		
		
	}



///////////////////////Or/////////////////////
/*
 * String str = "madam";

String rev = new StringBuilder(str).reverse().toString();

if (str.equals(rev)) {
    System.out.println("Palindrome");
}

 */








