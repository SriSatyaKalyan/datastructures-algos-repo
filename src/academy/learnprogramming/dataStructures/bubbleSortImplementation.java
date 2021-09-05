package academy.learnprogramming.dataStructures;

public class bubbleSortImplementation {

    public static void main(String[] args) {
        int[] arr = {50, -40, 30, -20, 1000, 5};
        printArray(arr);

        bubbleSorter(arr);
        printArray(arr);
    }

    private static void bubbleSorter(int[] arr) {
        int j = arr.length;
        while(j > 0){
            for(int i=0; i < (arr.length)-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                }
            }
            j--;
        }
    }

    private static int[] swap(int[] arr, int i) {
        arr[i]   = arr[i] + arr[i+1];
        arr[i+1] = arr[i] - arr[i+1];
        arr[i]   = arr[i] - arr[i+1];
        return arr;
    }

    public static void printArray(int[] arr){
        for(int k: arr){
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }
}
