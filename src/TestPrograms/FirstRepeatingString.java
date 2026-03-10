package TestPrograms;

import java.util.HashSet;

public class FirstRepeatingString {

	public static void main(String[] args) {

        String str = "madam";

        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()) {

            if(!set.add(ch)) {

                System.out.println("First repeating character: " + ch);
                break;
            }

        }

    }
}
