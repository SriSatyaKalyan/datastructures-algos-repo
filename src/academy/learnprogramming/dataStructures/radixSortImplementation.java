package academy.learnprogramming.dataStructures;

import resources.actions;

public class radixSortImplementation {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        actions.printArray(radixArray);

        radixSort(radixArray, 10, 4);
        actions.printArray(radixArray);
    }

    public static void radixSort(int[] arr, int radix, int width){
        for(int position=0; position < width; position++){
            radixSingleSort(arr, position, radix);
        }
    }

    public static void radixSingleSort(int[] arr, int position, int radix){
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for(int value:arr){
            countArray[getDigit(position, value, radix)]++;
        }

        //To adjust the counts, so that we can have a stable counting sort
        //We need not change the count in the first index, and so j starts from 1
        for(int j=1; j < countArray.length; j++){
            countArray[j] += countArray[j-1];
        }

        //Creating a temporary array
        int[] temp = new int[numItems];
        for(int tempIndex=numItems-1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];
        }

        //Copying temporary array into the actual array
        for(int k=0; k < numItems; k++){
            arr[k] = temp[k];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return (value / ((int)Math.pow(radix, position))) % radix;
    }
}