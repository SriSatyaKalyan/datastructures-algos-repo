package academy.learnprogramming.dataStructures;

import resources.actions;

public class quickSortImplementation {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        actions.printArray(arr);

        quickSort(arr, 0, arr.length);
        actions.printArray(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i=  start; int j = end;

        //While loop to make sure that i is less than j
        while(i < j){
            //Empty while loop to find an element lesser than pivot from the end of the array
            while(i<j && arr[--j] >= pivot);
            if(i<j){
                arr[i] = arr[j];
            }

            //Empty while loop to find an element greater than pivot from the start of the array
            while(i<j && arr[++i] <= pivot);
            if(i<j){
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }
}