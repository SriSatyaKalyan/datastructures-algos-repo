package academy.learnprogramming.graphs.traversals;

import java.util.ArrayList;
import java.util.Stack;

public class graphSearchDFS {

    int V;
    ArrayList<Integer> adjacency[];

    graphSearchDFS(int numberOfVertices){
        V = numberOfVertices;
        adjacency = new ArrayList[numberOfVertices];

        for(int i=0;i < numberOfVertices; i++){
            adjacency[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adjacency[x].add(y);
    }

    void depthFirstSearch(int sourceVertex) {
        System.out.println("Depth First Search:");
        boolean[] visited = new boolean[V];
        Stack<Integer> dfs = new Stack<>();

        dfs.push(sourceVertex);
        int vertex;

        while(!dfs.isEmpty()){
            sourceVertex = dfs.peek();
            dfs.pop();

            for(int i = 0; i < adjacency[sourceVertex].size(); i++){
                vertex = adjacency[sourceVertex].get(i);
                if(!visited[vertex]){
                    dfs.push(vertex);
                }
            }

            if(!visited[sourceVertex]){
                System.out.print(sourceVertex + " | ");
                visited[sourceVertex] = true;
            }
        }
    }

    public static void main(String[] args) {
        graphSearchDFS graph = new graphSearchDFS(6);
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

        graph.depthFirstSearch(0);
    }
}