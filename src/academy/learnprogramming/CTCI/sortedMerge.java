package academy.learnprogramming.CTCI;

import java.util.*;

public class sortedMerge {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<String, List>();
        for(String str:strs){

            char[] characterArray = str.toCharArray();
            Arrays.sort(characterArray);
            String key = String.valueOf(characterArray);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
                map.get(key).add(str);
            }else{
                map.get(key).add(str);
            }
        }

        return new ArrayList(map.values());
    }
}