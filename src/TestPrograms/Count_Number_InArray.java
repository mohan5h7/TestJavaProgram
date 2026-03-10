package TestPrograms;

public class Count_Number_InArray {
	
	public static void main(String args[]) {

	int arr[] = {1,2,3,4,2,4,2};
	
	int num = 2;
	
	int count = 0;
	
	for(int i = 0; i < arr.length; i++) 
	
	{
		int chr = arr[i];

	if(chr==num) 
	{
		count++;
	}
		
	}
	
	System.out.print(count);
}
}