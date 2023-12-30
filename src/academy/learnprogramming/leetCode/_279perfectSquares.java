package academy.learnprogramming.leetCode;

public class _279perfectSquares {

    public static void main(String[] args) {
        int n = 12;
        System.out.println("The ans: " + (numSquares(n) - 1));
    }

    private static int numSquares(int n) {
        int sqrt = (int) Math.sqrt(n);
        return calculate(n, sqrt, n);
    }

    private static int calculate(int n, int sqrt, int min) {
//        System.out.println("n: " + n + " || sqrt: " + sqrt + " || min: " + min);
        if(n <= 1){
//            System.out.println("n is 1");
            return 1;
        }
        for(int i = 1; i <= sqrt; i++){
            int calculatedDepth = (1 + (calculate((int) (n - (Math.pow(i, 2))), (int) Math.sqrt((n - (Math.pow(i, 2)))), min)));
//            System.out.println("i: " + i + " || depth: " + calculatedDepth);
            if(calculatedDepth < min) min = calculatedDepth;
        }

        return min;
    }
}
