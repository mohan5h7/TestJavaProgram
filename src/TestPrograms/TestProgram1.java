package TestPrograms;

public class TestProgram1 {

public static void main(String args[]) {
		
		
		String str = "TestSelenium"; //0
				
		
		String rev ="";
		String rem ="";
		
	
		
		
			 for(int i = 4 - 1; i >= 0; i--) {
				 
				// or
				// for(int i = str.indexOf("T"); i >= 0; i--) best for interview//
				 //indexOf() finds the position of a character in the string.
				// str.indexOf("T") = 3
			
			  char ch = str.charAt(i);
			  rev = rev+ch;//t//ts//tset
			
		     }
			
			 
			     for(int j=4;j<str.length();j++) {
				 char ch1 = str.charAt(j);
				 rem = rem+ch1;
				
			 }
			     System.out.println(rev+rem);
}
}
