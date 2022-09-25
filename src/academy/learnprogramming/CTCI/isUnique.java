package academy.learnprogramming.CTCI;

import java.util.Arrays;
import java.util.HashMap;

public class isUnique {

    public static void main(String[] args) {
        String str = "kalynj";
//                "mississippi";
        int[] nums = {1, 2, 3, 4};
        System.out.println(str + " is unique: " + isThisUnique(str));
        System.out.println(isThisUnique(nums));
    }

    public static boolean isThisUnique(String str){
        for(int i=0; i < str.length()-1; i++){
            for(int j=i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isThisUnique(int[] nums){
        HashMap<Integer, Integer> hmap= new HashMap<>();
        for(int i:nums){
            if(hmap.containsKey(i)){
                return false;
            }
            hmap.put(i, 1);
        }
        return true;
    }
}