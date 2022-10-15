package academy.learnprogramming.graphs.problems;

import java.util.ArrayList;
import java.util.Stack;

public class largestComponent {

    int V;
    ArrayList<Integer>[] adjacency;

    largestComponent(int numberOfVertices){
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
        largestComponent graph = new largestComponent(8);
        graph.edge(0, 1);
        graph.edge(1, 0);

        graph.edge(3, 5);
        graph.edge(4, 5);
        graph.edge(5, 3);
        graph.edge(5, 4);
        graph.edge(5, 6);
        graph.edge(5, 7);
        graph.edge(6, 5);
        graph.edge(7, 5);

        System.out.println("The largest component is: " + graph.largestComponentOfAll(graph.adjacency));
    }

    int largestCompValue = 0;
    int node = 0;

    private Integer largestComponentOfAll(ArrayList<Integer>[] adjacency) {
        int count = 0;

        ArrayList<Integer> visited = new ArrayList<>(V);
        Stack<Integer> dfs = new Stack<>();

        System.out.println("The length of the list is: " + adjacency.length);

        for(int i=0; i < adjacency.length; i++){
            if(explore(adjacency, i, visited)){
                count = count + 1;
            }
            largestCompValue = (largestCompValue > (compLength+1)) ? largestCompValue : compLength+1;
            compLength = 0;
        }

        return largestCompValue;
    }

    int compLength = 0;
    private boolean explore(ArrayList<Integer>[] adjacency, int vertex, ArrayList<Integer> visited) {
        if(visited.contains(vertex)){
            return false;
        }

        visited.add(vertex);

        for(int i = 0; i < adjacency[vertex].size(); i++){
            node = adjacency[vertex].get(i);
            if(explore(adjacency, node, visited)){
                compLength = compLength + 1;
            }
        }

        return true;
    }
}