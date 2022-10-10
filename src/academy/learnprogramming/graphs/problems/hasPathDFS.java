package academy.learnprogramming.graphs.problems;

import java.util.ArrayList;
import java.util.Stack;

public class hasPathDFS {
    static int V =  5;
    static ArrayList<Integer>[] adjacency;

    public hasPathDFS(int numberOfVertices){
        V = numberOfVertices;
        adjacency = new ArrayList[numberOfVertices];

        for(int i=0;i < numberOfVertices; i++){
            adjacency[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adjacency[x].add(y);
    }

    public static void main(String[] args) {
        hasPathDFS cGraph = new hasPathDFS(5);

        //Undirected Graph
        cGraph.edge(0, 1);
        cGraph.edge(0, 2);
        cGraph.edge(1, 0);
        cGraph.edge(1, 2);
        cGraph.edge(2, 0);
        cGraph.edge(2, 1);
        cGraph.edge(2, 3);
        cGraph.edge(2, 4);
        cGraph.edge(3, 2);
        cGraph.edge(4, 2);

        //Directed Graph
//        cGraph.edge(0, 1);
//        cGraph.edge(0, 2);
//        cGraph.edge(2, 1);
//        cGraph.edge(2, 3);
//        cGraph.edge(2, 4);

        System.out.println("Do we have a path from 0 and 4?: " + hasPathDFS(cGraph, 0, 4));
        printDFS(dfs);
    }

    static boolean[] visited = new boolean[V];
    static Stack<Integer> dfs = new Stack<>();

    private static boolean hasPathDFS(hasPathDFS cGraph, int source, int destination) {
        dfs.push(source);

        while(!dfs.isEmpty()) {
            int current = dfs.peek();
            System.out.println("current: " + current + " | visited[current]: " + visited[current]);

            if (!visited[current]) {
                if (current == destination) {
                    return true;
                }

                dfs.pop();
                visited[current] = true;
                for (int i = 0; i < adjacency[current].size(); i++) {
                    int neighbor = adjacency[current].get(i);
                    System.out.println("current: " + current + " | neighbor: " + neighbor);
                    dfs.add(neighbor);
//                    if(!visited[neighbor]){
//                        dfs.add(neighbor);
//                        hasPathDFS(cGraph, neighbor, destination);
//                    }
                }
            }
            visited[current] = true;
        }

        return false;
    }

    private static void printDFS(Stack dfs){
        System.out.println("Printing dfs");

    }
}