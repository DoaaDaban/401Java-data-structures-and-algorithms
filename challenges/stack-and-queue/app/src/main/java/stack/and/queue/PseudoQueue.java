package stack.and.queue;



public class PseudoQueue implements QueueInterFace{


    Stack stack1;
    Stack stack2;

    public PseudoQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    @Override
    public void enqueue(String value) {
        stack1.push(value);
    }

    @Override
    public String dequeue() {
        if (stack1.isEmpty()){
            return "queue is empty";
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            String data = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return data;
        }
    }
}
