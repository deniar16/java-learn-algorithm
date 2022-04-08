package learn.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    
    @Test
    public void factorialTest(){
        Factorial factorial = new Factorial();
        int fact = factorial.factorial(4);
        Assertions.assertEquals(24, fact);

        
        fact = factorial.factorial(2);
        Assertions.assertEquals(2, fact);

        
        fact = factorial.factorial(4);
        Assertions.assertEquals(24, fact);

        
        fact = factorial.factorial(7);
        Assertions.assertEquals(5040, fact);
    }
}
