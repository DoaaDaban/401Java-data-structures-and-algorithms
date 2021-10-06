package linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest{
    @Test void successfullyInstantiate(){
        LinkedList linkedList= new LinkedList();
        assertNull(linkedList.getHead(), "the linked list should be empty");
    }
    @Test void insertTest(){
        LinkedList linkedList= new LinkedList();
        linkedList.insert("Y");
        assertTrue(linkedList.includes("Y"), "faild insertion");
    }

    @Test
    void isHeadCorrect(){
        LinkedList linkedList = new LinkedList();
        linkedList.insert("D");
        linkedList.insert("O");
        linkedList.insert("A");
        linkedList.insert("A");
        assertEquals(linkedList.getHead().getData() , "A" , "The head is not pointing on First Element");
    }
    @Test
    void insertMultipleNodes (){
        LinkedList linkedList = new LinkedList();
        linkedList.insert("D");
        linkedList.insert("O");
        assertTrue(linkedList.includes("D"), "There is something wrong With Multiple Nodes Insertion");
        assertTrue(linkedList.includes("O"), "There is something wrong With Multiple Nodes Insertion");
    }
    @Test
    void findExistValue(){
        LinkedList linkedList = new LinkedList();
        linkedList.insert("D");
        linkedList.insert("O");
        assertTrue(linkedList.includes("O") , "The head is not pointing on First Element");
    }
    @Test
    void findNonExistValue(){
        LinkedList linkedList = new LinkedList();
        linkedList.insert("D");
        linkedList.insert("O");
        assertFalse(linkedList.includes("O") , "The head is not pointing on First Element");
    }
    @Test
    void returnAllList (){
        LinkedList linkedList = new LinkedList();
        linkedList.insert("D");
        linkedList.insert("O");
        linkedList.insert("A");
        linkedList.insert("A");
        assertEquals(linkedList.toString() , "{D} ->{O} ->{A} ->{A} -> Null" , "There is something wrong With Multiple Nodes Insertion");

    }
    @Test
    void successfullyAddANodeToTheEnd(){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("A");
        linkedList.append("O");
        assertEquals("{ D } ->{ O } ->{ A } -> null",linkedList.toString(),"The D Char should be in the end of the linked list");

    }

    @Test
    void successfullyAddMultipleNodesToTheEnd (){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("A");
        linkedList.append("A");
        assertEquals("{ D } ->{ A } ->{ A } -> null",linkedList.toString(),"The method should be able to Add Multiple Nodes end of the linked list");

    }

    @Test
    void insertANodeBefore(){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("O");
        linkedList.append("A");
        linkedList.append("A");
        linkedList.insertBefore("O","Y");
        assertEquals("{ D } ->{ R } ->{ O } ->{ A } ->{ A } -> null",linkedList.toString(),"Y char should be added before O char");

    }

    @Test
    void insertANodeBeforeTheFirstNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("O");
        linkedList.append("A");
        linkedList.append("A");
        linkedList.insertBefore("D","Y");
        assertEquals("{ R } ->{ D } ->{ O } ->{ A } ->{ A } -> null",linkedList.toString(),"Y char should be added at the beginning of the linked list ");
    }

    @Test
    void insertANodeAfterTheFirstNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("O");
        linkedList.append("A");
        linkedList.append("A");
        linkedList.insertAfter("D","Y");
        assertEquals("{ D } ->{ R } ->{ O } ->{ A } ->{ A } -> null",linkedList.toString(),"Y char should be after D char");
    }

    @Test
    void insertANodeAfterTheLastNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.append("D");
        linkedList.append("O");
        linkedList.append("A");
        linkedList.append("A");
        linkedList.insertAfter("A","Y");
        assertEquals("{ D } ->{ O } ->{ A } ->{ A } ->{ Y } -> null",linkedList.toString(),"Y char should be after A char");
    }



    @Test

    void oneOftheListsISEmpty() throws Exception {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append("D");
        list1.append("O");
        list1.append("A");
        list1.append("A");
        list1.append("D");
        list1.append("A");
        assertEquals(list1,list3.zipLists(list1,list2));
    }
}
