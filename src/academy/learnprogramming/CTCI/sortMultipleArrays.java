package academy.learnprogramming.CTCI;

public class sortMultipleArrays {

    public static void main(String[] args) {
        int k = 4;
        int n = 4;
        int arr[][] = { {1, 3, 5, 7}, {2, 4, 6, 8}, {9, 13, 18, 25}, {0, 10, 15, 17}} ;
        sortAll(arr, k, n);
    }

    private static int[] sortAll(int[][] arr, int numOfArrays, int sizeOfArrays) {
        int[] finalArray = new int[sizeOfArrays];
        if(numOfArrays < 2){
            return arr[0];
        }else{
            //1 - Two Sum. Copy firstArray into finalArray
            System.arraycopy(arr[0], 0, finalArray, 0, arr[0].length);
            //2 - Add Two Numbers. Compare finalArray and nextArray and paste the results into tempArray
            for(int selectedArray=1; selectedArray < numOfArrays; selectedArray++){
                int[] tempArray = new int[sizeOfArrays*(selectedArray+1)];
                int n = 0; int x = 0; int y = 0;
                while(n < tempArray.length && x < finalArray.length && y < (arr[selectedArray].length)){
                    tempArray[n++] = finalArray[x] <= arr[selectedArray][y] ? finalArray[x++] : arr[selectedArray][y++];
                }
                if(x < finalArray.length){
                    System.arraycopy(finalArray, x, tempArray, n, finalArray.length - x);
                }
                if(y < (arr[selectedArray].length)){
                    System.arraycopy(arr[selectedArray], y, tempArray, n, arr[selectedArray].length - y);
                }
                finalArray = new int[sizeOfArrays*(selectedArray+1)];
                System.arraycopy(tempArray, 0, finalArray, 0, tempArray.length);
            }
        }

        for(int j = 0; j < finalArray.length; j++){
            System.out.print(finalArray[j] + " ");
        }
        return finalArray;
    }
}