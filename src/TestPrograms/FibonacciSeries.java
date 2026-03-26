package TestPrograms;


/*
 * What is Fibonacci Series?

👉 Fibonacci series is a sequence where
each number is the sum of the previous two numbers

Series starts with:
0, 1

Fibonacci Series:
0 1 1 2 3 5 8 13 21 ...

Formula (simple words)
next = first + second
 */



//Print first 10 Fibonacci numbers



public class FibonacciSeries {

	public static void main(String[] args) {

        int n = 10;      // number of terms
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second);
  
        for (int i = 2; i < n; i++) {

            int next = first + second;
            
            System.out.print(" " + next);

            first = second;
            second = next;
        }
    }
}
