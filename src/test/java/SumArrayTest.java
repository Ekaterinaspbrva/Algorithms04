import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPass(){

//        {0, 1, 2, 3, 4, 5} → 15
//        {-7, -3} → -10
        int expectedResult = 15;
        int[] array = {0, 1, 2, 3, 4, 5};

        int expectedResult2 = 10;
        int[] array2 = {-7, -3};

        int[] actualArray =  {0, 1, 2, 3, 4, 5};
        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumArray2HappyPass(){

//        {0, 1, 2, 3, 4, 5} → 15
//        {-7, -3} → -10


        int expectedResult = -10;
        int[] array = {-7, -3};

        int[] actualArray =  {0, 1, 2, 3, 4, 5};
        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
