import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveAllaTest {
    RemoveAlla replaceAlla;

    @BeforeEach
    void setUp(){
        replaceAlla = new RemoveAlla();
    }


    @Test
    public void testremoveAlla(){
        String expectedResult = "QA4Everyone";

        Assertions.assertEquals(expectedResult, replaceAlla.removeAlla("    QA4Everyone   "));

    }
    @Test
    public void testremoveAlla2(){
        String expectedResult = "pnd";

        Assertions.assertEquals(expectedResult, replaceAlla.removeAlla("panda   "));

    }
    @Test
    public void testremoveAllaEmpty(){
        String expectedResult = "Invalid";

        Assertions.assertEquals(expectedResult, replaceAlla.removeAlla(""));

    }

}
