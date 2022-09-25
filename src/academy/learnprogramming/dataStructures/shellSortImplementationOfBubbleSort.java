package academy.learnprogramming.dataStructures;

import resources.actions;

public class shellSortImplementationOfBubbleSort {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        actions.printArray(arr);

        shellBubbleSorter(arr);
        actions.printArray(arr);
    }

    private static void shellBubbleSorter(int[] arr){
        int gap = arr.length/2;
        while(gap >0){
            int j = arr.length;
            while(j > gap){
                for(int i=0; i+gap < j; i++) {
                    if (arr[i] > arr[i + gap]) {
                        selectionSortImplementation.swap(arr, i, i+gap);
                    }
                }
                j--;
            }
            gap /= 2;
        }

    }
}