package academy.learnprogramming.graphs.problems;

public class maxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

//        int[][] grid =  {
//                {1,1,0,0,0},
//                {1,1,0,0,0},
//                {0,0,0,1,1},
//                {0,0,0,1,1}
//        };

        System.out.println("The  maximum area of an island is: " + maximumAreaOfIsland(grid));
    }

    public static int maximumAreaOfIsland(int[][] grid){
        //checking if the grid contains any values
        if(grid == null || grid.length == 0){
            return 0;
        }

        int rows = grid.length;
        int columns = grid[0].length;

        int numOfIslands = 0;
        int maxAreaOfIsland = 0;
        int areaOfIsland = 0;
        for(int r=0; r < rows; r++){
            for(int c= 0; c < columns; c++){
                if(grid[r][c] == 1){
//                    ++numOfIslands;
//                    ++areaOfIsland;
                    areaOfIsland = dfs(grid, r, c, areaOfIsland);
                }

                maxAreaOfIsland = (maxAreaOfIsland >= areaOfIsland) ? maxAreaOfIsland : areaOfIsland;
            }
        }

        return maxAreaOfIsland;
    }

    public static int dfs(int[][] grid, int r, int c, int area){
        int rows = grid.length;
        int columns = grid[0].length;
        System.out.println("r: " + r + " | c: " + c + " | area: " + area);

        if(r < 0 || c < 0 || r >= rows || c >= columns || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;

        System.out.println("Starting DFS at r " + r + " and c " + c);
        area = 1 +
                dfs(grid, r - 1, c, 1) +
                dfs(grid, r + 1, c, 1) +
                dfs(grid, r, c - 1, 1) +
                dfs(grid, r, c + 1, 1);

        return area;
    }
}