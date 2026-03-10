package TestPrograms;

public class ReverseWordsInSentence {

	 public static void main(String[] args) {
	        
		 String Str = "Java is Easy";//Sentence into reverse words
		 String [] words = Str.split(" ");
		 
		 
		 /*
What happens here:

" " (space) is the delimiter

Whenever Java finds a space, it splits the string

Result is stored in a String array

Array content:

words[0] = "Java"
words[1] = "is"
words[2] = "easy"
		  */
		 
	for(int i = words.length-1;i>=0;i--)	{
		
	         //	words.length = 3

				//Last index = 3 - 1 = 2

				//Loop runs backwards: 2 → 1 → 0
		
		System.out.print(words[i] +" ");
	}
		 
		 
		 
		 /*
		
		public static void main(String[] args) {
        
        String str = "Java is very easy";// Sentence into words

        String[] words = str.split(" ");

        for (String word : words) {
        
        //This loop goes through each element in the words array

       //word holds one word at a time
            
            System.out.println(word);
        }
    }
    out put = Java is very easy
		  */
		 
		 
		 
		 
		 
	    }
	}
