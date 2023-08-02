package academy.learnprogramming.dynamicProgramming;

public class fibonnaciSequenceMemoization {

    public static void main(String[] args) {
        System.out.println("The 0th number in the Fibonnaci Sequence is: " + fibonnaci(0));
        System.out.println("The 1st number in the Fibonnaci Sequence is: " + fibonnaci(1));
        System.out.println("The 2nd number in the Fibonnaci Sequence is: " + fibonnaci(2));
        System.out.println("The 3rd number in the Fibonnaci Sequence is: " + fibonnaci(3));
        System.out.println("The 4th number in the Fibonnaci Sequence is: " + fibonnaci(4));
        System.out.println("The 5th number in the Fibonnaci Sequence is: " + fibonnaci(5));
        System.out.println("The 6th number in the Fibonnaci Sequence is: " + fibonnaci(6));
        System.out.println(fibonnaci(7) + " || " + fibonnaci(8) + " || " + fibonnaci(9)
                + " || " + fibonnaci(20) + " || " + fibonnaci(30));
    }

    private static int fibonnaci(int i) {
        if(i == 0){
            return 0;
        }else if(i == 1 || i == 2){
            return 1;
        }

        int[] arr = new int[i+1];
        arr[0] = 0;
        arr[1] = 1;

        return fibonnaci(arr);
    }

    private static int fibonnaci(int[] arr){
        for(int j = 2; j < arr.length; j++){
            arr[j] = arr[j-1] + arr[j-2];
        }

        return arr[arr.length - 1];
    }
}
