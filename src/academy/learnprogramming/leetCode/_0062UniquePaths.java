package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _0062UniquePaths {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println("The number of unique paths are: " + uniquePaths(m, n));
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
