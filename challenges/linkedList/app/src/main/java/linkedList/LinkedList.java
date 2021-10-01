package linkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        this.size = 0;
    }

    /**
     *
     * @param value we receive a value and insert it in the front.
     */
    public void insert(int value){
        //define the node
        Node node = new Node(value);


        node.next = this.head;
        head = node;

        size++;
    }

    /**
     *
     * @param value this method checks to see if a value is in a linked list.
     * @return boolean
     */
    public boolean includes(int value) {

        //find the head
        Node current  = head;

        //check each node value in the list against input value
        while (current != null) {
            if (current.value == value) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    // this method will print the entire contents of the linked list
    public String valuesToString(){

        //find head
        Node current = head;
        String allValues = "";
        //output all values of the list
        while (current != null) {
            System.out.print("{ " + current.value + " } -> ");
            allValues = allValues + "{ " + current.value + " } -> ";
            current = current.next;
        }
        allValues = allValues + "NULL";
        System.out.print("NULL");
        return allValues;

    }



    public Node getHead(){
        return head;
    }
}

