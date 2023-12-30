package academy.learnprogramming.leetCodeSolutions;

import java.util.HashMap;

public class _1897 {
    public static void main(String[] args) {
        String[] arr = {"abc", "aabc", "bc", "c", "aabbc"};
        System.out.println(makeEqual(arr));
    }

    private static boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(String str : words) {
            for(char c : str.toCharArray()){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                }else{
                    map.put(c, 1);
                }
            }
        }

        int len = words.length;
        for(char c : map.keySet()){
            if(map.get(c) % len != 0) return false;
        }

        return true;
    }
}

// TC: O(n * k) where n is the length of words and k is the average length of the elements in words.
// To calculate counts, we iterate over every letter in input. There are n*k letters, so this costs O(n*k).
// Then we iterate over counts, the frequency counter, which has a length of 26.

//SC: O(1). The only extra space we use is for counts, which has a length of 26.