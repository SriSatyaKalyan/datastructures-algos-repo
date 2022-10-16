package academy.learnprogramming.graphs.problems;

public class numberOfIslands_DFS {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println("The number of islands is: " + numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
        //checking if the grid contains any values
        if(grid == null || grid.length == 0){
            return 0;
        }

        int rows = grid.length;
        int columns = grid[0].length;

        int numOfIslands = 0;
        for(int r=0; r < rows; r++){
            for(int c=0; c < columns; c++){
                if(grid[r][c] == '1'){
                    //pre-incrementing the value of number of islands
                    ++numOfIslands;
                    dfs(grid, r, c);
                }
            }
        }

        return numOfIslands;
    }

    private static void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int columns = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= columns || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}

//TC: O(rows X columns)
//SC: worst case - O(rows X columns) in the case where the grid map is filled with lands where DFS goes by rows X columns deep
//                 and has to mark them all as visited

//https://leetcode.com/problems/number-of-islands/