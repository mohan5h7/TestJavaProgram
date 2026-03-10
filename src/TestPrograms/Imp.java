package TestPrograms;

public class Imp {

	//conversion
	
	
	//Integer → String
	
	int num = 123;

	String str = String.valueOf(num);//output//"123";

	
	//or
	int num1 = 123;

	String str1 = Integer.toString(num);//output//"123";

	//String → Integer
	
	String str2 = "123";

	int num2 = Integer.parseInt(str2);//123

	//or
	
	String str3 = "123";

	int num3 = Integer.valueOf(str3);//123

	
	//String → Char Array
	
	String str4 = "java";

	char[] arr = str4.toCharArray();//output//['j','a','v','a']
	
	
	
	//Char Array → String
	
	char[] arr1 = {'j','a','v','a'};

	String str5 = new String(arr1);//"java";

	
	
}
