package academy.learnprogramming.leetCode;
import java.util.HashMap;

public class _1897redistributeCharactersToMakeAllStringsEqual {

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