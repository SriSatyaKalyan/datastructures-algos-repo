package academy.learnprogramming.challenges;

import resources.actions;

public class mergeSortDescending {
    public static void main(String[] args){
        int[] arr = {50, -40, 30, -20, 1000, 5};
        actions.printArray(arr);

        mergeSorterDescending(arr, 0 , arr.length);
        actions.printArray(arr);
    }

    public static void mergeSorterDescending(int[] arr, int start, int end){
        if(end-start < 2){
            return;
        }

        int mid = (start+end) / 2;
        mergeSorterDescending(arr, start, mid);
        mergeSorterDescending(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end){
        if(arr[mid - 1] >= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end-start];

        while((i<mid) && (j<end)){
            tempArray[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start+tempIndex, mid-i);

        System.arraycopy(tempArray, 0, arr, start, tempIndex);
    }
}
