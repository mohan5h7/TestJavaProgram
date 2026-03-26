package TestPrograms;

import java.util.Arrays;

public class AnagramCheck {
public static void main(String[] args) {
	
	/*Two strings are anagrams if:

		Same length
		Same characters (order doesn’t matter)
*/
    String s1 = "tomato";
    String s2 = "matoto";

    // Convert to char array
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    // Sort both arrays
    Arrays.sort(a);
    Arrays.sort(b);

    // Compare
    if(Arrays.equals(a, b)){
        System.out.println("Anagram");
    } else {
        System.out.println("Not Anagram");
    }
}
}


