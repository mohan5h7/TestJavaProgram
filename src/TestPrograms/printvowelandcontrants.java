package TestPrograms;

public class printvowelandcontrants {

	public static void main(String[] args) {

        String str = "I am an indian";

        String result = str.replace(" ", "");

        char[] words = result.toLowerCase().toCharArray();

        for(int i = 0; i < words.length; i++)
        {
            char ch = words[i];

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch + " is vowel");
            }
            else
            {
                System.out.println(ch + " is consonant");
            }
        }

	}
}
