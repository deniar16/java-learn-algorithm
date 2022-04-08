package learn.algorithm.recursion;

public class RecursiveRange {
    
    public static int recursiveRange(int num){
        if(num == 0){
            return 0;
        }
        return num + recursiveRange(--num);
    }
}
