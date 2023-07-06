package academy.learnprogramming.dataStructures;

import resources.actions;

public class mergeSortImplementation {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        actions.printArray(arr);

        mergeSorter(arr, 0 , arr.length);
        actions.printArray(arr);
    }

    public static void mergeSorter(int[] arr, int start, int end){

        //Recursion is going to break when it is a one-element array
        if(end - start < 2){
            return;
        }

        int mid = (start + end)/2;
        mergeSorter(arr, start, mid);
        mergeSorter(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        //OPTIMIZATION where we check if the last element of the left array is smaller than the first element of the right array
        if(arr[mid-1] <= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end-start];

        while((i<mid) && (j<end)){
            //if the condition is true,  we would assign arr[i] and increment i by 1 - Two Sum (i++)
            //if the condition is false, we would assign arr[j] and increment j by 1 - Two Sum (j++)
            tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        //OPTIMIZATION is that if there are elements remaining in the left array, we have to copy them into the tempArray
        //But if there are elements remaining in the right array, we need NOT copy them into the -
        //tempArray as they are already in their designated places
        System.arraycopy(arr, i, arr, start+tempIndex, mid-i);

        //This action is to copy everything in the tempArray into arr
        System.arraycopy(tempArray, 0, arr, start, tempIndex);
    }
}