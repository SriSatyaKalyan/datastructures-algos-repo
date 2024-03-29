package academy.learnprogramming.trees.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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


    public void levelOrderTraversal(int i){
//        if(root != null){
//            traverseLevelOrder(0, root);
//        }
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
        }else{  //(value == subTreeRoot.getData())
            //Cases 1 - Two Sum and 2 - Add Two Numbers: node to delete has 0 or 1 - Two Sum child(ren)
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }
            //Case 3 - Longest Substring Without Repeating Characters: node to delete has 2 - Add Two Numbers children
            //We should either always go to the right or left. Here, we are going right.
            //Replace the value in the subTreeRoot node with the smallest value from the right subTree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            //Delete the node that has the smallest value in the right subTree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }
}