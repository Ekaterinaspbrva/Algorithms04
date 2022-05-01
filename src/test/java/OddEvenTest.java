import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest{

    @Test
    public void testOddEvenHappyPass() {
        //  AAA  - The Arrange - Act - Assert
        //Arrange
        //Test Data
        int a = -345;
        String expectedResult = "Odd";
        //String expectedResult = "Even";

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(a);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult1);

    }

    @Test
    public void testOddEvenHappyPassZero() {
        //  AAA  - The Arrange - Act - Assert

        //Arrange
        //Test Data
        int a = 0;
        //String expectedResult = "Odd";
        String expectedResult = "Even";

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(a);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult1);

    }

    @Test
    public void testOddEvenHappyPass222222() {
        //  AAA  - The Arrange - Act - Assert
        //Arrange
        //Test Data
        int a = 222222;
        //String expectedResult = "Odd";
        String expectedResult = "Even";

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(a);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult1);

    }

    @Test
    public void testOddEvenHappyPassUndifinet() {
        //  AAA  - The Arrange - Act - Assert
        //Arrange
        //Test Data
        double a = Integer.MAX_VALUE + 1;
        //String expectedResult = "Odd";
        //String expectedResult = "Even";
        String expectedResult = "Undefined";

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(a);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult1);

    }
    @Test
    public void testOddEvenHappyPassUndifinet2() {
        //  AAA  - The Arrange - Act - Assert
        //Arrange
        //Test Data
        double a = Integer.MIN_VALUE - 1;
        //String expectedResult = "Odd";
        //String expectedResult = "Even";
        String expectedResult = "Undefined";

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(a);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult1);

    }

}
