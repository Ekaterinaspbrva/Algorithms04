import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyPass(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;


        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBiggerValueHappyPass2(){
        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;


        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBiggerValueHappyPass3(){
        int a = -3333;
        int b = 3333;
        int expectedResult = 3333;


        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
