package TestPrograms;

public class countallcharacterinstring {

	public static void main(String[] args) {

        String str = "selenium";
       
        for(int i = 0; i < str.length(); i++) {
        	 
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
            	
            	 char chp = str.charAt(j);
            	 
                if(chp == ch) {

                    count++;

                }

            }

            System.out.println(ch + " = " + count);
        }

    }
	
	
	
	
}
