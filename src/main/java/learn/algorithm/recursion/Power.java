package learn.algorithm.recursion;

public class Power {

    public int power(int num){
        //base case
        if(num == 0){
            return 1;
        }

        return 2 * power(num - 1);
    }
}
