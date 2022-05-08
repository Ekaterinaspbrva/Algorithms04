import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    //    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    @Test
    public void minMaxAvetest() {
        int[] expectedArray = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(expectedArray, mma.minMaxAve(new int []{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6));

    }

    @Test
    public void minMaxAvetest2() {
        int[] expectedArray = {1, 2, 1};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(expectedArray, mma.minMaxAve(new int []{1, 2}, 0, 1));


    }

    @Test
    public void minMaxAvetestNull() {
        int[] expectedArray = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(expectedArray, mma.minMaxAve(new int []{}, 2, 6));


    }
    @Test
    public void minMaxAvetestFirstBiggeLast() {
        int[] expectedArray = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(expectedArray, mma.minMaxAve(new int []{1, 2, 3, 4, 5, 6, 7, 8}, 9, 6));


    }
    @Test
    public void minMaxAvetestFirstEquilleLast() {
        int[] expectedArray = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(expectedArray, mma.minMaxAve(new int []{1, 2, 3, 4, 5, 6, 7, 8}, 6, 6));


    }

}
