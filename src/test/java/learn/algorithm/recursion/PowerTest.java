package learn.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {
    
    @Test
    public void powerTest(){
        Power power = new Power();
        int pow = power.power(4);
        Assertions.assertEquals(16, pow);

        
        pow = power.power(5);
        Assertions.assertEquals(32, pow);
    }
}
