package academy.learnprogramming.trees.implementation;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    //Constructor
    public TreeNode(int data){
        this.data = data;
    }

    //Insertion Method
    public void insert(int value){
        if(value == data){
            return;
        }

        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }else{
                leftChild.insert(value);
            }
        }

        if(value > data){
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else {
                rightChild.insert(value);
            }
        }
    }

    //Traversal Methods
    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print("| " + data + " ");
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        System.out.print(data + " | ");
        if(leftChild != null) {
            leftChild.traversePreOrder();
        }
        if(rightChild != null){
            rightChild.traversePreOrder();
        }
    }

    public void traversePostOrder(){
        if(leftChild != null) {
            leftChild.traversePostOrder();
        }
        if(rightChild != null){
            rightChild.traversePostOrder();
        }
        System.out.print(data + " | ");
    }

    //Get Method for the TreeNode
    public TreeNode get(int value){
        if(value == data){
            return this;
        }

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }

        return null;
    }

    //Getting min for the TreeNode
    public int min(){
        if(leftChild == null){
            return data;
        }else{
            return leftChild.min();
        }
    }

    //Getting max for the TreeNode
    public int max(){
        if(rightChild == null){
            return data;
        }else{
            return rightChild.max();
        }
    }

    //Getter and Setter methods
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}