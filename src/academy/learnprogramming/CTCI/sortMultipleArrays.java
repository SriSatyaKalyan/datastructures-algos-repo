package academy.learnprogramming.CTCI;

public class sortMultipleArrays {

    public static void main(String[] args) {
        int k = 3;
        int n = 4;
        int arr[][] = { {1, 3, 5, 7}, {2, 4, 6, 8}, {0, 9, 10, 11}} ;
        sortAll(arr, k, n);
    }

    private static int[] sortAll(int[][] arr, int numOfArrays, int sizeOfArrays) {
        int[] finalArray = new int[sizeOfArrays];
        if(numOfArrays < 2){
            return arr[0];
        }else{
            //1. Copy firstArray into finalArray
            System.arraycopy(arr[0], 0, finalArray, 0, arr[0].length);
            //2. Compare finalArray and nextArray and paste the results into tempArray
            for(int selectedArray=1; selectedArray < numOfArrays; selectedArray++){
                int[] tempArray = new int[sizeOfArrays*(selectedArray+1)];
                int n = 0; int x = 0; int y = 0;
                while(n < tempArray.length && x < finalArray.length && y < (arr[selectedArray].length)){
                    tempArray[n++] = finalArray[x] <= arr[selectedArray][y] ? finalArray[x++] : arr[selectedArray][y++];
                }
                if(x < finalArray.length){
                    System.arraycopy(tempArray, n, finalArray, x, finalArray.length - x);
                }
                if(y < (arr[selectedArray].length)){
                    System.arraycopy(tempArray, n, arr[selectedArray], y, arr[selectedArray].length - y);
                }
                finalArray = new int[sizeOfArrays*(selectedArray+1)];
                System.arraycopy(tempArray, 0, finalArray, 0, tempArray.length);
            }

            //3. Copy tempArray into finalArray
            //Repeat steps 2 and 3 until end
        }

        for(int j = 0; j < finalArray.length; j++){
            System.out.print(finalArray[j] + " ");
        }
        return finalArray;
    }
}

//OPTIMIZATION is that if there are elements remaining in the left array, we have to copy them into the tempArray
//But if there are elements remaining in the right array, we need NOT copy them into the -
////tempArray as they are already in their designated places
//        System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
//
//                //This action is to copy everything in the tempArray into arr
//                System.arraycopy(tempArray, 0, arr, start, tempIndex);