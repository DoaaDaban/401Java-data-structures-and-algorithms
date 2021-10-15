package trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements Comparable<BinarySearchTree<T>> {

    BinaryNode<T> root;
    private boolean validator;

    public void Add(T data){
        if(isEmpty()){
            root = new BinaryNode<>(data);
//            root = binaryNode;
        }else{
            AddHelper(data, root);
        }
    }

    public void AddHelper(T data, BinaryNode<T> root) {
        BinaryNode<T> binaryNode = new BinaryNode<>(data);
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(binaryNode);
            } else {
                AddHelper(data, root.getLeftNode());
            }
        } else if (data.compareTo(root.getData()) > 0) {
            if (root.getRightNode() == null) {
                root.setRightNode(binaryNode);
            } else {
                AddHelper(data, root.getRightNode());
            }
        }
    }

    public boolean Contains(T data){

        validator = false;
        containsHelper(data, root);
        return validator;
    }

    public void containsHelper(T data, BinaryNode<T> root){
        if (data== root.getData()){
            validator= true;
        }
        if(root.getLeftNode() != null ){
            containsHelper(data, root.getLeftNode());
        }
        if(root.getRightNode() != null ){
            containsHelper(data, root.getRightNode());
        }

    }


    public BinarySearchTree(){
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    @Override
    public int compareTo(BinarySearchTree<T> tBinarySearchTree) {
        return 0;
    }
}
