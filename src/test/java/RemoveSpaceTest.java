import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveSpaceTest {
//    “    QA4Everyone   “ → “Лишние пробелы удалены”
//            “QA4Everyone“ → “Пробелов не было”
//            “” → “Строка пустая”

//    String strTest = "    QA4Everyone   ";
//    String strTestNoSpace = "QA4Everyone";
//    String strTestIsEmpty = "";


//  AAA  - The Arrange - Act - Assert
    RemoveSpace as = new RemoveSpace();


    @Test
    public void testRemoveSpaces(){
        String expectedResultstrTest = "All Spaces was deleted";



        Assertions.assertEquals(expectedResultstrTest, as.removeSpace("    QA4Everyone   "));

    }
    @Test
    public void testNoSpacesFound(){
        String expectedResultstrTest = "There were not spaces";


        Assertions.assertEquals(expectedResultstrTest, as.removeSpace("QA4Everyone"));

    }
    @Test
    public void testEmptyString(){
        String expectedResultstrTest = "String was empty";



        Assertions.assertEquals(expectedResultstrTest, as.removeSpace(""));

    }
}