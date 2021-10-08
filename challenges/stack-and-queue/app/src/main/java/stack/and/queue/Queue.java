package stack.and.queue;

public class Queue extends Node{
    public Queue(String data) {
        super(data);
    }

    public Queue() {
        super();
    }

    private Node front;
   private Node rear;

   public void enqueue(String data){
       if(isEmpty()){
           Node node= new Node(data);
           front =node;
           rear =node;
       }else {
           Node node= new Node(data);
           rear.setNext(node);
           rear=node;
       }
   }

   public String dequeue(){
       if(isEmpty()){
           return "empty";
       }else {
           String data= front.getData();
           front= front.getNext();
           return data;
       }
   }

   public String peek(){
       if(isEmpty()){
           return "empty" ;
       }else {
           return front.getData();
       }
   }


   public Boolean isEmpty(){
       return front ==null;
   }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
