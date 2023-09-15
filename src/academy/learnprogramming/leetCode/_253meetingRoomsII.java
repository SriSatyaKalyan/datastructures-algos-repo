package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class _253meetingRoomsII {

    public static void main(String[] args) {
        int[][] intervals = {{2, 11}, {6, 16}, {11, 16}};
//        {{2, 10}, {4, 10}, {10, 20}, {10, 30}};
//                {{2, 11}, {6, 16}, {11, 16}};
//                [[9,10],[4,9],[4,17]]
//                {{13, 15}, {1, 13}};
//                {{0, 30}, {5, 10}, {15, 20}};

        System.out.println("The minimum number of rooms are: " + minMeetingRooms(intervals));
    }

    private static int minMeetingRooms(int[][] intervals) {
        int len = intervals.length;
        if(len == 1){
            return 1;
        }

        int count = 0;
        int minRooms = 0;

        int[][] times = new int[len * 2][2];

        int i = 0;
        for(int j = 0; j < times.length; j += 2){
            times[j][0] = intervals[i][0];
            times[j][1] = 1;
            times[j+1][0] = intervals[i++][1];
            times[j+1][1] = -1;
        }

        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

        for (int[] time : times) {
            System.out.println(time[0] + " || " + time[1]);
        }

        int k = 0;
        while(k < times.length) {
            int repeat = 0;
            System.out.println("k: " + k);
            if(k+1 < times.length && times[k][0] == times[k + 1][0]){
                repeat = k;
                while(repeat < times.length){
                    System.out.println("In Repeat: repeat: " + repeat + " || repeat+1: " + (repeat+1));
                    if(times[repeat][0] == times[repeat + 1][0]){
                        count += times[repeat][1] + times[repeat+1][1];
                    }else{
                        break;
                    }
                    repeat += 2;
                }
                k += repeat - 1;
            }else{
                count += times[k][1];
            }
            System.out.println("The count is: " + count);
            if (count > minRooms) {
                minRooms = count;
            }
            k++;
        }

        return minRooms;
    }
}
