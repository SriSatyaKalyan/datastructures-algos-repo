package academy.learnprogramming.leetCode;

import java.util.HashMap;

public class _567permutationInString {
    public static void main(String[] args) {

//        String s1 = "ab";
//        String s2 = "eidbaooo";

        String s1 = "adc";
        String s2 = "dcda";

//        String s1 = "hello";
//        String s2 = "ooolleoooleh";
        System.out.println("Does s2: \"" + s2 + "\" contain s1: \"" + s1 +  "\" in any form? " + checkInclusion(s1, s2));
    }

    private static boolean checkInclusion(String s1, String s2) {
        if(s1.length() == 0) { return true; }
        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = s1.toCharArray();
        for(int i=0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        char[] arr2 = s2.toCharArray();
        for(int i=0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "]: " + arr2[i]);
            if(map.containsKey(arr2[i]) && (i + s1.length() <= s2.length()) && checkInclusionHere(i, map, s1, s2)) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkInclusionHere(int i, HashMap<Character, Integer> hashMap, String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>(hashMap);
        System.out.println("------------------------------------------------");
        System.out.println("The substring to be considered is: " + s2.substring(i, i + s1.length()));
        if(i + s1.length() > s2.length()) { return false; }
        char[] arr3 = s2.substring(i, i + s1.length()).toCharArray();
        for(int j = 0; j < arr3.length; j++) {
            System.out.println("map.get(" + arr3[j] + "): " + map.get(arr3[j]));
            if (!map.containsKey(arr3[j]) || map.get(arr3[j]) == 0) {
                return false;
            }
            map.put(arr3[j], map.get(arr3[j]) - 1);
            System.out.println("map.get(" + arr3[j] + "): " + map.get(arr3[j]));
        }

        return true;
    }
}
