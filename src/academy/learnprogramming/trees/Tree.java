package academy.learnprogramming.trees;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }else{
            root.insert(value);
        }
    }

    //Traversal Methods
    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
        System.out.println("| ");
    }

    public void traversePreOrder(){
        if(root != null){
            root.traversePreOrder();
        }
        System.out.println("| ");
    }

    public void traversePostOrder(){
        if(root != null){
            root.traversePostOrder();
        }
        System.out.println("| ");
    }

    //Get Method for the Tree
    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }

        return null;
    }

    //Get min for the Tree
    public int min(){
        if(root != null){
            return root.getLeftChild().min();
        }
        return Integer.MIN_VALUE;
    }

    //Get max for the Tree
    public int max(){
        if(root != null){
            return root.getRightChild().max();
        }
        return Integer.MAX_VALUE;
    }

    //Delete method for the Tree
    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot == null){
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        }else if (value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }else{

            //Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            } //Case 3: node to delete has 2 children
              //We should either always go to the right or left.  
            //Replace the value in the subTreeRoot node with the smallest value from the right subTree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            //Delete the node that has the smallest value in the right subTree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }
}





















