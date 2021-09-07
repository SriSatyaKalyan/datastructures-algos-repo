package academy.learnprogramming.dataStructures;

public class shellSortImplementation {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22, -19, 23, 45, -22, -100};
        bubbleSortImplementation.printArray(arr);

        bubbleSorter(arr);
        bubbleSortImplementation.printArray(arr);
    }

    private static void bubbleSorter(int[] arr) {
        int gap = arr.length/2;
        int j;
        while(gap > 0){
            for(int i = gap; (i > 0) && (i < arr.length); i++){
                int newElement = arr[i];
                j = i;
                while(j >= gap && arr[j-gap] > newElement){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
            gap = gap/2;
        }
    }

}