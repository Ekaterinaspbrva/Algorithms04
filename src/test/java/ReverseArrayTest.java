import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testreverseArray() {

        //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] expectedResulArray = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResultArray = ra.reverseArray(new int[]{2, 7, 3, 10});

        Assertions.assertArrayEquals(expectedResulArray, actualResultArray);
    }
    @Test
    public void testreverseArrayNull() {

        //{2, 7, 3, 10} → {}
        int[] expectedResulArray = {};

        ReverseArray ra = new ReverseArray();
        int[] actualResultArray = ra.reverseArray(new int[]{});

        Assertions.assertArrayEquals(expectedResulArray, actualResultArray);
    }
    @Test
    public void testreverseArrayAllNumbersEquile() {

        //{2, 7, 3, 10} → {}
        int[] expectedResulArray = {0, 0, 0, 0};

        ReverseArray ra = new ReverseArray();
        int[] actualResultArray = ra.reverseArray(new int[]{0, 0, 0, 0});

        Assertions.assertArrayEquals(expectedResulArray, actualResultArray);
    }
}