package academy.learnprogramming.dataStructures;

import static academy.learnprogramming.dataStructures.bubbleSortImplementation.printArray;

public class selectionSortImplementation {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        System.out.print("Unsorted Array: ");
        printArray(arr);

        selectionSorter(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }

    private static void selectionSorter(int[] arr) {
        int indexWithMaxValue;
        int lastUnsortedIndex = arr.length-1;
        while(lastUnsortedIndex > 0){
            indexWithMaxValue = 0;
            for(int i=0; i < lastUnsortedIndex-1; i++){
                if(arr[indexWithMaxValue] < arr[i+1]){
                    indexWithMaxValue = i+1;
                }
            }
            swap(arr, indexWithMaxValue, lastUnsortedIndex);
            lastUnsortedIndex--;
        }
    }

    private static int[] swap(int[] arr, int indexWithMaxValue, int lastUnsortedIndex) {
        arr[indexWithMaxValue] = arr[indexWithMaxValue] + arr[lastUnsortedIndex];
        arr[lastUnsortedIndex] = arr[indexWithMaxValue] - arr[lastUnsortedIndex];
        arr[indexWithMaxValue] = arr[indexWithMaxValue] - arr[lastUnsortedIndex];
        return arr;
    }
}
