package trees;

public class BinarySearchTree <T extends Comparable<T>>{

    private BinaryNode<T> root;

    public BinarySearchTree() {

    }

    public void insert(T data){
        if(isEmpty()){
            root = new BinaryNode<>(data);
//            root = binaryNode;
        }else{
            insertHepler(data, root);
        }
    }

    public void preorderTraversal(){
        if(isEmpty()){
            return;
        }
        traversePreOrder(root);
    }

    public void inorderTraversal(){
        if(isEmpty()){
            return;
        }
        traverseInorder(root);
    }

    public void postorderTraversal(){
        if(isEmpty()){
            return;
        }
        traversePostOrder(root);
    }

    public void traversePreOrder(BinaryNode<T> root){ //  root -> left -> right
        // visit / print the root of the tree (root could be a sub-tree)
        System.out.print(root.getData() + " -> ");

        if (root.getLeftNode() != null){ // traverse left
            traversePreOrder(root.getLeftNode());
        }

        if (root.getRightNode() != null){
            traversePreOrder(root.getRightNode());
        }
    }


    public void traverseInorder(BinaryNode<T> root){ // left -> root -> right
        if (root.getLeftNode() != null){ // traverse left
            traverseInorder(root.getLeftNode());
        }

        // visit / print the root of the tree (root could be a sub-tree)
        System.out.print(root.getData() + " -> ");

        if (root.getRightNode() != null){
            traverseInorder(root.getRightNode());
        }
    }

    public void traversePostOrder(BinaryNode<T> root){ // left -> right -> root
        if (root.getLeftNode() != null){ // traverse left
            traversePostOrder(root.getLeftNode());
        }

        if (root.getRightNode() != null){
            traversePostOrder(root.getRightNode());
        }

        // visit / print the root of the tree (root could be a sub-tree)
        System.out.print(root.getData() + " -> ");

    }



    public void insertHepler(T data, BinaryNode<T> root) {
        BinaryNode<T> binaryNode = new BinaryNode<>(data);
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(binaryNode);
            } else {
                insertHepler(data, root.getLeftNode());
            }
        } else if (data.compareTo(root.getData()) > 0) {
            if (root.getRightNode() == null) {
                root.setRightNode(binaryNode);
            } else {
                insertHepler(data, root.getRightNode());
            }
        }
    }
    public boolean isEmpty(){
        return root==null;
    }


    public BinarySearchTree(BinaryNode<T> root) {
        this.root = root;
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
}
