package academy.learnprogramming.dataStructures;

import resources.actions;

public class bubbleSortImplementation {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        actions.printArray(arr);

        bubbleSorter(arr);
        actions.printArray(arr);
    }

    private static void bubbleSorter(int[] arr) {
        int j = arr.length;
        while(j > 0){
            for(int i=0; i+1 < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                }
            }
            j--;
        }
    }

    public static int[] swap(int[] arr, int i) {
        arr[i]   = arr[i] + arr[i+1];
        arr[i+1] = arr[i] - arr[i+1];
        arr[i]   = arr[i] - arr[i+1];
        return arr;
    }
}
