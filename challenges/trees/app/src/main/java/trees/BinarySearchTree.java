package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements Comparable<BinarySearchTree<T>> {

    private boolean validator;

    public List<T> breadthFirst(BinarySearchTree<T> tree) throws Exception {
        if(root==null) {
            return null;
        }
        Queue<BinaryNode<T>>queue = new Queue<>();
        List<T> list = new ArrayList<>();
        queue.enqueue(root);
        list.add((T) root.getData());
        while (!queue.isEmpty()){
                BinaryNode<T> node = queue.dequeue();
                if(node.getLeftNode()!=null){
                    queue.enqueue(node.getLeftNode());
                    list.add((T) node.getLeftNode().getData());
                }
                if(node.getRightNode()!=null){
                    queue.enqueue(node.getRightNode());
                    list.add((T) node.getRightNode().getData());
                }
        }
        return list;
    }


    public int FindMax(){
        List<Integer> myList = (List<Integer>) this.preorderTraversal();
        int max = Integer.MIN_VALUE;
        for (Integer integer : myList) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public void Add(T data) {
        if (isEmpty()) {
            root = new BinaryNode<>(data);
//            root = binaryNode;
        } else {
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

    public boolean Contains(T data) {

        validator = false;
        containsHelper(data, root);
        return validator;
    }

    public void containsHelper(T data, BinaryNode<T> root) {
        if (data == root.getData()) {
            validator = true;
        }
        if (root.getLeftNode() != null) {
            containsHelper(data, root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            containsHelper(data, root.getRightNode());
        }

    }


    public BinarySearchTree() {
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
