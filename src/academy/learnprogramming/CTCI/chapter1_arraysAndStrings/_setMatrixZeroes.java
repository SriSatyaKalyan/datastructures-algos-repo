package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

public class _setMatrixZeroes {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1 - Two Sum,1 - Two Sum,1 - Two Sum},{1 - Two Sum,0,1 - Two Sum},{1 - Two Sum,1 - Two Sum,1 - Two Sum}};
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        print2DMatrix(matrix);

        int[] xPosition = new int[rows];
        int[] yPosition = new int[columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == 0){
                    xPosition[i] = 1;
                    yPosition[j] = 1;
                }
            }
        }

        for(int i:xPosition){
            System.out.print(i + " | ");
        }
        System.out.println();
        for(int i:yPosition){
            System.out.print(i + " | ");
        }
        System.out.println();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(xPosition[i] > 0 || yPosition[j] > 0){
                    matrix[i][j] = 0;
                }
            }
        }

        print2DMatrix(matrix);

    }

    private static void print2DMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        System.out.println("--------------");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------");
    }
}
