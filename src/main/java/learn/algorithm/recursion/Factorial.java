package learn.algorithm.recursion;

public class Factorial {
    public int factorial(int num){
        //base case
        if(num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
