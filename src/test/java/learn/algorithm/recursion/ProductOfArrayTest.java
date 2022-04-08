package learn.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayTest {
    @Test
    public void productOfArray(){
        Assertions.assertEquals(6, ProductOfArray.productOfArray(new int[]{1,2,3}) );
        Assertions.assertEquals(60, ProductOfArray.productOfArray(new int[]{1,2,3,10}) );
    }
}
