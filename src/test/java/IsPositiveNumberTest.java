import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Order(1)
    @Test
    public void testIsPositiveNumberTest(){

        int number1 = 555;
        int number2 = 0;
        int number3 = -555;

        IsPositiveNumber as = new IsPositiveNumber();
        Boolean actualResult = as.isPositiveNumber(number1);

        Assertions.assertEquals(true, actualResult);

    }
    @Order(2)
    @Test
    public void testIsPositiveNumberTest1(){

        int number1 = 555;
        int number2 = 0;
        int number3 = -555;

        IsPositiveNumber as = new IsPositiveNumber();
        Boolean actualResult = as.isPositiveNumber(number2);

        Assertions.assertEquals(true, actualResult);

    }
    @Order(3)
    @Test
    public void testIsPositiveNumberTest2(){

        int number1 = 555;
        int number2 = 0;
        int number3 = -555;

        IsPositiveNumber as = new IsPositiveNumber();
        Boolean actualResult = as.isPositiveNumber(number3);

        Assertions.assertEquals(false, actualResult);



    }
}
