package CC.linkedList;

public class BinaryNode<T>{

    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;
    private T data;


    public BinaryNode(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", data=" + data +
                '}';
    }
}
