package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

import java.util.HashMap;

public class _palindromePermutation {

    public static void main(String[] args) {
        String s = "papacd";
        System.out.println("Is " + s + " a palindrome?: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String noSpacesString = s.replace(" ", "").toLowerCase();
        int stringLength = noSpacesString.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c:noSpacesString.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        int oddCharCount = 0;
        if(stringLength % 2 != 0){
            oddCharCount = 1;
        }

        for(char c: map.keySet()){
            oddCharCount -= (map.get(c) % 2);
            if(oddCharCount < 0){
                return false;
            }
        }

        return true;
    }
}
