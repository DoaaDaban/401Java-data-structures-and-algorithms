package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T>{

    protected BinaryNode<T> root;

    public BinaryTree() {

    }

    List<Integer> postOrderList = new ArrayList<>();
    List<Integer> inOrderList = new ArrayList<>();
    List<Integer> preOrderList = new ArrayList<>();


    public List<T> preorderTraversal(){
        if(isEmpty()){
            return null;
        }
        List<T> list = new ArrayList<>();
        traversePreOrder(root, list);
        return list;
    }

    public List<T> inorderTraversal(){
        if(isEmpty()){
            return null;
        }
        List<T> list = new ArrayList<>();
        traverseInorder(root, list);
        return list;
    }

    public List<T> postorderTraversal(){
        if(isEmpty()){
            return null;
        }
        List<T> list = new ArrayList<>();
        traversePostOrder(root, list);
        return list;
    }

    //===========================


    public void traversePreOrder(BinaryNode<T> root, List<T> list){ //  root -> left -> right
        // visit / print the root of the tree (root could be a sub-tree)
//        System.out.print(root.getData() + " -> ");
        list.add(root.getData());

        if (root.getLeftNode() != null){ // traverse left
            traversePreOrder(root.getLeftNode(), list);
        }

        if (root.getRightNode() != null){
            traversePreOrder(root.getRightNode(), list);
        }
    }


    public void traverseInorder(BinaryNode<T> root, List<T> list){ // left -> root -> right
        if (root.getLeftNode() != null){ // traverse left
            traverseInorder(root.getLeftNode(), list);
        }

        // visit / print the root of the tree (root could be a sub-tree)
//        System.out.print(root.getData() + " -> ");
        list.add(root.getData());

        if (root.getRightNode() != null){
            traverseInorder(root.getRightNode(), list);
        }
    }

    public void traversePostOrder(BinaryNode<T> root, List<T> list){ // left -> right -> root
        if (root.getLeftNode() != null){ // traverse left
            traversePostOrder(root.getLeftNode(), list);
        }

        if (root.getRightNode() != null){
            traversePostOrder(root.getRightNode(), list);
        }

        // visit / print the root of the tree (root could be a sub-tree)
//        System.out.print(root.getData() + " -> ");
        list.add(root.getData());

    }


    public boolean isEmpty(){
        return root==null;
    }


    public BinaryTree(BinaryNode<T> root) {
        this.root = root;
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
}
