package academy.learnprogramming.leetCode;

import java.util.*;

public class _1971findIfPathExistsInGraph {

    public static void main(String[] args) {

        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;

        System.out.println("Does validPath exist: " + validPath(n, edges, source, destination));
    }

    private static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }

        List<Integer> visited = new ArrayList<>();
        return dfsRecursive(graph, visited, source, destination);

//      BFS - Iterative
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(source);
//
//        while (!queue.isEmpty()) {
//            int currNode = queue.poll();
//            if (currNode == destination) {
//                return true;
//            }
//
//            // For all the neighbors of the current node, if we haven't visited it before,
//            // add it to 'queue' and mark it as visited.
//            for (int nextNode : graph.get(currNode)) {
//                if (!seen[nextNode]) {
//                    seen[nextNode] = true;
//                    queue.offer(nextNode);
//                }
//            }
//        }
//      --------------------------------------------------------------------------------------------

//      DFS - Iterative
//        Stack<Integer> stack = new Stack<>();
//        stack.push(source);
//
//        while (!stack.isEmpty()) {
//            int currNode = stack.pop();
//            if (currNode == destination) {
//                return true;
//            }
//
//            for (int nextNode : graph.get(currNode)) {
//                if (!seen[nextNode]) {
//                    seen[nextNode] = true;
//                    stack.push(nextNode);
//                }
//            }
//        }
//      --------------------------------------------------------------------------------------------


//      --------------------------------------------------------------------------------------------

//        return false;
    }

//  DFS - Recursive
    private static boolean dfsRecursive(Map<Integer, List<Integer>> graph, List<Integer> visited, int source, int destination) {
        if(source == destination) return true;
        if(visited.contains(source)) return false;

        visited.add(source);

        for(int neighbor: graph.get(source)){
            if(dfsRecursive(graph, visited, neighbor, destination)) return true;
        }

        return false;
    }
}