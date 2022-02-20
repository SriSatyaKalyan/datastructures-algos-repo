package academy.learnprogramming.leetCode;

public class _033searchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, 0, nums.length-1, target));
    }

    public static int search(int[] arr, int left, int right, int target) {
        if(right < left){
            return -1;
        }

        int middle = (left + right)/2;
        if(target == arr[middle]){
            return middle;
        }

        if(arr[left] < arr[middle]){
            if(arr[left] <= target && target < arr[middle]){
                return search(arr, left, middle-1, target);
            }else {
                return search(arr, middle+1, right, target);
            }
        }else if(arr[middle] < arr[right]){
            if(arr[middle] < target && target <= arr[right]){
                return search(arr, middle+1, right, target);
            }else{
                return search(arr, left, middle-1, target);
            }
        }else{
            int location = -1;
            if(arr[left] == arr[middle]){
                location = search(arr, middle+1, right, target);
            }
            if(location == -1 && arr[middle] == arr[right]){
                location = search(arr, left, middle-1, target);
            }
            return location;
        }
    }
}
