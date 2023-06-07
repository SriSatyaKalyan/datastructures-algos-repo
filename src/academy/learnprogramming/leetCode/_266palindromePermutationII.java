package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _266palindromePermutationII {

    public static void main(String[] args) {
        String s = "racecra";
        System.out.println("\nIs this a palindrome?: " + canPermutePalindrome(s));
    }

    private static boolean canPermutePalindrome(String s) {
//        char[] sArr = s.toCharArray();
        int oddCount = 0;

        int[] counter = new int[26];
        for(int i=0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
        }

        for(int count : counter){
            if(count % 2 == 1){
                oddCount++;
            }
        }

        if(s.length() % 2 == 1){
            return oddCount == 1;
        }

        return oddCount == 0;
    }
}