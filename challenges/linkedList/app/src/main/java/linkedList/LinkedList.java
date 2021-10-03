package linkedList;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head=null;
    }

    public void insert( String value) {
        Node newNode = new Node(value);
        if (head== null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head= newNode;
        }
    }


    public Boolean include(String value) {
        Node current = head;
        while (current != null ) {
            if(current.getData()==value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }



    @Override
    public String toString() {
        Node current = head;
        String sortedList = "" ;
        while (current!=null) {
            sortedList = sortedList + "{ " + current.getData() + " } ->";
            current = current.getNext();
        }
        sortedList= sortedList + " null";
        return sortedList;
    }

    public Node getHead() {
        return head;
    }

    public void append (String value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void insertBefore (String value, String newValue) {
        Node newNode = new Node(newValue);
        if (head == null)
            head = newNode;
        else if (head.getData() == value) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.getNext().getData() == value) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    break;
                }
                current = current.getNext();
            }
        }
    }

    public void insertAfter (String value, String newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null) {
            if (current.getData() == value) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            }
            current = current.getNext();
        }
    }

}
