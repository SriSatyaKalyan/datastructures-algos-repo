package academy.learnprogramming.graphs.traversals;

import java.util.ArrayList;
import java.util.Iterator;

public class graphSearchBFS {

    int V;
    ArrayList<Integer> adjacency[];

    graphSearchBFS(int numberOfVertices){
        V = numberOfVertices;
        adjacency = new ArrayList[numberOfVertices];

        for(int i=0;i < numberOfVertices; i++){
            adjacency[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adjacency[x].add(y);
    }

    void breadthFirstSearch(int sourceVertex){
        System.out.println("Breadth First Search:");
        boolean[] visited =  new boolean[V];
        ArrayList<Integer> bfs = new ArrayList<>();

        visited[sourceVertex] = true;
        bfs.add(sourceVertex);

        while (!bfs.isEmpty()) {
            sourceVertex = bfs.remove(0);
            System.out.print(sourceVertex + " | ");

            Iterator iterator = adjacency[sourceVertex].iterator();
            while (iterator.hasNext()){
                int vertex = (int) iterator.next();
                if(!visited[vertex]){
                    visited[vertex] = true;
                    bfs.add(vertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        graphSearchBFS graph = new graphSearchBFS(6);
        graph.edge(0, 1);
        graph.edge(0, 2);
        graph.edge(0, 5);
        graph.edge(1, 0);
        graph.edge(1, 2);
        graph.edge(2, 0);
        graph.edge(2, 1);
        graph.edge(2, 3);
        graph.edge(2, 4);
        graph.edge(3, 2);
        graph.edge(4, 2);
        graph.edge(4, 5);
        graph.edge(5, 0);
        graph.edge(5, 4);

        graph.breadthFirstSearch(0);
    }
}