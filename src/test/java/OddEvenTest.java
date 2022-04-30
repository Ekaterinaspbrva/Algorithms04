import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest{

    @Test
    public void testOddEven() {
        //  AAA  - The Arrange - Act - Assert

        //Arrange
        //Test Data
        int a = -345;

        //Act
        OddEven as = new OddEven();
        String actualResult1 = as.oddEven(-345);

        //Assert
        Assertions.assertEquals("Odd", actualResult1);

    }

}
