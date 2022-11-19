package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class _242validAnagram {

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";

//        String s = "cat";
//        String t = "rat";

        String s = "aabb";
        String t = "bbaac";

        System.out.println("Are s: \"" + s + "\" and t: \"" + t + "\" anagrams?: " + isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
