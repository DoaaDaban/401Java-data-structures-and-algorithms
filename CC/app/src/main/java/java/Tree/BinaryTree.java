package java.Tree;

public class BinaryTree<T>{

    private BinaryNode<T> root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryNode<T> root) {
        this.root = root;
    }

    // preOrder => root, left, right
    public T preOrder(T data){
        if(isEmpty()){
            return null;
        }
        else{
            preOrderTravarsal(root, data);
        }
        return data;
    }

    public T inOrder(T data){
        if(isEmpty()){
            return null;
        }
        else{
            inOrderTraversal(root, data);
        }
        return data;
    }

    public T postOrder(T data){
        if(isEmpty()){
            return null;
        }
        else{
            postOrderTraversal(root, data);
        }
        return data;
    }

    public void preOrderTravarsal(BinaryNode<T> root, T data){

        System.out.println(root.getData());

        if(root.getLeftNode()!=null){
            preOrderTravarsal(root.getLeftNode(), data);
        }

        if(root.getRightNode() !=null){
            preOrderTravarsal(root.getRightNode(), data);
        }
    }

    // inOrder => left, root, right
    public void inOrderTraversal(BinaryNode<T> root, T data){

        if(root.getLeftNode()!=null){
            inOrderTraversal(root.getLeftNode(), data);
        }
        System.out.println(root.getData());

        if(root.getRightNode()!= null){
            inOrderTraversal(root.getRightNode(), data);
        }
    }

    // postOrder => left, right, root
    public void postOrderTraversal(BinaryNode<T> root, T data){

        if(root.getLeftNode()!=null){
            inOrderTraversal(root.getLeftNode(), data);
        }

        if(root.getRightNode()!= null){
            inOrderTraversal(root.getRightNode(), data);
        }

        System.out.println(root.getData());
    }

    public BinaryNode<T> getRoot() {
        return root;
    }


    //===============================

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root==null;
    }
//        if(root==null){
//            return false;
//        }else
//        return true;
//    }
}
