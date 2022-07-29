package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _049groupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        for(List<String> lists : groupAnagrams(strs)){
            System.out.println(lists);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> newList = new ArrayList<List<String>>();
        HashMap<String, List<String>> map  = new HashMap<>();

        for(String str: strs){
            char sortedString[] = (str.toCharArray());
            Arrays.sort(sortedString);
//            System.out.println("String is: " + str + " => Sorted String: " + String.valueOf(sortedString));
            if(!map.containsKey(String.valueOf(sortedString))){
                List<String> listOfAnagrams =  new ArrayList<>();
                listOfAnagrams.add(str);
                map.put(String.valueOf(sortedString), listOfAnagrams);
            }else{
                map.get(String.valueOf(sortedString)).add(str);
            }
        }
        for(List<String> lists : map.values()){
            newList.add(lists);
        }

        return newList;
    }

}
