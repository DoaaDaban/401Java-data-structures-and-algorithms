package linkedList;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class AppTest {
    @Test
    @DisplayName("test the insert and includes methods")
    public void insertAndIncludesTest() {
        LinkedList testList = new LinkedList();

        testList.insert(3);
        testList.insert(8);
        testList.insert(44);
        testList.insert(6);

        Assertions.assertTrue((testList.includes(44)), "app should return true for testList, 44");
        Assertions.assertFalse(testList.includes(45), "app should return false for testList, 45");
        Assertions.assertTrue(testList.includes(8), "app should return true for testList, 8");

    }

    @Test
    @DisplayName("test the first value in the LinkedList")
    public void nodeHeadTest(){
        LinkedList testList = new LinkedList();

        testList.insert(3);
        testList.insert(8);
        testList.insert(44);
        testList.insert(6);

        Assertions.assertEquals(6,testList.getHead().value, "app should return 6 as a head for testList");
    }

    @Test
    @DisplayName("test the print all value in the LinkedList")
    public void printAllTest(){
        LinkedList testList = new LinkedList();

        testList.insert(3);
        testList.insert(8);
        testList.insert(44);
        testList.insert(6);

        Assertions.assertEquals("{ 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL",testList.valuesToString(), "app should print { 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL");
    }


}