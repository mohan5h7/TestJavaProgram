package TestPrograms;

public class Printzerosideoneside {

	
	public static void main(String[] args) {

		int[] arr = {0,1,1,1,0,0,1};

        for(int i = 0; i < arr.length; i++){
            int ch = arr[i];

            if(ch == 0){
                System.out.print(ch);
            }
        }

        for(int i = 0; i < arr.length; i++){
            int ch = arr[i];

            if(ch == 1){
                System.out.print(ch);
            }
        }
    }
}
