package TestPrograms;

public class ReverseNumber {

	
	public static void main(String args[]) {
		
		
		int number = 1234;
		int reverse = 0;
		
		System.out.println("Original Number: " + number);
		   
		    while(number != 0) {            //Loop runs until all digits are processed
			
			int digit = number%10;          //Get last digit 1234 % 10 = 4
			
			reverse = reverse*10+digit;     //Build reverse number //reverse = 0 * 10 + 4 = 4
			
			number = number/10;             //1234 / 10 = 123
			
		}
		
		 System.out.println("Reversed Number: " + reverse);
		
		
	}
	
	/*
	             OR
	   
	    public static void main(String[] args) {

        int number = 1234;

        System.out.println("Original Number: " + number);

        // Convert number to String
        String str = Integer.toString(number);

        // Reverse using StringBuilder
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Convert back to int
        int reversedNumber = Integer.parseInt(reversedStr);

        System.out.println("Reversed Number: " + reversedNumber);
    }
	  
	 */
	
	
	
	
	
	
}
