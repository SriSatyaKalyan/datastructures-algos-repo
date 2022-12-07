package academy.learnprogramming.leetCode;

import java.util.ArrayList;

public class _003longestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "bbbb";
//                "$$$%^&*(";
        System.out.println("The length of the longest substring is: " + lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i=0; i < s.length(); i++){
            int length = 0;
            ArrayList<Character> list = new ArrayList<>();
            for(int j = i; j < s.length(); j++){
                if(j == s.length()-1 && (!list.contains(s.charAt(j)))){
                    maxLength = maxLength > (length+1) ? maxLength : length+1;
                    return maxLength;
                }
//                System.out.println(" --------- s.charAt(j): " + s.charAt(j) + " | maxLength: " + maxLength + " | length: " + length + "  ---------");
                if(list.contains(s.charAt(j))){
//                    System.out.println("s.charAt(j): " + s.charAt(j) + " | maxLength: " + maxLength + " | length: " + length);
                    maxLength = maxLength > length ? maxLength : length;
                    list.clear();
                    break;
                }
                list.add(s.charAt(j));
                length++;
            }
        }

        return maxLength;
    }
}
