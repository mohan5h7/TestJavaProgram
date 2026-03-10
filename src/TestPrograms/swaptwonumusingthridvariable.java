package TestPrograms;

public class swaptwonumusingthridvariable {
 
	
	public static void main(String args[]) {
		
		int a = 2;
		
		int b =5;
		
		System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        /*
           OR
         
        // Swapping without third variable using XOR 
       
        a = a ^ b;
        b = a ^ b;        //Interview point of view this is the best
        a = a ^ b;
         
         
         */
        
        
        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        
		
	}
	
	
	
	
	
	
	
}
