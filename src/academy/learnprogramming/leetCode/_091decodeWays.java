package academy.learnprogramming.leetCode;

import java.util.HashMap;

public class _091decodeWays {
    public static void main(String[] args) {
        String s = "226366226";
        System.out.println(numDecodings(s));
    }

    static HashMap<String, Integer> cache = new HashMap<>();
    private static int numDecodings(String s) {
        System.out.println("The string is: " + s);
        if(cache.containsKey(s)){
            System.out.println("The cache CONTAINS");
            return cache.get(s);
        }

        if(s.length() == 1){
            // && (Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 9)
            // System.out.println("In the loop with: " + s + " and returning 1");
            return 1;
        } else if(s.length() > 1 && (Integer.parseInt(s) >= 10 && Integer.parseInt(s) <= 26)){
            return 2;
        }else{
            cache.put(Character.toString(s.charAt(0)), numDecodings(s.substring(1)) + numDecodings(s.substring(2)));
        }

        return cache.get(s);
    }
}
