package TestPrograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("It is Prime Number");
        } else {
            System.out.println("It is Not a Prime Number");
        }
    }
}
