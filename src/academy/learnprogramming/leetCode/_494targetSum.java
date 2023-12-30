package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class _494targetSum {

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, 1};
        int target = 3;
        System.out.println("The number of ways are: " + findTargetSumWays(nums, target));
    }

    static HashMap<Integer, Integer> cache = new HashMap<>();

    private static int findTargetSumWays(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return 1;
            }else{
                return 0;
            }
        }

        System.out.println("The total value is: " + Arrays.stream(nums).sum());
        findTargetSumWaysForEverything(nums, 0, 0);
        return cache.get(target);
    }

    private static void findTargetSumWaysForEverything(int[] nums, int val, int index) {
        if(nums.length == index) return;

        int val1 = val + nums[index];
        int val2 = val - nums[index];
//        System.out.println("val1: " + val1 + " || val2: " + val2 + " || index: " + index);

        if((index == nums.length - 1)){
            if(cache.containsKey(val1)){
                cache.put(val1, cache.get(val1) + 1);
            }else{
                cache.put(val1, 1);
            }

            if(cache.containsKey(val2)){
                cache.put(val2, cache.get(val2) + 1);
            }else{
                cache.put(val2, 1);
            }
        }

        findTargetSumWaysForEverything(nums, val1, index + 1);
        findTargetSumWaysForEverything(nums, val2, index + 1);
    }
}
