package academy.learnprogramming.leetCode;

import java.util.*;

public class _073setMatrixZeroes {

    public static void main(String[] args) {
//        int[][] matrix = {{1 - Two Sum, 1 - Two Sum, 1 - Two Sum}, {1 - Two Sum, 0, 1 - Two Sum}, {1 - Two Sum, 1 - Two Sum, 1 - Two Sum}};
//        int[][] matrix = {{0, 1 - Two Sum, 2 - Add Two Numbers, 0}, {1 - Two Sum, 3 - Longest Substring Without Repeating Characters, 1 - Two Sum, 9}, {1 - Two Sum, 1 - Two Sum, 1 - Two Sum, 7}};
        int[][] matrix = {{1}};
        setZeroes(matrix);

        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static int[][] setZeroes(int[][] matrix) {
        System.out.println("The length is: " + matrix.length + " matrix[0].length: " + matrix[0].length);

        int R = matrix.length;
        int C = matrix[0].length;

        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();

        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(rows.contains(i) || columns.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}

//class Solution {
//    public void setZeroes(int[][] matrix) {
//        HashMap<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
//        List<Integer> rows = new ArrayList<Integer>();
//        List<Integer> columns = new ArrayList<Integer>();
//
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                if(matrix[i][j] == 0){
//                    rows.add(i);
//                    columns.add(j);
//                    map.put('r', rows);
//                    map.put('c', columns);
//                }
//            }
//        }
//
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                if(map.get('r').contains(i) || map.get('c').contains(j)){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//}