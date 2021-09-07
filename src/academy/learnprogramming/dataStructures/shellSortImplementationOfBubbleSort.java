package academy.learnprogramming.dataStructures;

public class shellSortImplementationOfBubbleSort {
    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        bubbleSortImplementation.printArray(arr);

        shellBubbleSorter(arr);
        bubbleSortImplementation.printArray(arr);
    }

    private static void shellBubbleSorter(int[] arr){
        int gap = arr.length/2;
        while(gap >0){
            int j = arr.length;
            while(j > 0){
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