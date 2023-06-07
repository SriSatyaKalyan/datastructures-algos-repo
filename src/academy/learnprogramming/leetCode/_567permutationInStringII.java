package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class _567permutationInStringII {
    public static void main(String[] args) {

//        String s1 = "ab";
//        String s2 = "eidbaooo";

        String s1 = "adc";
        String s2 = "dcda";

//        String s1 = "hello";
//        String s2 = "ooolleoolleh";
        System.out.println("Does s2: \"" + s2 + "\" contain s1: \"" + s1 +  "\" in any form? " + checkInclusion(s1, s2));
    }

    private static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) { return false; }

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        if(s1.length() == s2.length()) {
            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);

            return Arrays.equals(s1Arr, s2Arr);
        }

        for(int i = 0; i <= s2.length()-s1.length(); i++){
            if(s1.indexOf(s2.charAt(i)) != -1){
                if(checkForInclusion(s1, s2.substring(i, i+s1.length()))){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkForInclusion(String s1, String s2){
        int[] counter = new int[26];

        for(int i = 0; i < s2.length(); i++){
            counter[s2.charAt(i) - 'a']++;
        }

        for(int j = 0; j < s1.length(); j++){
            counter[s1.charAt(j) - 'a']--;

            if(counter[s1.charAt(j) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
