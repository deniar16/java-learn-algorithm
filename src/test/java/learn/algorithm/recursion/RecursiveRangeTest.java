package learn.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveRangeTest {
    @Test
    public void recursiveRange(){
        Assertions.assertEquals(21, RecursiveRange.recursiveRange(6));
        Assertions.assertEquals(55, RecursiveRange.recursiveRange(10));
    }
}
