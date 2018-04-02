package src.lesson02;

public class Fibonacci {
    public static void printFibonacciNumbers (int n) {
        int a = 0;
        int b = 1;
        System.out.print (a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print (c + " ");
            a = b;
            b = c;
        }
        System.out.println ( );
    }

    public static void main(String[] args) {
        //Ex1
        Fibonacci fibo = new Fibonacci ();
        fibo.printFibonacciNumbers (6);}
}
