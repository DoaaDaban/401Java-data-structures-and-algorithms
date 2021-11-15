package CC.linkedList;

import CC.linkedList.BinaryNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T>{

    protected BinaryNode<T> root;

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST and use it in code challenge 16
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<Integer>(); // FOR TEST
    private Object Integer;


    public BinaryTree() {
    }

    public BinaryTree(BinaryNode<T> root) {
        this.root = root;
    }

    public List<T> preOrder(){
        if(isEmpty()){
            return null;
        }
            List<T> list= new ArrayList<>();
            preOrderTravarsal(root, list);
             return list ;
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

    // preOrder => root, left, right
    public void preOrderTravarsal(BinaryNode<T> root, List<T> list){
        list.add(root.getData());

        if(root.getLeftNode()!=null){
            preOrderTravarsal(root.getLeftNode(), list);
        }

        if(root.getRightNode() !=null){
            preOrderTravarsal(root.getRightNode(), list);
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



//    public int findMaxvalue() {
//        if(root == null){
//            throw new IllegalArgumentException("the tree is empty");}
//
//        int max = (int) root.getData();
//        preOrder();
//        for(int i = 0; i<preOrderList.size(); i++){
//            if(max<preOrderList.get(i)){
//                max = preOrderList.get(i);
//            }
//        }
//        return max;
//    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root==null;
    }
}
