import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    @Test
    public void testOddIndicesHappyPass(){

        int[] expectedResult =  {590, 985, 68};
        int[] arr = {-45, 590, 234, 985, 12, 68};


        OddIndices actualResult = new OddIndices();


        Assertions.assertArrayEquals(expectedResult, actualResult.oddIndices(arr));

    }

}
