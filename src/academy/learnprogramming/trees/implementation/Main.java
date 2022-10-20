package academy.learnprogramming.trees.implementation;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        //traversal of trees
        System.out.println("In Order");
        intTree.traverseInOrder();

        System.out.println("Pre Order");
        intTree.traversePreOrder();

        System.out.println("Post Order");
        intTree.traversePostOrder();

        //Testing how get works
//        System.out.println(intTree.get(27).getData());
//        System.out.println(intTree.get(22).getData());
//        System.out.println(intTree.get(998987).getData());

        //Testing how min and max work
        System.out.println("min: " + intTree.min());
        System.out.println("max: " + intTree.max());
    }
}