package TestPrograms;

public class RemoveSpacesString {

	//In Built Methods
	
public static void main(String args[])	{
	
	String str = "Java is very easy and manage";
	//String Result = str.replace(" ", "");//replace() removes all space characters.
	
	//OR
	
	String Result = str.replaceAll("\\s", "");//\\s → removes all whitespace (space, tab, newline)
	System.out.println(Result);
	
	
}
	
	
	
	
	
	
	
	
	
}
