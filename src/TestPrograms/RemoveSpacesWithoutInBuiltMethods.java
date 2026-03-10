package TestPrograms;

public class RemoveSpacesWithoutInBuiltMethods {

	
	static String str = "Java is easy";
	static String Result ="";
	
	public static void main(String args[]) {
		
		
		for(int i = 0 ; i < str.length();i++) {
			
			if(str.charAt(i)!=' ') {             //str.charAt(i) → gets one character at position i example First J next A
			
			Result = Result+str.charAt(i);       //Executes only if character is NOT equal to space
			}
		}
	
		System.out.println(Result);
	
	
}
}