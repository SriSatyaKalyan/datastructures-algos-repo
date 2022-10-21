package academy.learnprogramming.trees.traversals;

import java.util.ArrayList;
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

//        root.val = 3;
//        root.left = new TreeNode(11, new TreeNode(4), new TreeNode(2));
//        root.right = new TreeNode(4, null , new TreeNode(1));
//              3
//           /     \
//          11      4
//         /  \      \
//        4    2      1

//        root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        1
//       / \
//      2   3

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
        System.out.println("");

        System.out.println("The sum of the tree is: " + calculateTreeSumBFS(root));
        System.out.println("The sum of the tree is: " + calculateTreeSumRecursion(root));

        int targetSum = 5;
        System.out.println("Does a pathSum exist for targetSum of " + targetSum + "?: " + hasPathSum(root, targetSum));
    }


    private static boolean hasPathSum(TreeNode root, int targetSum) {
        boolean hasPath = false;
        calculateTreeSumRecursion(root, targetSum, 0, hasPath);
        return hasPath;
    }

    private static int calculateTreeSumRecursion(TreeNode root, int targetSum, int sumSoFar, boolean hasPath) {
        if(root == null) return 0;
//        System.out.println("root.val: " + root.val + " | " + "sumSoFar: " + sumSoFar);
        sumSoFar = root.val + sumSoFar;
//        System.out.println("root.val: " + root.val + " | " + "sumSoFar: " + sumSoFar);
        if((root.left == null) && (root.right == null) && sumSoFar ==  targetSum){
//            System.out.println("Changing hasPath to true");
            hasPath = true;
        }
//        System.out.println("--------------------");
        return calculateTreeSumRecursion(root.left, targetSum, sumSoFar, hasPath) + calculateTreeSumRecursion(root.right, targetSum, sumSoFar, hasPath);
    }

//    ------------------------------------------------------------------------------------------------

    private static int calculateTreeSumRecursion(TreeNode root) {
        if(root ==  null) return 0;

        return root.val + calculateTreeSumRecursion(root.left) + calculateTreeSumRecursion(root.right);
    }


    private static int calculateTreeSumBFS(TreeNode root) {
        int sum = 0;
        List<TreeNode> q = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode node = q.remove(0);
            sum = sum + node.val;
            if(node.left != null) { q.add(node.left); }
            if(node.right != null) { q.add(node.right); }
        }

        return sum;
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