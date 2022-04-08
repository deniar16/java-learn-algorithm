package learn.algorithm.recursion;

public class Fibonacci {
    public static int fib(int num){

        if(num == 1){
            return 1;
        }

        if(num == 0){
            return 0;
        }

        return fib(num - 2) + fib(num - 1);

    }
}
