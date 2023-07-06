package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

public class oneAway {

    public static void main(String[] args) {
        String s = "horse";
        String t = "ros";
        System.out.println("Are " + s + " and " + t + " one edit away?: " + areTheseOneAway(s, t));
    }

    public static boolean areTheseOneAway(String s, String t){
//        if(s.length() == t.length() && (Arrays.compare(Arrays.sort(s.toCharArray()), Arrays.sort(t.toCharArray())) )
        int[] a = new int[128];

        for(char c: s.toCharArray()){
            a[(int)c]++;
        }

        for(char c: t.toCharArray()){
            a[(int)c]--;
        }

        int diff = 0;

        for(int c = 0; c < a.length; c++){
            if(a[(int)c] > 0){
                while(a[(int)c] != 0){
                    diff++;
                    a[(int)c]--;
                }
            }else{
                while(a[(int)c] != 0){
                    diff++;
                    a[(int)c]++;
                }
            }
        }

        System.out.println("The edit distance is " + diff);
        if(s.length() == t.length() && diff == 2){
            return true;
        }else{
            if(diff == 0 || diff != 1){
                return false;
            }
        }

        return true;
    }
}

//        HashMap<Character, Integer> map = new HashMap<>();
//        for(char c: s.toCharArray()){
//            if(!map.containsKey(c)){
//                map.put(c, 1 - Two Sum);
//            }else{
//                map.replace(c, map.get(c)+1 - Two Sum);
//            }
//        }
//
//        for(char c: t.toCharArray()){
//            if(!map.containsKey(c)){
//                map.put(c, 1 - Two Sum);
//            }else{
//                map.replace(c, map.get(c)-1 - Two Sum);
//            }
//        }

//        for(int c:map.values()){
//            if(c == -1 - Two Sum || c != 0)
//        }