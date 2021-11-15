package CC.linkedList;

import java.util.List;

public class BST<T extends Comparable<T>> extends BinaryTree<T> implements Comparable<BST<T>>{

    private Boolean validator;

    public BST(T data){
        super((BinaryNode<T>) data);
    }

    public BST() { }

    public int findMax(){
        List<Integer> myList= (List<Integer>) this.preOrder();
        int max= Integer.MIN_VALUE;
        for (Integer integer: myList){
            if(integer > max){
                max= integer;
            }
        }
        return max;
    }

    public void add(T data){
        BinaryNode<T> newBN= new BinaryNode<>(data);
        if(isEmpty()){
            root= newBN;
        }else{
           addHelper(data, root);
        }
    }

    public void addHelper(T data,BinaryNode<T> root){
        BinaryNode<T> newBN= new BinaryNode<>(data);
        if(data.compareTo(root.getData()) >0 ){
            if(root.getRightNode() == null){
             root.setRightNode(newBN);
            }else{
                addHelper(data, root.getRightNode());
            }
        }else if(data.compareTo(root.getData()) <0){
            if (root.getLeftNode() == null){
                root.setLeftNode(newBN);
            }else {
                addHelper(data, root.getLeftNode());
            }
        }
    }

    public boolean contain(T data){
            validator=false;
            containHelper(data, root);
            return validator;
    }

    public void containHelper(T data, BinaryNode<T> root){
        if(root.getData()== data){
            validator= true;
        }else if(data.compareTo(root.getData()) > 0){
            if(root.getRightNode() != null){
                containHelper(data, root.getRightNode());
            }
        }else if(data.compareTo(root.getData()) < 0){
            if(root.getLeftNode() != null){
                containHelper(data, root.getLeftNode());
            }
        }
    }


    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }

    @Override
    public int compareTo(BST<T> tbst) {
        return 0;
    }
}
