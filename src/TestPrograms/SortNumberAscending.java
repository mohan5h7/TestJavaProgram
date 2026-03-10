package TestPrograms;

import java.util.Arrays;

public class SortNumberAscending {

	public static void main(String[] args) {


	        int arr[] = {5,3,8,1,2};

	        Arrays.sort(arr);   // Step 1: sort ascending

	        for(int i = arr.length - 1; i >= 0; i--) {   // Step 2: reverse print for descending order
	            System.out.print(arr[i] + " ");
	        }

        
    }
}
