package academy.learnprogramming.graphs.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class shortestPath {
    int V;
    ArrayList<Integer>[] adjacency;

    shortestPath(int numberOfVertices){
        V = numberOfVertices;
        adjacency = new ArrayList[numberOfVertices];

        for(int i=0;i < numberOfVertices; i++){
            adjacency[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adjacency[x].add(y);
    }

    private Integer calculateShortestPath(ArrayList<Integer>[] adjacency, int source, int destination) {
        int elementDistance = 0;
        boolean[] visited = new boolean[V];
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> elemDistance = new ArrayList<>();

        visited[source] = true;
        elements.add(source);
        elemDistance.add(elementDistance);

        while(!elements.isEmpty()){
            source = elements.remove(0);
            int distance = elemDistance.remove(0);

            System.out.println("source: " + source + " | distance: " + distance);
            int distanceFromSource = distance + 1;

            Iterator iterator = adjacency[source].iterator();
            while(iterator.hasNext()){
                int vertex = (int) iterator.next();
                if(vertex == destination){
                    return distanceFromSource;
                }
                if(!visited[vertex]){
                    visited[vertex] = true;
                    elements.add(vertex);
                    elemDistance.add(distanceFromSource);
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        shortestPath graph = new shortestPath(6);
        graph.edge(0, 1);
        graph.edge(0, 3);
        graph.edge(1, 0);
        graph.edge(1, 2);
        graph.edge(2, 1);
        graph.edge(2, 4);
        graph.edge(3, 0);
        graph.edge(3, 4);
        graph.edge(4, 2);
        graph.edge(4, 3);
        graph.edge(4, 5);
        graph.edge(5, 4);

//        graph.edge('w', 'x');
//        graph.edge('w', 'l');
//        graph.edge('x', 'w');
//        graph.edge('x', 'y');
//        graph.edge('y', 'x');
//        graph.edge('y', 'z');
//        graph.edge('l', 'w');
//        graph.edge('l', 'z');
//        graph.edge('z', 'y');
//        graph.edge('z', 'l');

        System.out.println("The shortest distance between 0 and 5: " + graph.calculateShortestPath(graph.adjacency, 0, 5));
    }
}
