package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _217containsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < (nums).length; i++){
            System.out.println(nums[i] + " | " + nums[i-1]);
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
    }
}
