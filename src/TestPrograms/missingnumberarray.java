package TestPrograms;

import java.util.HashSet;

public class missingnumberarray {

	public static void main(String[] args) {

        int[] arr = {1,2,3,5};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i=1;i<=5;i++){
            if(!set.contains(i)){//If the set does NOT contain that number
                System.out.println("Missing number: " + i);
            }
        }
    }
}
/*
public static void main(String[] args) {

        int[] arr = {1,2,3,5};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i=1;i<=5;i++){
            if(!set.contains(i)){
                System.out.println("Missing number: " + i);
            }
        }
    }
*/