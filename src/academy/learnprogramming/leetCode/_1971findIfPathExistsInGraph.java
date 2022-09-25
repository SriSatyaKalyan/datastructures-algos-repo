package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class _1971findIfPathExistsInGraph {

    public static void main(String[] args) {

        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        System.out.println("Does validPath exist: " + validPath(n, edges, source, destination));
    }

    private static boolean validPath(int n, int[][] edges, int source, int destination) {












//        System.out.println("source: " + source + " && destination: " + destination);
//        HashMap<Integer, ArrayList<Integer>> map = createAdjacencyList(edges);
//        boolean[] visited = new boolean[edges.length];
//
//        if(map.containsKey(source)){
//            if(!visited[source]){
//                System.out.println("The value of visited["+ source + "]" + " is " + visited[source]);
//                visited[source] = true;
//                System.out.println("The value of visited["+ source + "]" + " is " + visited[source]);
//                ArrayList neighbors = map.get(source);
//                for(Object neighbor : neighbors){
//                    if((Integer)neighbor == destination) return true;
//                    validPath(n, edges, (Integer) neighbor, destination);
//                }
//            }
//        }





        //code to traverse through the nodes
//        while(map.get(i).size() > 0){
//            System.out.println("The value of visited["+ i + "]" + " is " + visited[i]);
//            if(!visited[i]){
//                visited[i] = true;
//                System.out.println("The value of visited["+ i + "]" + " is " + visited[i]);
//                ArrayList arr = map.get(i);
//                System.out.println("The value that is being traversed is: " + i);
//                for(int j=0; j < arr.size(); j++){
//                    System.out.println("Is the destination: " + arr.get(j));
//                    if(arr.get(j).equals(destination)){
//                        return true;
//                    }
//                    validPath(n, edges, (Integer) arr.get(j), destination);
//                }
//            }
//            i++;
//        }
        //end code

        return false;
    }

    private static HashMap<Integer, ArrayList<Integer>> createAdjacencyList(int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i < edges.length; i++){
            if(!map.containsKey(edges[i][0])){
                map.put(edges[i][0], (new ArrayList<Integer>()));
                map.get(edges[i][0]).add(edges[i][1]);
            }else{
                map.get(edges[i][0]).add(edges[i][1]);
            }
            if(!map.containsKey(edges[i][1])){
                map.put(edges[i][1], (new ArrayList<Integer>()));
                map.get(edges[i][1]).add(edges[i][0]);
            }else{
                map.get(edges[i][1]).add(edges[i][0]);
            }
        }

//        printAdjacencyList(map);
        return map;
    }

    private static void printAdjacencyList(HashMap<Integer, ArrayList<Integer>> map) {
        for(Integer key: map.keySet()){
            System.out.print(key + ": ");
        }
        for(ArrayList values: map.values()){
            for(Object value: values){
                System.out.print(value + " ");
            }
            System.out.println("---------");
        }
    }


//    private static boolean validPath(int n, int[][] edges, int source, int destination) {
//        for(int i=0; i < edges.length; i++){
//            System.out.println("The edge being considered is: " + edges[i][0]);
//            if(edges[i][0] == source){
//                if(edges[i][1] == destination){
//                    return true;
//                }
//            }else{
//                validPath(n, edges, edges[i][1], destination);
//            }
//        }
//        return false;
//    }
}
