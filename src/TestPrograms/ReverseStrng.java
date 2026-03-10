package TestPrograms;

public class ReverseStrng {

	
	static String Str ="Selenium";
	static String Rev="";
	
	public static void main(String args[]) {
		
		for(int i=Str.length()-1;i>=0;i--) {
			
			Rev = Rev+Str.charAt(i); //m//mu/mui/muin/muine/muinel
			
		}
		
		System.out.println("Reverse String is " +Rev);
	}
	
	
	
	
}
//charAt() is a String method used to get a single character from a string using its index position.

//Syntax
//stringName.charAt(index);

//String str = "Selenium";
//System.out.println(str.charAt(0)); //Output S
