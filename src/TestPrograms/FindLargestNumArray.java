package TestPrograms;

public class FindLargestNumArray {

	public static void main(String args[]) {
		
		
		int[] arr = {10, 25, 5, 40, 30};
		
		
		int max = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			
			/*
			 
			 Loop starts from index 1 (second element)

             We already stored index 0 in max

             Loop runs till the last element
			 
			 
			 */
			
			
			if(arr[i]>max) { //Checks if current element is greater than the current maximum
				
				max =arr[i]; //If condition is true, update max
				
				
			}
		}
		
		System.out.println("Largest number: " + max);
		
		
	}
	
	
	
	
	
	
	
	
	
}
