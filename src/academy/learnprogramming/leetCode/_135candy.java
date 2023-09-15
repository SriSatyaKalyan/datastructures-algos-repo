package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _135candy {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println("The number of candies are: " + candy(ratings));
    }

    private static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int sum = 0;

        Arrays.fill(candies, 1);

        print(candies);

        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = Math.max(candies[i], candies[i-1] + 1);
            }
        }

        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }

        for(int i : candies) sum += i;

        return sum;
    }

    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i + " || ");
        }
        System.out.println();
    }
}
