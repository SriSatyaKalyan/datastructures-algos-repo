package academy.learnprogramming.leetCode;

import java.util.HashMap;
import java.util.Map;

public class _266palindromePermutation {

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Is this a palindrome?: " + canPermutePalindrome(s));
    }

    private static boolean canPermutePalindrome(String s) {
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toLowerCase().toCharArray();

        for(int i=0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }


        int oddCount = 1;
        if(length % 2 == 0){
            oddCount = 0;
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(!(entry.getValue() % 2 == 0) && (--oddCount < 0)){
                return false;
            }
        }

        return true;
    }
}
