package academy.learnprogramming.trees.traversals;

import academy.learnprogramming.trees.implementation.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
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
//        root.left = new TreeNode(11, new TreeNode(4), new TreeNode(3));
//        root.right = new TreeNode(4, null , new TreeNode(2));
//              3
//           /     \
//          11      4
//         /  \      \
//        4    3      2

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

        int targetSum = 9;
        System.out.println("Does a pathSum exist for targetSum of " + targetSum + "?: " + hasPathSum(root, targetSum));
        System.out.println("The minimum value of the tree is: " + treeMinValue(root));

        System.out.println("The max root to path sum is: " + maxRootToPathSum(root));

        int[] nums = {0, 1, 2, 3, 4, 5};
//                {-10, -3, 0, 5 ,9};
//        System.out.println("Convert the array nums[] into BST: " + sortedArrayToBST(nums));

        List<Integer> preOrderListII = preOrderTraversalDFS(sortedArrayToBST(nums));
        System.out.print("preOrderTraversalDFS:   ");
        for(int i : preOrderListII){
            System.out.print(i + " | ");
        }

        inorderSuccessor(root, new TreeNode(3));
    }

    private static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) { return null; }
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();


        while(!q.isEmpty()){

        }

        return null;
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length - 1);
    }

    private static TreeNode insert(int[] nums, int startIndex, int endIndex) {
        if(startIndex > endIndex) return null;
        int mid = (startIndex + endIndex) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = insert(nums, startIndex, mid - 1);
        root.right = insert(nums, mid + 1, endIndex);

        return root;
     }

    private static int maxRootToPathSum(TreeNode root) {
        return calculateRootPathSum(root, 0);
    }

    private static int calculateRootPathSum(TreeNode root, int sum) {
        if(root == null) return sum;
        sum = sum + root.val;
        return Math.max(sum, Math.max(calculateRootPathSum(root.left, sum), calculateRootPathSum(root.right, sum)));
    }

    private static int treeMinValue(TreeNode root) {
        if(root == null) return -1;

        return calculateSmallerNode(root);
    }

    private static int calculateSmallerNode(TreeNode root) {
        double inf = Double.POSITIVE_INFINITY;
        if(root.left == null && root.right == null) { return (int) inf; }
        if(root.left == null) { return root.right.val; }
        if(root.right == null) { return root.left.val; }
        return Math.min(root.val, Math.min(calculateSmallerNode(root.left), calculateSmallerNode(root.right)));
    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        return calculateTreeSumRecursion(root, targetSum, 0);
    }

    private static boolean calculateTreeSumRecursion(TreeNode root, int targetSum, int sumSoFar) {
        if(root == null) return false;
        sumSoFar = root.val + sumSoFar;
        if((root.left == null) && (root.right == null)){
            return (sumSoFar ==  targetSum);
        }
        return (calculateTreeSumRecursion(root.left, targetSum, sumSoFar) || calculateTreeSumRecursion(root.right, targetSum, sumSoFar));
    }

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