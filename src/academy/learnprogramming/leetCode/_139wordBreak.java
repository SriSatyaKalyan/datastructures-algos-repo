package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _139wordBreak {

    public static void main(String[] args) {

//        String s = "leetcode";
//        List<String> wordDict = Arrays.asList("leet", "code");

        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");

        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        HashMap<Character, Integer> alphCount = new HashMap<Character, Integer>();

        for(char c:s.toCharArray()){
            if(!alphCount.containsKey(c)){
                alphCount.put(c, 1);
            }else{
                alphCount.put(c, alphCount.get(c)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : alphCount.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------");

        for(int i=0; i < wordDict.size(); i++){
            for(char c:wordDict.get(i).toCharArray()){
                if(alphCount.containsKey(c)){
                    alphCount.put(c, alphCount.get(c)-1);
                    if(alphCount.get(c) < 0){
                        return false;
                    }
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : alphCount.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : alphCount.entrySet()) {
            if(entry.getValue() < 0){
                return false;
            }
        }

         return true;
    }
}
