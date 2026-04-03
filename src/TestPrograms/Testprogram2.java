package TestPrograms;

import java.util.Arrays;

public class Testprogram2 {
	
	
	public static void main(String args[]) {
		
		
		
		String str = "Wipro Company mnc";
		String [] ch = str.split(" ");
		//for(int i=0;i<ch.length;i++) { //ch[0] = Wipro //ch[1] = Company //Ch[2] = mnc
			for(String sr : ch) {
			
		
			System.out.print(sr);
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}//classs

	/*
	//find missing num
	
	public static void main(String args[]) {
		int num = 123478;
		String str = Integer.toString(num);
	HashSet<Character> s = new HashSet<>();
	for(int i=0;i<str.length();i++) 
	{
		
		char ch =str.charAt(i);
		
	    s.add(ch);
			
		
		}
	
	for(int i=1;i<8;i++) {
		if(!s.contains(i)) {
			 System.out.println("Missing number: " + i);
		}
	}
		
	}

	
	
	*/
	
	
	

	/*
	//Find the Second Largest in the arry
	public static void main(String args[]) {
	int arr[] = {1,2,33,34,56,77};
	int largest =arr[0];
	
	for(int i=1;i<arr.length;i++) 
	{
		
		int ch = arr[i];
		if(ch>largest) 
		{
			
			largest =ch;
			
		}
	}
		int seclarg = arr[0];
		
		// Find second largest
        for(int i = 1; i < arr.length; i++) {

            int ch2 = arr[i];   // storing arr[i] again

            if(ch2 > seclarg && ch2 != largest) {
                seclarg = ch2;
            }
        }
	
        System.out.println(largest + " is first largest number");
    	
        System.out.println(seclarg + " is second largest number");
	
	
	
	
	}//main
	*/



////////////////////////////////////////////////////////////
/*
//Print Vowels and Constants from given string
	public static void main(String args[]) {

	String str = "I am an indian";
	char vowelscount ='0';
	char Constantscount ='0';

	char [] ch = str.replace(" ", "").toLowerCase().toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		
		char che = ch[i];
		
		if(che=='a' || che=='e' || che=='i' || che=='o' || che=='u')
        {
			vowelscount = che;
            System.out.println(vowelscount + " is vowel");
        }
        else
        {
        	Constantscount =che;
            System.out.println(Constantscount + " is consonant");
        }
		
		
		
		
	}//for
	
    
	
	}//main
	*/

//////////////////////////
///
///
///
/*
	//Count Vowels and Constants from given string
	public static void main(String args[]) {

	String str = "I am an indian";
	int vowelscount =0;
	int Constantscount =0;

	char [] ch = str.replace(" ", "").toLowerCase().toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		
		char che = ch[i];
		
		if(che =='a' || che=='e' || che =='i' || che=='o' || che=='u') 
		{
			
			vowelscount++;
			
		}
		else
		{
			Constantscount++;
		}
		
	}//for
	
	System.out.println("Total Vowels = " + vowelscount);
    System.out.println("Total Consonants = " + Constantscount);
	}//main
	
	
	/*/

///////////////////////////////////////

/*
///Count all character in given string
public static void main(String args[]) {

//Count all character in given string
String Str = "Selenium";

for(int i=0;i<Str.length();i++) {	
	
	char ch = Str.charAt(i);
	int count =0;

	for(int j=0;j<Str.length();j++) {	
		
		
		char ch1 = Str.charAt(j);
		
		if(ch==ch1) {
			
			count++;
		}
	}
	  System.out.println(ch + " = " + count);

	}
	}
*/






/////////////////////////////////
///
///	
/*
	//Count number in array

	public static void main(String args[]) {
	
	int [] arr = {1,2,3,2,3,4,5,3,3};
	int count = 0;
	
	int num = 3;
	
	for(int i=0;i<arr.length;i++) {
		
		int dup = arr[i];
		
		if(dup==num) {
			
			count++;
		}
		
	}
	System.out.println(count);
	
	}
	
	*/
/////////////////////////////
///

	/*
	//Count Characters in String
	
	public static void main(String args[]) {
	
		String str = "Selenium";
	    
	    char rep = 'e';
	    int count = 0;
	
	for(int i=0;i<str.length();i++) {
		
		char ch = str.charAt(i);
		
		if(ch==rep)
		{
			count++;
			
		}
		
	}
	System.out.println(count);

	}
	*/

//////////////////////////////////////////////
/*
//print duplicates from number

	public static void main(String args[]) {
		
		int num = 12223345;
		String str = Integer.toString(num);
		char [] arr =str.toCharArray();
		
		HashSet<Character> s = new HashSet<>();
		
		for(int i =0;i<arr.length;i++) {
			
			char pr = arr[i];
			
			if(!s.add(pr)) {
				
				System.out.println(pr);	
			}
			
			
		}
	}
	*/
///////////////////////////////////////////////////////////////////
	/*
	
	//Remove duplicates from number
	
			public static void main(String args[]) {
				
				int num = 12223345;
				String str = Integer.toString(num);
				char [] arr =str.toCharArray();
				
				HashSet<Character> s = new HashSet<>();
				
				for(char ch : arr) {
					
					
					
                 if(!s.add(ch))
					System.out.println(ch);
                  }

				}
				
			*/
///////////////////////////////////////////////////////////////

/*
	//print duplicates from array
	
		public static void main(String args[]) {
			
			int [] arr = {1,2,3,4,2,3,4,5,6};
			
			HashSet<Integer> s = new HashSet<>();
			
			for(int i=0;i<arr.length;i++) {
				
				int num = arr[i];
				
				if(!s.add(num)) {
					
					System.out.println(num);
				}
			}
	}
	*/
//////////////////////////////////////////////////////////
	/*
	//Remove duplicates from array
	
	public static void main(String args[]) {
		
		int [] arr = {1,2,3,4,2,3,4,5,6};
		
		HashSet<Integer> s = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int num = arr[i];
			
			if(s.add(num)) {
				
				System.out.println(num);
			}
		}
}
*/

/////////////////////////////////////////////////
/*
	//Print duplicates from string
	public static void main(String args[]) {
	String str = "selenium";
	char[] arr = str.toCharArray();
	
	HashSet<Character> s = new HashSet<>();
	
	for(int i=0;i<str.length();i++) {
		
		char result = arr[i];
		
		if(!s.add(result)){
			
			System.out.println(result);
			
		}
	}
	
	
	*/
	
	
	
	
	
/////////////////////////////////////////////////////////////////////////////
/*
//Remove dupliactes from string
public static void main(String args[]) {
	
String str = "selenium";


HashSet<Character> s = new HashSet<>();

for(char rem : str.toCharArray()) {
	
	if(s.add(rem)) {
		
		
		System.out.println(rem);


	}
	
}
	
}
		
	*/
	////////////////////////////////////////////////////////////////
/*

// Remove dupliactes from string
public static void main(String[] args) {

    String str = "selenium";
    String result = "";

    for(int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if(!result.contains(String.valueOf(ch))) {
            result = result + ch;
        }
    }

    System.out.println(result);
}


*/



////////////////////////////////////////////
/*
//Reverse num

public static void main(String args[]) {
	
	
	
	int num = 123456;
	String str = Integer.toString(num);

	char[] ch = str.toCharArray();
	
	char rev =0;
	
	for(int i = ch.length-1;i>=0;i--) {
		
		//rev = rev+str.charAt(i);
	
		char rev1 = ch[i];
		rev = rev1;
	
		System.out.print(rev);
		
	}
	
	
	
	
}

*/






/////////////////////////////////////////////////////////////



	/*
	
	
	//Reverse Array
	
	public static void main(String args[]) {
		
		int [] arr = {1,2,3,4,3};
		int rev =0;
		
		for(int i= arr.length-1;i>=0;i--) {
			
			int ch = arr[i];
			 
			rev = ch;
			System.out.print(rev);
		}

	
	
	*/
	
	
	///////////////////////////////////////////////////////////////
	
	
	
	/*
	//Reverse String 
	
	public static void main(String args[]) {
		
		String str ="Selenium";
		char [] arr = str.toCharArray();
		String rev ="";
		
		for(int i = arr.length-1;i>=0;i--) {
			
			char ch = arr[i];
			rev = rev+ch;
		}
		System.out.println(rev);
		
	}
	
	*/
	
	
	
