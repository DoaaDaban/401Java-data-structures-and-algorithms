package stack.and.queue;

public class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public Node() {

    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext(String value) {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }

    public Node getNext() {
        return next;
    }
}
