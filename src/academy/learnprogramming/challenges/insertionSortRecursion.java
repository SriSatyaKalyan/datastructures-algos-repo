package academy.learnprogramming.challenges;

import resources.actions;

public class insertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        actions.printArray(arr);

        insertionSorter(arr, arr.length);
        actions.printArray(arr);
    }

    private static void insertionSorter(int[] arr, int endIndex) {
        if(endIndex > 1){
              insertionSorter(arr, endIndex - 1);
        }

        int newElement = arr[endIndex-1];
        int j;
        for (j = endIndex-1; (j > 0) && (arr[j - 1] > newElement); j--) {
            arr[j] = arr[j - 1];
        }
        arr[j] = newElement;
    }
}