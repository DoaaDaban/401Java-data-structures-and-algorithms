package linkedList;

public class Node{
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }
}