package stack.and.queue;

public class MaxStack {
    private int max;

    private final Stack<Integer> trackStack = new Stack<>();

    public void push(int x){
        trackStack.push(x);
    }
    public MaxStack() {}

    public int getMax(){
        max = trackStack.peek();
        while(!trackStack.isEmpty()){
            if(max< trackStack.peek()){
                max = trackStack.peek();
            }
            trackStack.pop();
        }
        return max;
    }
}
