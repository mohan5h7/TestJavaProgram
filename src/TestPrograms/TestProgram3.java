package TestPrograms;

import java.util.HashSet;

public class TestProgram3 {
	
	public static void main(String[] args) {
		
	
		int [] arr = {1,3,44,55,66};
		
		int Max = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			
			if(arr[i]<Max) {
				
				Max = arr[i];
			}
		}
		int min = arr[0];
		
		for(int j =0;j<arr.length;j++) {
			
		
			
			
			 
			 if(arr[j]>min && arr[j]< Max ) {
				 
				 min = arr[j];
				 
				 
			 }
		
			 
			
		}
		
		System.out.println("Second Largest: " + min);
	}
	
	
}