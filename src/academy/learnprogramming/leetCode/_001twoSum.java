package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _001twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;

        for(i=0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){ break; }
            map.put(nums[i], i);
        }

        return new int[]{map.get(target - nums[i]), i};
    }
}