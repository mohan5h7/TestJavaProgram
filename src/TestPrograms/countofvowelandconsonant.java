package TestPrograms;

public class countofvowelandconsonant {

	//Count vowels in giveen strin
	public static void main(String[] args) {

        String str = "I am an indian";

        String result = str.replace(" ", "").toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        char[] words = result.toCharArray();

        for(int i = 0; i < words.length; i++)
        {
            char ch = words[i];

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
        }

        System.out.println("Total Vowels = " + vowelCount);
        System.out.println("Total Consonants = " + consonantCount);
    }
}