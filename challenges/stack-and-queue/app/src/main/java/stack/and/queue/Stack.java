package stack.and.queue;

public class Stack {

    private Node top;

    public Stack(Node top) {
        this.top = top;
    }

    public Stack() {

    }

    public void push(String value){
        if(isEmpty()){
            Node node= new Node(value);
            top= node;
        }else{
            Node node= new Node(value);
            node.setNext(top);
            top= node;
        }

    }

    public boolean pop(){
    if (isEmpty()){
        return false;
    }else {
        Node node= new Node(top.getData());
        node.setNext(null);
    }
        return false;
    }

    public boolean isEmpty(){
        return top==null;
    }
}
