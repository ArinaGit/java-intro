package Test3;


public class Main {
    public static void main(String[] args) {
        //Ex1
        Fibonacci fibo = new Fibonacci ();
        fibo.printFibonacciNumbers (6);
        //Ex2
        eachNth stroka = new eachNth ();
        stroka.eachNth ("String", 2);
        stroka.eachNth ("abcdefg", 2);
        stroka.eachNth ("abcdefg", 3);
    }

}


