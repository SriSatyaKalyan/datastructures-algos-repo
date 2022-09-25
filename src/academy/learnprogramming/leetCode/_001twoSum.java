package academy.learnprogramming.leetCode;

import java.util.HashMap;
import java.util.Map;

public class _001twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i:nums){
            int current = nums[i];
            int x = target - current;

            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(current, i);
        }

        return null;
    }
}