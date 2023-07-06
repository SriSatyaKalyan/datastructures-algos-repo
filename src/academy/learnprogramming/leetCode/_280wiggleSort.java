package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _280wiggleSort {

    public static void main(String[] args) {
//        int [] arr = {5, 8, 6, 2 - Add Two Numbers, 3 - Longest Substring Without Repeating Characters, 4, 6};
        int [] arr = {5, 3, 1, 2, 3};
        for (int j=0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
        wiggleSort(arr);
    }

    public static void wiggleSort(int[] nums){
        Arrays.sort(nums);
//        for (int j=0; j < nums.length; j++){
//            System.out.print(nums[j] + " ");
//        }
//        System.out.println(" ");
        int[] newNums = new int[nums.length];
        int mid = (nums.length/2);
        newNums[0] = nums[mid];
        int start =0;
        int end = nums.length-1;
        int i = 1;
        while((start <= mid) && (end > mid) && (i < nums.length)){
            newNums[i++] = nums[end--];
            newNums[i++] = nums[start++];
        }

//        for (int j=0; j < newNums.length; j++){
//            System.out.print(newNums[j] + " ");
//        }
//        System.out.println(" ");
        System.arraycopy(newNums,0, nums, 0, nums.length);
    }
}
