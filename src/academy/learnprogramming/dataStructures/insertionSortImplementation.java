package academy.learnprogramming.dataStructures;

import resources.actions;

public class insertionSortImplementation {
    public static void main(String[] args) {
//        int[] arr = {50, -40, 30, -20, 1000, 5};
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        actions.printArray(arr);

        insertionSorter(arr);
        actions.printArray(arr);
    }

    public static int[] insertionSorter(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int j;
            for (j = i; (j > 0) && (arr[j - 1] > newElement); j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = newElement;
        }
        return arr;
    }
}