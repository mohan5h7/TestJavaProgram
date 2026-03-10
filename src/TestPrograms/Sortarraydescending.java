package TestPrograms;

import java.util.Arrays;

public class Sortarraydescending {
	public static void main(String[] args) {

        int arr[] = {5,3,8,1,2};

        Arrays.sort(arr);  // this sorts ascending after we need to reverse for descending

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
