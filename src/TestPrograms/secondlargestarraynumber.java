package TestPrograms;

import java.util.Arrays;

public class secondlargestarraynumber {

	
	
	public static void main(String[] args) {

        int[] arr = {10,25,5,40,30};

        Arrays.sort(arr);//5,10,25,30,40

        int secondLargest = arr[arr.length-2];//arr[5-2]=3=arr[3]=30;

        System.out.println("Second Largest: " + secondLargest);
    }
}
/* public static void main(String args[]) {

        int[] arr = {10,25,5,40,30};

        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int secondLargest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
 *  
 */      



//  Second smallest num 
 
 
/*
 *  public static void main(String[] args) {

        int[] arr = {10,25,5,40,30};

        Arrays.sort(arr);  // [5,10,25,30,40]

        int secondSmallest = arr[1];

        System.out.println("Second Smallest: " + secondSmallest);
    }
 */

