package java.Tree;

public class BST<T extends Comparable<T>> extends BinaryTree<T> implements Comparable<BST<T>>{


        public BST(T data){
        super((BinaryNode<T>) data);
    }

    public void add(T data){
        BinaryNode<T> newBN= new BinaryNode<>(data);
        if(isEmpty()){
            root= newBN;
        }else{
           addHelper(T data, root);
        }
    }

    public void addHelper(T data,BinaryNode<T> root){
        BinaryNode<T> newBN= new BinaryNode<>(data);
        if(data.compareTo(root)){
            addHelper(data, root.setRightNode(newBN));
        }

    }


    @Override
    public int compareTo(BST<T> tbst) {
        return 0;
    }
}
