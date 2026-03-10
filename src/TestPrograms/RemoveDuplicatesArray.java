package TestPrograms;

import java.util.HashSet;

public class RemoveDuplicatesArray {
	
	
	public static void main(String args[]) {
		
		
		

		        int[] arr = {1,2,3,2,4,1,5};

		        HashSet<Integer> s = new HashSet<>();

		        for(int num : arr) {
		        	 if(s.add(num)) { //   Remove Duplicate number
		          //  if(!s.add(num)) { //   Print only Duplicate number  
		                System.out.println("Remove Duplicate number: " + num);
		               // System.out.println("Print only Duplicate number: " + num);

		            }
		        }

		    }

}
