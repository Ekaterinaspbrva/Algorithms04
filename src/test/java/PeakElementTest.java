import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Test
    public void testPeakElement(){
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] expectedResultArray = {3, 7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1});

    }

    @Test
    public void testPeakElement1(){
        //{1, 1, 1, 7, 1, 1, 1} → {7}
        int[] expectedResultArray = {7};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElement(new int[]{1, 1, 1, 7, 1, 1, 1});

    }

    @Test
    public void testPeakElement2(){
        //{2, 2, 2, 2, 2, 2, 2, 2} → {}
        int[] expectedResultArray = {};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElement(new int[]{2, 2, 2, 2, 2, 2, 2, 2});

    }

    @Test
    public void testPeakElement3(){
        //{3, 2, 7, 5, 1, 9, 2, 56} → {3, 7, 9, 56}
        int[] expectedResultArray = {3, 7, 9, 56};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElement(new int[]{3, 2, 7, 5, 1, 9, 2, 56});

    }
}
