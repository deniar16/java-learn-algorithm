package learn.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void fibonacciTest(){
        Assertions.assertEquals(3, Fibonacci.fib(4));
        Assertions.assertEquals(55, Fibonacci.fib(10));
        Assertions.assertEquals(317811, Fibonacci.fib(28));
        Assertions.assertEquals(9227465, Fibonacci.fib(35));
    }
}
