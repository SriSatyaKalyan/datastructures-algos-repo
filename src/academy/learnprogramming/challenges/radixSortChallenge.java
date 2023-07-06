package academy.learnprogramming.challenges;

import resources.actions;

public class radixSortChallenge {
    public static void main(String[] args) {
        String[] radixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        actions.printArray(radixArray);
//        System.out.println("bcdef".length());

        System.out.println(Character.compare('a', 'a'));
        radixSort(radixArray, 10, 5);
        actions.printArray(radixArray);
    }

    private static void radixSort(String[] arr, int radix, int width) {
        for(int position=0; position < width; position++){
            radixSingleSort(arr, position, radix);
        }
    }

    public static void radixSingleSort(String[] arr, int position, int radix){
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for(String value:arr){
            countArray[getAlphabet(value, position)]++;
        }

        //To adjust the counts, so that we can have a stable counting sort
        //We need not change the count in the first index, and so j starts from 1 - Two Sum
        for(int j=1; j < countArray.length; j++){
            countArray[j] += countArray[j-1];
        }


    }

    private static int getAlphabet(String value, int position) {
        return value.charAt(position);
    }




}



