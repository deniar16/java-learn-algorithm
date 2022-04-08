package learn.algorithm.recursion;

public class ProductOfArray {

    public static int productOfArray(int[] arr, int index) {
        //base case
        if(index >= arr.length){
            return 1;
        }
        return arr[index] * productOfArray(arr, ++index);
    }

    public static int productOfArray(int[] arr){
        return productOfArray(arr, 0);
    }
}
