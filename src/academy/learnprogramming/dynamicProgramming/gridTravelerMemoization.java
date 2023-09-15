package academy.learnprogramming.dynamicProgramming;

import java.util.Arrays;

public class gridTravelerMemoization {
    public static void main(String[] args) {
//        int rows = 3;
//        int columns = 7;

        System.out.println("The number of unique paths for rows: 1 and columns: 7 are: " + uniquePaths(1, 7));
        System.out.println("The number of unique paths for rows: 3 and columns: 7 are: " + uniquePaths(3, 7));
        System.out.println("The number of unique paths for rows: 18 and columns: 18 are: " + uniquePaths(18, 18));
    }

    private static int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];

        for(int[] arr : d){
            Arrays.fill(arr, 1);
        }

        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                d[row][col] = d[row-1][col] + d[row][col - 1];
            }
        }

        return d[m - 1][n - 1];
    }
}
