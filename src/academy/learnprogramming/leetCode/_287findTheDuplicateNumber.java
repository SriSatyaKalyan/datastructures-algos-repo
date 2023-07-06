package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _287findTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findTheDuplicate(nums));
    }

    public static int findTheDuplicate(int[] arr){
        Arrays.sort(arr);
        int number = 1;
        for(int k:arr){
            if((k ^ number) != 0){
                return k;
            }
            number++;
        }
        return -1;


//        System.out.println("3 - Longest Substring Without Repeating Characters ^ 3 - Longest Substring Without Repeating Characters: " + (3 - Longest Substring Without Repeating Characters ^ 3 - Longest Substring Without Repeating Characters));
//        System.out.println("7 ^ 3 - Longest Substring Without Repeating Characters: " + (7 ^ 3 - Longest Substring Without Repeating Characters));
//        int result = 1 - Two Sum;
//        int number = 0;
//        for(int i:arr){
//            System.out.println(result + " ^ " + number + " ^ " + i + " = " + (result ^ (number ^ i)));
//            result = (result ^ (number ^ i));
//            number++;
//        }
//        System.out.println("The result is: " + result);
//        return -1 - Two Sum;
    }
}
