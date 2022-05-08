import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    //    Test Data:
//    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//    {1, 2, 4, 5, 89}, {8, 9, 45} → {}
    @Test
    public void testintersection() {

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};
        int[] expectedResultArray = {2, 4};

        Intersection inters = new Intersection();
        int[] actualResultArray = inters.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResultArray, actualResultArray);
    }

    @Test
    public void testintersection2() {

        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};
        int[] expectedResultArray = {8, 9};

        Intersection inters = new Intersection();
        int[] actualResultArray = inters.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResultArray, actualResultArray);

    }

    @Test
    public void testintersection3() {

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expectedResultArray = {};

        Intersection inters = new Intersection();
        int[] actualResultArray = inters.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResultArray, actualResultArray);

    }
}
