package academy.learnprogramming.graphs.problems;

import java.util.ArrayList;

public class hasPathBFS {
    static int V =  5;
    static ArrayList<Integer>[] adjacency;

    public hasPathBFS(int numberOfVertices){
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
        hasPathBFS cGraph = new hasPathBFS(5);

        //Undirected Graph
        cGraph.edge(0, 2);
        cGraph.edge(0, 1);
        cGraph.edge(1, 0);
        cGraph.edge(1, 2);
        cGraph.edge(2, 1);
        cGraph.edge(2, 0);
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

        System.out.println("Do we have a path from 0 and 4?: " + hasPathBFS(cGraph, 0, 4));
        printBFS(bfs);
    }

    static boolean[] visited = new boolean[V];
    static ArrayList<Integer> bfs = new ArrayList<>();

    private static boolean hasPathBFS(hasPathBFS cGraph, int source, int destination){
        ArrayList<Integer> bfs = new ArrayList<>();
        bfs.add(source);

        while(!bfs.isEmpty()){
            int current = bfs.remove(0);
            System.out.println("current: " + current + " | visited[current]: " + visited[current]);

            if(!visited[current]){
                if(current == destination){
                    return true;
                }

                for(int i=0; i < adjacency[current].size(); i++){
                    System.out.println("current: " + current + " | neighbor: " + adjacency[current].get(i));
                    bfs.add(adjacency[current].get(i));
                }

                visited[current] = true;
            }
        }

        return false;
    }

    private static void printBFS(ArrayList bfs){
        System.out.println("Printing bfs");
        while(!bfs.isEmpty()){
            int node = (int) bfs.remove(0);
            System.out.print(node + " | ");
        }
    }
}