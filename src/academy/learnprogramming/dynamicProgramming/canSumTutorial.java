//https://www.youtube.com/watch?v=oBt53YbR9Kk&list=RDCMUC8butISFwT-Wl7EV0hUK0BQ&start_radio=1&t=8s

package academy.learnprogramming.dynamicProgramming;

import java.util.HashMap;

public class canSumTutorial {

    public static void main(String[] args) {
        System.out.println("For the target: 7, the result is: " + canSum(7, new int[]{2, 3}));
        System.out.println("For the target: 7, the result is: " + canSum(7, new int[]{5, 3, 4, 7}));
        System.out.println("For the target: 7, the result is: " + canSum(7, new int[]{2, 4}));
        System.out.println("For the target: 300, the result is: " + canSum(300, new int[]{7, 14}));
    }

    private static boolean canSum(int target, int[] arr) {
        HashMap<Integer, Boolean> memo = new HashMap<>();
        return canSum(target, arr, memo);
    }

    private static boolean canSum(int target, int[] arr, HashMap<Integer, Boolean> memo) {
//        System.out.println("target: " + target);
        if(memo.containsKey(target)) {
//            System.out.println("memo contains the target");
            return memo.get(target);
        }
        if(target == 0) return true;
        if(target < 0) return false;

        for(int i : arr){
            int remainder = target - i;
//            System.out.println("i: " + i + " || remainder: " + remainder);

            if(canSum(remainder, arr, memo)){
                memo.put(target, true);
                return true;
            }
        }

        memo.put(target, false);
        return false;
    }
}
