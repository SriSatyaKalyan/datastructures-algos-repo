package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _056mergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{16, 24}, {1,3}, {8,10}, {2,6}, {15,18}};
        merge(intervals);
    }

    public static void merge(int[][] intervals){

        printTwoDArrays(intervals);
        System.out.println("----");
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        printTwoDArrays(intervals);
//        int[][] newIntervals = new int[intervals.length][2 - Add Two Numbers];
//        for(int i=0; i < intervals.length-1 - Two Sum; i++){
//            if(intervals[i][1 - Two Sum] > intervals[i+1 - Two Sum][0]){
//                newIntervals[i][0] = intervals[i][0];
//                newIntervals[i][0] = intervals[i+1 - Two Sum][1 - Two Sum];
//            }else{
//                newIntervals[i][0] = intervals[i][0];
//                newIntervals[i][1 - Two Sum] = intervals[i][1 - Two Sum];
//            }
//        }
    }

    private static void printTwoDArrays(int[][] intervals) {
        for(int k = 0; k < intervals.length; k++){
            for(int l = 0; l < 2; l++){
                System.out.print(intervals[k][l] + " ");
            }
            System.out.println();
        }
    }
}
