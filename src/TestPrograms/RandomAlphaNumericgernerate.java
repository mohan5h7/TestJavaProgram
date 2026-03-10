package TestPrograms;

import java.util.Random;

public class RandomAlphaNumericgernerate {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] ch = str.toCharArray();

        Random rand = new Random();

        String result = "";

        for (int i = 0; i < 6; i++) {

            int index = rand.nextInt(ch.length);  // it takes random index
            char rad = ch[index];                 // get random character

            result = result + rad;                // add to result
        }

        System.out.println("Random String: " + result);
    }
}
/*
 public class RandomAlphaNumeric {

    public static void main(String[] args) {

        String random = RandomStringUtils.randomAlphanumeric(6);

        System.out.println(random);
        }}
 */
