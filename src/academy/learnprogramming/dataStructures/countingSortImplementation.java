package academy.learnprogramming.dataStructures;

import resources.actions;

public class countingSortImplementation {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 2, 8, 0, 9};
        actions.printArray(arr);

        countingSorter(arr, 0, 9);
        actions.printArray(arr);
    }

    private static void countingSorter(int[] arr, int min, int max) {
        //The elements in the array allocated by new will automatically be initialized to zero (for numeric types)
        int[] countArray = new int[(max - min) + 1];

        for (int i=0; i < arr.length; i++){
            countArray[arr[i] - min]++;
        }

        int k =0;
//        actions.printArray(countArray);
        for(int j=0; (j < countArray.length); j++){
            while(countArray[j] > 0){
                arr[k++] = min + j;
                countArray[j]--;
            }
        }
    }
}