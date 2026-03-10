package TestPrograms;

import java.util.HashMap;

public class Count_characters_count {

	public static void main(String args[]) {
		
		
		String str = "Selenium";
		
		//count e letter 
		
		char ch = 'e';//
		
		int count = 0;
		
		
		for(int i = 0;i<str.length();i++) {
			
			char chee = str.charAt(i);; 
			
			if(chee==ch) {
				
				count++;
				
			}
			
		}
		
		
		System.out.print("Count Occurence"+count);
		
		
	}
	
	
	
	
}
