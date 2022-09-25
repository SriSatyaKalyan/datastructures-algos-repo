package academy.learnprogramming.leetCode;

import java.util.HashMap;

public class _771jewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("The number of jewels is: " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char j: jewels.toCharArray()){
            map.put(j, 0);
        }

        int numOfJewels = 0;
        for(char s: stones.toCharArray()){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
                numOfJewels++;
            }
        }

        return numOfJewels;
    }

}