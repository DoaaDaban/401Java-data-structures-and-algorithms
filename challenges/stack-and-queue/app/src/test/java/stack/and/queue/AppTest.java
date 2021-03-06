/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }
//
//    @Test void pushToStackTest(){
//        Stack stackTest = new Stack();
//        stackTest.push("D");
//        stackTest.push("O");
//        assertNotEquals("D", stackTest.toString());
//    }
//
//    @Test
//    public void popStackTest(){
//        Stack stackTest = new Stack();
//        stackTest.push("D");
//        stackTest.push("O");
//        stackTest.push("A");
//
//        stackTest.pop();
//
//        assertNotEquals("A", stackTest.toString());
//    }
//
//    @Test
//    public void emptyStackTest() throws IllegalArgumentException {
//        Stack stackTest = new Stack();
//        stackTest.push("D");
//        stackTest.push("O");
//        stackTest.push("A");
//        stackTest.pop();
//        stackTest.pop();
//        stackTest.pop();
//
//        assertNotEquals("Stack { Null }",stackTest.toString());
//        assertTrue(stackTest.isEmpty());
////        assertEquals("Empty",stackTest.pop());
////      assertNull(stackTest.peek());
//    }
//
//    @Test
//    public void whenExceptionThrown_thenAssertionSucceeds() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//       Stack stackTest= new Stack();
//            stackTest.peek();
//        });
//
//        String expectedMessage = "Empty";
//        String actualMessage = exception.getMessage();
//
//        assertTrue(actualMessage.contains(expectedMessage));
//    }
//
//    @Test
//    public void peekStackTest(){
//        Stack stackTest = new Stack();
//        stackTest.push("D");
//        stackTest.push("O");
//        stackTest.push("A");
//
//        assertEquals("A",stackTest.peek());
//        stackTest.pop();
//        assertEquals("O",stackTest.peek());
//    }
//
//    @Test
//    public void enqueueToQueueTest(){
//        Queue queueTest = new Queue();
//        queueTest.enqueue("D");
//        queueTest.enqueue("O");
//        queueTest.enqueue("A");
//        assertEquals("Queue{front=Node{data='D', next=Node{data='O', next=Node{data='A', next=null}}}, rear=Node{data='A', next=null}}",queueTest.toString());
//    }
//
//    @Test
//    public void dequeueFromQueueTest(){
//        Queue queueTest = new Queue();
//        queueTest.enqueue("D");
//        queueTest.enqueue("O");
//        queueTest.enqueue("A");
//
//        queueTest.dequeue();
//        assertEquals("Queue{front=Node{data='O', next=Node{data='A', next=null}}, rear=Node{data='A', next=null}}",queueTest.toString());
//    }
//
//
//    @Test
//    public void emptyQueueTest(){
//        Queue queueTest = new Queue();
//        queueTest.enqueue("D");
//        queueTest.enqueue("O");
//        queueTest.enqueue("A");
//
//        queueTest.dequeue();
//        queueTest.dequeue();
//        queueTest.dequeue();
//        assertTrue(queueTest.isEmpty());
//        assertEquals("Queue{front=null, rear=Node{data='A', next=null}}",queueTest.toString());
//        assertEquals( "empty",queueTest.dequeue());
//      //  assertNull(queueTest.peek());
//    }
//
//    @Test
//    public void peekQueueTest(){
//        Queue queueTest = new Queue();
//        queueTest.enqueue("D");
//        queueTest.enqueue("O");
//        queueTest.enqueue("A");
//
//        assertEquals( java.util.Optional.of("D"), java.util.Optional.ofNullable(queueTest.peek()));
//        queueTest.dequeue();
//        assertEquals(java.util.Optional.of("O"),java.util.Optional.ofNullable(queueTest.peek()));
//    }
//
//    @Test
//
//    public void enqueueDequeueTest() {
//        PseudoQueue queueTest = new PseudoQueue();
//        queueTest.enqueue("1");
//        queueTest.enqueue("2");
//        queueTest.enqueue("3");
//
//        assertEquals("1",queueTest.dequeue());
//    }
//
//
//    @ Test
//    public void enqueueDequeueEdgeCaseTest() {
//        PseudoQueue queueTest = new PseudoQueue();
//        assertEquals("queue is empty",queueTest.dequeue());
//    }

    // ================================== code challenge 12 ====================================

    @Test
    public void enqueueAnimalShelterTest() {

        AnimalShelter shelterTest = new AnimalShelter();

        shelterTest.enqueue(new Cat("looz"));
        shelterTest.enqueue(new Cat("meghem"));
        assertEquals("AnimalShelter { catQueue = Queue { looz --> meghem --> Null }, dogQueue = Queue { Null } }", shelterTest.toString());
        assertEquals("looz", shelterTest.catQueue.peek().toString());

        shelterTest.enqueue(new Dog("husky"));
        shelterTest.enqueue(new Dog("oklah"));
        assertEquals("AnimalShelter { catQueue = Queue { looz --> meghem --> Null }, dogQueue = Queue { husky --> oklah --> Null } }", shelterTest.toString());
        assertEquals("husky", shelterTest.dogQueue.peek().toString());

        assertFalse(shelterTest.catQueue.isEmpty());
        assertFalse(shelterTest.dogQueue.isEmpty());

        shelterTest.dequeue("cat");
        assertEquals("AnimalShelter { catQueue = Queue { meghem --> Null }, dogQueue = Queue { husky --> oklah --> Null } }", shelterTest.toString());

        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter { catQueue = Queue { meghem --> Null }, dogQueue = Queue { oklah --> Null } }", shelterTest.toString());

        shelterTest.dequeue("cat");
        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter { catQueue = Queue { Null }, dogQueue = Queue { Null } }", shelterTest.toString());
        assertTrue(shelterTest.catQueue.isEmpty());
        assertTrue(shelterTest.dogQueue.isEmpty());

        assertNull(shelterTest.dequeue("cat"));
        assertNull(shelterTest.dequeue("dog"));
    }

    // ================================== code challenge 13 ====================================

    @Test
    public void validateBracketsTest(){

        ValidateBrackets test = new ValidateBrackets();

        assertTrue(test.validateBrackets("{}"));
        assertTrue(test.validateBrackets("{}(){}"));
        assertTrue(test.validateBrackets("()[[Extra Characters]]"));
        assertTrue(test.validateBrackets("(){}[[]]"));
        assertTrue(test.validateBrackets("{}{Code}[Fellows](())"));

        assertFalse(test.validateBrackets("[({}]"));
        assertFalse(test.validateBrackets("(]("));
        assertFalse(test.validateBrackets("{(})"));
        assertFalse(test.validateBrackets(")"));
        assertFalse(test.validateBrackets("[}"));
        assertFalse(test.validateBrackets("["));

    }

}
