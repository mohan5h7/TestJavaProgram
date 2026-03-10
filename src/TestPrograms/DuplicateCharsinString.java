package TestPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharsinString {

//Print duplicate characters	
	 /*

Creates a HashSet

Purpose:

Store unique characters

Automatically ignores duplicates
	  
	  */
	  
	public static void main(String args[]) {
		
		String Dp = "programming";
		
		Set<Character> s = new HashSet<>();
		
		//Or
		//HashSet<Character> s = new HashSet<>();

		
		//for(int i = 0;i<Dp.length();i++) {
		for(char ch : Dp.toCharArray()) {			
			//char c = Dp.charAt(i);
			
			

			
			if(!s.add(ch))	{ // If we remove Not operator it will print only non repeated words 
				
				System.out.println(ch);
				
			}//if
				
				
				
				
			}//for
			
			/*
What happens here internally?

s.add(c):

Returns true → if character is new(so it will prints only non repeated words)

Returns false → if character already exists

So kept ! (NOT operator):

Converts false to true then it will print duplicate characters
			
			 */
			
			
			
		
	}//main
	
	
}//class
