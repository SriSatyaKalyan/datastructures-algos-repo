package academy.learnprogramming.trees.traversals;

import java.util.List;
import java.util.Stack;

public class treeTraversals {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
//              1
//           /     \
//          2       3
//         /  \    /  \
//        4    5  6    7

        List<Integer> preOrderList = preOrderTraversalDFS(root);
        System.out.print("preOrderTraversalDFS:   ");
        for(int i : preOrderList){
            System.out.print(i + " | ");
        }
        System.out.println("");

        List<Integer> inOrderList = inOrderTraversalDFS(root);
        System.out.print("inOrderTraversalDFS:    ");
        for(int i : inOrderList){
            System.out.print(i + " | ");
        }
        System.out.println("");

        List<Integer> postOrderList = postOrderTraversalDFS(root);
        System.out.print("postOrderTraversalDFS:  ");
        for(int i : postOrderList){
            System.out.print(i + " | ");
        }
    }

    private static List<Integer> preOrderTraversalDFS(TreeNode root) {
        if(root == null) { return null; }
        List<Integer> list = new Stack<>();

        preOrder(root, list);
        return list;
    }

    private static void preOrder(TreeNode root, List<Integer> list) {
        if(root != null) {
            list.add(root.val);
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }

    private static List<Integer> postOrderTraversalDFS(TreeNode root) {
        if(root == null) { return null; }
        List<Integer> list = new Stack<>();

        postOrder(root, list);
        return list;
    }

    private static void postOrder(TreeNode root, List<Integer> list) {
        if(root != null) {
            postOrder(root.left, list);
            postOrder(root.right, list);
            list.add(root.val);
        }
    }


    private static List<Integer> inOrderTraversalDFS(TreeNode root) {
        if(root == null) { return null; }
        List<Integer> list = new Stack<>();

        inOrder(root, list);
        return list;
    }

    private static void inOrder(TreeNode root, List<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }
}